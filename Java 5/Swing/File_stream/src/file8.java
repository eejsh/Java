import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//Files로 해당 모든 내용을 배열로 전송시키는 방법.
public class file8 {

	public static void main(String[] args) throws IOException {
		
		//List : 최상위 배열 class
		//files : 신규 IO class 입니다. 유일하게 readAllLines(전체 내용을 한번에 모두 읽음) 있음. 
		//Files + Paths.get("파일경로");

		List<String> data = Files.readAllLines(Paths.get("C:\\Java 5\\File_stream\\src\\buffer.txt"));
		System.out.println(data);
		
	
		//단점 : 메모리 할당이 많음, 한글언어패킷을 조정해야 함.
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\Java 5\\File_stream\\src\\buffer.txt"));
		System.out.println(new String(data2));  
		
		
	}

}
