import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/*
		 * 응용문제
		 * 
		 * while문으로 코드를 작성해야 하며, 프로세서는 다음과 같습니다. 사용자가 상품을 전체 선택하였습니다. 첫번째 질문은
		 * "7000원 결제하시겠습니까?" 라고 출력되며, 숫자 1이라고 입력하면 최종결제 금액에 추가 되어 집니다. 단, 2라고 입력시 최종결제
		 * 금액에 추가되어지면 안됩니다. 총 질문 횟수는 4번 입니다. 마지막에 최종 결제 금액이 나오도록 코드를 작성하시오. 1번 클릭시 7000원
		 * 추가 2번 클릭시 0원 추가
		 */

		Scanner sc = new Scanner(System.in);
        final int mo1= 7000;      // 추가될 금액. 절대값
		int a = 1;                // 반복문에 들어갈 변수
		int total = 0;            // 총금액
		int user;                 // 사용자가 입력할 변수

		while (a <= 4) {
	        	   System.out.println("7000원 결제하시겠습니까?");
                   user = sc.nextInt();
	           if(user == 1)
				total = total + mo1;      //total += mo1;
				a++;
			}

		System.out.println("총 금액은 "+total+"입니다.");
	}

}
