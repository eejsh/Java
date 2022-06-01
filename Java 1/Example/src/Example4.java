
public class Example4 {

	public static void main(String[] args) {

		/*
		 * 다음 결과값에 맞춰서 코드가 출력되도록 하시오. 해당 코드는 for 문으로 작성하시오 45 35 25 15 10
		 */

		int f;
		int v;

		for (f = 9; f > 0; f--) {

			v = 5 * f;

			if (f % 2 == 1 || f == 2 || f >= 10) {
				if (f != 1) {
			
					System.out.println(v);
				}

			}

		}

	}

}
