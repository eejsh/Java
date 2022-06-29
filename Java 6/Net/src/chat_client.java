import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client
public class chat_client {

	public static void main(String[] args)  {
	
       try {
		client_chat cc = new client_chat();
		cc.chat();
		
       }catch(Exception a) {
    	   if(a.getMessage()!=null) {
    		   System.out.println(a);
    	   }
       }
	}
}

class client_chat{
	
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
    OutputStream os = null;
    private String mid = null;  ///외부에서 아이디 강제 생성되지않도록..
    Socket sk = null;
    String msg = null;   //스캐너 사용자가 입력파트
    String smsg = null; //서버로 전송하는 메세지
  
    String check = null; // exit 단어체크 
    
public void chat() {
/* 각종 stream을 close 하지 않습니다. 
왜냐하면 모든 stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료가 됩니다.
---finally에서 설정해야됨. */
	//※ socker은 데이터가 본 데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생 할 수 있습니다.
	
	//exit 시 채팅 종료 -client에서 exti 시 채팅 빠져나오기.
	
	try {  //try~catch 도 하나의 클래스, 선언할 메소드가 있을 경우 필드에 선언해주는게 좋습니다. 
		
		this.sc = new Scanner(System.in);
		System.out.println("아이디를 생성해 주세요.");
		this.mid = this.sc.next();  //생성하자 마자 접속
		
	
		int c = 0;	
		while(true) {
			
			this.sk = new Socket(this.ip, this.port);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		
  if(c==0) {
	this.msg = "[" + this.mid +"] :  님 입장하셨습니다." ; // (1)
//	  this.os.write(this.msg.getBytes());  //채팅 전송
//	  this.os.flush();
   }

  else {			
	  this.sc = new Scanner(System.in);
	  System.out.println("내용을 입력해 주세요 : ");
	  this.check = this.sc.nextLine().intern();
	  this.msg = "[" + this.mid +"] : " + this.check ; //받기.
  }
//  String ex = "exit";
//  if(this.msg.contains(ex)) {
//	 System.out.println("서버에서 " +this.mid +"님이 퇴장하셨습니다. ");
//	  this.sk.close();
//	  }
	
  if(this.check =="exit") {  //exit 퇴장부분
  this.msg = "[" + this.mid +"] 님이 퇴장하셨습니다. "; 
  this.os.write(this.msg.getBytes());
  this.os.flush();
  
  this.sk.close(); 
  }
  else {
	  this.os.write(this.msg.getBytes());
	  this.os.flush();
  }
  
  
  
  this.os.write(this.msg.getBytes());  //채팅 전송
  this.os.flush();
			
			byte data[] = new byte[1024]; // 서버에서 채팅 받기 파트
			int n = this.is.read(data);
			this.smsg = new String(data, 0 , n);
			System.out.println(this.smsg);

c++;
		}	
		
/*this.os.writer ~~( this.msg 가 더블로 들어감 = msg, msg2로 나눔 )님 입장했습니다 ,내용을 입력해 주세요 파트가 같이 보내짐. 
outputstream 도 2개로 나눠야함. 		
	*/		
		}catch(Exception e) {
			if(e.getMessage()!= null) {
//				String error = e.getMessage();
//				if(error.indexOf("OutOfBounds")!=-1) {
					System.out.println("서버접속 장애가 발생하여 강제 종료합ㄴ디ㅏ.");
//				}
			//	System.out.println(e);

			}

	}
	
	
	 
  }	
}
