import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		 /* ���빮�� 3. 
		  * ����ڰ� �ش� ���� �Է��մϴ�.
		  * �� , ����ڰ� �ΰ��� ���ڸ� �Է��ϵ�, ù��° ���ڿ� �ι�° ���� ���� �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
		  * ��, �ش� �ڵ�� do~while������ �ۼ��մϴ�.
		  * ����, 1��° ���� ���ڴ�?  5
		  *      2��° ���� ���ڴ�?  10 
		  *        ���� ���� ��� �հ�� :45 �Դϴ�.      */
		
		
		/* Scanner user1 = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		
		int us1 = user1.nextInt();         // ��� �ʱ�
		        
		Scanner user2 = new Scanner(System.in);
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		
		int us2 = user2.nextInt();        		
		int total = 0; // ��� 
		
	 	do { 
			total += us1;
        	us1++;
		}while (us1 <= us2) ;
		System.out.println("���� ���� ��� �հ�� :" + total + "�Դϴ�.");
		
		user1.close();	 
		user2.close();   */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int a = sc.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int b = sc.nextInt();
		
		int total=0;
		
	do {
	total += a;   //total = total+a;
	a++;
	}while(a<=b);
		
		System.out.println(total);
	
		sc.close();
		
	}

}

