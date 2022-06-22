import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드법   스캐너도 IO  (output)
public class file5 {

	public static void main(String[] args) throws IOException {

		//system.in : input 
		//system.out : output
		try {
		FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\\\db.txt",Charset.forName("UTF8"));
			
	//	File fr = new File("C:\\Java 5\\File_stream\\src\\db.txt");	 ---> 포맷 변환이 안됨 ms949>utf8.. 

		Scanner sc = new Scanner(fr);  //system.in (in:사용자 직접입력), (fileReader : 파일을 로드)
	/*	for(;;) { //loop시 예외처리로 빠질 수 있음.
		String result = sc.nextLine();   // 파일로드 된 입력값을 result 전달 (가상으로 스캐너로드), 파일 로드시 nextLine 이 기본형 
		if(result==null) {
		System.out.println(result);  //출력
		}
		else { sc.close(); break;  }
		} */ 
		int count = 0;
			while(sc.hasNext()) {   // hasnext() : true 면 계속 돌고 false면 정지함.
			sc.nextLine();
			count++;
		System.out.println(count);
		sc.close();
		fr.close();
		
			}
		}
		catch(IOException a) {	
			
		}
		

	}
}
