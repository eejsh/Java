import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		/*응용문제
		 * 
		 * 사용자가 다음과 같은 질문을 받습니다.
		 * 1~5 까지 숫자를 입력해 주시기 바랍니다.    ->scanner 사용
		 * [결과내용]
		 * 1 : 5% 할인쿠폰
		 * 2 : 10% 할인쿠폰
		 * 3 ~ 4 : 택배비 무료
		 * 5 : 다음기회에.........
		 * */
		
		
		int user;

    		System.out.println("1~5번까지 숫자를 하나 입력해 주세요.");
		 Scanner sc = new Scanner(System.in);
		 
		 user = sc.nextInt();           //문자로 받을경우 user.next();
		 String msg;
		 
		 switch(user){                 // switch(a)  case "1"  <문자로 받아야됨. 
			 case 1 :
				 msg = "5% 할인쿠폰";
			//	 System.out.println("5% 할인쿠폰");
				 break;
			 
			 case 2 :
				 msg = "10% 할인쿠폰";
				// System.out.println("10% 할인쿠폰");
				 break;
				 
			 case 3 :
				 
			 case 4 :
				 msg = "택배비 무료";
				 //System. out.println("택배비 무료");
				 break;
				 
			 case 5 :
			 default:
				 msg = "다음 기회에";
				 //    System.out.println("다음 기회에..");
				break; 
			 
		 }   		 System.out.println(msg);
		
		 // switch version 형태           자바 버전 14 이상부터 가능. 자바8번대는 밑에 코드 안됨
		 
        /*  switch (user) {
          //-> 는 break 없이 활용.
          case 1 -> {      
        	  msg ="5% 할인쿠폰";
          }
          case 2 ->{
        	  msg ="10%할인쿠폰";
          }
          case 3, 4 ->{
        	  msg = "택배비 무료";
          }
          default ->{
        	  msg ="다음기회에";
          }
          }
          System.out.println(msg);		 */
        
        sc.close();
        
		 
	}

}
