
public class App {

	public static void main(String[] args) {

		int a1 = 25 + 31 * 4 + 12;

		int a2 = 15 * 3 + 9 + 14;

		if (a1 > a2) {
			System.out.println(" 공2가 작음");
		} else if (a1 < a2) {
			System.out.println("공1가 작음");
		}

		int a11 = 25 + 31 * 4 + 12;
		System.out.println(a11);
		int b11 = 15 * 3 + 9 + 14;
		System.out.println(b11);

		if (a11 > b11) {
			System.out.println("공식2번 값이 작습니다.");
		}

		else if (a11 < b11) {
			System.out.println("공식1번 값이 작습니다.");

		} else {
			System.out.println("두 값이 같습니다.");
		}

		/* 해당값을 2진수로 짝수, 홀수로 확인하기 */
		// % 기호로 사용시 0 또는 1로 나머지 값이 출력이 됩니다.

		int c = b11 % 2;

		// int c = 10 % 2 ;
		System.out.println(c);

		if (c == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

}
