import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {

		/*
		 * ���빮�� �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� �����˴ϴ�. �� �� ���������� ���� 3 �̸�(3�� ������) ���� Ȯ���Ͽ�
		 * �迭 �����͸� �簡�� �մϴ�.
		 *
		 * ȫ�浿, �̼���, ������, �������, ������, ������ 6�� 4 , 3 , 1 , 1 , 2 , 2 
		 * ["������", "�������", "������", "������"]
		 */

		String member[] = { "ȫ�浿", "�̼���", "������", "�������", "������", "������" };
		
		int lv[] = { 4, 3, 1, 1, 2, 2 };

		int n_lv[] = new int[4];

		String new_member[] = new String [8] ;
		
		
		int ea = member.length; // 6��

		int f; // �ݺ����� ����� ���� 0~
		int ct = 0; // if���� ����� ����

		for (f = 0; f < ea ; f++) { //
                                           
			if (lv[f] < 3) { 
                    	n_lv[ct] = lv[f]; // �� �Ҵ�� n_lv �� lv[a]���� (�ݺ���) 1�� �߰��ɶ����� if �� ���ǿ� �´� ���� b�� ��������.
                	new_member[ct] = member[f];                  	
               	
                  //	System.out.println(member [f]);
                 	
				ct++; // if������ 1+ �߰�
			}

		}
		System.out.println(Arrays.toString(new_member));
		

		
		
		
	}
}
