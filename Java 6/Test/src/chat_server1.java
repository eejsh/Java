import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//port 1�� ���
public class chat_server1 {
	public static void main(String[] args) {
	
	
	int port = 8003;               //������ thread ȣ�� �� ��Ʈ 1���� �����ָ��.
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
		
			
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
 }	
}


