import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/*
		 * ���빮��
		 * 
		 * while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�. ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�. ù��° ������
		 * "7000�� �����Ͻðڽ��ϱ�?" ��� ��µǸ�, ���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰� �Ǿ� ���ϴ�. ��, 2��� �Է½� ��������
		 * �ݾ׿� �߰��Ǿ����� �ȵ˴ϴ�. �� ���� Ƚ���� 4�� �Դϴ�. �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�. 1�� Ŭ���� 7000��
		 * �߰� 2�� Ŭ���� 0�� �߰�
		 */

		Scanner sc = new Scanner(System.in);
        final int mo1= 7000;      // �߰��� �ݾ�. ���밪
		int a = 1;                // �ݺ����� �� ����
		int total = 0;            // �ѱݾ�
		int user;                 // ����ڰ� �Է��� ����

		while (a <= 4) {
	        	   System.out.println("7000�� �����Ͻðڽ��ϱ�?");
                   user = sc.nextInt();
	           if(user == 1)
				total = total + mo1;      //total += mo1;
				a++;
			}

		System.out.println("�� �ݾ��� "+total+"�Դϴ�.");
	}

}
