
public class If3 {

	public static void main(String[] args) {
		
		//boolean : true , false �� �����ϰ� �˴ϴ�. (t. f ""������.�����ڷ�)
		 
		boolean ck = false ;
		if (ck==true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		}
		
		else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}
		
		
		String mid = "park";
		String mpass = "a1234";
		//&& : �Ѱ��� �����̻� ��� ���� ���  and
		// ||   : �Ѱ��� �����̻󿡼�  �Ѱ��� ���� ��� or
		
		if(mid=="park" && mpass=="a12134") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
			
		}
		
		
		if(mid=="park" || mid=="kim") {
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
			
			/*if (mid=="park" || mpass=="a1234") �� ���� �߿� �Ѱ����� ���� ��� ..
			(id,pw ���� �Ѱ����� ������ ���ΰ��������..)*/			
		}
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
			
			
		}
			

		
	}

}
