import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자를 하나 선택하세요.");
		int no = sc.nextInt();

		// memorys m = new memorys(); -출력하고보자..
		memorys m = null; // 메모리 관리 하면서 쓰기 좋음.
		m = new memorys();
		m.ms(no);

		m = null; // 해당 인스턴스를 비움 (더이상 안쓰겠다... 메모리초기화)

		
		
		m = new memorys();
		m.rd();
		
		
		
	}

}

class memorys {

	public void ms(int user) {

		// Math.random () 랜덤메소드 사용법 기본 자료형은 double입니다. (기본적으로 랜덤은 소숫점임. int는 별도 셋팅 필요함)
		// random =>보안코드, 인증코드, 랜덤추첨이나 룰렛.. 사용시 사용!

		double a = Math.random(); // 0.0~1.0

		int w = 0;
		while (w <= 10) {
			int b = (int) (Math.random() * 9) + 1; // 정수 랜덤은 (int)(Math.random()*10) 10은0~10 , 100은 0~100..
		//	System.out.printf("%d ", b);
			w++;

		}

//		if(user==b) {
//			System.out.println("당첨");
//		}
//		else {
//			System.out.println("다음기회에");
//		}

		// System.out.println(b);

	}

	
	public void rd() {              //random util 사용법
		Random r = new Random();    //random 객체 생성 및 인스턴스 적용 -> 메모리에 작동됨.
		
		
		int w = 0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1);  // 0~9까지의 값. nextint(10)사용함. nextint(10)+1 = 0~10까지.
           w++;			
		}
		
		r=null;  //랜덤유틸 끝 선언.
		
 		
	}
	
	
	
}





