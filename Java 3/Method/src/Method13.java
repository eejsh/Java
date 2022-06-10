
public class Method13 {

	public static void main(String[] args) {
		// extends : inherit (상속)

		/*
		 * 절대 부모 class에 construct 부문에 인수값을 적용하면 자식 class에 로드를 못하는 사항이 발생함. 단, 자식 class에서
		 * 인수값을 적용하여 construct 을 사용할 수는 있음.
		 * 
		 * 
		 */

		mth1 m1 = new mth1();

		mth2 m2 = new mth2(50);

	}

}



class mth1 {

	public int on;

	public mth1() { // public에 인수값 넣으면 extends에서 오류남. public 에 인수값 넣지않는게 좋음. void는 상관없음.

		this.on = 20;

		System.out.println("mth1");

	}
}

class mth2 extends mth1 {

	public mth2(int z) { // extends 자식 class는 인수값 넣어두됨.
            this.on = 50;
		System.out.println("mth2");
		System.out.println(this.on);

	}

}