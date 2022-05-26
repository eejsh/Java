
public class For1 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단~3단까지 출력
		 */

		int f, ff; // 반복문에 사용할 변수선얼을 미리 하였음. (2개)
		for (f = 2; f <= 3; f++) { // 큰 반복문 2~3까지만 회전함.

			for (ff = 1; ff <= 9; ff++) { // 작은 반복문 1~9까지 회전함.

				// 해당 작은 반복문이 작동할 때마다 출력을 사용함.
				System.out.println(f + "*" + ff);
			}

		}

		/*
		 * 응용문제 구구단 5단~7단 출력을 하되, 4까지만 연속적으로 나오는 수식구를 출력하시오. 해당 결과값의 총 합계를 출력하시오. 180
		 *
		 */

		int e, ee;
		int to1 = 0;
		for (e = 5; e <= 7; e++) {

			for (ee = 1; ee <= 4; ee++) {

				to1 = to1 + (e * ee); // to1 += e*ee;

			}
		}
		System.out.print(to1); // ("%d*%d ", w,ww)

	}

}
