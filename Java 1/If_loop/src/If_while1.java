
public class If_while1 {

	public static void main(String[] args) {

		/*
		 * 응용문제 while문으로 10~30 숫자 중에서 홀수값만 출력하시오. 20이상
		 */

		int a = 10;
		while (a <= 30) {
			if (a % 2 == 1) {
				if (a > 20) {
					// System.out.println(a); // 출력
				}
			}
			a++;
		}

		// 카운터로 갯수 파악하기
		// 1~10가지 숫자중에 짝수값이 몇개 있는지 갯수를 파악하시오

		int ww = 1;
		int count = 0; // 카운터 변수 값0
		while (ww <= 10) {
			if (ww % 2 == 0) { // 짝수일 경우
				count++; // 해당조건이 맞을경우 1식 증가

			}
			ww++;

		}
		// 반복문 종료시 최종 카운터 값을 출력하게 됩니다.
		System.out.println("1~10 숫자중에 짝수 개수는 " + count);
	}

}
