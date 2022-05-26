import java.util.Scanner;

public class Scan9 {

	public static void main(String[] args) {


		

		int to1 = 100000;
	        Scanner a = new Scanner(System.in);

			System.out.println(" 1번 입력시 입금 ");

		    System.out.println(" 2번 입력시 출금 ");

		    int b = a.nextInt() ;   // 숫자입

		    int to2 ;

		   
		  if ( b == 1 ) {
			  Scanner mm1 = new Scanner(System.in);
		      System.out.println("해당 금액을 입력 하세요.");
		      int mm2 =mm1.nextInt() ; //숫자입력
	
		      to2 = to1 + mm2 ;
		      System.out.println("총금액은"+ to2+"입니다.");
		
		  }

		   else if (b == 2) {

			  Scanner mm3 = new Scanner(System.in);
			  System.out.println("해당 금액을 입력 하세요.");
      	      int mm4 =mm3.nextInt() ; //숫자입력
     	      to2 = to1 - mm4 ;

		      System.out.println("총금액은"+ to2+"입니다." );


		 }

		   a.close();
	
	}

}
