import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * 응용문제
		 * 고객이 자신의 통장에서 입.출금을 하는 프로세서를 제작해야 합니다.
		 * 고객의 기본 자산 금액 : 100,000
		 * "1번 입력 시 입금"
		 * "2번 입력 시 출금" 입니다 라는 메세지가 제일 먼저 실행 되어야 합니다.
		 * 1번을 입력 시 "해당 금액을 입력하세요" (입금)
		 * 
		 * 금액 입력 시 ) 사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산금액을 출력 하시면 됩니다.
		 * 2번을 입력 시 "출금할 금액을 입력하세요"
		 * 사용자가 입력한 금액 - 기본 자산 금액을 계산하여 총 자산금액을 출력 하시면 됩니다.
		 */

		int to1 = 100000;

		Scanner a = new Scanner(System.in);
		System.out.println(" 1번 입력시 입금 ");
		System.out.println(" 2번 입력시 출금 ");
		int b = a.nextInt(); // 숫자입력

		int to2;

		if (b == 1) {

			Scanner mm1 = new Scanner(System.in);
			System.out.println("해당 금액을 입력 하세요.");

			int mm2 = mm1.nextInt(); // 숫자입력
			to2 = to1 + mm2;
		
			System.out.println("총금액은" + to2 + "입니다.");

		}

		else if (b == 2) {

			Scanner mm1 = new Scanner(System.in);
			System.out.println("해당 금액을 입력 하세요.");
			
			int mm2 = mm1.nextInt(); // 숫자입력
			to2 = to1 - mm2;
			
			System.out.println("총금액은" + to2 + "입니다.");
		}

		
		
		a.close(); 
	
		
	// 스캐너는 조건문이 다르면 두개 돌아갈 필요가 없음.   mm1  if, else if 문 둘 중한개만 돌아감으로 한개만 잡아도됨
      
		
		//풀이
		
	/*	int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금");
		int work = sc.nextInt();
		int total;
		
		Scanner sc1 = new Scanner(System.in);
		
		
		if ( work == 1) ; {
		                System.out.println("입금 금액을 입력하세요.");
		                total = sc1.nextInt();
		                money = money + total;          
		}
		
		else if       {
		            	System.out.println("출금 금액을 입력하세요.");
		            	total = sc1.nextInt();
		                money = money - total;  
			
		}
		else {
			System.out.println("정상적인 코드가 아닙니다.");
			sc.close()    ;              //잘못입력하면 스캐너 종료시킴
		}
		
		
		
		System.out.println("처리된 내용은 다음과 같습니다. " +money+"원");
		*/
	
	
	   }
	}

