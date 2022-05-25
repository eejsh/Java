import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {

		
		
		/* Scanner 와 함게 While 문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작 하시오.
		 * */
		
         Scanner sc = new Scanner(System.in);
         System.out.println("원하시는 구구단 숫자를 입력하세요");

         int gugu = sc.nextInt();
         
         
         int c = 1;   // 기초
         int aws ;      //출력값
        
       
         while (c<10) { ;  
          aws = gugu * c ;
         
         System.out.print(aws+" ");

         c ++; 
         }
         
         sc.close();
		
	}

}
