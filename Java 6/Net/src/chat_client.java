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
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���..");
			myid = sc.nextLine(); 
		
			int c = 0;
	        Socket sk = new Socket(ip, port);  
	      
	        while(true) {

        	OutputStream os = sk.getOutputStream();
	        InputStream is = sk.getInputStream();  

	        String message = "[" + myid + "] : ���� �����ϼ̽��ϴ�." ; 
	        os.write(message.getBytes()); 
	        os.flush();

	        //inputstream, outputstream close�� �ִ��� finally�� �����ؾߵ�.
	        
	   	       
	   		 byte data[] = new byte[1024];  // �Է���Ʈ.
	   		 int no = is.read(data);
	   		 String msg = new String(data, 0 , no);
		   	   
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("������ �Է��� �ּ���.....");
	        
	        String word = sc2.nextLine();
	        
	        if(word=="exit") {
	        	String messageString = "[" + myid + "] : " +word;
	        	System.exit(0);  // �ý��� ��ü ����

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
