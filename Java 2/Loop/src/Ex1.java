import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	  /*  "응용문제 3개의 상품 "바코드로 상품을 입력시켜 주세요?" 금액을 입력하고 나서
	      할인 %를 입력해 주세요" 라는 문구와 함께 해당 할인 숫자를 입력하면, 최종 금액이 변경 되어 출력되도록 합니다.   
	              int money = 10000;
		       int coupon = 20;
		       double a = coupon * 0.01 ;
		       double b = money * a; //= 2000원이 뜸.
		       //   최종 값 - 2000원 값넣으면 됨.
               
	       
	       double c = money - b;
		       System.out.println(c);  */
	
		   double dis = 0.01  ; //* 0.01;  //할인..입력
		   double dis2 ;
		   double c  ; //최종 금액 * 할인율 = 할인금
		   double total ; // 최종금
		  
		   int us ;  // 입력된 총 금액
		   int usto = 0 ;  //합계 총금
		     int b ;  //반복
		   Scanner sc = new Scanner(System.in);
		  
		       for(b=1;b<=3;b++)   {
		          System.out.println("바코드로 상품을 입력해 주세요?");
		         us = sc.nextInt();
		         usto += us ;
		          }
		       
		       System.out.println("할인 %를 입력해 주세요.");
		        dis2 = sc.nextInt();
		       
		          c =  dis * dis2 ;   
		         
		         total = usto - (usto * c);
		         
		        System.out.println(total);
		        
		        sc.close();
		        
		        
		        
	}

}