package Ab2;

public class app {

	public static void main(String[] args) {

/*	(�ڽ�) + (�ڽ�)
 * 
 * members mb = new members();
	mb.opp();
	mb.oop();  */
		
	
		//(�θ�)=(�ڽ�) -> �������̽� �������� ����� �������̵常 ȣ���� (����ȯ)
		
//		members mb = new members();  // �ڽ� class ����
//		app_data2 ap = mb; //�������̽� ����   (Ŭ����->�������̽� ����)
	    
		
		app_data2 ap = new members();
		members mb2 = (members)ap;  // �������̽� -> Ŭ���� ��ȯ
	
//		ap.oop();
//		ap.oop2();
//		mb.oop(); //���� ���� �޼ҵ�� ���ȵ�. ���� ȣ���ؾߵ�		
		
		
		
	} 
}
/*
 * class members implements app_data1 { 
 * app_data1�� ������ �ڷ��� �����ϴ� ���

public void user_join(
{system.out.println("test" );
 * }
 */


class members implements app_data2 {
	@Override
	public void opp() {
System.out.println("test");
	}

	@Override
	public void opp2() {
System.out.println("test2");
	}

	
	public void oop() {  // ���� ȣ���ؾ� ��밡��.
System.out.println("test3");
	}

} 
	
	