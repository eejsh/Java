import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client { // 클라이언트는 thread사용안함. 받는쪽에서 값 처리해야됨.

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력해 주세요 : ");
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
			System.out.println(mid + " 님이 접속하셨습니다.");  //받기
			this.sk = new Socket(this.ip, this.port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			System.out.println("채팅 내용을 입력하는 코드.");
			
			this.message = mid + "내용"; //--서버로 보냄.
			this.os.write(this.message.getBytes());
			this.os.flush();

			
			
			// 입력이 없음.
			while(true) {
				this.sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요.");
				this.result = sc.nextLine();
			// 	
			
			
			
			
			byte data[] = new byte[4096]; // 회신받아서 작동..
			int n = this.is.read(data);
			this.result = new String(data, 0, n);
			System.out.println(this.result); 
			
			}
			
		}catch(Exception e) { System.out.println(e); 	}
		
		
	}
	
}