
public class While1 {

	public static void main(String[] args) {
		
		int a = 1 ;         // while 시작값
 		while (a < 11) {    // while 범위값, 종료값 (몇번 돌릴건지)
			System.out.print(a+",");
			a++;            //증가 또는 감소
		}
	
 		int b = 10 ;
 		while (b >= 5) {
 			System.out.print(b+",");
 			b--;
 		}
		
 	/*응용문제
 	 * 다음 사항을 while문으로 작성하시오.
 	 * 22부터 16까지 숫자를 출력하시오
 	 * */
 		
 		// 반복문에 문자열(string) 사용안함 
	 int c = 22;
	 while (c >=16) {
		 System.out.print(c+",");
		// printf("%d ", c);
		 c--;
	 }
	
	/*  int aa = 1;    // 초기값
	  int bb = 10;   // 종료값
	  
	  while(aa <= bb) { //반복문 범위
		  System.out.printf("%d ",aa);
		  aa++ ; //증가
	  }   */
		
    /*응용문제
     * 변수 두개를 이용하여 범위에 맞게 값을 출력하시오.
     * 99~47 까지 출력
     */
		int a1 = 99 ;
		int a2 = 47 ;
		while (a1>=a2) {
			System.out.printf("%d ",a1);
		a1--;
		
		}
		
		
	}

}
