package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/* 사용자가 직접 입력 받습니다 - scanner
		 * 단, 사용자가 문자를 입력할 경우 예외처리가 진행되어야 합니다.
		 * 총 숫자 입력은 7번 이며, 해당 숫자 사용자가 입력한 숫자를 오름차순으로 정렬 합니다.
		 * 
		 * "숫자를 하나 입력해 주시길 바랍니다 :- 7번
		 * 결과[6,22,37,44,45,80,100]
		 * 
		 * */	Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data = new LinkedList<>();
		LinkedList<Integer> data1 = new LinkedList<>();
		int w = 0;
		
		do {
			System.out.println("숫자 하나를 입력해 주시길 바랍니다.");
			try {
				Integer ck = Integer.valueOf(sc.next());
				if(ck%2==0) {
					data.add(ck);
				}else {
					data1.add(ck);
					
				}
			}catch(Exception e) {
				
				System.out.println("숫자를 입력하셔야 합니다.");
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
//		  System.out.println("숫자를 입력해 주세요. ");
//		  try {
//				ab=sc.nextInt();
//		      userin.add(ab);
//
//		  }catch(Exception e) {
//			  System.out.println("숫자만 입력해 주세요.");
//			 }
//	  }
//
//	    Collections.sort(userin);
//     System.out.println(userin);
//		
//	
	
	
	
	
	
	
	
	
	
	
	
	}

}


