import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���.");
		int no = sc.nextInt();

		// memorys m = new memorys(); -����ϰ���..
		memorys m = null; // �޸� ���� �ϸ鼭 ���� ����.
		m = new memorys();
		m.ms(no);

		m = null; // �ش� �ν��Ͻ��� ��� (���̻� �Ⱦ��ڴ�... �޸��ʱ�ȭ)

		
		
		m = new memorys();
		m.rd();
		
		
		
	}

}

class memorys {

	public void ms(int user) {

		// Math.random () �����޼ҵ� ���� �⺻ �ڷ����� double�Դϴ�. (�⺻������ ������ �Ҽ�����. int�� ���� ���� �ʿ���)
		// random =>�����ڵ�, �����ڵ�, ������÷�̳� �귿.. ���� ���!

		double a = Math.random(); // 0.0~1.0

		int w = 0;
		while (w <= 10) {
			int b = (int) (Math.random() * 9) + 1; // ���� ������ (int)(Math.random()*10) 10��0~10 , 100�� 0~100..
		//	System.out.printf("%d ", b);
			w++;

		}

//		if(user==b) {
//			System.out.println("��÷");
//		}
//		else {
//			System.out.println("������ȸ��");
//		}

		// System.out.println(b);

	}

	
	public void rd() {              //random util ����
		Random r = new Random();    //random ��ü ���� �� �ν��Ͻ� ���� -> �޸𸮿� �۵���.
		
		
		int w = 0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1);  // 0~9������ ��. nextint(10)�����. nextint(10)+1 = 0~10����.
           w++;			
		}
		
		r=null;  //������ƿ �� ����.
		
 		
	}
	
	
	
}





