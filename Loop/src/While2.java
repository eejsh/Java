
public class While2 {

	public static void main(String[] args) {
		
		int a = 1 ;  //기초
		int b = 4 ;  
		int c;
		while ( a<10 ) {   // a<10 = 9번 반복
			//a++ ;   a값에 +1을 더하여 계산하기 때문에 값이 변함
			c = b * a;    //산술식
	     	//System.out.print(c+",");
			a++;  // 위치에 따라 값이 다름 (이위치는 오름.내림차순)
		}
		
		/*응용문제
		 *  56, 49, 42, 35, 28, 21   / 해당문에 해당숫자 넣으면안됨 ㅜ
		 * 7단. 7*8=56 
		 * 
		 * */
		int aa = 8; //기초  8*7=56 기본 값부터 잡아서 역으로 계산.
		int bb = 7; //
		int cc;
		
		while (aa > 2 ) {          
			cc = bb * aa ;
			System.out.print(cc+",");
			aa--; 
		}
		
	  int kk = 7 ;             //반복문으로 달아가는 숫자
	  int jj = 8 ;
	  int zz ; 
	  
	  while ( jj > 2 ) {
				  zz = kk * jj;
		  System.out.println(zz);
		  		  jj--;
	  }
	  
	  
		/* 응용문제
		 * 
		 * 다음 결과 값을 확인 하신 후 해당 결과값에 맞는 코드를 작성하시오.
		 * 4,7,10,13,16,19,22,
		 
		 * */
		
		 int a1 = 3 ;

		 int b1 = 1 ;

		 int c1 ;
	 
		 while ( b1 <= 7) {
			 c1 = (b1 * a1 ) + 1 ;
			 System.out.println(c1);
			 b1 ++ ;
		 }
		 
			 
		
		
		
		
		
	}

}
