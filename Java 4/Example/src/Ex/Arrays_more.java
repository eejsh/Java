package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_more {

//arraylist 2�� �迭���� , ������������
	public static void main(String[] args) {

		String member_data[][] = new String[][] {
				{ "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
				{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" } };

		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
        
		// String[] : 2���迭 ����
		// Integer[] : 2���迭 ����
		
		
		int w = 0;
		
		while (w<list.size()) {   //2���� ���ư�. 
			System.out.println(list.get(0)[w]);   // w �ݺ��� �κ� / [2] �ε��� 2�� = ��ȭ��ȣ ������ ��� ��°���..��
			w++;
		}
		
		
	
		
		
	}

}
