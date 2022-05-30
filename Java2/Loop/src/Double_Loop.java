import java.text.SimpleDateFormat;

import java.util.Date;

// import java.util.Scanner;  ex 스캐너 사용 종료 및 삭제 후 ctrl +shift + O 키 눌르면 안쓰는 엔진 삭제됨. 

public class Double_Loop {

	public static void main(String[] args) {

	Date today = new Date();

	//	System.out.println(today);
	
	SimpleDateFormat date = new SimpleDateFormat("yy년MM월dd일"); // 소문자 mm은 분, 대문자MM은 월 을 표시 (mm-dd으로 쓰면 월-일출력)
		// format = 콤마 찍고 싶을때 사용

	System.out.println(date.format(today));
	SimpleDateFormat time = new SimpleDateFormat("H:m:s");
	System.out.println(time.format(today)); 
    //	format 규격화된 형태로 값을 표현할 때 사용하게 됩니다. 

	//	int f;
		// for(f=1 ; f<=10; f++ ) //1식 증가

	//	for (f = 1; f <= 10; f = f + 2) // 2식 증가
		//	System.out.println(f + " ");

		/* 응용문제
		 * 3개의 상품 * "바코드로 상품을 입력시켜주세요" 사용자가 금액을 입력하고 나서		 * 		 * "할인 %을 립력해주세요."
		 * 
		 * 결제 최종 금액이 있습니다.		 * 		 * 최종 금액은 60,000원 입니다.		 * 
		 * 단, "할인 %를 입력해 주세요" 라는 문구와 함께 해당 할인 숫자를 입력하면, 최종 금액이 변경 되어 출력되도록 합니다.		 * 
		 */

		/*int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a; // = 2000원이 뜸.
		// 최종 값 - 2000원 값넣으면 됨.
		double c = money - b;
		System.out.println(c); */
		/* 10000*0.8 = 8000 (20%할인)
		 * 10000 / 20 =500원... X*/
		  // double c = money - b;
		 //    System.out.println(c);  */
			
			
			
		// 더블 반복문의 for 문	
		int f, ff;
		int total ;
		for (f=1; f<=3; f++) {
	        for ( ff=1; ff<=4; ff++) {   // 절대 큰 반복문에 사용한 변수값 작은 반복문에 사용하면안됨 =>Loop 발생
	         	   total = f+ff;
	  System.out.println(f +"+"+ff +"="+ total );      	                    
	      }
	}
				
	}

}