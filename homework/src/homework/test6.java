package hw;

public class test6 {

	public static void main(String[] args) {
	

		
		

/*다음 제시한 사항을 JAVA에 다형성을 기반으로 프로그램을 제작하시오.
해당 추상 클래스명은 login 입니다.

결과]
홍길동님 환영합니다.
이순신님 주문하신 내역이 없습니다.

힌트) 자식 클래스는 2개 입니다.  extends */
	
	String nm = "홍길동";
	String od = "이순신";
	
	user us = new user();
    us.aa(nm, od);
    
	}

}


abstract class login{
	public String name;
	public String order;

	public abstract void aa(String a, String b);
		
}
class user extends login{
		@Override
		public void aa(String a, String b) {
			this.name = a;
			this.order = b;
			
			System.out.println( a + "님 환영합니다.  ");
			System.out.println( b + "님 주문하신 내역이 없습니다.");
		}
			
}