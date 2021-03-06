
public class oop5 {
//abstract 응용 기본형태 인수값으로 추상 메소드를 값을 넘김.
	public static void main(String[] args) {

		load1 ld1 = new load1();
		ld1.datain(20, 30);
		ld1.call();

		load2 ld2 = new load2();
		ld2.datain(20, 30);
		ld2.call();

	}

}

abstract class abclass {
	int data1, data2;

	public void datain(int d1, int d2) { 
		// 기본추상 메소드이며, 모든 데이터를 인수값 받아서 this처리.
		// 단, 외부 클래스에는 선언하지 않음.

		this.data1 = d1;
		this.data2 = d2;
	}// 할당만 해줌.

	public abstract void plus(); // load 1,2 -> plus
	// 각각의 class 기본으로 plus 메소드는 무조건 들어가야함

	public void call() {
		this.plus(); // 부모에 작동.
	}

}

class load1 extends abclass {

//	public void call(int i) {
//		this.avg();                     // -->오버로딩
//	}
	
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
		}
}

class load2 extends abclass {
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();   //(2)
	}
	public void avg() {
		System.out.println("홍길동"); //재귀함수로 plus로 보냄.(1)
	}
}
