public class Method7 {

	public static void main(String[] args) {
		apink ap = new apink("홍길동", 25, "test@test.com", -1000);
		// ap.names();

		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink {

	// class안에 필드라 부름
	// private선언은 class 필드에서 생성해야 합니다.
	private String nm;
//	private int age;
	private String email; 
	
	private String email_cp;
	
	private int point;

	// String nm2;

	public void names() { // private를 안에서 사용하지 못함.

		if(this.nm == "홍길동") {
		this.nm = "hong";             //한글->영어로 바꿀때 사용.

		String e[] = this.email.split("@");      // 이메일 뒤에 이메일회사 정보만 가져오기 위한 배열로 나누는 작업임  .. split("@")
		
	//	System.out.println(Arrays.toString(e));
		this.email_cp = e[1];
		
		}
		
	}

	public apink(String nm1, int age2, String email3, int point4) { // 한번에 선언
		// setter 형태

		this.nm = nm1;
		this.email = email3;
		if (point4 < 0) {
			this.point = 0;

		} else {
			this.point = point4;

		}
		//names();   //중간에 로드하는 메소드가 끼면 우선출력됨. 홍길동X->hong
	}

	public String data() {

		names(); //return으로 나가기전에 바뀐 정보를 태워서 보냄.  ->public void 에서 홍길동->hong으로 변경되어 값변경 후 출력됨.
		
		//return this.nm;  //return은 맨 마지막에 사용하는 코드 입니다. 이후 변수추가되면 에러뜸.
    return this.email_cp;
	
	}

	public int data2() {
		// getter 형태
		return this.point;

	}
}