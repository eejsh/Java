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
//		  System.out.println("서버 접속 되었습니다.");
//		  os = sso.getOutputStream();       //client -> server
//		  is = sso.getInputStream();       // server->client전송 
//		  
//		  
//		  System.out.println("채팅에 사용하실 아이디를 입력해주세요.");
//		  
//			while(true) {   // 지속적으로 연결 
//				sc = new Scanner(System.in);
//				String id = sc.nextLine();
//			
//			System.out.println("내용을 입력해 주세요.......");	
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
////              if(msg.contains("종료")) {
////            	  ok=true;
////            	  sso.getInputStream();
////              }
//			}	
//			
//		}catch(Exception e) {
//		
//			if(e.getMessage()!=null){
//			
//				System.out.println("접속장애 발생..");
//			}
//		}
//		
//		finally {  //클라이언트가 접속 종료시 해당 소켓 및 각종 stream, scanner 모두 종료.
//			try {
//		sso.close();
//		os.close();
//		is.close();
//		sc.close();  // 접속이 종료시 체크
//		System.out.println("종료.");
//			}catch(Exception aa) {
//			}
//			
//			}
//		
//		}
//		
	
	
	}
	
}
