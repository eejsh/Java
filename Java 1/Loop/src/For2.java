
public class For2 {

	public static void main(String[] args) {
       
		/*int a;   //for 문 초기값
		int b=2; //연산에 사용할 값
		int c;   //연산한 결과값 사용
		
		for (a=1; a<=9; a++) {
			c = b * a ;  //산술연산 작업
			//System.out.print(b*a);
	       	System.out.print(c+" ");  //연산 된 결과값을 출력함.
		}
 		 */
		/* 응용문제
		 * 다음 결과값을 보고 코드를 작성하시오.
		 * 45, 40, 35, 30, 25, 20,
		 * */
		
	//for(초기값 ; 범위값(몇번돌릴지); 증가 또는 감소)
	 /*	int a1;     // for 기초 변수 값
		int b1=5;   // 연산에 사용할 값 - 5의 배수값
		int c1;     // 계산값
                  //4번 반복
	   for (a1=9; a1>=4; a1--)  {
		      //a1 * 5 
		   c1 = a1 * b1 ;
			System.out.print(c1","); }
	   */
	 
	/* 응용문제
	 * 다음 결과값을 확인 후 코드를 제작하여 출력하시오.
	 * 11,22,33,44,55,66,77,88,99
	 * */	
		
		int aa1; //기초변수
		int bb1=11; //연산 사용값
		int cc1; //계산값
		    //11*1 ; 11*9 		
		for (aa1=1; aa1<=9; aa1++){
			cc1 = bb1 * aa1 ;
			System.out.print(cc1+",");
		}
		int z;  // for
		int x;  // 결과값
		        //z<100 100번 반복, z<9 9번 반복         
		for (z=1; z<10; z++) {
		    x = (10*z)+z;
		  // x = 11*z; 
		    System.out.print(x+",");
		}
		
				// 5~25
		
		int aaa1;
		int aaa2=5;
		int aaa3;
		 // 1부터 시작; 5번 반복; 오름차순 
		for (aaa1=1; aaa1<6; aaa1++){ 
		     aaa3 = aaa1*aaa2;
			System.out.print(aaa3+" ");
			
		}

		
	}

}
