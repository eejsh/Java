import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_ex {

	public static void main(String[] args)  {
		
		
//		String ip = "127.0.0.1";
//		int port = 9090;
//		
//		Scanner sc = null;
//		OutputStream os = null;
//		InputStream is = null;
//		Socket sso = null;
//		
//		try {
//		  sso = new Socket(ip, port);
//		  System.out.println("���� ���� �Ǿ����ϴ�.");
//		  os = sso.getOutputStream();       //client -> server
//		  is = sso.getInputStream();       // server->client���� 
//		  
//		  
//		  System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է����ּ���.");
//		  
//			while(true) {   // ���������� ���� 
//				sc = new Scanner(System.in);
//				String id = sc.nextLine();
//			
//			System.out.println("������ �Է��� �ּ���.......");	
//			String msg = id+ "  : " + sc.next();
//			
//			os.write(msg.getBytes());
//			os.flush();
//
//			byte[] data = new byte[1024];
//			int n = is.read(data);
//			String cmsg = new String (data,0,n);
//			System.out.println(cmsg);
//
//
////             boolean ok = false;
////              if(msg.contains("����")) {
////            	  ok=true;
////            	  sso.getInputStream();
////              }
//			}	
//			
//		}catch(Exception e) {
//		
//			if(e.getMessage()!=null){
//			
//				System.out.println("������� �߻�..");
//			}
//		}
//		
//		finally {  //Ŭ���̾�Ʈ�� ���� ����� �ش� ���� �� ���� stream, scanner ��� ����.
//			try {
//		sso.close();
//		os.close();
//		is.close();
//		sc.close();  // ������ ����� üũ
//		System.out.println("����.");
//			}catch(Exception aa) {
//			}
//			
//			}
//		
//		}
//		
	
	
	}
	
}
