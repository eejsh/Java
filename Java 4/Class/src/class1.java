/* 부모 class 및 자식(내부) class 연동*/
public class class1 {

	public static void main(String[] args) {
/*부모가 인스턴스에 적용이 되지 않으면 자식 class 는 절대 호출하지 못함.*/
		
		parents p = new parents();      // 부모 class를 먼저 인스턴스에 올려야댐 ->전제조건.
	 p.p_box();     //--->부모 메소드 호출 받음 출력(홍길동)
	 
	 parents.child pc = p.new child();
	// 부모class.자식class 이름생성 = 부모class명.new 자식클래스명 (인스턴스에 적용) /(점=그안에 있는 class호출)
	 pc.c_box();          
		
	}

}

//지역변수 public void 안에서만 쓸수있는 변수
//전역변수 class 안에서 쓸수있는 변수.
class parents{       //부모class            보완쪽에서 많이사용.
	
	String a = "홍길동";       // 부모filed에 있는 전역변수  (this)
	String b;
	class child{     //자식class                //parents 필드에있음 class child
		int a = 20;   // 자식 class의 전역변수
		
		public void c_box() {       //자식 메소드
			double c = 10.5;
	
			System.out.println(c);               //--> 자식 전용 지역변수 : 10.5   
			System.out.println(this.a);          //--> 자식 class 전용 전역변수 : 20
			System.out.println(parents.this.a);  //--> 부모 class 전용 전역변수  : 홍길동  
			System.out.println(parents.this.b);
		}
	}
      public void p_box() {         // 부모 메소드
//    	   class p_aaa{
//    		   
//    	   }----------메소드 안에 class 가능. 
    	  
    	  String a = "이순신";        //p_box에 있는 지역변수 선언
    	  this.b=a;  // --> 지역변수를 부모class 전역변수로 가져가기.
    	  System.out.println(a);     
    	  System.out.println(this.a);  //부모 필드에 있는 a값 가져오기.
      }
}
