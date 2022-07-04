import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server�� �������� port ����  8001,8002
//exception : bind exception -> port �浹 (Address already in use: bind)
public class chat_server {
	public static void main(String[] args) {
	
/*server�� thread ����ؾߵ�. 
server  port 2�� 
1. server 8001, 8002
2. client 8001,  client 8002

server port 1��
1.server 8003
2.client 1,2  8003���� ����  */
		
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
			
			this.sk = new ServerSocket(this.pt); //   �ݺ��� X �ѹ��� ����
			
			while(true) {
			Socket s = sk.accept();    //�ش� port ��� ���� accpet�� �޾ƿ���..
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			
			//Ŭ���̾�Ʈ���� �޴� �޼���. 
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


