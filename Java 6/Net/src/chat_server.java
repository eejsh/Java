import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class chat_server {
	
	public static void main(String[] args)  {
	
	
		chat c = new chat();
		c.chatserver();
		
	}

}
class chat{
	
	private int port = 8009;
	ServerSocket sk = null;// ���
	Socket so = null;   //�� �����ִ� ��Ʈ
	
	
	Scanner sc = null;
	InputStream is= null;
	OutputStream os = null;
	String mid = null;     //���̵� ����뵵
	String msg = null;    
	String cmsg = null;   //  client���� ��
	
	String check = null;
	
	public void chatserver () {
		
		try {
			
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �����ϼ���. : ");
			this.mid = sc.next();
			System.out.println("ä�ù� ���� �Ǿ����ϴ�.");   //ä�� ����. 
			
			while(true) {
				this.so = sk.accept();  //����.. �����....
				this.is = so.getInputStream();
				this.os = so.getOutputStream();
				
				byte data[] = new byte[1024];  //������ �������� client ~~�� �����߽��ϴ�. �޾ƿ� (1)
				int n = this.is.read(data);
				this.msg = new String (data,0,n);
				System.out.println(this.msg);  //client���� �޾ƿ��� �κ�.
			// ���� ������ ������ �پ��ִ� Ŭ���̾�Ʈ �� ����. ��, ������ ��������� ���� ����.
				if(this.msg.indexOf("����")!=-1) {
				sk.close();
				sc.close();
					break; 
				}   
				// ���� ���� ������ �ٸ�Ŭ���̾�Ʈ���� ���� ����.				
				
				this.sc = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ���.");
				this.check =  this.sc.nextLine().intern();
	        /*	if(this.check=="exit") {
					sk.close();
					so.close();
					break;
				}  -------�������� exit ��� �� ���  */
				this.cmsg = "[" +this.mid + "] :" + this.check;
				
				this.os.write(this.cmsg.getBytes());
				this.os.flush();		
			
				
				
				
			}
			
		}catch(Exception e) {
			
		}
		
	} 
	
}