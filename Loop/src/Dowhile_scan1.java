import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
     /*���빮��
      * ����ڰ� �� 3���� ���ڸ� �Է��մϴ�. 
      * 3���� ���ڸ� ��� ���Ͽ� �� �հ���� ����Ͻÿ�.
      * 
      * 123456789 * 123456789 * 123456789
      * */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1; // �ݺ��� ��� 
		int user ; // ����� �Է°�
		long to1 = 1; // �� ���尪  ������ 0 ������ �ȵ�.��    long�� �Է½� ����������� -���� �߻���.
 	  
		do {
			System.out.println( a +"��° ���ڸ� �Է��ϼ���.");
			user = sc.nextInt();
			to1 *= user ;      // to1 = total + user ;
			a++;
		}while(a<=3);
		
			System.out.println("�� �հ�� " + to1+"�Դϴ�.");
             
			sc.close();
	}

}
