public class Class4 {

	public static void main(String[] args) {

		Member mb = new Member();
	
		
		// 객체 : Member
		// mb : 인스턴스
		// new Member(): 메모리에 인스턴스명을 생성하여 사용할 수 있도록 함. - 보이지 않지만 메모리할당,,,,

		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 25 * mb.user_agree;
		System.out.println(total);

		final int agree = mb.user_agree;
		// member 인스턴스 필드값을 로드합니다. => agree라는 필드 상수값으로 전달

		mb.user_agree = 80; // 메모리에 등록된 필드명에 해당되는 값을 변경함. 원래 6가지고 있던것을 80으로 변경

		System.out.println(mb.user_agree);
		System.out.println(agree);

		/*
		 * 일반 클래스 메소드부분 일반 클래스 메소드 사용시 별도의 객체 및 인스턴스를 만들 필요가 없습니다. 왜? static 자체가 메모리
		 * 인스턴스를 사용한다는 뜻입니다. static = 메모리 인식. 메모리에 바로 넣어주기..
		 * 
		 */
		coupon.events();
		mb.Member_event();

	}

}



class Member { // 클래스
	// 각각 파트에 자료형태의 변수만 선언
	String user_name; // 변수 필드명 (user_name) 을 생성.
	int user_age;
	int user_level;
	int user_agree = 6; // 변수 필드명에 필드값(1)을 선언.
	//필드 값을 선언 안하면 맨 위 new 객체가 받질 못함,, 만약 필드값을 선언했다면 new 선언해야됨.

	public static void Member_event() { // 다른 클래스에 있는 메소드를 작동하고 싶으면 pubilc stacit void 선언해야됨.
              coupon.events();      
  //class에 대한 메소드를 바로 호출할 수 있음. 단, event라는 메소드에 변수필드 및 변수필드값을 class에 선언하게 되면 그때는 객체+인스턴스를 생성해야만 로드 됩니다.
              

	}

}

class coupon {
	public static void events() {

		int cp = 30;       //메소드 함수만 있음...... 만약에 필드 선언하면 member에 new 할당해야됨.
		System.out.println(cp);

	}
}

/*
 * 하나의 project 중 서로 다른 package라도 한번 사용한 Class명은 다른 곳에서 사용하실 수 없습니다. 다른프로젝트는 가능..
 * Class 같은단어 잘 사용하지않음..
 */
