import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.Severity;

//socket : Server, client : �޼���, ���� ���� �ۼ��� ���(�����)  ������<->�ޱ�   ����)ä��..? //�뷮�� ū�� �Ⱦ���.. 
//HTTP��� : Image, ������, ����  ����� (��û)�� ����(����)�� �ۼ��� ���	 --> �ܹ��� ���  // ������->�ް�->������
public class Net5 {

	//Server
	public static void main(String[] args) {
            System.out.println("Server Connect");
            int port = 8080;  //������ port ��ȣ�� ������. (��, ���� �ߺ��� ��Ʈ�� ����ϸ� �ȵ�)
            String msg ="Success Connect!!";
            
            try {
            
            	ServerSocket ss = new ServerSocket(port); //serversorket : ���� ��ų ��Ʈ�� ����
            	//������ �������� �ϱ� ���ؼ��� ServerSocket�� ���� ��ε带 �ؼ��� �ȵ˴ϴ�.

            	while(true) {
            
            System.out.println("���� ��� ��........");
            Socket sc = ss.accept();
            //accept : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ��Ȱ�� �ϰ� �˴ϴ�. �� �ʿ���.. 
            System.out.println("ȣ��Ʈ : ��� ���� ����");

            /*server���� client�� �޴� ���*/
            InputStream is = sc.getInputStream();   //client���� ������ ���� �о����.
        
            /*Client�� ������ ���*/
            OutputStream os = sc.getOutputStream();  //client�� ���� ����
            
            byte data[] = new byte[1024];   //client�� �޴� ���� byte�� ����
            int n = is.read(data);    // �ش� ���� �о����.
            String msgClient = new String(data, 0, n);  // �ش� ���� �迭�� Ȯ���Ͽ� ������ �̰�.
            System.out.println(msgClient);  // �̰��� ���� ��� ��Ŵ.
            
            String aws = "�ݰ����ϴ�.";    // �������� ������ �޼���.
            os.write(aws.getBytes());    //client�� ������ ���� �޸� ����
            os.flush(); 
            
            is.close();
            os.close();
            sc.close();
            
            
            }
            }catch(Exception e){
            	System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ� ������ ���� ���� �մϴ�. ");
            } 
            
            
	}

}
