package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		// �ܺ� class�� ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�.
		/*
		 * arraylise? linkedlist?
		 * 
		 * ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���� �迭�� �ϳ��� �迭�� ��ġ���� �մϴ�. �״��, �ߺ��� ���� �ϳ��� ó���ϼž� �մϴ�.
		 * 1�� db : 11,22,33,44,55 2�� db : 8,10,11,19 ��� ��� [8.10.11.19.22.33.44.55]
		 * 
		 * ��: collection �̿��� arraylist, linkedlist ���.
		 *
		 * 
		 * 1. 1�� DB 2�� DB �ߺ��� �� �� 2�� DB ����. 2. 2�� DB�� 1�� DB�� �߰� 3. 1�� DB sort�� ����
		 */

		outclass oc = new outclass();
		oc.filter();
	}
}

class outclass {

	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;
	ArrayList<Integer> c1 = null;

	public void filter() {

		Integer a[] = { 11, 22, 33, 44, 55 };
		Integer b[] = { 8, 10, 11, 19, 44 };

		this.a1 = new ArrayList<Integer>(Arrays.asList(a));
		this.b1 = new ArrayList<Integer>(Arrays.asList(b));

		int w = 0;
		do {
			// System.out.println(this.a1.get(w));
			int ww = 0;
			int z = b1.size();
			while (ww < z) {
				// System.out.println(this.b1.get(ww));
					if (this.a1.get(w) == this.b1.get(ww)) {
						this.b1.remove(ww);   // ���� ���ڰ� ������ 0�� �Է�.  = [8, 10, 11, 19, 44] -> [8, 10, 0, 19, 0]
						this.b1.add(ww,0);
					}
				ww++;
			}
			w++;
		} while (w < this.a1.size());
	 int t =0;
	 while(t<this.b1.size()) {
		 if(this.b1.get(t)!=0) {         //0�� �ƴѰ͸� �־��ּ���.
			 this.a1.add(this.b1.get(t));
			  }
		 t++;
	 }
	 Collections.sort(this.a1);
  System.out.println(this.a1);
		
		
		
		
		
	
	}
}







//		int w = 0;
//		int ea = no2.size();
//
//		// no1==5
//		while (w < ea) {
//
//			no1.add(no2.get(w));
//			w++;
//		}
//
//		Collections.sort(no1);
//		no1.remove(2);
//		no1.remove(6);
//
//		System.out.println(no1);
