import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		
		/* ���빮�� 
		 * �� 2���� ������ �ϰ� �˴ϴ�.
		 * ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� ��ĳ�ʸ� �����Ͻÿ�.  
		 */
		Scanner sc = new Scanner(System.in);
		
		int a=1 ;
		int to1 = 0;
		int su ;
				
		while(a<=2){
			System.out.println(a+"��° ���ڸ� �Է��ϼ���."); // System.out.println("���ڸ� �Է��ϼ���");
			su = sc.nextInt();
			to1 += su ;
				a++;
		}
		System.out.println("�� �հ� ���� "+to1+"�Դϴ�.");
		
		sc.close();

		
		
		
		
		
		
	}

}
