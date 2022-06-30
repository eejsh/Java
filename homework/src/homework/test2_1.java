package homework;

import java.util.Scanner;

public class test2_1 {

	public static void main(String[] args) {
		/*		[TEST2]
		[문제1]
		총 8번의 사용자가 숫자를 입력 합니다. 해당 숫자를 입력하는 Scanner은 userinput이라는 메소드 에서 처리를 해야 하며
		해당 모든 값에 대한 더한 결과는  result에서 값이 출력 되도록 하는 프로그램을 제작하시오.
		힌트 (외부클래스에서 메소드2개 생성)
	
		*/
		
      users us = new users();
      
      us.userinput();
      int t = us.result();
      System.out.printf( "입력한 숫자의 총 합계는 %d 입니다." ,t );
      	
	}

}
class users {
	int total =0;
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		int no =0;
		int w = 8 ;
		while(w > 0) {
			System.out.println("숫자를 입력하세요. " + w + "번남음");
			no = sc.nextInt();
	       this.total += no;
	      	w--;
		}
		sc.close();
	}
	
	public int result() {
	return this.total;
		
	}
}