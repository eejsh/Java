import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {
    //client //Ŭ���̾�Ʈ�� Exception
	public static void main(String[] args)throws Exception {  
		
		System.out.println("Ŭ���̾�Ʈ");

		String ip = "127.0.0.1";  //local host  ip�� �߰��� . ���� string���� ����.
		int port = 8080;   
		
		//port�� ���ڷ� �޾ƾߵ�
		
		try {
			Socket sc = new Socket(ip, port);   //(������ ����IP, ������ ���� PORT)�����Ƕ� ��Ʈ �Ѵ� �־�ߵ�. 
			System.out.println("������ ���� �Ǿ����ϴ�....");
			String cmsg = "�ȳ��ϼ���!";
		/*Client ���� Server�� ������ ���*/
		OutputStream os = sc.getOutputStream();
		
		/*Server���� ������ ���� �޴� ���*/
		
		/*client���� ������ �޼����� �޸𸮿� ���� �� byte�� ����*/
		InputStream is = sc.getInputStream();
		
		os.write(cmsg.getBytes());
		os.flush();
		
		/*server ���� ȸ�ŵ� �������� byte�迭�� ���� �� ���*/
		byte data[] = new byte[1024];
		int n = is.read(data);
		String sm = new String(data, 0 , n);
	    System.out.println(sm);
		
		}catch(Exception e) {
			System.out.println("���� ���ῡ ���� �Ͽ����ϴ�...");
		}
		
		
		
	}

}
