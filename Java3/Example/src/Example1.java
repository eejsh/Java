import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		
	/*	[up & down 게임]
	 *  1. pc가 숫자를 하나 선택       힌트 - randow 1~10  
	 *  2. 총 기회는 X번 남았습니다. (총 5회) 1~10까지 번호 중 하나의 번호를 입력?
	 *  3. 만약에 PC가 7을 선택한 기준에서 사용자 숫자와 비교..
	 *     - pc :7 사용자:2   => 결과 : UP
	 *  4. 총 기회는 4번 남았습니다. 1~10번호 중 하나의 번호를 입력? 
	 *  5. -pc : 7  사용자 :4 => 결과 : up
	 *  6. 총 기회는 3번 남았습니다. 1~10번호 중 하나의 번호를 입력?
	 *  7. pc : 7  사용자 : 7  => 정답입니다. 모든 프로세서는 정지
	 *  
	 *  *반복문, if문 배열X
	 *  
	 *  A파트 : PC 랜덤, Scanner(5)이용
	 *  B파트 : PC에서 랜덤숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리.
		*/
		 Example2 ex2 = new Example2();
		 

     int pc = (int)(Math.random()*10+1);
     Scanner user = new Scanner(System.in);
      
     int a;
     int nu=0; //유저값
     for(a=5; a>0; a--) {		
		System.out.println("1~10까지 번호 중 하나의 번호를 입력?");
		nu = user.nextInt(); 
		ex2.ab(pc, nu);
		String ed1 = ex2.end();
	
		
		if(ed1.equals("정답입니다.")) {
			System.out.println(ed1);
			System.exit(0);
					}
		else {
			System.out.println(ed1);
		}
     }
     
     user.close();
     
     
     
   
   
		
}
	}
