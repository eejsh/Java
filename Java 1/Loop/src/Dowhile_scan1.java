import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
     /*응용문제
      * 사용자가 총 3번의 숫자를 입력합니다. 
      * 3개의 숫자를 모두 곱하여 총 합계수를 출력하시오.
      * 
      * 123456789 * 123456789 * 123456789
      * */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1; // 반복문 사용 
		int user ; // 사용자 입력값
		long to1 = 1; // 총 저장값  곱셈은 0 때리면 안됨.ㅠ    long을 입력시 최종결과에서 -음수 발생함.
 	  
		do {
			System.out.println( a +"번째 숫자를 입력하세요.");
			user = sc.nextInt();
			to1 *= user ;      // to1 = total + user ;
			a++;
		}while(a<=3);
		
			System.out.println("총 합계는 " + to1+"입니다.");
             
			sc.close();
	}

}
