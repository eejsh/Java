
public class Example3 {

	public static void main(String [] args) {
	
		inherit2 ih2 = new inherit2();
		ih2.it("홍길동", "aaa5");
		ih2.print(); 
	}
	
}
class inherit1{
	
	private String nm;  // inherit1 해당 부분에서만 작동
	protected String pw;  //inherit1, inherit2에서 모두 작동되도록 하며, 외부에서 로드못함. (외부에선 들어오진 못하지만 extends, -묶인 class에서는 사용가능.)
	//static String aa;
	public String aa;    //private으로 받은 부분을 inherit2에서도 사용 할 수 있도록 하기위함
		
	public void it(String d1, String d2) {
	 this.nm = d1;
	 this.pw = d2;
	 //aa = this.nm;         //private-> static 으로 한번 거침.->사용가능
	 this.aa = this.nm;  //privata -> public으로 거침->사용가능
	 
		
		
	}
//	public String aa = nm;
	
}

class inherit2 extends inherit1{  // 주로결과출력..
	
	public void print() {
		System.out.println(this.aa + " " + this.pw);
	
}
	
}