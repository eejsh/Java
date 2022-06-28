import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {
    //client //클라이언트만 Exception
	public static void main(String[] args)throws Exception {  
		
		System.out.println("클라이언트");

		String ip = "127.0.0.1";  //local host  ip는 중간에 . 들어가서 string으로 받음.
		int port = 8080;   
		
		//port는 숫자로 받아야됨
		
		try {
			Socket sc = new Socket(ip, port);   //(접속할 서버IP, 접속할 서버 PORT)아이피랑 포트 둘다 넣어야됨. 
			System.out.println("서버에 연결 되었습니다....");
			String cmsg = "안녕하세요!";
		/*Client 에서 Server로 보내는 통로*/
		OutputStream os = sc.getOutputStream();
		
		/*Server에서 보내는 값을 받는 통로*/
		
		/*client에서 적용한 메세지를 메모리에 적용 후 byte로 전송*/
		InputStream is = sc.getInputStream();
		
		os.write(cmsg.getBytes());
		os.flush();
		
		/*server 에서 회신된 내용으로 byte배열로 받은 후 출력*/
		byte data[] = new byte[1024];
		int n = is.read(data);
		String sm = new String(data, 0 , n);
	    System.out.println(sm);
		
		}catch(Exception e) {
			System.out.println("서버 연결에 실패 하였습니다...");
		}
		
		
		
	}

}
