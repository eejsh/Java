import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	  /*  "���빮�� 3���� ��ǰ "���ڵ�� ��ǰ�� �Է½��� �ּ���?" �ݾ��� �Է��ϰ� ����
	      ���� %�� �Է��� �ּ���" ��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ�, ���� �ݾ��� ���� �Ǿ� ��µǵ��� �մϴ�.   
	              int money = 10000;
		       int coupon = 20;
		       double a = coupon * 0.01 ;
		       double b = money * a; //= 2000���� ��.
		       //   ���� �� - 2000�� �������� ��.
               
	       
	       double c = money - b;
		       System.out.println(c);  */
	
		   double dis = 0.01  ; //* 0.01;  //����..�Է�
		   double dis2 ;
		   double c  ; //���� �ݾ� * ������ = ���α�
		   double total ; // ������
		  
		   int us ;  // �Էµ� �� �ݾ�
		   int usto = 0 ;  //�հ� �ѱ�
		     int b ;  //�ݺ�
		   Scanner sc = new Scanner(System.in);
		  
		       for(b=1;b<=3;b++)   {
		          System.out.println("���ڵ�� ��ǰ�� �Է��� �ּ���?");
		         us = sc.nextInt();
		         usto += us ;
		          }
		       
		       System.out.println("���� %�� �Է��� �ּ���.");
		        dis2 = sc.nextInt();
		       
		          c =  dis * dis2 ;   
		         
		         total = usto - (usto * c);
		         
		        System.out.println(total);
		        
		        sc.close();
		        
		        
		        
	}

}