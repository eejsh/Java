import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		/*  ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, ������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
		 *  "�����ܿ� ���� ���ڸ� �Է��ϼ���" ��� �޼����� ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���Ͽ�,
		 *  ���Ѱ��� ���� ¦�� ���� Ȧ�� ������ ����Ͻø� �˴ϴ�.
		 *  ��, �ش� �ݺ����� for~ do while �� �� �Ѱ����� �����Ͽ� �ۼ��Ͻÿ�.
		 *  (�հ�)
		 *  ��.�ݺ��� �ȿ� ������ �ȵ�. �ݺ����ȿ� ���ǹ��� ������ �ȵ˴ϴ�...........
		 *  */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���");
		
		int a = 1 ; // �ݺ��� ���
		int b;
		int user ;  // ���� �Է�
		int to1 = 1;    // �� �ݾ� 
		do {
			user = sc.nextInt();
			to1 = user * 1 ;
			
			a++;
		}while (a<=9) ;
		
		
		
		System.out.println();
				
		
	}

}

