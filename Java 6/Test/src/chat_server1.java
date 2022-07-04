import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//port 1개 사용
public class chat_server1 {
	public static void main(String[] args) {
	
	
	int port = 8003;               //위에서 thread 호출 시 포트 1개만 날려주면됨.
	openchat1 oc = null;
	oc = new openchat1(port);
	oc.start();

	}

}

class openchat1 extends Thread{
    String ip = "127.0.0.1";
    int pt = 0 ; 
    ServerSocket sk = null;
    InputStream is = null;
    OutputStream os = null;
    
    		
  public openchat1(int p) {
	this.pt = p;
//	System.out.println(this.pt);
  }
	@Override
   public void run() {
	
		try {
			
			this.sk = new ServerSocket(this.pt); //   반복문 X 한번만 오픈
			
			while(true) {
			Socket s = sk.accept();    //해당 port 모두 오픈 accpet만 받아오게..
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			
			//클라이언트에서 받는 메세지. 
			byte[] data = new byte[1024];
			int n = is.read(data);
			String message = new String(data, 0, n);
			System.out.println(message);
		
			
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
 }	
}


