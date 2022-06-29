import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client
public class chat_client {

	public static void main(String[] args)  {
	
       try {
		client_chat cc = new client_chat();
		cc.chat();
		
       }catch(Exception a) {
    	   if(a.getMessage()!=null) {
    		   System.out.println(a);
    	   }
       }
	}
}

class client_chat{
	
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
    OutputStream os = null;
    private String mid = null;  ///�ܺο��� ���̵� ���� ���������ʵ���..
    Socket sk = null;
    String msg = null;   //��ĳ�� ����ڰ� �Է���Ʈ
    String smsg = null; //������ �����ϴ� �޼���
  
    String check = null; // exit �ܾ�üũ 
    
public void chat() {
/* ���� stream�� close ���� �ʽ��ϴ�. 
�ֳ��ϸ� ��� stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ���ᰡ �˴ϴ�.
---finally���� �����ؾߵ�. */
	//�� socker�� �����Ͱ� �� �����Ͱ� ������ �̷������ ������ �������� ������ �߻� �� �� �ֽ��ϴ�.
	
	//exit �� ä�� ���� -client���� exti �� ä�� ����������.
	
	try {  //try~catch �� �ϳ��� Ŭ����, ������ �޼ҵ尡 ���� ��� �ʵ忡 �������ִ°� �����ϴ�. 
		
		this.sc = new Scanner(System.in);
		System.out.println("���̵� ������ �ּ���.");
		this.mid = this.sc.next();  //�������� ���� ����
		
	
		int c = 0;	
		while(true) {
			
			this.sk = new Socket(this.ip, this.port);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		
  if(c==0) {
	this.msg = "[" + this.mid +"] :  �� �����ϼ̽��ϴ�." ; // (1)
//	  this.os.write(this.msg.getBytes());  //ä�� ����
//	  this.os.flush();
   }

  else {			
	  this.sc = new Scanner(System.in);
	  System.out.println("������ �Է��� �ּ��� : ");
	  this.check = this.sc.nextLine().intern();
	  this.msg = "[" + this.mid +"] : " + this.check ; //�ޱ�.
  }
//  String ex = "exit";
//  if(this.msg.contains(ex)) {
//	 System.out.println("�������� " +this.mid +"���� �����ϼ̽��ϴ�. ");
//	  this.sk.close();
//	  }
	
  if(this.check =="exit") {  //exit ����κ�
  this.msg = "[" + this.mid +"] ���� �����ϼ̽��ϴ�. "; 
  this.os.write(this.msg.getBytes());
  this.os.flush();
  
  this.sk.close(); 
  }
  else {
	  this.os.write(this.msg.getBytes());
	  this.os.flush();
  }
  
  
  
  this.os.write(this.msg.getBytes());  //ä�� ����
  this.os.flush();
			
			byte data[] = new byte[1024]; // �������� ä�� �ޱ� ��Ʈ
			int n = this.is.read(data);
			this.smsg = new String(data, 0 , n);
			System.out.println(this.smsg);

c++;
		}	
		
/*this.os.writer ~~( this.msg �� ����� �� = msg, msg2�� ���� )�� �����߽��ϴ� ,������ �Է��� �ּ��� ��Ʈ�� ���� ������. 
outputstream �� 2���� ��������. 		
	*/		
		}catch(Exception e) {
			if(e.getMessage()!= null) {
//				String error = e.getMessage();
//				if(error.indexOf("OutOfBounds")!=-1) {
					System.out.println("�������� ��ְ� �߻��Ͽ� ���� �����դ���.");
//				}
			//	System.out.println(e);

			}

	}
	
	
	 
  }	
}
