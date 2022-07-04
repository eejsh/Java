import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server에 여러개의 port 오픈  8001,8002
//exception : bind exception -> port 충돌 (Address already in use: bind)
public class chat_server {
	public static void main(String[] args) {
	
/*server는 thread 사용해야됨. 
server  port 2개 
1. server 8001, 8002
2. client 8001,  client 8002

server port 1개
1.server 8003
2.client 1,2  8003으로 접속  */
		
	int port[] = {8001,8002};
	int ea = port.length;
	int w= 0;
	openchat oc = null;
	
	while(w<ea) {
	oc = new openchat(port[w]);
	oc.start();
		w++;
	   }
	
	}

}

class openchat extends Thread{
    String ip = "127.0.0.1";
    int pt = 0 ; 
    ServerSocket sk = null;
    InputStream is = null;
    OutputStream os = null;
    
    		
  public openchat(int p) {
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
			
		//	Scanner sc = new Scanner(System.in);
			
				
			
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
 }	
}


