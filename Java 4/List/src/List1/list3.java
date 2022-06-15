package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
	/* [응용문제]
	 * number data = {
	 * 넘버데이터1  3,6,9,12,15
	 * 넘버데이터2  2,4
	 * 
	 * 결과 3,6,9,12,15,2,4
	 * */
		
		//arrays.sort : 배열변수 형태에만 적용합니다.
	Integer	a[] = { 3,6,9,12,15 };
	Integer	b[] = { 2,4 };
		
	ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(b));

	ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(a));
	
	int w =0;
	int ea =ar.size();
	
	  while(w<ea) {
	    ar2.add(ar.get(w));
	    	w++;
	}
	
	  Collections.sort(ar2);  //ArrayList, LinkedList  - 오름차순 정렬하기.
	System.out.println(ar2);
	
	int ea2 = ar2.size();
	System.out.println(ea2);
	
	
	
	
//	ar2.sort(null);
//	System.out.println(ar2);
	
	
		
	}

}
