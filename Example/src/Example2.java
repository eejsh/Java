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
		// 2�� 90�� ���;ߴ�..
		
	Scanner sc = new Scanner(System.in);
	System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���");
	int gu = sc.nextInt() ;
	
	int a = 1;    //����	
	int to =0 ;
    int to1 ;
 do {  
	    to += (gu * a) ;
	      a++;
}while(a<=9) ;
    if (to %2 == 0) {
    	System.out.println("¦�� �Դϴ�. " ) ;
    	}
    
    else  {
      System.out.println("Ȧ�� �Դϴ�. ");
    }
  sc.close()
}}


