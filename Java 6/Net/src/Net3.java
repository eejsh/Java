import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//Crawling 사용.

public class Net3 {

	public static void main(String[] args) throws Exception {
		String url = "aa.com";
		URL urls = new URL(url);
	    URLConnection con = urls.openConnection();
	    int size = con.getContentLength();
		
		System.out.println(urls.getProtocol());  // https  프로토컬  http, https
		System.out.println(urls.getPort());      // 443   포트 번호
		System.out.println(urls.getFile());      // login  접속 파일명
		
		InputStream is = urls.openStream(); 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter write = new FileWriter("login,html");
	
		//웹페이지 소스 긁기
		
	//	byte html[] = new byte[1024];
	//	FileOutputStream fs = new FileOutputStream("login.html");
		String str = "";
		while((str=br.readLine())!=null) {

		write.write(str);
		}
		br.close();
	

	}
}
