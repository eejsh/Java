import java.util.Scanner;

public class For_scan1 {
	public static void main(String[] args) {

	/*tip
	 * int a = 5;
	System.out.println(a++); //�� ���� �� ����  = 5
	System.out.println(++a); //���� �� �� ����  = 7	
	int b = 10 ;
	int c = 10 ;
	//int d = b + c++ ;  // ��� ������Ŵ
	  int d = ++b +c ;  // ���� �� ����   c + (++b)
	System.out.println(d);  */
	
	Scanner sc = new Scanner(System.in);        // �Է¿���
	int jumsu;                                  // ����� �Է� ����
	int f;                                      // �ݺ���
	int total = 0;                              // ����ڰ� �Է��� ���� ���� �հ�
	
	for (f=1; f<4; f++) {          //3��
		System.out.println("������ �Է��� �ּ���."); 
		jumsu = sc.nextInt();                    // ����ڰ� �Է��� ��
		total += jumsu;                          // ����ڰ� �Է��� ���� �հ躯���� �̰�  total = total + jumsu;
					
	}System.out.println("�� ������ ���� " + total);
	sc.close();	      // ��������
	
	
		
 }
}