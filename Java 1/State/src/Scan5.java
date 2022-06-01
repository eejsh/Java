import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		// 조건부의 범위 선택

	/* 	byte a = 10;
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		} else if (a >= 10 || a <= 22) { // 조건문에 범위를 설정하여 적용함.
			System.out.println("당첨 입니다..");
		} else {
			System.out.println("범위 밖의 숫자 입니다.");
		}

  */
		/*
		 * [응용문제] Q. 1~45까지 숫자 하나를 입력하세요 ?
		 * 
		 * error문구 0을 입력 : 숫자 입력이 잘못되었습니다.
		 * 
		 * 45보다 큰 숫자를 입력 : 숫자는 1~45가지만 입력 가능합니다.
		 * 
		 * 
		 * 
		 * 1~45 숫자를 입력 하였을 경우 7.12.14 숫자 가 입력시 당첨입니다. 라고 출력 그 외의 숫제시 다음기회에 참여하세요 라고 출력
		 */

	/*  	Scanner a1 = new Scanner(System.in);
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요.");

		int b1 = a1.nextInt();

		int b2 = 7;
		int b3 = 12;
		int b4 = 14;

		if (b1 <= 1 || b1 <= 45) {
			System.out.println(b1);

			if (b1 == 0) {
				System.out.println("숫자 입력이 잘못되었습니다.");
			}
		} else if (b1 > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}

		if (b1 == b2 || b1 == b3 || b1 == b4) {
			System.out.println("당첨입니다.");
		}

		else {
			System.out.println("다음기회에 참여하세요.");
		}

		*/ 
		//조건문 안에 조건문 if-else if- else
		
		Scanner qa = new Scanner(System.in) ;		
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요?"); 
		
		int n = qa.nextInt() ;    //사용자 입력부분의 값
				
		if(n == 0 ) {
			System.out.println("숫자 입력이 잘못되었습니다.");
		}
		else if( n > 45 ) {
           System.out.println("숫자는 1~45까지만 입력 가능합니다.");		
		}
		else {
			if (n == 7 || n==12 || n==14) {
				System.out.println("20%쿠폰 당첨입니다.");
			}
			
			else if (n==41) {
				System.out.println("50% 쿠폰 당첨 입니다.");
			}
		
			else {	
			System.out.println("다음 기회에...");
			}
	
		}
		
	qa.close();

	}
}

