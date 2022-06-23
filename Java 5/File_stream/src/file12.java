import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//fileoutputStream
public class file12 {

	public static void main(String[] args) throws IOException{
		
		String test = "연습입니다";
		
	//	FileOutputStream os = new FileOutputStream("C:\Java 5\File_stream\src\\array.txt"); 아무거나~
		OutputStream os = new FileOutputStream("C:\\Java 5\\File_stream\\src\\array.txt");
		byte[] data = test.getBytes();  //문자 -> ASCII변환
		os.write(data);
		os.flush(); 
		//Stream에 저장된 모든 값이 메모리에 있게 됩니다.
		//flush()는 메모리값을 모두 비우는 작업을 하게 됩니다. 간혹 빠지는 데이터가 있을수 있음으로 flush() 추가하는게 좋음.
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
