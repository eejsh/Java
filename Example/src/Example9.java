import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
	/* ���빮�� 9
	 * A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
	 * "������ �Է��ϼ���"��� ������ �� 5���� ������ �Ǹ�, ��� ������ �ջ� �� �� 5���� ������ ���� ��հ��� ����ϼž� �մϴ�.
	 * ��� �޼����� "�ش� ������ ������: " ���
	 * ��, ���� ������ 40�� ���� �� ��� "������Դϴ�." ��� �޼����� 
	 * ����� ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�"�̶�� �޼�����
	 * ����Ͻʽÿ�.
	 * 
	 * [�߰���ȹ]
	 * "�Է��Ͻ� ���� ���� �����ּ���: " ��� ���ϸ��� ��� ��
	 * �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ���� �Ǿ���մϴ�.
	 * for ��
	 * 
	 * */
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ������� �����ּ���");
		
		
		int a ;    //�ʱⰪ
		int b ;    //�Է�
		int total = 0; // �հ�
		int c ;  // �Է� �����
		int total2 ;  // ��հ�
		c = sc.nextInt();
		
		for(a=1;a<=c;a++) {
		 	
			System.out.println("������ �Է��ϼ���.");
			b = sc.nextInt();
            total += b;
		}			
		    //System.out.println("�� ������ :"+total+" �Դϴ�.");
	          
		        total2 = total / c ;
		
				System.out.println("�ش� ������ ������: " + total2 +"�Դϴ�.");	
			
				if(total2 >= 40) {
				System.out.println("�հ�");
			}
		    	else if(total2 <= 40) {
				System.out.println("������Դϴ�");
			}
			
		sc.close(); */
	
	 //������ Ǯ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� ������� �����ּ���.");		
		int w = 1;
		int user ;
		int total = 0;
		
		int subject = sc.nextInt();

		
		
		while (w<=subject) {
			System.out.println("������ �Է��� �ּ���.");
		    user = sc.nextInt();
	        //total += user;
		    total = total + user;
		    w++ ;
		     }
		//		System.out.println("���� �հ� ������ " + avg + " �Դϴ�.");
	       double avg  = (double)(total) / subject ;     // �Ҽ��� ����       total�� double �Լ� �߰� ������ �Ҽ������� ǥ��
	       String msg ;
		     if(avg < 40 ) {
	        	msg = "����� �Դϴ�.";  
	      }
	      else {
	        	  msg = "�հ� �Դϴ�.";
	      }
   System.out.println("���� ��� ������ : "+ avg+ " �̸�,"+ msg );
	        
	  sc.close();
	  
	}

}

