import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.text.Position.Bias;

public class Net1 {
//UnknownHostException : host 정보가 확인 되지 않을 경우
	public static void main(String[] args) throws UnknownHostException {
	//	InetAddress : Ip network Address 
		
	
//		InetAddress ia = InetAddress.getByName("localhost");
//		  System.out.println(ia);  ---본인 컴퓨터 호스트확인.
		
		InetAddress ia = InetAddress.getByName("www.naver.com");
		             //getByName 접속할 도메인 주소명을 말합니다.
		
//		System.out.println(ia);  //to.string 붙어있음 ver높아서 ...
//		System.out.println(ia.getHostName());          //도메인 이름
//		System.out.println(ia.getHostAddress());       // dns에 연결된 ip
	
		//getAllbyname : 도메인에 Ip 정보 확인.
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");
	//	System.out.println(ia2[0].getHostAddress()); -- getallbyname 선언시 !배열! 로 확인해야됨.
		
		System.out.println(ia2.length);   // 해당 DNS의 IP 갯수 (naver 도메인에 몇개의 ip가 물려있는지 확인)
		int w= 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		

	}

}
