package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
	/* [���빮��]
	 * number data = {
	 * �ѹ�������1  3,6,9,12,15
	 * �ѹ�������2  2,4
	 * 
	 * ��� 3,6,9,12,15,2,4
	 * */
		
		//arrays.sort : �迭���� ���¿��� �����մϴ�.
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
	
	  Collections.sort(ar2);  //ArrayList, LinkedList  - �������� �����ϱ�.
	System.out.println(ar2);
	
	int ea2 = ar2.size();
	System.out.println(ea2);
	
	
	
	
//	ar2.sort(null);
//	System.out.println(ar2);
	
	
		
	}

}
