
public class Example4 {

	public static void main(String[] args) {
		
		/*응용문제
		 * 두개의 값을 외부 class로 보냅니다. 해당 클래스에서 두개의 값을 계산하게 됩니다.
		 * 계산형식은 다음과 같습니다.
		 * 3,10을 보내게 되면 두개의 값을 더합니다. 
		 * 나머지 외부 클래스에서 해당 결과값을 출력하는데, 두개의 합 값이 짝수, 홀수인지를 출력하는 extends를 구현 하세요.
		*/
		a2 a = new a2();  // extends 선언 순간 a1는 비워있고 a2로 상속(소속)된다고 생각하면됨.
		
		//  a.ans();  // 자식값을 먼저 호출하면 0값으로 들어가기 때문에 값이 다름/
		
		a.aaa1(3, 10);  // a2 안에 aaa1가 들어감.
		a.ans();        // a2 자식(class)출력 호출.
		
	}
}

class a1 {                                // a1,a2 가 묶이면 extends에다가 호출하면됨
	//private int aa;
	//private int bb;
	protected int cc;
	protected String msg;
	
	public void aaa1 (int ab1, int ab2 ) {
	 //this.aa = ab1;
	 //this.bb = ab2;
  
	 this.cc = ab1 + ab2;
		
	}
}

class a2 extends a1{
	public void ans () {
    
		if(this.cc%2==0) {
			msg= "짝수";
		}
		else  {
			msg="홀수";
		}
		System.out.println(msg);
				
	}
}