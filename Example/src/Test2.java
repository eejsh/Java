import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * ���빮��
		 * ���� �ڽ��� ���忡�� ��.����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		 * ���� �⺻ �ڻ� �ݾ� : 100,000
		 * "1�� �Է� �� �Ա�"
		 * "2�� �Է� �� ���" �Դϴ� ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�.
		 * 1���� �Է� �� "�ش� �ݾ��� �Է��ϼ���" (�Ա�)
		 * 
		 * �ݾ� �Է� �� ) ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ�ݾ��� ��� �Ͻø� �˴ϴ�.
		 * 2���� �Է� �� "����� �ݾ��� �Է��ϼ���"
		 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ� �ݾ��� ����Ͽ� �� �ڻ�ݾ��� ��� �Ͻø� �˴ϴ�.
		 */

		int to1 = 100000;

		Scanner a = new Scanner(System.in);
		System.out.println(" 1�� �Է½� �Ա� ");
		System.out.println(" 2�� �Է½� ��� ");
		int b = a.nextInt(); // �����Է�

		int to2;

		if (b == 1) {

			Scanner mm1 = new Scanner(System.in);
			System.out.println("�ش� �ݾ��� �Է� �ϼ���.");

			int mm2 = mm1.nextInt(); // �����Է�
			to2 = to1 + mm2;
		
			System.out.println("�ѱݾ���" + to2 + "�Դϴ�.");

		}

		else if (b == 2) {

			Scanner mm1 = new Scanner(System.in);
			System.out.println("�ش� �ݾ��� �Է� �ϼ���.");
			
			int mm2 = mm1.nextInt(); // �����Է�
			to2 = to1 - mm2;
			
			System.out.println("�ѱݾ���" + to2 + "�Դϴ�.");
		}

		
		
		a.close(); 
	
		
	// ��ĳ�ʴ� ���ǹ��� �ٸ��� �ΰ� ���ư� �ʿ䰡 ����.   mm1  if, else if �� �� ���Ѱ��� ���ư����� �Ѱ��� ��Ƶ���
      
		
		//Ǯ��
		
	/*	int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ���");
		int work = sc.nextInt();
		int total;
		
		Scanner sc1 = new Scanner(System.in);
		
		
		if ( work == 1) ; {
		                System.out.println("�Ա� �ݾ��� �Է��ϼ���.");
		                total = sc1.nextInt();
		                money = money + total;          
		}
		
		else if       {
		            	System.out.println("��� �ݾ��� �Է��ϼ���.");
		            	total = sc1.nextInt();
		                money = money - total;  
			
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
			sc.close()    ;              //�߸��Է��ϸ� ��ĳ�� �����Ŵ
		}
		
		
		
		System.out.println("ó���� ������ ������ �����ϴ�. " +money+"��");
		*/
	
	
	   }
	}

