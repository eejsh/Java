package App;

public class App1 {
/*App1라는 기본 메인class 이며 abox와 main이 공존해 있음.*/
	public static void main(String[] args) {
		//method11에서 로드할 경우 해당 외부 blue 클래스를 로드하여 출력시켜 method11에서 로드 할 수 있도록 함.

		blue b = new blue();

		System.out.println(b.box());

	}

	public void abox() {
		System.out.println("test import");

	}

}


//blue 는 별도의 외부 class 이며, method 11 에서 직접적인 핸들링은 불가능함.
class blue {

	private String msg;

	public String box() {
		this.msg = "환영합니다";
		return this.msg;

	}

}