import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class chat_server {
	
	public static void main(String[] args)  {
	
	
		chat c = new chat();
		c.chatserver();
		
	}

}
class chat{
	
	private int port = 8009;
	ServerSocket sk = null;// 장소
	Socket so = null;   //문 열어주는 파트
	
	
	Scanner sc = null;
	InputStream is= null;
	OutputStream os = null;
	String mid = null;     //아이디 저장용도
	String msg = null;    
	String cmsg = null;   //  client으로 줌
	
	String check = null;
	
	public void chatserver () {
		
		try {
			
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성하세요. : ");
			this.mid = sc.next();
			System.out.println("채팅방 개설 되었습니다.");   //채팅 개설. 
			
			while(true) {
				this.so = sk.accept();  //연결.. 기달중....
				this.is = so.getInputStream();
				this.os = so.getOutputStream();
				
				byte data[] = new byte[1024];  //데이터 가져오기 client ~~님 입장했습니다. 받아옴 (1)
				int n = this.is.read(data);
				this.msg = new String (data,0,n);
				System.out.println(this.msg);  //client에서 받아오는 부분.
			// 서버 소켓이 죽으면 붙어있는 클라이언트 다 죽음. 단, 서버가 살아있으면 재사용 가능.
				if(this.msg.indexOf("퇴장")!=-1) {
				sk.close();
				sc.close();
					break; 
				}   
				// 소켓 종료 없으면 다른클라이언트에서 입장 가능.				
				
				this.sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요.");
				this.check =  this.sc.nextLine().intern();
	        /*	if(this.check=="exit") {
					sk.close();
					so.close();
					break;
				}  -------서버에서 exit 사용 할 경우  */
				this.cmsg = "[" +this.mid + "] :" + this.check;
				
				this.os.write(this.cmsg.getBytes());
				this.os.flush();		
			
				
				
				
			}
			
		}catch(Exception e) {
			
		}
		
	} 
	
}