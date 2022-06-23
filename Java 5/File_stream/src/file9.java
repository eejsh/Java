
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

//inputStream(입력)
//Reader(최상위) -
//(하위) bufferreReader, FileReader, CharArrayReader - 문서파일.
//(하위) InputStreamReader - 이미지, 동영상, 오디오
public class file9 {

	public static void main(String[] args) {
		//inputstream-이미지, 동영상,오디오 같은 파일을 로드하기 위해서 사용(바이너리)
		//InputStream : 모든 입력장치에 대한 값을 받는 클래스 입니다. 기본(int)-ASCII
		//InputStream (최상위 입력장치)
		//(하위클래스) : FileInputStream, AudioInputStream, ObjectInputStream
		
		
		InputStream is = new InputStream() { //->기본 class를 로드하여 오버라이드 메소드. 
			//filereader와 사용할 경우 메인에 throws ioexception 넣어줘야함. 단독으로 사용할경우 메인엔 사용안해도됨.
			
			@Override
			public int read() throws IOException { //byte 단위 1~2, 1024, 1000
				int a = 15;
				return a;
			}
		};
//	InputStreamreader : (언어패킷 변경)
//  InputStreamReader ("파일명", EUCKR) or inputStreamReader("파일명", UTF8) 
		
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
			System.out.println(is.read()); 
			System.out.println(ir.read());
		}catch(Exception z) {
			System.out.println(z);
		}
		
		InputStream user = System.in;
		try {
			int code = user.read();         //키보드 입력 ASCII 코드값을 반환          
			if(code == 13) {
			System.out.println("엔터키는 사용하실 수 없습니다.");	
			}
            //System.out.println(code);			 -->키값 확인..
		}catch(Exception z) {
				
			}
		
				
		
		
		
		//===
		
		
			}

}
