
public class Class2 {
//package를 사용하지못함 . (default라서..)
	public static void main(String[] args) {

		// 별도의 클래스 지정 후 함수를 이용하여 값을 전달받기.

		inject.oksign(); // 가장 기본이 되는 함수 즉, static void 를 사용시.
		inject.test();
		members.user("이순신");  //괄호 안에 있는 data (인자값) 
		members.cal(5, 10);     // members class 안에 cal 라는 일반 함수에 5와 10 의 인자값을 던짐. 
		
	}

}

class inject {
	// public static void : 가장 기본이 되는 일반 함수를 뜻합니다. = 메소드 함수.

	public static void oksign() {
		String user = "홍길동";
		System.out.println(user);

	}

	public static void test() {
		int aa = 1;
		int bb = 3;
		int cc = aa + bb;
		System.out.println(cc);
	}

}

class members {
	public static void user(String names) {
		
		
		String msg = names+ "님 환영합니다.";
		System.out.println(msg);
		
		
	//  System.out.println("test");
		
		
	}

	public static void cal(int a, int b ) {  // (자료형 이름, 자료형 이름)  : 인자값 2개를 받음
		int c = a*b;
		System.out.println(c);
		
	}
	
	
	
}
