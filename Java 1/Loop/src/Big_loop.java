import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {

		/* 1~100 전체 합계 for 문으로 제작하시오 */

		/*int a;
		int total= 0;
		for (a = 1; a <= 100; a++) {
			total += a;
		}
	    	System.out.println(total);*/

		/*1부터 100까지 곱한 결과값은................?*/
		
		int f;
		//biginteger : 자바에서 모둔 무한의 값을 저장할 수 있는 유일한 자료형.함수    
		BigInteger aa = new BigInteger("1");             
		// 합계치에 사용할 변수형태       1을 최초값으로 설정. 단 ""을 무조건 적용해야됨.
		for(f=1; f<=10; f++) {
			aa = aa.multiply(BigInteger.valueOf(f));   
			/* multiply: 사칙연산 곱하기를 담당함.
			* add : 사칙연산에 더하기를 담당함.
			* subtract : 사칙연산 빼기를 담당함.
			 * divide : 사칙연산 나누기를 담당함.
			*/ 
		}
		
		System.out.println(aa);
		
		
		
		
		
	}

}
