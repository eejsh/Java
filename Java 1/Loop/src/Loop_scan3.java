import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		
		
		// ��ĳ�ʸ� �̿��� do~while�� ����Ͽ� �������� ��µǴ� ���α׷��� �����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���");
		int gugu = sc.nextInt();
		
		int c = 1 ; //�ʱⰪ
		int d ;  //��°�
	
		do {
			d = gugu * c ;             //����
			System.out.printf(d+" ");
             c++;              //��������
		}while( c < 10 );   // �ݺ���. 1.2.3.4.5.6.7.8.9 = 9ȸ  C�� 10�� ����������.

		sc.close(); 
		
		
		
		
	}

}

