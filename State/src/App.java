
public class App {

	public static void main(String[] args) {

		int a1 = 25 + 31 * 4 + 12;

		int a2 = 15 * 3 + 9 + 14;

		if (a1 > a2) {
			System.out.println(" ��2�� ����");
		} else if (a1 < a2) {
			System.out.println("��1�� ����");
		}

		int a11 = 25 + 31 * 4 + 12;
		System.out.println(a11);
		int b11 = 15 * 3 + 9 + 14;
		System.out.println(b11);

		if (a11 > b11) {
			System.out.println("����2�� ���� �۽��ϴ�.");
		}

		else if (a11 < b11) {
			System.out.println("����1�� ���� �۽��ϴ�.");

		} else {
			System.out.println("�� ���� �����ϴ�.");
		}

		/* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
		// % ��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.

		int c = b11 % 2;

		// int c = 10 % 2 ;
		System.out.println(c);

		if (c == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

	}

}
