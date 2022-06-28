import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//ũ�Ѹ�2
public class Net4 {

	public static void main(String[] args) throws Exception{
	
	String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
	URL url = new URL(page);
	/*Stream�� ����ϸ� read�� ��� ����(byte) , BufferedReader - readLine ��밡��(string).  
	 * flush() ������� : bufferedoutputStream ����� ���.
 	 * */
    //	BufferedReader --> readLine
    //  Reader --->realLine
	//  stream -> read, byte 
	
	InputStream is = url.openStream();
	BufferedInputStream bs = new BufferedInputStream(is);  // ���۽�Ʈ�� - byte[�迭]
	//�����, stream���� ������ �� �ƿ�ǲ ��Ʈ�� ��� ���ص��� - writer�� �޾Ƶ���. 
	byte html[] = new byte[1024];  //byte�����ؼ� �迭������ ���� 
//	FileOutputStream fs = new FileOutputStream("game.html");  //�迭 �� �ε��ؼ� ����. 
    BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));
	int s = 0;
    while((s=bs.read(html))!= -1) {   //Stream �� read�� byte�迭 ���� �Է�. 
    	fs.write(html,0,s); 
    	
    } 
    fs.flush(); // bufferoutputstream ���� �޸� �ʱ�ȭ ������.
  		is.close();
		bs.close();
		fs.close();

	}

}
