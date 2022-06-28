import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	public static void main(String[] args)  {
		
		String ip = "127.0.0.1" ;
		int port = 9090;
		Scanner sc = null;
		String myid = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("채팅에 사용하실 아이디를 입력해 주세요..");
			myid = sc.nextLine(); 
		
			int c = 0;
	        Socket sk = new Socket(ip, port);  
	      
	        while(true) {

        	OutputStream os = sk.getOutputStream();
	        InputStream is = sk.getInputStream();  

	        String message = "[" + myid + "] : 님이 입장하셨습니다." ; 
	        os.write(message.getBytes()); 
	        os.flush();

	        //inputstream, outputstream close는 최대한 finally에 선언해야됨.
	        
	   	       
	   		 byte data[] = new byte[1024];  // 입력파트.
	   		 int no = is.read(data);
	   		 String msg = new String(data, 0 , no);
		   	   
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("내용을 입력해 주세요.....");
	        
	        String word = sc2.nextLine();
	        
	        if(word=="exit") {
	        	String messageString = "[" + myid + "] : " +word;
	        	System.exit(0);  // 시스템 전체 종료

	        sc2.close();
	        os.close();
	        is.close();
	        break;
	        //system.exti(0)
	        
	        }
	        
	        os.write(message.getBytes());
	        os.flush();
	      
	          }
	   	               
	        
	        
		}catch(Exception z){
			
		}

	}

}
