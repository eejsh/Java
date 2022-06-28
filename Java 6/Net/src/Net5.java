import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.Severity;

//socket : Server, client : 메세지, 파일 전달 송수신 통신(양방향)  보내기<->받기   예시)채팅..? //용량이 큰건 안쓰임.. 
//HTTP통신 : Image, 동영상, 음악  사용자 (요청)랑 서버(응답)랑 송수신 통신	 --> 단방향 통신  // 보내고->받고->보내고
public class Net5 {

	//Server
	public static void main(String[] args) {
            System.out.println("Server Connect");
            int port = 8080;  //오픈할 port 번호를 세팅함. (단, 절대 중복된 포트를 사용하면 안됨)
            String msg ="Success Connect!!";
            
            try {
            
            	ServerSocket ss = new ServerSocket(port); //serversorket : 오픈 시킬 포트를 적용
            	//연결을 지속유지 하기 위해서는 ServerSocket은 절대 재로드를 해서는 안됩니다.

            	while(true) {
            
            System.out.println("연결 대기 중........");
            Socket sc = ss.accept();
            //accept : 클라이언트가 들어오는 것을 대기하는 역활을 하게 됩니다. 꼭 필요함.. 
            System.out.println("호스트 : 통신 연결 성공");

            /*server에서 client로 받는 통로*/
            InputStream is = sc.getInputStream();   //client에서 보내는 값을 읽어들임.
        
            /*Client로 보내는 통로*/
            OutputStream os = sc.getOutputStream();  //client로 값을 전송
            
            byte data[] = new byte[1024];   //client로 받는 값을 byte로 받음
            int n = is.read(data);    // 해당 값을 읽어들임.
            String msgClient = new String(data, 0, n);  // 해당 값을 배열로 확인하여 변수로 이관.
            System.out.println(msgClient);  // 이관된 값을 출력 시킴.
            
            String aws = "반갑습니다.";    // 서버에서 보내는 메세지.
            os.write(aws.getBytes());    //client로 보내기 위한 메모리 저장
            os.flush(); 
            
            is.close();
            os.close();
            sc.close();
            
            
            }
            }catch(Exception e){
            	System.out.println("현재 서버 포트가 중복되어 서버를 강제 종료 합니다. ");
            } 
            
            
	}

}
