import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {

		/*응용문제
		 * 다음 해당 내용을 확인 후 코드를 작성하시오.
		 * Q. 사용자가 원하는 숫자를 입력하세요?
		 * 응답상태 : 짝수 , 홀수 값입니다. 라고 출력.
		 * 
		 * */
		
		
		/* Scanner a = new Scanner(System.in);
		System.out.println("Q : 사용자가 원하는 숫자를 입력하세요.?");
		
		int b = a.nextInt() ;
	
			if ( b%2==1 ) {
	System.out.println("홀수값 입니다.");
			}
					
				else {
			System.out.println("짝수 값 입니다.");
				}
		   */
		
		Scanner k = new Scanner(System.in);
		System.out.println("Q : 사용자가 원하는 숫자를 입력하세요?") ;
		
		
		int z = k.nextInt()  ; // % 2;
		//% : 값을 나누면서 나머지값을 확인하는 수식구
		
		if ( z % 2 == 0) {
			System.out.println("짝수값입니다.");
		}
	
		/*else if (z % 2 ==1 ) {
			System.out.println("홀수 값입니다.");
		} */
		
		else {
			System.out.println("홀수값입니다.");
		}
				
				k.close(); 
				
				
			
		
	}

}
