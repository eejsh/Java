import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		/*  사용자가 입력한 숫자에 맞춰서 구구단이 작동되며, 구구단 결과를 계산하여 짝수인지 홀수인지를 출력하시오.
		 *  "구구단에 대한 숫자를 입력하세요" 라는 메세지가 출력되면 해당 숫자에 맞춰서 모든 결과를 더하여,
		 *  더한값에 따라 짝수 인지 홀수 인지를 출력하시면 됩니다.
		 *  단, 해당 반복문은 for~ do while 문 중 한가지를 선택하여 작성하시오.
		 *  (합계)
		 *  힌.반복문 안에 있으면 안됨. 반복문안에 조건문이 있으면 안됩니다...........
		 *  */
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("구구단에 대한 숫자를 입력하세요");
		int gu = sc.nextInt() ;
		
		int a = 1;    //기초	
		int to =0 ;

	    do {  
		  
	    	// to = gu ;	
	    	
	       to += (gu * a) ;                
		      a++; 
		      
	     }while(a<=9) ;
	    if (to %2 == 0) {
	    	System.out.println("짝수 입니다. " ) ;
	    	}
	    
	    else  {
	      System.out.println("홀수 입니다. ");
	    }
	    
	    
	  sc.close(); */
	
		//풀이
	  
	  Scanner sc1 = new Scanner(System.in);
	  String msg = "구구단에 대한 숫자를 입력하세요";
	  String msg2 ;        // 메세지 구문
	  System.out.println(msg);
	  int user = sc1.nextInt();
	  int f = 1;
	  int total = 0 ;  // 덧셈 시 초기값이 0이여야 되고, 곱하기일 경우 1이여야
	 
	  do {
	//	  total = total + (user * f); // total += user + f;
		  f++;
		  
	  }while (f < 10) ;
 	  //  System.out.println(total);
	 
 	  if (total % 2 ==0 ) {
		  msg2 = "짝수" ;
	  }
	  else {
		  msg2 ="홀수" ;
	  }
       System.out.println("결과값은 " + msg2 + " 입니다.");
       
       sc1.close();
       
	}
	

}

