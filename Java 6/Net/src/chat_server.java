import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class chat_server {
	
	static String mid = null;
	public static void main(String[] args)  {
		int port = 9090;
		String mid = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����Ͻ� ���̵� �Է��� �ּ��� : ");
		mid = sc.next();
		
		try {
      		ServerSocket server_socket = new ServerSocket(port);
	     
	     	System.out.println(" ��� ��.......................");
	     	
	     	while(true) {
	         Socket sk = server_socket.accept();   //accept ���� (����)
	         
	     	InputStream is = sk.getInputStream();
	     	OutputStream os = sk.getOutputStream();
	     			
 	     byte[] data= new byte [1024];
 	     int arr = is.read(data);
 	     String message = new String (data, 0, arr);
 	     System.out.println(message);
	     	
	     	sc = new Scanner(System.in);
	     	System.out.println("������ �Է��� �ּ���...");
	     	String msg= "[" +mid +"] :"+ sc.nextLine();
	     	
	     	
	     	
	     	
	     	os.write(msg.getBytes());
	     	os.flush();
	     	
	     	
	     	}
	     	
	     	
		}catch(Exception e) { 	}
		
		//Ŭ���̾�Ʈ���� exit ������ ���⼭ �����ؾߵ�. 
		
	

	}

}
