
public class If_dowhile1 {

	public static void main(String[] args) {

		/*
		 * ���빮�� do~while ������ 6�� �߿��� 35 �̻� ������ڸ� ����Ͻÿ�.
		 */

		/*
		 * int dw = 1; int total ; do { total = dw * 6 ; if(total>=35) {
		 * System.out.println(total + " "); }
		 * 
		 * dw++;
		 * 
		 * }while (dw<=9) ;
		 */

		/* ���빮�� 14���� 27���� ������ ¦���� ��� ���Ͽ� ����������� ����Ͻÿ� */
		int a1 = 14; //���۰�
		int a2 = 0;  //���� ���尪 ->����
		do {
			if (a1 % 2 == 0) {
				a2 += a1;
			}
			a1++;
		} while (a1 <= 27);

		System.out.println(a2);  // ����������� �˰������ while�� ������ �����  // while ������ ���� 14+15+16... ������� Ƣ���
	}

}
