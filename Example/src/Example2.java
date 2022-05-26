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
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단에 대한 숫자를 입력하세요");
		
		int a = 1 ; // 반복문 사용
		int b;
		int user ;  // 유저 입력
		int to1 = 1;    // 총 금액 
		do {
			user = sc.nextInt();
			to1 = user * 1 ;
			
			a++;
		}while (a<=9) ;
		
		
		
		System.out.println();
				
		
	}

}

