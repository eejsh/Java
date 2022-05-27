import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
	/* 응용문제 9
	 * A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
	 * "점수를 입력하세요"라는 문구는 총 5번이 나오게 되며, 모든 점수는 합산 한 후 5개의 점수에 대한 평균값을 출력하셔야 합니다.
	 * 출력 메세지는 "해당 점수의 평점은: " 출력
	 * 단, 평점 점수가 40점 이하 일 경우 "재시험입니다." 라고 메세지를 
	 * 출력후 프로세서는 종료합니다. 40점 이상일 경우 "합격"이라고 메세지를
	 * 출력하십시오.
	 * 
	 * [추가기획]
	 * "입력하실 과목 수를 적어주세요: " 라고 제일먼저 출력 후
	 * 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용 되어야합니다.
	 * for 문
	 * 
	 * */
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목수를 적어주세요");
		
		
		int a ;    //초기값
		int b ;    //입력
		int total = 0; // 합계
		int c ;  // 입력 과목수
		int total2 ;  // 평균값
		c = sc.nextInt();
		
		for(a=1;a<=c;a++) {
		 	
			System.out.println("점수를 입력하세요.");
			b = sc.nextInt();
            total += b;
		}			
		    //System.out.println("총 점수는 :"+total+" 입니다.");
	          
		        total2 = total / c ;
		
				System.out.println("해당 점수의 평점은: " + total2 +"입니다.");	
			
				if(total2 >= 40) {
				System.out.println("합격");
			}
		    	else if(total2 <= 40) {
				System.out.println("재시험입니다");
			}
			
		sc.close(); */
	
	 //선생님 풀이
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하실 과목수를 적어주세요.");		
		int w = 1;
		int user ;
		int total = 0;
		
		int subject = sc.nextInt();

		
		
		while (w<=subject) {
			System.out.println("점수를 입력해 주세요.");
		    user = sc.nextInt();
	        //total += user;
		    total = total + user;
		    w++ ;
		     }
		//		System.out.println("최종 합계 점수는 " + avg + " 입니다.");
	       double avg  = (double)(total) / subject ;     // 소숫점 변수       total앞 double 함수 추가 넣으면 소숫점까지 표기
	       String msg ;
		     if(avg < 40 ) {
	        	msg = "재시험 입니다.";  
	      }
	      else {
	        	  msg = "합격 입니다.";
	      }
   System.out.println("최종 평균 점수는 : "+ avg+ " 이며,"+ msg );
	        
	  sc.close();
	  
	}

}

