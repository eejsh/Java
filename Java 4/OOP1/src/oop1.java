import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		// ��� �޼ҵ� ����

		op_method om = new op_method();
	}

}

//��͸޼ҵ� : �޼ҵ带 ���� �Ǵ� �������� ȣ���ϴ� ���μ����� ���մϴ�.
// �ݺ���, �ܺ� class�� ����� �� ������ ������ ���� �ذ��ϱ� ���ؼ� �����ϴ� �޼ҵ� ���¸� ���մϴ�.
class op_method {

	Scanner sc = new Scanner(System.in);
	private String nm;

	public op_method() { // ���� ���� �޼ҵ� (1��)
		this.m1();

	}

	public void m1() { // �޼ҵ� m1�� �۵�
		System.out.println("ã�� �̸��� �Է��ϼ���?"); // (2��) -> ȫ�浿�� �ƴҽ� (4��)
		this.nm = sc.next();
		this.m2(); // m1������� m2���� ����

	}

	public void m2() {

		if (this.nm.equals("ȫ�浿")) { // m1�� ���� ������� m2�� Ȯ��
			sc.close(); // �Էµ� �����Ͱ� ȫ�浿�̸� ����. (3-1 ȫ�浿�Ͻ� ����)
			System.exit(0);
		} else {

			System.out.println("�ش��̸��� �����ϴ�.");
			this.m1(); // m1�� ��ȣ�� (��� �޼ҵ� - �Էµ� �����Ͱ� ȫ�浿�� �ƴ� �� m1���� ���ư�) (3-2 ȫ�浿 �ƴҽ� 2������)
		}

	}
}
