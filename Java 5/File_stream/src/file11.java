import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일로드
public class file11 {

	public static void main(String[] args)throws IOException {
		
		try {
		
		FileInputStream fs = new FileInputStream("C:\\Java 5\\File_stream\\src\\list.txt");
	
		System.out.println(fs.available());   //파일 전체 사이즈 확인. - 이미지쓸때 사용.   availalble : 파일 전체 크기
		byte temp[] = new byte[fs.available()];   //무제한 용량배열파일 ( 파일 크기에 따라 유동성있게 잡아줌)
		int ea = fs.read(temp);          
		String data = new String (temp, "UTF-8"); 
		System.out.println(data);
		
		//	InputStream fs = new FileInputStream("C:\\Java 5\\File_stream\\src\\list.txt");
	/*	byte temp[] = new byte[1024*16];  //1024*16 = 파일크기 : byte는 크게 비워놓으면 좋음. 저장될 데이터가 커짐.OR // eX)이메일 2mb이하만 올려주세여->제약조건
		int ea = fs.read(temp); // ASCII code로 전체를 읽어서 ea로 받도록 함.
		String data = new String(temp,"UTF-8"); //String 문자형태로 배열을 받아서 출력
		System.out.println(data);    */
		
		
		}catch(Exception e) {
			
		}
		
		
		
	}

}
