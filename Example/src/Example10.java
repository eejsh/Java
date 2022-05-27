import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {

		/*
		 * 응용문제 10번 다음 이용약관에 대한 동의 프로그램을 제작하게 됩니다. 동의 항목은 전체 3가지 이며, 모두 true 가 적용되여야만 다음
		 * 프로세서로 진행됩니다.
		 * 
		 * 사용자에게 질문 되는 사항은 다음과 같습니다. "동의 항목에 동의하시겠습니까?" 라는 메세지 출력 동의함(1), 동의안함 (2) ///
		 * 동의 항목 중 한가지라도 동의하지 않을 경우 "모두 동의하셔야만 진행됩니다." 라고 출력합니다. 모두 동의 하였을 경우
		 * "회원가입이 완료 되었습니다. 라고 출력합니다.
		 */

	
		Scanner sc = new Scanner(System.in);

        int user; // 유저 입력값
		int a = 1; // 반복
       	user = sc.nextInt();

	
         do {
			if (user != 2);
		      	{     break;
			      }
			
			else {
			System.out.println("회원가입이 완료되었습니다.");
			}
		 	
			a++;
		} while (a<3);

         System.out.println();
         
         
		// System.out.println("회원가입이 완료되었습니다.");
 
		
	/* int w = 1;
	 int agree ;
	 boolean all_agree = false ;  // 처음엔 다 동의안되있으므로 기본은 false로 
	 
	 do {
		 System.out.println("동의항목에 동의하시겠습니가? 동의함-1, 동의안함-2");
	      agree = sc.nextInt();
	      
	      if(agree==1) {
	    	  all_agree = true;
	      }
	      else {
	    	  all_agree = false;
	    	  break;
	      }
		 w++;
	 }while(w<=3);
		
     if(all_agree==false) {
     System.out.println("모두 동의하셔야 진행됩니다.");
      }
     else {
   	 System.out.println("회원가입이 되었습니다.");
      }
	 
	 
     sc.close();*/
     
	}

}
