import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ���� ���ڹ迭 ������ ���� �ֽ��ϴ�. a1 : ȫ�浿, �̼���, ������, ������, ������ a2 : 100 , 80 , 39 ,
		 * 60, 55 "�˻� �ϰ��� �ϴ� �̸��� �����ּ���" ��� ����ϰ� �˴ϴ�. �˻�� �̼��� �̶�� �˻��� �ϰ� �Ǹ� �̼��Ŵ��� 80��
		 * �Դϴ�. ��� ����� �Ǿ�� �մϴ�.
		 * 
		 * main class�� �迭��..
		 */

		String a1[] = { "ȫ�浿", "�̼���", "������", "������", "������" }; // a1 �迭
		String a2[] = { "100", "80", "39", "60", "55" }; // a2 �迭
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���?");
		String usernm = sc.next(); // ����ڰ� �Է��� ������ usernm -- ��


		jumsu j = new jumsu();                          //class �����ϸ� ���μ���..  class jumsu -> jumsu j��..
		      j.ck(a1, a2, usernm);                     //(jumsu) j .ck��� �޼ҵ忡 ���� ��������..   J�� ������ ����
		
		
		    //jumsu j
		
		      
		      
		      class jumsu {

			                 //a1 �迭       ,  a2 �迭       , ������ �Է��� ���� usernm
			public void ck(String data1[], String data2[], Straing user) {

				
				
				System.out.println(Arrays.toString(data1)); //data1 �迭���� ����Ͻÿ�.
				System.out.println(Arrays.toString(data2)); //data2 �迭���� ����Ͻÿ�.
			
			}
			
			

		}

	}
}

//		String aa[] = { "ȫ�浿", "�̼���", "������", "������", "������" };
//
//		String bb[] = { "100", "80", "39", "60", "55" };
//
//		to1 toto1 = new to1();
//
//		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
//		Scanner sc = new Scanner(System.in);
//		String user = sc.next();
//		toto1.su1(aa, bb, user);
//
//	}
//
//}
//
//class to1 {
//
//	public void su1(String e[], String f[], String g) {
//
//		int aab = e.length(); // �̸�
//		int aac = f.length(); // ����
//
//		int a; // �ݺ��� ����
//		int ff = 0;// if�� ī����
//
//		String z;
//
//		for (a = 0; a < aab; a++) {
//
//			int b;
//			for (b = 0; b < aac; b++) {
//
//				if (g.equals(e)) {
//
//				}
//
//			}
//
//		}
//
//	}
//
//}