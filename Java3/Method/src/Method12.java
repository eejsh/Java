
public class Method12 {

	public static void main(String[] args) {
	
		//extend 를 사용한 자식 class를 로드하게 되면 자동으로 부모 class도 함께 사용이 가능합니다. (위치 상관없음)
		

		bbox2 bx = new bbox2();
		bx.b2("이순신");
        System.out.println(bx.abc());  //메소드 전부 상속받음
        
		
		
	}

}



class bbox {   //기존 외부 class1 main 에서 필요한 사항을 체크       //부모class

	protected String user_info;

	private String user_pw;
	public String user_rpw;  //private에서 bbox2로 넘어가지 않으니 한번 거치기 public string user_rpw;

	public bbox( ) {
		this.user_info = "홍길동";
		this.user_pw = "abcd";

		this.user_rpw = this.user_pw.replace("abcd", "Ox5%3#df2");

		
		
	}
	

public String abc() {
	String email  = "hong@nate.com";
	
	return email;
	
}



}


class bbox2 extends bbox  {   //bbox에 대한 모든 정보를 bbox2와 공유하게됨.   //자식class   
	//단, bbox 중에서 private으로 셋팅된 값은 공유하지 않음.
    
	
	// extends -> bbox에 있는 코드를 전부 받음. 단, 인수값이 있으면 로드 안됨

	public void b2(String nm) {
	//해당 값에 인수값을 적용하여 bbox class 에 있는 필드명 중 user_info에 적용하게 되는 형태.
		
		this.user_info = nm;
		
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);

	}


}

