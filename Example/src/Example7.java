import java.math.BigInteger;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
	
		
		/*���빮��7
		 * ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		 * 
		 * "ù��° �Է°��� ��(1~10����)�Դϴ�." 
		 * "�ι�° �Է°��� ��(1~10����)�Դϴ�."
		 * "����° �Է°��� ��(1~10����)�Դϴ�."
		 * "������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�"
		 * �ش� �����ȣ�� �°� ����Ŀ� �����Ͽ� �������� ��½�Ű�ÿ�. 
		 * */
		/* 
		Scanner a1 = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int user1 = a1.nextInt();
		System.out.println("ù��° �Է°��� "+user1+"�Դϴ�.");        //���1
		
		int user2 = a1.nextInt();
		System.out.println("�ι�° �Է°��� "+user2+"�Դϴ�.");        //���2
		
		int user3 = a1.nextInt();
		System.out.println("������ �Է°��� "+user3+"�Դϴ�.");         //���3
		
		
		System.out.println("������ �����Դϴ�. ������ ���� ���� �����ȣ�� �־��ּ���.");
	    String user4 = a1.next();

	    int add1 ;   //����
	    int sub1 ;   //����
	    int mul1 ;   //���ϱ�
	    int div1 ;   //������
	    
   	    
	    if (user4.equals("+")) {
	    
	    	add1 = user1 + user2 + user3 ;
	    	System.out.println(add1);
	       
	    }
	    else if (user4.equals("-")) {
    	
	   	sub1 = user1 - user2 - user3 ;
    	System.out.println(sub1);
        }

	    else if (user4.equals("*"))
     	{
	    	mul1 = user1 * user2 * user3 ;
	    	System.out.println(mul1);
	        
	    }

	      else{

		div1 = user1 - user2 - user3;
		System.out.println(div1);
	     }

	    */
	    
	    //Ǯ��
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° �Է°� ��(1~10����) �Դϴ�.");
		int no1 = sc.nextInt();
		System.out.println("�ι�° �Է°� ��(1~10)���� �Դϴ�.");
		int no2 = sc.nextInt();
		System.out.println("����° �Է°� ��(1~10)���� �Դϴ�.");
		int no3 = sc.nextInt();
		System.out.println("������ �����Դϴ�. ������ ���� ���� �����ȣ�� �־��ּ���.");
	    String ms = sc.next();

		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
		}	
		else if(ms.equals("-")) {
			System.out.println(no1-no2-no3);
		}
		else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);
		}
		else {
			System.out.println(no1/no2/no3);     //double
		}
		
	    sc.close();
	    
       }

}
