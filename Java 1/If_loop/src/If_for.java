
public class If_for {

	public static void main(String[] args) {
	 final int a = 1;  // final 을 사용시 변수 에서 상수로 변경됨.
	 /*상수는 절대 변하지 않는 수를 말함. (절대값)*/
	 final String name = "홍길동";  // 문자열 절대값
	 System.out.println(name);
	 System.out.println(a);
		
	 final int ct = 5;  // 절대값 . 고정값         ex 아이디
	 int f;              //   반복문
	 boolean ok = false; // ct=55 -> ok 기억    // 조건에 대한 true or false 로 구분. 
	 for (f=1;f<=10;f++) {  //1~10까지 반복 if(f==ct)후 숫자가 없으면 if(ok==false)로 넘어가고 출력
	     if (f==ct) {         // 반복문 값과 고정값이 같을 경우 
	    	 System.out.println("등록된 값이 확인 됩니다.");
	         ok = true;        // int 값에서 조건에 맞는 숫자가 나오면 boolean 문의 false가 true로 변경되어 등록된 값이확인딥니다 출력.
	         // 조건에 대한 값을 변경
	     }
	                           //else 사용하면 위의 true 값이 다시변경되므로 2가지 조건이 있을 경우 if문 추가.	 
	 }
 
                                  //for문 종료	 
	 if (ok == false) {     
		 // 만약에 반복문이 끝났는데도 반복문 안에 조건 사항이 없을 경우 출력되는 코드.
			System.out.println("확인이 되지 않은 숫자입니다.");
			
		}

		/*총 20번의 값을 반복합니다. 그중 홀수 값만 출력합니다.*/ 
		
	 int ff ;
	 String odd="" ;          //odd 홀수, even 짝수
	 
	 for(ff=1;ff<=20;ff++) {
		 if(ff%2!=1) {    // 값에서 나누기 하여 남은 수가 1 이면 홀수, 0이면 짝수
			 System.out.print(ff+" ");
			 
		 }
	 
		 else {
			  // 만약에 홀수 값일 경우 odd 변수에 지속적으로 값을 추가하게 됩니다.
			odd +=ff+" " ; // ff + " " + odd ;   //추가 할 경우 " " 빈 공간을 활용 하여 적용함.
	 }
	 }
	 System.out.print(odd);
	
	     
		
	}

}
