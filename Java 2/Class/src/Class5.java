import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		Member2.lists2();
		
		Member2 mb2 = new Member2 ();  
		//static 이 없는 함수이므로 객체 및 인스턴스를 생성해야됨  = Member2 mb2 = new Menmber2();
		mb2.lists();            //인스턴스(메모리)에 있는 메소드를 로드하게 됨

		
		Member2.lists3("유관순",12345);        //class Member2에 있는 lists3에 있는..string nm 으로보냄
		                                //string user_name = nm; 은 거처서 할 경우. ex ->반복문, 배열로 사용할경우는 감. 
		
		
		
		
		/*응용문제 for_in 이라는 일반 메소드(메모리)가 있습니다. 
		 * 프로그램 실행 시 다음과 같이 질문을 합니다.
		 * 
		 * "사용하실 구구단 숫자를 하나 입력해 주세요."
		 * [결과] 해당 메소드에서 출력해야됨. 
		 *  만약 사용자가 3단을 입력 시, 3*1=3.......3*9=27  출력되야함..
		 *  for문...ㅠ
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
	 	System.out.println("사용하실 구구단 숫자를 하나 입력해 주세요.");
		int usersc = sc.nextInt();
		Member2.for_in(usersc);         //for_in으로 보내야됨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		sc.close();
		
		
	}

}




class Member2 {

	public void lists() {                        //메모리 할당하지 않음      static 선언이 없어서 할당되지않음 class5 에서 new Member2(); 선언해줘야함.
    // 메모리에 별도의 할당없이 메소드 함수만 선언, 직접적으로 로드하지 않음.
	String a = "홍길동" ;
	//System.out.println(a);
	
	}
	
	public static void lists2() {                //메모리 할당함
		String a = "이순신" ;
	//	System.out.println(a);

	}
   
	
	/*member2 에 일반함수(메모리) list3 메소드 안에 3개의 필드를 셋팅합니다. 문자user_name, 숫자 user_tel, 숫자 user_point 
	 * 인자값을 넣기..       */
    public static void lists3(String nm, int pw) {
    	// mn을 메소드에서 전달받는 값을 바로 사용할 경우 (nm.equals("유관순"))
    	
    	
    	String user_name = nm ;
    	int user_pw = pw;           //메소드에 객체 값을 첨부하여 로드 후 메소드 안에 별도의 필드명을 이용하여 전달받는 형식
 
    	
    //	System.out.println(nm); = "유관순"으포 출력됨  string nm ->유관순
    	
    	if(nm.equals("유관순") &&  user_pw==123456   ) {           //string nm->string user_name=nm -> if문으로 바꺼서 사용할 경우..
   // 		System.out.println("회원 확인이 되었습니다.");
    		
    	}
    	
    	//else if~~
    	else {
   // 		System.out.println("비회원입니다.");
    	}
    		
    	
    }
    
    
    
    
    public static void for_in (int usersc) {    //위 scanner에서 값을 받아와야댐.........
    	int userf = usersc;
    	
    	int a ; 
        int total = 1;
    	for(a=0; a <= 9; a++) {
    	  	total = a * userf;
    		
    	 // 	System.out.println(total);
    	  	System.out.println(userf + "*" + a + "=" + total);
    	  	
    	  	
    	}
    	
    }
	
}