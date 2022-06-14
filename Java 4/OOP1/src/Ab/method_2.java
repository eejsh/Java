package Ab;
/* abstract 와 interface 의 차이점 및 공통점 */




public class method_2 {
//method_2inter and method_2inter2  --> interface 연결됨.
	public static void main(String[] args) {

		loadinter ld = new loadinter();
		ld.setbox("홍길동");
		
		
		
	}
}

//중요 : abstract 와 interface는 모두 static은 사용할 수 있음.


abstract class test{      //public 안써도 사용가능.     abstract는 default를 사용하지 않음(public으로 설정)
	// 차이점. 필드에 자료형을 생성할수 있음.
    public String nn;
	
	public abstract void box();

	public void box2(String n) {
    this.nn=n;
    	
//	public static void box2() {
//	public void.
//  public abstract -> X
		
       		System.out.println("test");		
	}
}


class loadinter implements method_2re, method_2inter2 {   //---> 다중상속.
	@Override
	public String names() {
		return null;
		
	}
}
