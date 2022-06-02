
public class Class7 {

	public static void main(String[] args) {

//class의 기본 메소드 객체값 전달.
		String mid = "hong";
		String mname = "홍길동";

		java1 jv1 = new java1(mid, mname);

	}

}

class java1 {

	// java1 class를 main에서 객체생성 및 인스턴스를 실행하면 바로작동하는 class 기본 메소드 입니다.

	public java1(String a, String b) { // class에 기본으로 사용하는 메소드 (public만 사용할 경우 class명과 무조건 동일)

		// public java( String a, String b) // 기본메소드 class = public은 무조건 같아야함.
		System.out.println(a + b);
		java2();             // void 메소드를 바로 호출 할 수 있습니다.

	}

	public void java2 () {
		System.out.println("test");
	}

}