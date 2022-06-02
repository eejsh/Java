import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {

		// static 이 많을수록 메모리 부여가 많음.. 없으면 메모리 관리가 편해집니다.

		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		// datalist da = " "; // 초기화 시키기

		// String pay = "신용카드";
		String pay = "무통장";

		if (pay.equals("신용카드")) {
			da.pay1(); // 해당 조건에 맞는 메소드를 호출
		} else {
			da.pay2(pay); // 메소드에 객체값을 테워서 전달 (객체값은 무한대) pay2라는 메소드로 넘겨주세요.
		}

		/*
		 * 응용문제 해당 로드할 class 명은 agree 라는 이름을 가지고 있습니다. main 메소드에서 사용자가 "동의함", "동의안함"을
		 * 입력하게 됩니다. 동의함으로 입력 되었을 경우 "회원가입이 진행됩니다. " 라는 메세지를 출력하고, 동의안함을 입력시
		 * "동의를 하셔야 진행 됩니다." 라고 출력되도록 하시오. 단, agrss 클래스 안에 void 메소드 한개 또는 두개를 선택하여 코드를
		 * 제작하시오.
		 */

		System.out.println("동의함,동의안함");

		Scanner sc = new Scanner(System.in);

//		String sc1 = sc.next();
//		if (sc1.equals("동의함")) {
//			da.agree1();
//		} else {
//			da.agree2();
//		}

		// 선생님풀이
		// 스캐너 탑재
		System.out.println("약관에 동의하시겠습니까? ");
		String atext = sc.next();
		agrres ag = new agr();
		ag.agr(atext);

		sc.close();

	}

}

class datalist {
	/*
	 * static 메소드를 활용하는 형태 : 여러 package에서 해당 메소드를 자주 사용해야 하는 부분에서는 static을 이용하여
	 * 사용합니다.
	 * 
	 * static (정적메소드) : 오버라이딩을 사용할 수 없습니다. void만 사용 (동적메소드) : 오버라이딩을 사용할 수 있습빈다.
	 * 오버라이딩 예제 class a{ void 메소드
	 * 
	 * } class b extend a { void 메소드 }
	 */

	public void array_data(int a) { // static 없는 메소드

		int w = 1;
		while (w <= 9) {
			System.out.println(a * w);

			w++;
		}

	}

	public void pay1() {
		System.out.println("신용카드로 결제 진행 합니다.");
	}

	public void pay2(String pm) {
		System.out.println(pm + "으로 결제 진행 합니다."); // 위 if 문의 else에서 값을 받아 출력.

	}

//	public void agree1() {
//		System.out.println("회원가입이 진행됩니다.");
//
//	}
//
//	public void agree2() {
//		System.out.println("동의를 하셔야 진행됩니다.");
//	}

	public void agr (String k ) {
		
		String msg;
		
		if(!k.equals("동의함")) {    // ! 동의함의 반대.. !k.equals = 동의안함.
			msg = "동의를 하셔야 진행 됩니다."
		}
		else {
			msg = "회원가입이 진행됩니다."
		}
		
	}

}