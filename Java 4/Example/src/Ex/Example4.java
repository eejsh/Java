package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/* ����ڰ� ���� �Է� �޽��ϴ� - scanner
		 * ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ�� �մϴ�.
		 * �� ���� �Է��� 7�� �̸�, �ش� ���� ����ڰ� �Է��� ���ڸ� ������������ ���� �մϴ�.
		 * 
		 * "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ� :- 7��
		 * ���[6,22,37,44,45,80,100]
		 * 
		 * */	Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data = new LinkedList<>();
		LinkedList<Integer> data1 = new LinkedList<>();
		int w = 0;
		
		do {
			System.out.println("���� �ϳ��� �Է��� �ֽñ� �ٶ��ϴ�.");
			try {
				Integer ck = Integer.valueOf(sc.next());
				if(ck%2==0) {
					data.add(ck);
				}else {
					data1.add(ck);
					
				}
			}catch(Exception e) {
				
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
			} w++;	
			}while(w<7);
		Collections.sort(data);
		Collections.sort(data1);
		System.out.println(data);
		System.out.println(data1);
		
	
//	  Scanner sc = new Scanner(System.in);
//	  ArrayList<Integer> userin = new ArrayList<>();
//	  
//	  int f;
//	  Integer ab;
//	  for(f=1; f<=7; f++) {
//
//		  System.out.println("���ڸ� �Է��� �ּ���. ");
//		  try {
//				ab=sc.nextInt();
//		      userin.add(ab);
//
//		  }catch(Exception e) {
//			  System.out.println("���ڸ� �Է��� �ּ���.");
//			 }
//	  }
//
//	    Collections.sort(userin);
//     System.out.println(userin);
//		
//	
	
	
	
	
	
	
	
	
	
	
	
	}

}


