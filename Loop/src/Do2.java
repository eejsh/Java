
public class Do2 {

	public static void main(String[] args) {
		
	/*	int a = 1 ; //반복문 기초값
 		int b = 9 ; //산술 고정값
 		int c ;
 
		do { 
		 c = a * b ;
		System.out.print(c);	
		 a++;
		
		}while (a < 10 ) ;          //a 가 10 보다 작은수까지
	*/
	
		/*응용문제
		 * 다음 결과 값을 보고 do~while 문으로 코드을 작성하시오.
		 *  35 , 45, 55, 65, 75 
		 *   결과값넣으면안됨..
		 * */
		
		// int 첫 변수 k들어가면  k++; 변수 바귀면 안됨
		
		int k = 3 ;
		int j ;
		do {
			j = k * 10 + 5;
		System.out.print(j+" ");
			k++;
		}while(k <= 7) ;  // 3.4.5.6.7 = 5번반복.. ㅜㅜ 
		
		

	}

}
