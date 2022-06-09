
public class Over {

	public static void main(String[] args) {

		//pt p = new pt();
 		//p.display();
        
		cd c = new cd();
        c.display("메인 내용 값 출력");    //오버로딩
	    c.display();                   //오버라이드
	}
}

/*오버로딩 overloading : 새로운 메소드를 정의하는 것을 말합니다.
  오버라이드 override : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다.
  
*/
class pt{
	public void display() {
		System.out.println("부모 내용 값");
	}
	

	
}
class cd extends pt{           //pt상속
// aaaa() 메소드는 메노테이션을 사용하지 못함. 부모 class에서 선언하지 않았음.  -->  class pt { public void aaaa() 생성하면사용가능.
	//	@Override
//	public void aaaa() {
//		System.out.println("자식에 만들어진 메소드");
//	}
	
	
	
	
	@Override   //메노테이션 (표시) 문제 발생 시 확인 (오버라이드)
	public void display () {     //오버라이드   상속 안받고 재 정리해서 출력.
	    System.out.println("자식 클래스값으로 변경?");	  
	                 super.display();   // 부모에는 고유 속성 메소드값을 가져올 때 사용합니다.  
	                 //super.display();-->부모내용값을 강제로 출력시키기.
	      }
		public void display (String msg) {   //오버로딩
			System.out.println(msg);
		}
	
}

/*
 * 오버로딩 - 부모, 자식 사용가능

오버라이드 - 자식만 사용가능.

[메소드]
public void b () {
public void b () ----------------> 같은 클래스 작동안됨
public void b (string a)
public void b (stirng b)-------->인수형태 string이 같아도 작동안됨
public void b (int a)
public void b (double a)
public void b (boolean a)

이름은 같으나 (인수 형태)가 다 틀려도 작동은 됨 = 오버로드  

*/

		