
public class Var {
	// var - ���� , ����:���������� ���ϴ� �� ex(id-���, pw�� ��ȭ��ȣ �� -����)
	public static void main(String[] args) {
		/*
		
		 * string (a1)<�ƹ��ų��ᵵ��. ���ڸ� ���� �ȳ������.ex(1A-�ȵ�)
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The local variable a1 may not have been initialized at Var.main(Var.java:11)
		 * <- 11���ٿ��� ����..��
		 * 
		 * ; �� ����
		 * 
		 */
		
		
		//1. ���� 1. ������ - ������ ����
        //string ���� �ڷ���. - �� �������� ����
		String a1;  //a1. �������� ����
		a1 = "�̼��� �Դϴ�.";
		a1 = "ȫ�浿 �Դϴ�.";
		

		
		// =:���� �Ѱ��ִ� ��ȣ(�ڿ��ִ� ���� ���) ==:���� ���� ��ȣ
		
		System.out.println(a1);
		// �������� ���� �� ���� �����Ͽ� �Ѱ��ִ� ���� . ����
	
	   //2. ����+���� ���� �����ϴ� ��� 
		String b1="�̼��� �Դϴ�.";
		System.out.println(b1);
		
		//����Ȯ�� ����
		  a1 = "�̼��� �Դϴ�.";  // ������ ������ �ִ� �����ʹ� �����ǰ�, ���ο� ������ �缳����. 
		  
		 System.out.println(a1);
		 

		  
		 
		
		
	}
}
