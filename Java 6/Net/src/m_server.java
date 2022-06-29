import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {
	public static void main(String[] args) {

		chatroom cr = new chatroom();

	}
}

class chatroom { // 기본사항 --> 채팅 각 접속자 마자 Thread 분할.
	ServerSocket server = null;
	static final int port = 9009; // 스레드에서 공용으로 사용하기 위함. port는 하나만 사용, port번호 변경안되게
	Socket sk = null;

	public chatroom() {

		try {
			this.server = new ServerSocket(this.port); // 포트만 열어주는 역활..

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("****멀티 채팅 시작!!****");

        //while(w<2) --2명밖에 못들어옴
		while (true) { // 최대 접속수 설정함, true 시 접속자 별도설정없음

			try {
				sk = this.server.accept(); // 서버연결하기--> 클라이언트 접속 허가 부분
				chat_thread ct = new chat_thread(this.sk); //accept 정보 보냅니다.
				Thread t = new Thread(ct);
				t.start();
				

			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class chat_thread implements Runnable {  //chatroom에서 넘어옴 
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;     
	String message = null;
	String result = null;
	Scanner sc = null;      
	//메모리에 누적시키기 위해 static에 올려야됨
	//접속자 추가 발생 시 thread가 새롭게 생성 되으로 static에 올리지 않으면 누적없이 계속 초기화 되어버림 ( 메모리 초기화X->메모리 누적시켜야됨) 
	static ArrayList<Socket> user = new ArrayList<>();  //(접속자) 인원수 확인 파트 //소캣이 몇개 열린지 확인할수 있음..
	
    public chat_thread(Socket s) {  //위에서 소켓으로 받아서 int로 받으면 안됨..
    	this.sk =s ;  //9009
    	    	
    	this.user.add(this.sk);  //접속수 인원만큼 소캣 ..
    	
    	
    try {
    	System.out.println("채팅에 참여 하셨습니다.");
    	System.out.println(this.sk);
    	this.is = this.sk.getInputStream();
    	this.os = this.sk.getOutputStream();
    	
    }catch(Exception e) { 
    	System.out.println("클라이언트 접속 정보가 올바르지 않습니다. ");
    	
        }
    }
    

	@Override
	public void run(){
	
		try {
		
		
	byte data[] = new byte[1024];
	int n = this.is.read(data);
	this.message = new String(data, 0, n);
	System.out.println(this.message); //받기. 
	
	while(true) {
		System.out.println(this.user.size());
		this.sc = new Scanner(System.in);    
	System.out.println("보낼 메세지를 입력하세요.");
	this.result = sc.nextLine();
	
	//순차적으로 가는중..ㅜ 스캐너 끝나고 발동되는 라인. getbytes->flush로 감..
	/* Array에 있는 vport(증가)에 대한 정보를 담은 수 만큼 반복하기.  */
	for(int j=0; j<this.user.size(); j++) {  // 인원수가 많을수록 for문 느려짐.. while, do~while, foreach문으로 .. 
		// 배열에 있는 사용자 vport로 전송을 하게 됩니다. 
		
	OutputStream all = this.user.get(j).getOutputStream();
	//사용자 별로 stream 생성 
	
	all.write(this.result.getBytes());
	all.flush(); // 해당 전송 메세지를 비움 (메모리 비우기)
	
	}
	
/*	this.os.write(this.message.getBytes());  //회신파트  --반복문안에.
	this.os.flush();//출력 
	Thread.sleep(10000);
	String m = "관리자 메세지 출력";
	this.os.write(m.getBytes());
	this.os.flush();
*/	
	}
	
	}catch(Exception z) {
	System.out.println("클라이언트가 종료되었습니다.");	
	}
	finally { //종료파트
		try {
			this.is.close();
			this.os.close();
			this.sk.close();
		}catch(Exception i) { 		}
	}
	
 }  
}
