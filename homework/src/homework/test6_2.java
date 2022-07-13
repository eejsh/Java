
public class test6_2 {

	public static void main(String[] args) {

		/*
		 * 다음 제시한 사항을 JAVA에 다형성을 기반으로 프로그램을 제작하시오. 해당 추상 클래스명은 login 입니다. 결과] 홍길동님
		 * 환영합니다. 이순신님 주문하신 내역이 없습니다. 힌트) 자식 클래스는 2개 입니다. extends
		 */

		String aa = "홍길동";
		String od = "이순신";
		
		jjj j = new jjj();
		j.A(aa);
		kkk k = new kkk();
		k.A(od);
		
	

	}

}

class jjj implements test6_1 {

	@Override
	public void A(String nm) {
		System.out.println(nm + "님 환영합니다.  ");
	}

}

class kkk implements test6_1 {

	@Override
	public void A(String nm) {
		System.out.println(nm + "님 주문하신 내역이 없습니다.");

	}

}
