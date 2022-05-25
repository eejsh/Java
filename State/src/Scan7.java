import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {

 /* [인증번호 발송에 대한 번호 비교 코드]
  * 
  * Q. 인증 받은 번호를 입력하세요?
  * 
  *  숫자 220524 
  *  
  *  사용자가 숫자 220524 외에 입력시  "인증번호가 틀립니다" 입력
  *  동일한 인증번호 입력 시 "인증 확인되셨습니다" 라고 출력합니다.
  *  
  *   단 220524는 java 실행 시 가장 먼저 실행되는 변수로 처리하세요. 
  * */
		
		int sc = 220524 ;   // 인증번호를 보냈다고 가정 하에..
		/*
		Scanner n1 = new Scanner(System.in) ; 
		System.out.println("Q . 인증받은 번호를 입력하세요?");
		 int n2 =  n1.nextInt() ;                     //사용자  숫자 입력

		 if ( n2 == sc ) {
			System.out.println("인증 확인되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		} 
	
	n1.close();   // scanner 닫기.. [ 스캐너변수명.close() ;   ]
	
	*/
	
		
		Scanner h = new Scanner(System.in) ;   // 스캐너를 새롭게 구성. system in 받은 값을 h에게 준겠다고 할당함
		System.out.println("인증번호를 입력하세요");

		int uesr1 = h.nextInt() ; 
		if (uesr1==sc ) {
			System.out.println("인증 확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
			
		
		}
		h.close();
		
		
		
		/* [ Scanner 주의사항 ]
		 *  Scanner 을 import 사용
		 *  문구출력 (사용자가 어떤 값을 입력하는지에 대한 문구)
		 *  해당 사용자가 입력한 값을 받는 변수를 지정
		 *  

		 *  [응용문제]
		 * 
		 *  사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
		 *  첫번째 숫자 값을 입력하세요?
		 *  두번째 숫자 값을 입력하세요?
		 *  
		 *  첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하십시오.
		 *  
		 *  단, 해당 결과값이 100 이하 일 경우 출력 메세지는  "해당 100이하의 결과값 입니다." 라고 설정하시고
		 *  100 이상일 경우 "해당 값은 100 이상 결과값 입니다." 라고 출력합니다.
		 *  
		 *  
		 * */
		

		Scanner n1 = new Scanner(System.in) ; 
		System.out.println("첫번째 숫자값을 입력하세요");
		int B1 = n1.nextInt() ; // 숫자 입력 
		
		Scanner n2 = new Scanner(System.in) ;
	    System.out.println("두번째 숫자값을 입력하세요");

	    int B2 = n2.nextInt() ;
	    
        if ( B1*B2 < 100 ) {
        	System.out.println("해당 값은 100 이하의 결과값 입니다.");
        }
        else {
        	System.out.println("해당 값은 100 이상의 결과값 입니다.");
        } 
        


		n1.close() ; // 스캐너1종료
		n2.close() ; // 스캐너2종료
		
	}

}
