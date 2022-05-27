import java.math.BigInteger;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
	
		
		/*응용문제7
		 * 사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 도출하는 프로세서를 제작합니다.
		 * 
		 * "첫번째 입력값은 단(1~10까지)입니다." 
		 * "두번째 입력값은 단(1~10까지)입니다."
		 * "세번째 입력값은 단(1~10까지)입니다."
		 * "마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 찍으시오"
		 * 해당 산술기호에 맞게 산술식에 적용하에 최종값을 출력시키시오. 
		 * */
		/* 
		Scanner a1 = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int user1 = a1.nextInt();
		System.out.println("첫번째 입력값은 "+user1+"입니다.");        //산술1
		
		int user2 = a1.nextInt();
		System.out.println("두번째 입력값은 "+user2+"입니다.");        //산술2
		
		int user3 = a1.nextInt();
		System.out.println("세번재 입력값은 "+user3+"입니다.");         //산술3
		
		
		System.out.println("마지막 질문입니다. 세가지 값에 대한 산술기호를 넣어주세요.");
	    String user4 = a1.next();

	    int add1 ;   //덧셈
	    int sub1 ;   //뺄셈
	    int mul1 ;   //곱하기
	    int div1 ;   //나누기
	    
   	    
	    if (user4.equals("+")) {
	    
	    	add1 = user1 + user2 + user3 ;
	    	System.out.println(add1);
	       
	    }
	    else if (user4.equals("-")) {
    	
	   	sub1 = user1 - user2 - user3 ;
    	System.out.println(sub1);
        }

	    else if (user4.equals("*"))
     	{
	    	mul1 = user1 * user2 * user3 ;
	    	System.out.println(mul1);
	        
	    }

	      else{

		div1 = user1 - user2 - user3;
		System.out.println(div1);
	     }

	    */
	    
	    //풀이
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 입력값 단(1~10까지) 입니다.");
		int no1 = sc.nextInt();
		System.out.println("두번째 입력값 단(1~10)까지 입니다.");
		int no2 = sc.nextInt();
		System.out.println("세번째 입력값 단(1~10)까지 입니다.");
		int no3 = sc.nextInt();
		System.out.println("마지막 질문입니다. 세가지 값에 대한 산술기호를 넣어주세요.");
	    String ms = sc.next();

		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
		}	
		else if(ms.equals("-")) {
			System.out.println(no1-no2-no3);
		}
		else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);
		}
		else {
			System.out.println(no1/no2/no3);     //double
		}
		
	    sc.close();
	    
       }

}
