import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {

		// Ŭ���� + �޼ҵ� + �迭

		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է����ּ���.");

		String name = sc.next();

		String users[] = { "ȫ�浿", "�̼���", "������" };

		arrays.lists(users, name); // �迭��, �Է°��� lists�� �����ּ���.

		sc.close();

	}
}

class arrays {

	public static void lists(String a[], String n) { // �迭�� ������

		// System.out.println(Arrays.toString(a));

		/*
		 * ���빮�� ����ڰ� �ڽ� �̸��� �Է��մϴ�. ����� �̸��� �ش� class ������ ��ϵ� ����� ���� �� ������ ����� ������ �����ϴ�
		 * �ڵ带 �ۼ��Ͻÿ�. ��ϵ� ������� ���, "������ �Ǿ� �ֽ��ϴ�." ��� ����ϰ� , Ȯ���� ���� ���� ��� "�̰����� �Դϴ�." ���
		 * ����Ͻÿ�.
		 */

		int w=0;                  // �ݺ��� �⺻��
		int ea = a.length;      //�迭 �ݺ���
		
		String msg = ""; // �޼ҵ�� �ش簪�� �����Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����ϼž� �մϴ�.
		// Stirng "" �Ǵ� null int = 0 ���� ǥ���մϴ�.. ��.

		boolean ck = false;

		while (w < ea) {
			if (n.equals(a[w])) {
				msg = "������ �Ǿ��ֽ��ϴ�.";
				ck = true;
			}
			w++;
		}
		if (ck == false) {
			msg = "�̰����� �Դϴ�.";
		}

		arrays ar = new arrays();
		ar.message(msg);

		// message(msg); ->static �����ؾߵ����� �޸� �Ҵ�.. �Ⱦ��°� ����

	}

	public void message(String m) {
		System.out.println(m);

	}

}
