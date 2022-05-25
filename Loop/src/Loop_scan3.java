import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		
		
		// 스캐너를 이용한 do~while문 사용하여 구구단이 출력되는 프로그램을 제작하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력하세요");
		int gugu = sc.nextInt();
		
		int c = 1 ; //초기값
		int d ;  //출력값
	
		do {
			d = gugu * c ;             //수식
			System.out.printf(d+" ");
             c++;              //오름차순
		}while( c < 10 );   // 반복값. 1.2.3.4.5.6.7.8.9 = 9회  C가 10다 작을때까지.

		sc.close(); 
		
		
		
		
	}

}

