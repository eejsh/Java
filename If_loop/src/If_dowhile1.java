
public class If_dowhile1 {

	public static void main(String[] args) {

		/*
		 * 응용문제 do~while 구구단 6단 중에서 35 이상 결과숫자만 출력하시오.
		 */

		/*
		 * int dw = 1; int total ; do { total = dw * 6 ; if(total>=35) {
		 * System.out.println(total + " "); }
		 * 
		 * dw++;
		 * 
		 * }while (dw<=9) ;
		 */

		/* 응용문제 14부터 27까지 숫자중 짝수값 모두 더하여 최종결과값을 출력하시오 */
		int a1 = 14; //시작값
		int a2 = 0;  //변수 저장값 ->최종
		do {
			if (a1 % 2 == 0) {
				a2 += a1;
			}
			a1++;
		} while (a1 <= 27);

		System.out.println(a2);  // 최종결과값만 알고싶으면 while문 밖으로 빼면됨  // while 안으로 들어가면 14+15+16... 모든결과값 튀어나옴
	}

}
