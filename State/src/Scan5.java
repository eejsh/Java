import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		// ���Ǻ��� ���� ����

	/* 	byte a = 10;
		if (a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
		} else if (a >= 10 || a <= 22) { // ���ǹ��� ������ �����Ͽ� ������.
			System.out.println("��÷ �Դϴ�..");
		} else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}

  */
		/*
		 * [���빮��] Q. 1~45���� ���� �ϳ��� �Է��ϼ��� ?
		 * 
		 * error���� 0�� �Է� : ���� �Է��� �߸��Ǿ����ϴ�.
		 * 
		 * 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 * 
		 * 
		 * 
		 * 1~45 ���ڸ� �Է� �Ͽ��� ��� 7.12.14 ���� �� �Է½� ��÷�Դϴ�. ��� ��� �� ���� ������ ������ȸ�� �����ϼ��� ��� ���
		 */

	/*  	Scanner a1 = new Scanner(System.in);
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���.");

		int b1 = a1.nextInt();

		int b2 = 7;
		int b3 = 12;
		int b4 = 14;

		if (b1 <= 1 || b1 <= 45) {
			System.out.println(b1);

			if (b1 == 0) {
				System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
			}
		} else if (b1 > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}

		if (b1 == b2 || b1 == b3 || b1 == b4) {
			System.out.println("��÷�Դϴ�.");
		}

		else {
			System.out.println("������ȸ�� �����ϼ���.");
		}

		*/ 
		//���ǹ� �ȿ� ���ǹ� if-else if- else
		
		Scanner qa = new Scanner(System.in) ;		
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���?"); 
		
		int n = qa.nextInt() ;    //����� �Էºκ��� ��
				
		if(n == 0 ) {
			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
		}
		else if( n > 45 ) {
           System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");		
		}
		else {
			if (n == 7 || n==12 || n==14) {
				System.out.println("20%���� ��÷�Դϴ�.");
			}
			
			else if (n==41) {
				System.out.println("50% ���� ��÷ �Դϴ�.");
			}
		
			else {	
			System.out.println("���� ��ȸ��...");
			}
	
		}
		
	qa.close();

	}
}

