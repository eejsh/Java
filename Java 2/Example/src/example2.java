import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {

		/*
		 * �迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * 
		 * product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ���� �� ����, ��, Ű���� �����Ͽ����ϴ�. �ش� ���� �� �迭�� �ٽ�
		 * �� ����Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ�. ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ� �ݺ����� free�Դϴ�.
		 * 
		 * ��� : [����, ���, ����, �ٳ���, ����]
		 */

		String aa[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };

		ffa(aa);
	//	basket(aa);

	}

	public static void ffa(String ff[]) {
		String np[] = new String[5];
		int a;
        int eaa = ff.length;  //�迭�����ľ�
		int b = 0; //ifī����
        for (a = 0; a < eaa; a++) {
			if (!ff[a].equals("����") && !ff[a].equals("��") && !ff[a].equals("Ű��")) {
				np[b]=ff[a];
				b++;
			}
		}
        System.out.println(Arrays.toString(np));
        
        
	}

//	public static void basket(String pd[]) {
//
//		int ea = pd.length; // �迭�����ľ�
//		int no = 5;
//		String newproduct[] = new String[no];
//		int idx = 0;  //if ī����
//
//		for (String p : pd) { // for-each
//
//			if (!p.equals("����") && !p.equals("��") && !p.equals("Ű��")) {
//				// newproduct[]�ȿ� if�� �ȿ� �´������� 1�� �߰��Ͽ� �־��ּ���.
//				newproduct[idx] = p;
//				idx++;
//			}
//		}
//		System.out.println(Arrays.toString(newproduct));
//	}

}
