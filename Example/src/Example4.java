
public class Example4 {

	public static void main(String[] args) {

		/*
		 * ���� ������� ���缭 �ڵ尡 ��µǵ��� �Ͻÿ�. �ش� �ڵ�� for ������ �ۼ��Ͻÿ� 45 35 25 15 10
		 */

		int f;
		int v;

		for (f = 9; f > 0; f--) {

			v = 5 * f;

			if (f % 2 == 1 || f == 2 || f >= 10) {
				if (f != 1) {
			
					System.out.println(v);
				}

			}

		}

	}

}
