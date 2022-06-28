import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

/* 전송 형태의 프로토콜 */
//TCP(연결 프로토콜)-전송 속도가 빠름 , UDP(사용자 데이터 프로토콜)- 전송속도가 느림 (단, 1:1 경우 굉장히 빠름)
/*PORT 
80 : web (http:// )
21 : FTP - 파일 전송시 사용 (업다운로드)
22 : SSH(shell port) - (파일전송, 서버 외부접속) linux, unix
23 : TELNET - window  (서버 외부 접속)
443 : web(https:// )   SSL 
25 : SMTP (mail 서버) - 메일 보내기(전송)
110 : POP3 (mail 받기) - 문자, 파일 받기 - (비동기화) 삭제시 복구못함.
143 : IMAP (mail 받기) - 문자, 파일 받기 - (동기화)
*/

/*SNMP : UDP (문자발송 시스템) VPN (가상IP) -UDP*/
public class Net2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해 주세요.");
		String url = sc.next();
	  //  String url ="www.naver.com/123.jpg";
	    
		URL u = new URL(url);    //URL : 네트워크 경로를 말합니다. -> url class
		URLConnection con = u.openConnection();  // 해당 경로를 연결  // 파일이 있는지 없는지 확인.
		
		
	//	System.out.println(con);
		int imgsize = con.getContentLength();  // 이미지 크기 get.contentlength
	//	System.out.println(imgsize); // indexof 기능 : -1(없음). 그 외에는 파일 확인한것임(이미지 크기 나옴)  95363/1024 = 93mb
		//http://80 port, https:// 443 port
		
		String imgtype = con.getContentType();
		System.out.println(imgtype);  // 파일 속성을 확인하는 부분 : 이미지 타입 확인. image/jpeg  //  
		//예시:http:// -출력-> text/html; charset=UTF-8 :80포트 사용안함. 주소 외부에서 들어오는거 강제로 막음.
		
		long data1 = con.getDate(); // 파일로드 날짜. 서버 시스템에 올라간 시간으로 나옴. 일반 날짜로 출력하고싶음 바꿔줘야함. 
		System.out.println(data1);
		
		
		//opneStream() : URL 에만 사용. - (네트워크)에서만 사용
		InputStream is = u.openStream();      // 해당되는 이미지를 복사.    URL에서 파일을 읽어올때 사용함.
		BufferedInputStream bi = new BufferedInputStream(is);  //inputstrean->bufferedinputstream 사용가능 // url에서 읽은 파일을 임시저장 (버퍼 사용- 속도빠름)
		byte data[] = new byte[1024];   //1024=1kb 해당 파일을 조각냄
		FileOutputStream fo = new FileOutputStream("copy.jpg");     //저장형태 설정  // split으로 잘라서 넣어야됨..
//      System.out.println(bi.read(data));
	 	int imgdata =0;
		int cnt =0; //반복값 체크
		
		
		while((imgdata=bi.read(data))!=-1) {
			//fo.write(imgdata);
			fo.write(data, 0, imgdata); //조각난 파일을 붙여넣기 하는 상태.
			cnt += imgdata;   //1024++
             System.out.println("다운로드 중.... " + (cnt*100)/imgsize + "%");  // 크기에 맞춰서( 카운터 )*100/이미지크기)나누면 %로 나옴. 1~100%
             
		}
		fo.flush();  //메모리 비우기.
		fo.close();
		System.out.println("다운로드가 완료되었습니다.");
		
		
	}

}
