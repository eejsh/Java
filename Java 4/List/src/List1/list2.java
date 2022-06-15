package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 해당 데이터 값 중 휴면고객 데이터는 모두 삭제 해야 합니다. 고객 데이터 :
		 * {"김수빈","김정현","김창섭","박도현","이경훈","정재욱","하윤성"} 결과 : 정재욱, 하윤성
		 * 
		 * 반복문
		 */
		// [0][1][2][3][4][5] -->인덱스, node
//		String user[] = { "김수빈", "김정현", "김창섭", "박도현", "이경훈", "정재욱", "하윤성" };
//		ArrayList<String> ar = new ArrayList<>(Arrays.asList(user));
//		int ea = ar.size();  
//		int w = 0;
//		while (w < ea) {
//			int ea2 = ar.size();             //node의 갯수를 다시 파악함.. -->데이터가 바뀌면서 갯수도 바뀌기 때문에.
//			int ww = 0;
//			while (ww < ea2) {
//				if (!ar.get(w).equals("정재욱") && !ar.get(w).equals("하윤성")) {
//					ar.remove(0); // 해당되는 값을 지우려 한다면 0부터 시작. // 맨앞부터 삭제함.
//					System.out.println(ar);
//                	}
//			}
//			w++;
//		}

		/*
		 * 응용문제 짝수의 숫자를 모두 삭제합니다. {10,7,6,1,11,37,41,22}
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

		
		//풀이.
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
