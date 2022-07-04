import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class file_server {

	public static void main(String[] args) {

		fserver fs = new fserver();
		fs.data();
		
	}
}


class fserver {
	
	ServerSocket server = null;
	Socket sk = null;
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void data() {
	 try {
		 this.server = new ServerSocket(this.port);
		 this.sk = this.server.accept();
		 System.out.println("*****서버가동중*****");
		 
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			
			byte data[] = new byte[1024*16];
			int n = this.is.read(data);
			//String f = new String(data, 0, n); -- 채팅 문자 받을떄 사용.
			
			
			String url = "C:\\Java 6\\Test\\src\\copy.jpg";  //값받아서 똑같은 파일로 만들어보세요..(응용)
		/* 파일로 클라이언트가 전송을 하므로 서버에서 byte로 값을 받게 됩니다. 
		 * is.getinputstream() -> fileoutputstream()으로 거처옴.
		 * */
			FileOutputStream fs = new FileOutputStream(url);
			fs.write(data,0,n);  //해당 url 자료형으로 저장되도록 함.
			fs.flush();
			
		 
		 
		 
	 }catch(Exception e) {
		 System.out.println(e);
	 }
		
	}
}