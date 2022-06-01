import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

//	    /*3.4, 1.6, 4.2, 5.3, 4.7 .. 24.0 ,11.5, 11.0       소숫점이 나오면 int 사용시 에러뜸..  
//	     * { 5,10, 15, 20, 30}	     */
//	
//		int data[] = {5,10,15,20,25,30,35} ;
//		/*
//		 * for~each 문을 사용 할때는 인덱스 번호가 필요 없이 사용할 경우는 for each사용.
//		 * for, while, do~while문을 사용 할 때는 인덱스 번호가 필요할때 사용.
//		 * [0][1][2] .... : 인덱스 번호   */ 
//	    for(int f : data) {         //int F 가 순차적으로 data 배열값을 받아서 저장시킵니다. ㅇㅅㅇ
//	    	 if(f %2 == 0) {  // f 중 0으로 떨어지는 애들을 표기해주세요.	    	
//	    //	System.out.println(f);}
//		      }
//	    }
//		 
//	   String pay[] = {"무통장입금", "신용카드", "휴대폰", "상품권", "쿠폰"};   //결제 선택배열
//	   Scanner sc = new Scanner(System.in);
//	   System.out.println("결제하고자 하는 형태를 선택해 주세요.");
//	
//	   String pm = sc.next();
//	   
//	   for(String z : pay ) {      // 배열 데이터가 문자이므로 변수형태 또한 문자형을 사용해야 합니다.
//		   //pay 배열 데이터 삭다 가져옴... 일반 반복문엔 string가 없지만 for~each문에서는 string 사용가능
//	       if(pm.equals(z)) {
//	      //	   System.out.println(pm+" 으로 결제 실행 됩니다.");
//	    	   if(z.equals("휴대폰")) {
//	    		   System.out.println("현재 시스템 점검으로 해당 결제는 사용 하실 수 없습니다.");
//	    	  }
//	    	   else {
//	    		   System.out.println(pm+" 으로 결제 실행 됩니다.");
//	          }
//  	       }
//	  }
//	  
//	 sc.close();  
//	
//	 /* 응용문제
//	     * 
//	     * 주문절차. 
//	     * 햄버거 쳐도 또 질문이 뜸, 치킨 선택 시 .. 
//	     * 종료 -> 햄버거, 치킨
//	     * {"햄버거", "피자", "치킨", "커피"}
//	     * "Q. 주문하고자 하는 음식을 선택해 주세요."
//	     * 해당 질문은 총 4번을 물어보게 됩니다.
//	     * 단, "주문종료"라고 사용자가 입력시,그 즉시 주문은 종료되며, 주문 내역을 출력하시면 됩니다.*/    ctrl+shift+c= 선택된 영역 주석 

		// 2차 배열에서는 for~each 절대 사용하지 못함=방식이 없음~!~!~!~!

		String menus[] = { "햄버거", "피자", "치킨", "커피" };
		String user_meuns[] = new String[4];

		Scanner sc = new Scanner(System.in);
		String user;
		int ct = 0; // if문의 카운터사용할 함수

		for (String f : menus) {
			// System.out.println(f);
			/*Scanner가 반복문 안에 적용시 loop로 무조건 반복하지는 않음.
			 * 사용자가 입력할 때 마다 반복문 범위만큼 출력하는 형태임. 
			 * 집에가서 다른 반복문으로 돌려보세요~
			 * */
			
			
			System.out.println("매뉴를 선택해 주세요?");
			user = sc.next();
			if (user.equals("주문종료")) {
				break;
			} else {
				for (String ff : menus) {
					if (user.equals(ff)) {
						user_meuns[ct] = ff;
						ct++;
					}
				}
			}
		}

		sc.close();
		System.out.println("주문하신 메뉴는 다음과 같습니다." + Arrays.toString(user_meuns));

	}

}
