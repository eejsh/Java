package Ab2; 
import Ab.method_1;  // package Ab에서 main class를 로드함.

public class ab2_method {
	public static void main(String[] args) {
         //@Override  main class를 Ab-method1 을 오버라이드 함.

		Ab.method_1 at = new Ab.method_1();        // ab에 있는 method_1을 가져오기. 가져올 class에 public이 있어야만 가져올 수 있음.
//		at.recall();                //public 메소드 실행
//		at.name();                  // protected 메소드 실행.
		at.main(args);              // main 메소드 실행       --Ab-method1 main을 다 끌고와서 출력.
		
		//private는 못끌고옴. [은닉화]
		
		
		
		
	}

}
