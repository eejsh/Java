
public class app {

	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ;
		int c ;
		
		// 사칙연산 기호 : + - * /
		
		// c= a+b =  30
		// c= a-b = -10
		// c= a*b =  200
		// c= a/b =  0..
		
		c = a/b;
		System.out.println(c);

		String a1="홍길동";
		String b1="환영합니다";
		String c1 ; 
		c1 = a1+b1 ; // 문자 형태일 때 +는 문자+문자 열로 표현할 수 있습니다.
		
				System.out.println(c1);
		/*
		 * 응용문제
		 * 다음과 같이 출력되는 코드를 완성하시오.
		 홍길동님 적립금은 50000 입니다.
		 단, 홍길동과 50000의 값은 지속적으로 변화할 수 있습니다. 
		 */
		
		String d1="홍길동";
		
		String e1="님 적립금은";
		String f1="입니다.";
		
		int g1= 50000;
		
		System.out.println(d1+e1+g1+f1);
		
		
		//우와앙....!
		
		
		String mname="홍길동";
		int mpoint=50000 ; 
		
		System.out.println(mname+"님 적립금은"+mpoint+"입니다.");
		
		
		String msg = mname+"님 적립금은"+mpoint+"입니다.";
		System.out.println(msg);
		
		
		
		/*응용문제
		 * 아마존 사이트에서 상품을 구매 했습니다.
		 * 장바구니에 담은 상품가격을 모두 더해서 총 결제금액이 
		 * 출력되도록 하시오. 
		 * 단, $ 한글로 출력 되어야 합니다.
		 * 8.25
		 * 4.02
		 * 3.71
		 * 결과값은 다음과 같이 출력하시오
		 * 총 결제금액 : $ 입니다.
		 */
		
     String ho="총 결제금액은 $" ;
     String he="입니다." ;
     
     double z1 = 8.25 ;
     double z2 = 4.02 ;
     double z3 = 3.71 ;
	 double z4 ;
		
     z4 = z1+z2+z3 ;
     
	System.out.println(ho+z4+he);
	
	
	System.out.println("총 결제금액은 $"+z4+"입니다.");
	
	
	
	//ㅋ
	double p1,p2,p3,p4;
	p1=8.25;
	p2=4.02;
	p3=3.71;
	
	p4=p1+p2+p3 ;
			System.out.println("총 결제금액은 $"+p4+"입니다.");
	
		
			
			

			int k = 3;
			int j = 9;
			double aw = (double)k/j;  //연산 형태의 자료형 또한 있는 코드 - 텍스트형태
			                        // double aw = k/j; 선언시 소숫점 날려버림.
			//double aw= (double)k/j; 선언시 소숫점 나옴~!
			
			System.out.println(aw);
			
			
				
		
		
		
	}

}
