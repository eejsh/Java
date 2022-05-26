import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		
		/* 응용문제 
		 * 총 2번의 질문을 하게 됩니다.
		 * 사용자가 숫자를 입력하여 두 수의 합을 구하는 스캐너를 제작하시오.  
		 */
		Scanner sc = new Scanner(System.in);
		
		int a=1 ;
		int to1 = 0;
		int su ;
				
		while(a<=2){
			System.out.println(a+"번째 숫자를 입력하세요."); // System.out.println("숫자를 입력하세요");
			su = sc.nextInt();
			to1 += su ;
				a++;
		}
		System.out.println("총 합계 수는 "+to1+"입니다.");
		
		sc.close();

		
		
		
		
		
		
	}

}
