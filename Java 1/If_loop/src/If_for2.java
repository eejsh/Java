
public class If_for2 {

	public static void main(String[] args) {
		 //1~100까지 숫자 중 80이상의 숫자만 출력
	     int f ;
			for (f=1;f<=100;f++) {
				if (f>=80) { // 만약에 80이상 숫자이면 (f=100) 80~100가지 숫자 출력
					System.out.print(f+" ");
					
				}
			}      
		
			//200~300 숫자 중 240 이하의 숫자만 출력하시오.
		     int e;
		     for (e=200; e<=300; e++) {
		    	 if(e<=240) {
		    		 System.out.print(e+" ");
		    	 }
		     }

		     
		     final int a = 4;       // 1*4 = 4 / 567은 4의 배수가 아님으로 안나옴.
		     int w ;
		     for (w=1;w<=10;w++) {
		    	 if(w % a == 0)
		    		 System.out.printf("%"
		    		 		+ "d ",w);
		    	 
		     }
		     
		     /*응용문제  구구단 중 2단을 반복합니다.
		     단, 2단 결과값 중 10이상 숫자만 출력합니다. 10.12.14.16.18 */
		    final int aa = 2; 
		     int ab ;
		     int total ;
		     for (ab=1;ab<=9;ab++) {
		                    total = ab * aa ;
	         if(total>=10 ) {    // 10이상의 값만 출력하시오.
		    		 System.out.println(total);
		    		 
		    	 }
		     } 
		     /*응용문제
		      *다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		      *18, 36, 54, 72
		      * */
		  
	     final int a2 = 9;      // 절대값
	     int a3 ;               // 변수
	     int to1 ;              // 출력될 값
	     for(a3=1;a3<=9;a3++) { 
	    	 to1=a2*a3;         
	       	 if (a3 %2 == 0)    //to값은 %2 를 하여 0이 나오면 짝수값 / 변수값이 짝수만 계산
	    	 //if(to1 %2 ==0) 출력값이 짝수인 경우	 
	    	 
	    	 System.out.print(to1);
	     }
	       	 /*응용문제
	       	  * 
	       	  * 다음 결과값을 보고 해당 값을 출력되도록 코드를 제작하시오.
	       	  * 1부터 20사이의 숫자
	       	  * 6 14 17 19       -> 규칙성이 없는 숫자~!
	       	  */
	       	  
	       	 
	     final int bb = 1;
	       	  int bb2 ;
	          for (bb2=1; bb2<=20; bb2++) {
                if (bb2==6 || bb2==14 || bb2==17 || bb2==19) {
	       			  System.out.println(bb2+" ");
	       	  } }
	     
	}

}
