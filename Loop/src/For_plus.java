
public class For_plus {

	public static void main(String[] args) {

		/*1부터 10까지 모든 숫자를 합한 결과 값을 출력하시오.*/
		
		int f ;              //f 반복문
		int total = 0 ; 
		 //       f<11 = 1~10 반복
		for (f=1 ; f<11; f++ ) {         // total 변수값의 반복 값을 지속적으로 증가시킴 
			
	    //	 total = total + f;
            total += f; 
		}
		System.out.println("총 합계:"+total);

		// += (더하기할당 기호) -= (빼기할당 기호)   *= (곱하기할당 기호) /= (나누기할당 기호) 
		// b = b-f; ->      b -= f ;       연산수식.
		
	
		/* 응용문제 
		 * 전체 값은 500 이 있습니다.
		 * 총 8회 동안 반복되면서 한번 반복할 때마다 12씩 감소하도록 하여 최종 값을 출력하시오.
		 * 결과값 404
		 * */
		/*
		int a1 ;
		int tto = 500 ;
		
		for ( a1=1 ; a1<9 ; a1++ ) {		
			tto = tto - 12 ;
		}
		
		System.out.println("결과값 :" + tto );
    	*/	
		
	int alls = 500 ;
	int m = 12 ;
	int w ;
	for (w=1 ; w <9 ; w++) {
		// alls = alls - m ;
		// alls -= m;
		// alls -= 12;
		
		alls = alls - 12 ;
	}
		
	System.out.println(alls);
	
	
	/* 응용문제
	 * 
	 * 구구단 2단 2*1 ~ 2*9가지의 총 합계를 출력하시오.
	 *         정갑 합계 90
	 * */
	
	
	}

}



