import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*	 * [ Scanner ���ǻ��� ]
		 * Scanner �� import ���
		 * ������� (����ڰ� � ���� �Է��ϴ����� ���� ����)
		 * �ش� ����ڰ� �Է��� ���� �޴� ������ ����

		 * [���빮��]
		 * ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
		 * ù��° ���� ���� �Է��ϼ���?
		 * �ι�° ���� ���� �Է��ϼ���?
		 * ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����Ͻʽÿ�.

		 * ��, �ش� ������� 100 ���� �� ��� ��� �޼����� "�ش� 100������ ����� �Դϴ�." ��� �����Ͻð�
		 * 100 �̻��� ��� "�ش� ���� 100 �̻� ����� �Դϴ�." ��� ����մϴ�.
           */
	
		
		  Scanner sc1 = new Scanner(System.in);
		  System.out.println("ù��° ���ڸ� �Է��ϼ���");
		  int user1 = sc1.nextInt();
		  
		  Scanner sc2 = new Scanner(System.in);
		  System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		  int user2 = sc2.nextInt();
		  
		  int user3 = user1 * user2 ;
		  if (user3<100) {
			  System.out.println("100 ������ ����� �Դϴ�.");
		  }
		  else {
			  System.out.println("100 �̻��� ����� �Դϴ�.");
		  }
		  
		sc1.close();
		sc2.close();
		
	}

}
