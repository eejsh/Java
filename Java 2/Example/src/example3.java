import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {

		/*
		 * 배열 = 기본(클래스) 메소드 문제 \ product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고 moneys :
		 * 35000,8000,4000,5500,3800,4400,11000,18900 장바구니에 해당 상품을 모두 담았습니다. 단 그 중 사과와
		 * 바나나는 제외하고 총 결제금액을 출력하시오 // 90600 - 15000 = 75600
		 */

		String pro[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };
		int a[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };

		bas(pro, a);

		totals(pro, a);

	}

	public static void bas(String pro1[], int aa[]) {

		int ea = pro1.length; // 배열갯수파악
		int o = 0; // 반복문
		int total = 0;

		do {
			if (!pro1[o].equals("사과") && !pro1[o].equals("바나나")) { // 반복문o값// !=아니면의 표기, pro[]=배열 값중에 .equals (문자열) &&
																	// =사과와 바나나 둘다있을경우
				// System.out.println(pro1[o]);

				total += aa[o];
			}
			o++;
		} while (o < ea);

//		System.out.println(total);
	}

	public static void totals(String p[], int m[]) {
		// for each문으로 가져올 경우 배열값 바로적용해도됩니다.
		int eaa = p.length;
		int w = 0;
		int total = 0;

		while (w < eaa) {
			if (!p[w].equals("사과") && !p[w].equals("바나나")) {
				// System.out.println(Arrays.toString(p[w]);
				total += m[w];
			}
			w++;
		}
		System.out.println("최종결제금액은 " + total + " 입니다.");

	}

}
