import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client { // Ŭ���̾�Ʈ�� thread������. �޴��ʿ��� �� ó���ؾߵ�.

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��� �ּ��� : ");
		String user = sc.nextLine();
		
	    chatclient cc = new chatclient(user);
	    
	 
	}
}

class chatclient{
	
	static final String ip = "127.0.0.1";
	static final int port = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	public chatclient(String mid)   {
		
		try {
			System.out.println(mid + " ���� �����ϼ̽��ϴ�.");  //�ޱ�
			this.sk = new Socket(this.ip, this.port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			System.out.println("ä�� ������ �Է��ϴ� �ڵ�.");
			
			this.message = mid + "����"; //--������ ����.
			this.os.write(this.message.getBytes());
			this.os.flush();

			
			
			// �Է��� ����.
			while(true) {
				this.sc = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ���.");
				this.result = sc.nextLine();
			// 	
			
			
			
			
			byte data[] = new byte[4096]; // ȸ�Ź޾Ƽ� �۵�..
			int n = this.is.read(data);
			this.result = new String(data, 0, n);
			System.out.println(this.result); 
			
			}
			
		}catch(Exception e) { System.out.println(e); 	}
		
		
	}
	
}