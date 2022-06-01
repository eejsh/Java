
public class Double_Loop3 {

	public static void main(String[] args) {
		/*
		 * 다음 출력값이 출력 되도록 for문으로 작성하시오. 
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * 7+2=9
		 * 7+3=10
		 * 7+4=11
		 * 7+5=12 ...... 9+5 =14*/

		int a, aa;
		int total;

		for (a = 5; a <= 9; a++) {
			for (aa = 2; aa <= 5; aa++) {
				total = a + aa;
				System.out.println(a + "+" + aa + "=" + total);

				//System.out.println(a+"+"+aa+"="+(a+aa));
				
			}

		}
		
	/*응용문제 double while으로 제작
	   9*7=63
	 * 9*6=54
	 * 9*5=45
	 * 8*7=56
	 * 8*6=48
	 * 8*5=40
	 * 7*7=49
	 * 7*6=42
	 * 7*5=35
	 * */

		 int g = 9;
		 int total1 ;
		 
		 while (g>=7) {
			 int gg = 7;
			 while(gg>=5) {
				 total1=g*gg;
				 
		  System.out.println(g + "*"+ gg + "="+ total1);				 
				gg--; 
			 }
			 g--;
		 }
		
		 //선생님풀이
		 int w = 9;
		 while(w>=7) {                             //7보다 9까지 크거나 같을때
		    int ww = 5;
		    while(ww>=7) {                            // 5보다 7까지 크거나 같을때
		    	System.out.println(w + "*" + ww + "=" + (w*ww));
		    			    	ww--;
		    }
		              w--; 
		 }
		 
		 
		 
		 /* 다음 결과값을 보고 do~while 문으로 제작하시오.
		  * 5+4=9
		  * 5+5=10
		  * 5+6=11
		  * 5+7=12
		  * 4+4=8
		  * 4+5=9
		  * 4+6=10
		  * 4+7=11
		  * 3+4=7
		  * 3+5=8
		  * 3+6=9
		  * 3+7=10 */
		 
		 
		 int dw1=5 ;
		 
		 do {
			
			int dw2=4;
			 do {
				 System.out.println(dw1 + "+" + dw2 + "=" + (dw1+dw2) );
				 
				 dw2++;
			 }while(dw2<=7);
			 
			 dw1--;
		 }while(dw1>=3);      //부등호..조심..ㅠ
		 
		 
		 
	}

}
