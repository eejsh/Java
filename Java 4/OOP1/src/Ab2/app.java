package Ab2;

public class app {

	public static void main(String[] args) {

/*	(자식) + (자식)
 * 
 * members mb = new members();
	mb.opp();
	mb.oop();  */
		
	
		//(부모)=(자식) -> 인터페이스 기준으로 적용된 오버라이드만 호출함 (형변환)
		
//		members mb = new members();  // 자식 class 전용
//		app_data2 ap = mb; //인터페이스 전용   (클래스->인터페이스 기준)
	    
		
		app_data2 ap = new members();
		members mb2 = (members)ap;  // 인터페이스 -> 클래스 변환
	
//		ap.oop();
//		ap.oop2();
//		mb.oop(); //따로 만든 메소드라 사용안됨. 직접 호출해야됨		
		
		
		
	} 
}
/*
 * class members implements app_data1 { 
 * app_data1에 강제로 자료형 선언하는 방식

public void user_join(
{system.out.println("test" );
 * }
 */


class members implements app_data2 {
	@Override
	public void opp() {
System.out.println("test");
	}

	@Override
	public void opp2() {
System.out.println("test2");
	}

	
	public void oop() {  // 직접 호출해야 사용가능.
System.out.println("test3");
	}

} 
	
	