import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//크롤링2
public class Net4 {

	public static void main(String[] args) throws Exception{
	
	String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
	URL url = new URL(page);
	/*Stream을 사용하면 read만 사용 가능(byte) , BufferedReader - readLine 사용가능(string).  
	 * flush() 사용형태 : bufferedoutputStream 선언시 사용.
 	 * */
    //	BufferedReader --> readLine
    //  Reader --->realLine
	//  stream -> read, byte 
	
	InputStream is = url.openStream();
	BufferedInputStream bs = new BufferedInputStream(is);  // 버퍼스트림 - byte[배열]
	//저장시, stream으로 받으면 꼭 아웃풋 스트림 사용 안해도됨 - writer로 받아도됨. 
	byte html[] = new byte[1024];  //byte생성해서 배열값으로 받음 
//	FileOutputStream fs = new FileOutputStream("game.html");  //배열 값 로드해서 저장. 
    BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));
	int s = 0;
    while((s=bs.read(html))!= -1) {   //Stream 은 read에 byte배열 명을 입력. 
    	fs.write(html,0,s); 
    	
    } 
    fs.flush(); // bufferoutputstream 사용시 메모리 초기화 시켜줌.
  		is.close();
		bs.close();
		fs.close();

	}

}
