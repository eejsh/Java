import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class file_server {

	public static void main(String[] args) {

		fserver fs = new fserver();
		fs.data();
		
	}
}


class fserver {
	
	ServerSocket server = null;
	Socket sk = null;
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void data() {
	 try {
		 this.server = new ServerSocket(this.port);
		 this.sk = this.server.accept();
		 System.out.println("*****����������*****");
		 
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			
			byte data[] = new byte[1024*16];
			int n = this.is.read(data);
			//String f = new String(data, 0, n); -- ä�� ���� ������ ���.
			
			
			String url = "C:\\Java 6\\Test\\src\\copy.jpg";  //���޾Ƽ� �Ȱ��� ���Ϸ� ��������..(����)
		/* ���Ϸ� Ŭ���̾�Ʈ�� ������ �ϹǷ� �������� byte�� ���� �ް� �˴ϴ�. 
		 * is.getinputstream() -> fileoutputstream()���� ��ó��.
		 * */
			FileOutputStream fs = new FileOutputStream(url);
			fs.write(data,0,n);  //�ش� url �ڷ������� ����ǵ��� ��.
			fs.flush();
			
		 
		 
		 
	 }catch(Exception e) {
		 System.out.println(e);
	 }
		
	}
}