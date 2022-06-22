import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {
	public static void main(String[] args) throws IOException{
		
		try {
		//	FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\list.txt");  //->java 8버전에서 사용했었음..
			
			FileReader fr = new FileReader("C:\\\\Java 5\\\\File_stream\\\\src\\\\list.txt", Charset.forName("UTF8")); // Charset,forname: EUCKR(ANSI), ANSI, UTF8, UTF16					
					
	// System.out.println(fr.getEncoding()); //인코더 형식 확인 FileReader
	//		System.out.println(fr.read()); // 54861 -> 데이터크기.	
		int w = 0;
		while(true) {  //loop를 활용하여 해당 파일에 문자를 모두 가져옴
			int m = fr.read();        //-1, 내용이 없음(더이상 문자가 없을 경우)
			System.out.print((char)m); // 2byte char로 사용함.
			if(m==-1) {// 더이상 가져올 문자가 없을 경우없을 경우 loop로 빠져나감
				break;
			}				
			
		 }	
			fr.close(); //filereader 종료
		
	}
		catch(IOException e){
	  
			if(e.getMessage()!=null) {
				System.out.println(e);    
					
			}
		}
			
	}
}
