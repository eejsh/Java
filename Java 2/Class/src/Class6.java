import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {

		// static �� �������� �޸� �ο��� ����.. ������ �޸� ������ �������ϴ�.

		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		// datalist da = " "; // �ʱ�ȭ ��Ű��

		// String pay = "�ſ�ī��";
		String pay = "������";

		if (pay.equals("�ſ�ī��")) {
			da.pay1(); // �ش� ���ǿ� �´� �޼ҵ带 ȣ��
		} else {
			da.pay2(pay); // �޼ҵ忡 ��ü���� �׿��� ���� (��ü���� ���Ѵ�) pay2��� �޼ҵ�� �Ѱ��ּ���.
		}

		/*
		 * ���빮�� �ش� �ε��� class ���� agree ��� �̸��� ������ �ֽ��ϴ�. main �޼ҵ忡�� ����ڰ� "������", "���Ǿ���"��
		 * �Է��ϰ� �˴ϴ�. ���������� �Է� �Ǿ��� ��� "ȸ�������� ����˴ϴ�. " ��� �޼����� ����ϰ�, ���Ǿ����� �Է½�
		 * "���Ǹ� �ϼž� ���� �˴ϴ�." ��� ��µǵ��� �Ͻÿ�. ��, agrss Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带
		 * �����Ͻÿ�.
		 */

		System.out.println("������,���Ǿ���");

		Scanner sc = new Scanner(System.in);

//		String sc1 = sc.next();
//		if (sc1.equals("������")) {
//			da.agree1();
//		} else {
//			da.agree2();
//		}

		// ������Ǯ��
		// ��ĳ�� ž��
		System.out.println("����� �����Ͻðڽ��ϱ�? ");
		String atext = sc.next();
		agrres ag = new agr();
		ag.agr(atext);

		sc.close();

	}

}

class datalist {
	/*
	 * static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ� �ϴ� �κп����� static�� �̿��Ͽ�
	 * ����մϴ�.
	 * 
	 * static (�����޼ҵ�) : �������̵��� ����� �� �����ϴ�. void�� ��� (�����޼ҵ�) : �������̵��� ����� �� �ֽ����.
	 * �������̵� ���� class a{ void �޼ҵ�
	 * 
	 * } class b extend a { void �޼ҵ� }
	 */

	public void array_data(int a) { // static ���� �޼ҵ�

		int w = 1;
		while (w <= 9) {
			System.out.println(a * w);

			w++;
		}

	}

	public void pay1() {
		System.out.println("�ſ�ī��� ���� ���� �մϴ�.");
	}

	public void pay2(String pm) {
		System.out.println(pm + "���� ���� ���� �մϴ�."); // �� if ���� else���� ���� �޾� ���.

	}

//	public void agree1() {
//		System.out.println("ȸ�������� ����˴ϴ�.");
//
//	}
//
//	public void agree2() {
//		System.out.println("���Ǹ� �ϼž� ����˴ϴ�.");
//	}

	public void agr (String k ) {
		
		String msg;
		
		if(!k.equals("������")) {    // ! �������� �ݴ�.. !k.equals = ���Ǿ���.
			msg = "���Ǹ� �ϼž� ���� �˴ϴ�."
		}
		else {
			msg = "ȸ�������� ����˴ϴ�."
		}
		
	}

}