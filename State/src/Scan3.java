import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {

		/*���빮��
		 * ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�.
		 * Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?
		 * ������� : ¦�� , Ȧ�� ���Դϴ�. ��� ���.
		 * 
		 * */
		
		
		/* Scanner a = new Scanner(System.in);
		System.out.println("Q : ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���.?");
		
		int b = a.nextInt() ;
	
			if ( b%2==1 ) {
	System.out.println("Ȧ���� �Դϴ�.");
			}
					
				else {
			System.out.println("¦�� �� �Դϴ�.");
				}
		   */
		
		Scanner k = new Scanner(System.in);
		System.out.println("Q : ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?") ;
		
		
		int z = k.nextInt()  ; // % 2;
		//% : ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		
		if ( z % 2 == 0) {
			System.out.println("¦�����Դϴ�.");
		}
	
		/*else if (z % 2 ==1 ) {
			System.out.println("Ȧ�� ���Դϴ�.");
		} */
		
		else {
			System.out.println("Ȧ�����Դϴ�.");
		}
				
				k.close(); 
				
				
			
		
	}

}
