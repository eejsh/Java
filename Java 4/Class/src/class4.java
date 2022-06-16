import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 * 배열 데이터 : 홍길동, 이순신, 유관순 세개의 데이터가 있습니다. 메인class에서 문자를 하나 전송합니다. 단, 문자가 null 보낼
		 * 수 있으며, 배열데이터와 관계없는 "강감찬"이라고 보낼 수도 있습니다. 외부 class : data_list 이며, 추상 class
		 * :v_constuct 입니다. 외부 class 안에 내부 클래스명은 check 입니다. [결과형태] main class 에서 강감찬을
		 * 적용할경우 내부 class 에서 "해당 사용자는 가입자가 아닙니다" 출력. main class 에서 이순신을 적용할 경우 내부
		 * class에서 "해당 사용자가 있습니다" 라고 출력. 단, arraylist로 배열을 로드하십시오.
		 */

		data_list da = new data_list();
		da.userinput("유관순");

	}

}

abstract class v_constuct {
	String user_name;
	public abstract void userinput(String nm);
}

class data_list extends v_constuct {

	@Override
	public void userinput(String nm) {

		if (nm == null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");

		} else {
			this.user_name = nm;
			check ck = new check(); // 내부->외부 호출 가능.
			ck.db(); // ckeck의 db로 넘김.
		}

	}

	class check {             //부모 클래스에 있는 받은 값을 자식 클래스로 이관
		String user_name = data_list.this.user_name;            
		String data_list[];  // 필드에 배열을 받는 객체만 생성(밖에서 안돌고 마지막 check에서 데이터 검수하면 작동속도빠름. -->메모리공백-->이름 들어오면 동작)
		ArrayList<String> ar = null; // arraylist 유틸을 필드에 선언만 함. 객체만 생성 함.public 에 있는 data_list 가져옴.
		public void db() {
			// 해당 필드에 있는 arraylist를 인스턴스로 적용함.
			this.data_list = new String[] { "홍길동", "이순신", "유관순" };
			this.ar = new ArrayList<>(Arrays.asList(this.data_list));
			this.compare(); // 최종 db와 사용자 정보를 비교하는 메소드 /compare로 넘김. 
		}

	public void compare() {

		int ea = this.ar.size();
		int dw = 0;
		boolean bl = false;  //결과확인.
		do {
			if(this.user_name.equals(this.ar.get(dw))) {
			bl =true;
			}
			dw++;
		}while(dw<ea);
		if(bl==true) {
			System.out.println("해당 사용자가 있습니다.");
		}
		else {
			System.out.println("해당 사용자는 가입자가 아닙니다.");
		}
		
	}

	}

}