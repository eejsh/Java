
public class oop4 {
	// 추상 클래스 및 메소드 abstract
	public static void main(String[] args) {

		// ab_1 a1 = new ab_1(); 사용못함. 실체가 없는, -> abstract 코드 정형화. 표준화코드.

		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		System.out.println(ab.c());
		ab.ab_a();

	}
}

abstract class ab_1 { // 추상클래스 : 외부에서 로드가 절대 안됨. 자체실행도 안됨. 보이지않는데 잡아서사용한다.
    public int c;
	public void ab_a() { // free ( 인수값 없는 추상 메소드) -사용해도 되고 안해도되고.
    	
        // System.out.println("부모 클래스 입니다.");
	}
	public void ab_a(int a) {  //free 인수값 받는 추상메소드 

	}
    public abstract void ab_c();   //free 구성 무조건 자식 class에서 사용.
    
	public abstract int b(); // 추상 메소드 (free구성) 자체 실행 안됨 (extends에서 불러서 써야댐)
	// public abstract int c() ; //앱스텍 올려서쓰세용 --> 추후에 수정용이함, 문제시 차단할수 있음

}

class ab_2 extends ab_1 {
	@Override
	public void ab_c() {
	}
	
	@Override
	public void ab_a(int a) {
             }
	
	@Override
	public int b() { // 실제 메소드 - 추상메소드를 받아와서 씀 [abstract에서 int로 받았음으로 public int로 받아야댐]
		return 55;
	}

	public int c() { // -> abstract int c
		return 99;
	}

}
