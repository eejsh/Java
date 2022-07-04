import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class sv {

	public static void main(String[] args) {
		ssvv sv = new ssvv();
		sv.chat();
	}
}
class ssvv {
	int port = 9009;
	
	ServerSocket ss= null; //장소
	Socket so = null;  //문열기
	
	InputStream is = null;
	OutputStream os = null;
	
	String msg =null;  //
    String cmsg = null; // 클라로 넘어가는..	
		
	boolean ck = false;
	
	public void chat() {
		try {
			
			this.ss = new ServerSocket(port);
			
			this.so =ss.accept(); // 연결
			
			byte data[] = new byte[1024];
			int n = this.is.read(data);
			this.msg = new String(data,0,n);
			this.os.write(this.msg.getBytes());
			this.os.flush();
			    
	
		
			
			
		
		
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}
	 
}
