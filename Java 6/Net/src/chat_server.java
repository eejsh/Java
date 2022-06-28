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
		System.out.println("서버에서 사용하실 아이디를 입력해 주세요 : ");
		mid = sc.next();
		
		try {
      		ServerSocket server_socket = new ServerSocket(port);
	     
	     	System.out.println(" 대기 중.......................");
	     	
	     	while(true) {
	         Socket sk = server_socket.accept();   //accept 선언 (연결)
	         
	     	InputStream is = sk.getInputStream();
	     	OutputStream os = sk.getOutputStream();
	     			
 	     byte[] data= new byte [1024];
 	     int arr = is.read(data);
 	     String message = new String (data, 0, arr);
 	     System.out.println(message);
	     	
	     	sc = new Scanner(System.in);
	     	System.out.println("내용을 입력해 주세요...");
	     	String msg= "[" +mid +"] :"+ sc.nextLine();
	     	
	     	
	     	
	     	
	     	os.write(msg.getBytes());
	     	os.flush();
	     	
	     	
	     	}
	     	
	     	
		}catch(Exception e) { 	}
		
		//클라이언트에서 exit 들어오면 여기서 종료해야됨. 
		
	

	}

}
