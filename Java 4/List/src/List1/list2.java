package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� �ش� ������ �� �� �޸�� �����ʹ� ��� ���� �ؾ� �մϴ�. �� ������ :
		 * {"�����","������","��â��","�ڵ���","�̰���","�����","������"} ��� : �����, ������
		 * 
		 * �ݺ���
		 */
		// [0][1][2][3][4][5] -->�ε���, node
//		String user[] = { "�����", "������", "��â��", "�ڵ���", "�̰���", "�����", "������" };
//		ArrayList<String> ar = new ArrayList<>(Arrays.asList(user));
//		int ea = ar.size();  
//		int w = 0;
//		while (w < ea) {
//			int ea2 = ar.size();             //node�� ������ �ٽ� �ľ���.. -->�����Ͱ� �ٲ�鼭 ������ �ٲ�� ������.
//			int ww = 0;
//			while (ww < ea2) {
//				if (!ar.get(w).equals("�����") && !ar.get(w).equals("������")) {
//					ar.remove(0); // �ش�Ǵ� ���� ����� �Ѵٸ� 0���� ����. // �Ǿպ��� ������.
//					System.out.println(ar);
//                	}
//			}
//			w++;
//		}

		/*
		 * ���빮�� ¦���� ���ڸ� ��� �����մϴ�. {10,7,6,1,11,37,41,22}
		 */

		Integer num[] = { 10, 7, 6, 1, 11, 37, 41, 22 };
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(num));
//		int ea1 = ar2.size();
//		int ww1 = 0;
//		while (ww1 < ea1) {
//			int ww2 = 0;
//			int ea11 = ar2.size();
//			while (ww2 < ea11) {
//				if (ar2.get(ww2) % 2 == 0) {
//					ar2.remove(ww2);
//				}
//				ww2++;
//			}
//			ww1++;
//		}
//		System.out.println(ar2);

		
		//Ǯ��.
	       int no = ar2.size();
	       int z=0;
	       
	       do {
	    	   int no2 = ar2.size();
	    	   int zz = 0;
	    	   do {
	    		   if(ar2.get(zz)%2==0) {
	    			   ar2.remove(zz);
	    			   break;
	    		   }
	    		   zz++;
	    	   }while(zz<no2);
	    	   z++;
	       }while(z<no);
	       System.out.println(ar2);		   

	}

}
