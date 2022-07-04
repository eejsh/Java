import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client 
public class ce {

	public static void main(String[] args) {
	
		open o = new open();
		o.op();
		
		
	}

}
class open {
	
	String ip = "127.0.0.1";
	int port = 9009;
	
	InputStream is = null;
	OutputStream os = null;
	Socket ss = null;
	String msg = null;
	Scanner sc = null;
	
	public void op (){
			
		try {
	
		this.ss = new Socket(ip, port);	
		this.is = this.ss.getInputStream();
		this.os = this.ss.getOutputStream();
		
		System.out.println("사용하실 ip 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
         boolean ck = false;

		int say = sc.nextInt();
	    if(say==port) {
	    	ck = true;
	    }
	    else {
	    	ck=false;
	    }
	    
	    if(ck=true) {
	    String msg = sc.nextInt();
	    	this.os.write(say);
	  	    this.os.flush();
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
		System.out.println("사용하실 ip 번호를 입력하세요.");

		String say1 = sc.next();
	    
	  
	    
	    
	    
	    
	    
	    this.os.write(say);
	    this.os.flush();
	    
	    
	    byte[] data = new byte[1024];
	    int n = this.is.read(data);
	    String cmsg = new String(data, 0, n);
	    
	    System.out.println(cmsg);
	
		
		}catch(Exception e) {
			
		}
		
		
	}
}	

