import java.util.Random;
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
		 

//		Example2 ex2 = new Example2();
//     int pc = (int)(Math.random()*10+1);
//     Scanner user = new Scanner(System.in);
//      
//     int a;
//     int nu=0; //유저값
//     for(a=5; a>0; a--) {		
//		System.out.println("1~10까지 번호 중 하나의 번호를 입력?");
//		nu = user.nextInt(); 
//		ex2.ab(pc, nu);
//		String ed1 = ex2.end();
//	
//		
//		if(ed1.equals("정답입니다.")) {
//			System.out.println(ed1);
//			System.exit(0);
//					}
//		else {
//			System.out.println(ed1);
//		}
//     }
//     
//    user.close();

		/*  일반 random 형식 (random double 자료형)
		 * 유틸을 이용한 랜덤- 0부터 시작함으로 10개 에서 +1하면 1~10출력됨 */
		    int pcr1 = (int)(Math.random()*10+1);
	      	System.out.println(pcr1);
		/* 유틸 사용한 random방식*/
			Random r = new Random();
			int pcr2 = r.nextInt(10)+1;
			System.out.println(pcr2);	
		
   		
	
	Example2 ex2 = new Example2();
	Scanner sc = new Scanner(System.in);
	

	int w = 5;
	do {
	System.out.println("1~10까지 숫자를 입력하세요." + w +"번남음");	
	int user = sc.nextInt();
	ex2.randomok(pcr1, user);
	String out = ex2.result();  //ex2에 있는 result 에 있는 값을 받아옴. string return 되었음으로 string 으로 받음
     System.out.println(out);
	 
     //결과값 확인.
     //indexof - 단어가 있는지 찾음 -1 : 없음  0 : 있음 , 문장이 길어도 단어만 찾아서 값을 유출해냄
     int check = out.indexOf("정답");
     if(check==0) {   //찾은 단어가 0으로 나오면 프로세서 종료
		 break;
	 } w--;
	 System.exit(0);
	}while(w > 0);
	
	sc.close();
	
	
	
}

}
