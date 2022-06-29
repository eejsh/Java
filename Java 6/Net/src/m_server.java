import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {
	public static void main(String[] args) {

		chatroom cr = new chatroom();

	}
}

class chatroom { // �⺻���� --> ä�� �� ������ ���� Thread ����.
	ServerSocket server = null;
	static final int port = 9009; // �����忡�� �������� ����ϱ� ����. port�� �ϳ��� ���, port��ȣ ����ȵǰ�
	Socket sk = null;

	public chatroom() {

		try {
			this.server = new ServerSocket(this.port); // ��Ʈ�� �����ִ� ��Ȱ..

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("****��Ƽ ä�� ����!!****");

        //while(w<2) --2��ۿ� ������
		while (true) { // �ִ� ���Ӽ� ������, true �� ������ ������������

			try {
				sk = this.server.accept(); // ���������ϱ�--> Ŭ���̾�Ʈ ���� �㰡 �κ�
				chat_thread ct = new chat_thread(this.sk); //accept ���� �����ϴ�.
				Thread t = new Thread(ct);
				t.start();
				

			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class chat_thread implements Runnable {  //chatroom���� �Ѿ�� 
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;     
	String message = null;
	String result = null;
	Scanner sc = null;      
	//�޸𸮿� ������Ű�� ���� static�� �÷��ߵ�
	//������ �߰� �߻� �� thread�� ���Ӱ� ���� ������ static�� �ø��� ������ �������� ��� �ʱ�ȭ �Ǿ���� ( �޸� �ʱ�ȭX->�޸� �������Ѿߵ�) 
	static ArrayList<Socket> user = new ArrayList<>();  //(������) �ο��� Ȯ�� ��Ʈ //��Ĺ�� � ������ Ȯ���Ҽ� ����..
	
    public chat_thread(Socket s) {  //������ �������� �޾Ƽ� int�� ������ �ȵ�..
    	this.sk =s ;  //9009
    	    	
    	this.user.add(this.sk);  //���Ӽ� �ο���ŭ ��Ĺ ..
    	
    	
    try {
    	System.out.println("ä�ÿ� ���� �ϼ̽��ϴ�.");
    	System.out.println(this.sk);
    	this.is = this.sk.getInputStream();
    	this.os = this.sk.getOutputStream();
    	
    }catch(Exception e) { 
    	System.out.println("Ŭ���̾�Ʈ ���� ������ �ùٸ��� �ʽ��ϴ�. ");
    	
        }
    }
    

	@Override
	public void run(){
	
		try {
		
		
	byte data[] = new byte[1024];
	int n = this.is.read(data);
	this.message = new String(data, 0, n);
	System.out.println(this.message); //�ޱ�. 
	
	while(true) {
		System.out.println(this.user.size());
		this.sc = new Scanner(System.in);    
	System.out.println("���� �޼����� �Է��ϼ���.");
	this.result = sc.nextLine();
	
	//���������� ������..�� ��ĳ�� ������ �ߵ��Ǵ� ����. getbytes->flush�� ��..
	/* Array�� �ִ� vport(����)�� ���� ������ ���� �� ��ŭ �ݺ��ϱ�.  */
	for(int j=0; j<this.user.size(); j++) {  // �ο����� �������� for�� ������.. while, do~while, foreach������ .. 
		// �迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�. 
		
	OutputStream all = this.user.get(j).getOutputStream();
	//����� ���� stream ���� 
	
	all.write(this.result.getBytes());
	all.flush(); // �ش� ���� �޼����� ��� (�޸� ����)
	
	}
	
/*	this.os.write(this.message.getBytes());  //ȸ����Ʈ  --�ݺ����ȿ�.
	this.os.flush();//��� 
	Thread.sleep(10000);
	String m = "������ �޼��� ���";
	this.os.write(m.getBytes());
	this.os.flush();
*/	
	}
	
	}catch(Exception z) {
	System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");	
	}
	finally { //������Ʈ
		try {
			this.is.close();
			this.os.close();
			this.sk.close();
		}catch(Exception i) { 		}
	}
	
 }  
}
