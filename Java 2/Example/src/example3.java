import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {

		/*
		 * �迭 = �⺻(Ŭ����) �޼ҵ� ���� \ product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ���� moneys :
		 * 35000,8000,4000,5500,3800,4400,11000,18900 ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�. �� �� �� �����
		 * �ٳ����� �����ϰ� �� �����ݾ��� ����Ͻÿ� // 90600 - 15000 = 75600
		 */

		String pro[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };
		int a[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };

		bas(pro, a);

		totals(pro, a);

	}

	public static void bas(String pro1[], int aa[]) {

		int ea = pro1.length; // �迭�����ľ�
		int o = 0; // �ݺ���
		int total = 0;

		do {
			if (!pro1[o].equals("���") && !pro1[o].equals("�ٳ���")) { // �ݺ���o��// !=�ƴϸ��� ǥ��, pro[]=�迭 ���߿� .equals (���ڿ�) &&
																	// =����� �ٳ��� �Ѵ��������
				// System.out.println(pro1[o]);

				total += aa[o];
			}
			o++;
		} while (o < ea);

//		System.out.println(total);
	}

	public static void totals(String p[], int m[]) {
		// for each������ ������ ��� �迭�� �ٷ������ص��˴ϴ�.
		int eaa = p.length;
		int w = 0;
		int total = 0;

		while (w < eaa) {
			if (!p[w].equals("���") && !p[w].equals("�ٳ���")) {
				// System.out.println(Arrays.toString(p[w]);
				total += m[w];
			}
			w++;
		}
		System.out.println("���������ݾ��� " + total + " �Դϴ�.");

	}

}
