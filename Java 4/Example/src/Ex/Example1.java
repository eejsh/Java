package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		// 외부 class를 사용하여 다음 프로세서를 작성하시오.
		/*
		 * arraylise? linkedlist?
		 * 
		 * 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나의 배열로 합치도록 합니다. 그대신, 중복된 값은 하나로 처리하셔야 합니다.
		 * 1번 db : 11,22,33,44,55 2번 db : 8,10,11,19 결과 출력 [8.10.11.19.22.33.44.55]
		 * 
		 * 힌: collection 이용한 arraylist, linkedlist 사용.
		 *
		 * 
		 * 1. 1번 DB 2번 DB 중복값 비교 및 2번 DB 삭제. 2. 2번 DB를 1번 DB에 추가 3. 1번 DB sort로 정렬
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
						this.b1.remove(ww);   // 같은 숫자가 나오면 0을 입력.  = [8, 10, 11, 19, 44] -> [8, 10, 0, 19, 0]
						this.b1.add(ww,0);
					}
				ww++;
			}
			w++;
		} while (w < this.a1.size());
	 int t =0;
	 while(t<this.b1.size()) {
		 if(this.b1.get(t)!=0) {         //0이 아닌것만 넣어주세요.
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
