import java.io.FileReader;
import java.io.IOException;

public class file1 {
/* I/O : inputStream, OutputStream
 
 입력 스트림 : 프로그램으로 들어오는 스트림 (inputStream : 키보드, 마우스, HDD)
 출력 스트림 : 프로그램 밖으로 나가는 부분 (outputStream : 모니터, HDd, 프린터)
Stream : input, output 사용자 처리
JAVA.io (API)
File, FileReader (일반) -> StreamAPI(FileinputStream)
FileWriter -> StreamAPI (FileOutputStream)
예외처리 필수사항 -public static void main(String[]args) throws IOException{
*/
	
	public static void main(String[] args) throws Exception,IOException {  
		//exception 이 ioException 보다 상위.
		
	/*FileReader :
		1.문자 데이터를 파일로 부터 읽는 클래스
        2.파일 이름을 생성자 인수값(파라미터)으로 사용해서 FileReader 객체를 생성합니다. ex(public void abc(String a ) -> String a 를 파라미터(인수)라 함)
  new filereader(파일 주소); 
	*/	
		
		try {
//FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\list1.txt"); java.io.FileNotFoundException: C:\Java 5\File_stream\src\list1.txt (지정된 파일을 찾을 수 없습니다)
		FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\list.txt");
		String a = "a1";
		tests(a);
		}catch(IOException z) {   //IOException 에 대한 예외처리          //public void 에 throws IOException이므로 catch(ioexcepiton)사용
			System.out.println(z.getMessage());
		}
	    catch(Exception z1) { //일반 Exception 에 대한 예외처리
		System.out.println(z1.getMessage());
	    }

}
	static public void tests(String data) throws Exception{
		int k = Integer.valueOf(data);
			Exception ex = new Exception();
			throw ex;
			
			
	}
	
}
