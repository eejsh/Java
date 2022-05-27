import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*	 * [ Scanner 주의사항 ]
		 * Scanner 을 import 사용
		 * 문구출력 (사용자가 어떤 값을 입력하는지에 대한 문구)
		 * 해당 사용자가 입력한 값을 받는 변수를 지정

		 * [응용문제]
		 * 사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
		 * 첫번째 숫자 값을 입력하세요?
		 * 두번째 숫자 값을 입력하세요?
		 * 첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하십시오.

		 * 단, 해당 결과값이 100 이하 일 경우 출력 메세지는 "해당 100이하의 결과값 입니다." 라고 설정하시고
		 * 100 이상일 경우 "해당 값은 100 이상 결과값 입니다." 라고 출력합니다.
           */
	
		
		  Scanner sc1 = new Scanner(System.in);
		  System.out.println("첫번째 숫자를 입력하세요");
		  int user1 = sc1.nextInt();
		  
		  Scanner sc2 = new Scanner(System.in);
		  System.out.println("두번째 숫자를 입력하세요");
		  int user2 = sc2.nextInt();
		  
		  int user3 = user1 * user2 ;
		  if (user3<100) {
			  System.out.println("100 이하의 결과값 입니다.");
		  }
		  else {
			  System.out.println("100 이상의 결과값 입니다.");
		  }
		  
		sc1.close();
		sc2.close();
		
	}

}
