
public class If_while1 {

	public static void main(String[] args) {

		/*
		 * ���빮�� while������ 10~30 ���� �߿��� Ȧ������ ����Ͻÿ�. 20�̻�
		 */

		int a = 10;
		while (a <= 30) {
			if (a % 2 == 1) {
				if (a > 20) {
					// System.out.println(a); // ���
				}
			}
			a++;
		}

		// ī���ͷ� ���� �ľ��ϱ�
		// 1~10���� �����߿� ¦������ � �ִ��� ������ �ľ��Ͻÿ�

		int ww = 1;
		int count = 0; // ī���� ���� ��0
		while (ww <= 10) {
			if (ww % 2 == 0) { // ¦���� ���
				count++; // �ش������� ������� 1�� ����

			}
			ww++;

		}
		// �ݺ��� ����� ���� ī���� ���� ����ϰ� �˴ϴ�.
		System.out.println("1~10 �����߿� ¦�� ������ " + count);
	}

}
