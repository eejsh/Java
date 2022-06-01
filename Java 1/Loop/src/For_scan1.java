import java.util.Scanner;

public class For_scan1 {
	public static void main(String[] args) {

	/*tip
	 * int a = 5;
	System.out.println(a++); //선 대입 후 연산  = 5
	System.out.println(++a); //연산 후 선 대입  = 7	
	int b = 10 ;
	int c = 10 ;
	//int d = b + c++ ;  // 찍고 증가시킴
	  int d = ++b +c ;  // 증가 후 덧셈   c + (++b)
	System.out.println(d);  */
	
	Scanner sc = new Scanner(System.in);        // 입력엔진
	int jumsu;                                  // 사용자 입력 변수
	int f;                                      // 반복문
	int total = 0;                              // 사용자가 입력한 값에 대한 합계
	
	for (f=1; f<4; f++) {          //3번
		System.out.println("점수를 입력해 주세요."); 
		jumsu = sc.nextInt();                    // 사용자가 입력한 값
		total += jumsu;                          // 사용자가 입력한 값을 합계변수로 이관  total = total + jumsu;
					
	}System.out.println("총 점수의 합은 " + total);
	sc.close();	      // 엔진종료
	
	
		
 }
}