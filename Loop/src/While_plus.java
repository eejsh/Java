
public class While_plus {

	public static void main(String[] args) {
		// 5~10 R까지 더한 합계 수를 출력하세요.
		
		int w = 5;  //  초기값. (5 부터)
		int total = 0 ; //숫자 카운터 . 합계치를 누적시키기 위한 변수값
		while (w < 11) {      //5부터 10 까지  더하기   +=, -=, *=, /=, %=
		//   total = total + w; 
		   total += w;
		
			w++;
		}
		System.out.println("합계 "+ total);
		
		/*3에서 8까지 곱한 총 합계를 출력하시오..*/
		
		int w1 = 3 ;
	                           	// 합계를 설정 시 1 기본값으로 설정.
		int to1 = 1 ;           // 곱셈 시 1부터 시작. 덧셈은 1이 추가됨으로 0 부터 시작. (1*0=0, 1+0=1)
		while (w1 < 9) {
			
			to1 *= w1;
			w1++;
			
		}
		System.out.println("합계 "+to1);
		
		
		
		
		
	}

}
