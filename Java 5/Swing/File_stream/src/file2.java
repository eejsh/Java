import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {
	public static void main(String[] args) throws IOException{
		
		try {
		//	FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\list.txt");  //->java 8�������� ����߾���..
			
			FileReader fr = new FileReader("C:\\\\Java 5\\\\File_stream\\\\src\\\\list.txt", Charset.forName("UTF8")); // Charset,forname: EUCKR(ANSI), ANSI, UTF8, UTF16					
					
	// System.out.println(fr.getEncoding()); //���ڴ� ���� Ȯ�� FileReader
	//		System.out.println(fr.read()); // 54861 -> ������ũ��.	
		int w = 0;
		while(true) {  //loop�� Ȱ���Ͽ� �ش� ���Ͽ� ���ڸ� ��� ������
			int m = fr.read();        //-1, ������ ����(���̻� ���ڰ� ���� ���)
			System.out.print((char)m); // 2byte char�� �����.
			if(m==-1) {// ���̻� ������ ���ڰ� ���� ������ ��� loop�� ��������
				break;
			}				
			
		 }	
			fr.close(); //filereader ����
		
	}
		catch(IOException e){
	  
			if(e.getMessage()!=null) {
				System.out.println(e);    
					
			}
		}
			
	}
}
