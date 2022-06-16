import java.util.ArrayList;
import java.util.Arrays;

public class class4_1 {

	public static void main(String[] args) {
		/*
		 * 배열 데이터 : 홍길동, 이순신, 유관순 세개의 데이터가 있습니다. 메인class에서 문자를 하나 전송합니다. 단, 문자가 null 보낼
		 * 수 있으며, 배열데이터와 관계없는 "강감찬"이라고 보낼 수도 있습니다. 외부 class : data_list 이며, 추상 class
		 * :v_constuct 입니다. 외부 class 안에 내부 클래스명은 check 입니다. [결과형태] main class 에서 강감찬을
		 * 적용할경우 내부 class 에서 "해당 사용자는 가입자가 아닙니다" 출력. main class 에서 이순신을 적용할 경우 내부 class
		 * 에서 "해당 사용자가 있습니다" 라고 출력. 단, arraylist로 배열을 로드하십시오.
		 * 
		 */

		datalist1 dl = new datalist1();
		dl.data1("유관순");

		datalist1.check dlc = dl.new check();
		dlc.che();

	}

}

abstract class vconstuct {
	String lists[] = { "홍길동", "이순신", "유관순" };
	ArrayList<String> u_list = new ArrayList<>(Arrays.asList(lists));
	String userck;

}
class datalist1 extends vconstuct {

	public void data1(String user) {
		this.userck = user;
	}

	class check {
		public void che() {
			String usname = datalist1.this.userck; // 체크이름
			String msg = "";

			int f;
					int ea = datalist1.this.u_list.size(); // 배열 숫자. -3개
			for (f = 0; f < ea; f++) {
				if (datalist1.this.u_list.get(f).equals(usname)) {
				msg ="회원맞음";
				}
				System.out.println(msg);
			}

		}

	}
}
