import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

/* ���� ������ �������� */
//TCP(���� ��������)-���� �ӵ��� ���� , UDP(����� ������ ��������)- ���ۼӵ��� ���� (��, 1:1 ��� ������ ����)
/*PORT 
80 : web (http:// )
21 : FTP - ���� ���۽� ��� (���ٿ�ε�)
22 : SSH(shell port) - (��������, ���� �ܺ�����) linux, unix
23 : TELNET - window  (���� �ܺ� ����)
443 : web(https:// )   SSL 
25 : SMTP (mail ����) - ���� ������(����)
110 : POP3 (mail �ޱ�) - ����, ���� �ޱ� - (�񵿱�ȭ) ������ ��������.
143 : IMAP (mail �ޱ�) - ����, ���� �ޱ� - (����ȭ)
*/

/*SNMP : UDP (���ڹ߼� �ý���) VPN (����IP) -UDP*/
public class Net2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է��� �ּ���.");
		String url = sc.next();
	  //  String url ="www.naver.com/123.jpg";
	    
		URL u = new URL(url);    //URL : ��Ʈ��ũ ��θ� ���մϴ�. -> url class
		URLConnection con = u.openConnection();  // �ش� ��θ� ����  // ������ �ִ��� ������ Ȯ��.
		
		
	//	System.out.println(con);
		int imgsize = con.getContentLength();  // �̹��� ũ�� get.contentlength
	//	System.out.println(imgsize); // indexof ��� : -1(����). �� �ܿ��� ���� Ȯ���Ѱ���(�̹��� ũ�� ����)  95363/1024 = 93mb
		//http://80 port, https:// 443 port
		
		String imgtype = con.getContentType();
		System.out.println(imgtype);  // ���� �Ӽ��� Ȯ���ϴ� �κ� : �̹��� Ÿ�� Ȯ��. image/jpeg  //  
		//����:http:// -���-> text/html; charset=UTF-8 :80��Ʈ ������. �ּ� �ܺο��� �����°� ������ ����.
		
		long data1 = con.getDate(); // ���Ϸε� ��¥. ���� �ý��ۿ� �ö� �ð����� ����. �Ϲ� ��¥�� ����ϰ���� �ٲ������. 
		System.out.println(data1);
		
		
		//opneStream() : URL ���� ���. - (��Ʈ��ũ)������ ���
		InputStream is = u.openStream();      // �ش�Ǵ� �̹����� ����.    URL���� ������ �о�ö� �����.
		BufferedInputStream bi = new BufferedInputStream(is);  //inputstrean->bufferedinputstream ��밡�� // url���� ���� ������ �ӽ����� (���� ���- �ӵ�����)
		byte data[] = new byte[1024];   //1024=1kb �ش� ������ ������
		FileOutputStream fo = new FileOutputStream("copy.jpg");     //�������� ����  // split���� �߶� �־�ߵ�..
//      System.out.println(bi.read(data));
	 	int imgdata =0;
		int cnt =0; //�ݺ��� üũ
		
		
		while((imgdata=bi.read(data))!=-1) {
			//fo.write(imgdata);
			fo.write(data, 0, imgdata); //������ ������ �ٿ��ֱ� �ϴ� ����.
			cnt += imgdata;   //1024++
             System.out.println("�ٿ�ε� ��.... " + (cnt*100)/imgsize + "%");  // ũ�⿡ ���缭( ī���� )*100/�̹���ũ��)������ %�� ����. 1~100%
             
		}
		fo.flush();  //�޸� ����.
		fo.close();
		System.out.println("�ٿ�ε尡 �Ϸ�Ǿ����ϴ�.");
		
		
	}

}
