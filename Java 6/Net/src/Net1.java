import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.text.Position.Bias;

public class Net1 {
//UnknownHostException : host ������ Ȯ�� ���� ���� ���
	public static void main(String[] args) throws UnknownHostException {
	//	InetAddress : Ip network Address 
		
	
//		InetAddress ia = InetAddress.getByName("localhost");
//		  System.out.println(ia);  ---���� ��ǻ�� ȣ��ƮȮ��.
		
		InetAddress ia = InetAddress.getByName("www.naver.com");
		             //getByName ������ ������ �ּҸ��� ���մϴ�.
		
//		System.out.println(ia);  //to.string �پ����� ver���Ƽ� ...
//		System.out.println(ia.getHostName());          //������ �̸�
//		System.out.println(ia.getHostAddress());       // dns�� ����� ip
	
		//getAllbyname : �����ο� Ip ���� Ȯ��.
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");
	//	System.out.println(ia2[0].getHostAddress()); -- getallbyname ����� !�迭! �� Ȯ���ؾߵ�.
		
		System.out.println(ia2.length);   // �ش� DNS�� IP ���� (naver �����ο� ��� ip�� �����ִ��� Ȯ��)
		int w= 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		

	}

}
