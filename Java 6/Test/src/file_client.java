import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class file_client {

	public static void main(String[] args) {
		f_client fc = new f_client();
		fc.files();
		
	}
}
class f_client {
	Socket sk = null;
	String ip = "127.0.0.1";
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {

		try {
			this.sk = new Socket(this.ip, this.port);
	
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			/* ÷������ byte �迭�� ������ 
			 * �̹����� ������ ������ǲ��Ʈ�� ����ؾ� ���۵�. */
			String url = "C:\\Java 6\\img.jpg";
	//		Ŭ���̾�Ʈ���� ���� �̹���, ������, ���� ���� ��� ���� ���� 
			
//			this.os.write(url.getBytes());    //���ڷι�����.
			
			FileInputStream fs = new FileInputStream(url);  // ���� ó���� ���fileinputstream
			//InputStream fs = new FileInputStream(url);  input, fileinput �Ѵ� ��밡��
			BufferedInputStream bs = new BufferedInputStream(fs);
			/*÷������ ���� ����*/

			byte img[] = new byte[bs.available()]; // �̹��� ũ�� Ȯ�� 
		//	System.out.println(bs.read(img));         
			int fordata = 0;
			
			while((fordata=bs.read(img))!= -1) {
				this.os.write(img, 0, fordata);
		
			}
			
		}catch(Exception e) {
			
		}
		
		
		
	}
}