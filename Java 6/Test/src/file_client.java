import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class file_client {

	public static void main(String[] args) {
		f_client fc = new f_client();
		fc.files();
		
	}
}
class f_client {
	Socket sk = null;
	String ip = "127.0.0.1";
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {

		try {
			this.sk = new Socket(this.ip, this.port);
	
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			/* 첨부파일 byte 배열로 변경함 
			 * 이미지나 파일은 파일인풋스트림 사용해야 전송됨. */
			String url = "C:\\Java 6\\img.jpg";
	//		클라이언트에서 보낼 이미지, 동영상, 음악 문서 등등 보낸 형식 
			
//			this.os.write(url.getBytes());    //문자로받을시.
			
			FileInputStream fs = new FileInputStream(url);  // 파일 처리할 경우fileinputstream
			//InputStream fs = new FileInputStream(url);  input, fileinput 둘다 사용가능
			BufferedInputStream bs = new BufferedInputStream(fs);
			/*첨부파일 전송 형태*/

			byte img[] = new byte[bs.available()]; // 이미지 크기 확인 
		//	System.out.println(bs.read(img));         
			int fordata = 0;
			
			while((fordata=bs.read(img))!= -1) {
				this.os.write(img, 0, fordata);
		
			}
			
		}catch(Exception e) {
			
		}
		
		
		
	}
}