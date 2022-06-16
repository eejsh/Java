
public class class3 {

	public static void main(String[] args) {

		// abstract 호출하면 안됨. ---extend 된 mother 호출.
		apink m = new apink();
		m.f_method("이보미");

		apink.cafe LA = m.new cafe();
		LA.call();
	}

}

abstract class father {  //추상class
	public String u_name; // 전역 변수  (abstract 가 없음으로 추상변수 아님) // this로 가져가려고 호출.
	//public abstract String u_name -->추상 전역변수

	public abstract void f_method(String name); // 추상 메소드      //--->f_mother에도 똑같이 들어와야댐

}

class apink extends father {

	@Override
	public void f_method(String name) {  //추상 메소드를 실제 메소드로 전환.  // main에서 값 보냄.
		this.u_name = name;            // 추상 메소드에 있는 전역 변수로 값을 이관함.

	}

	class cafe {     //father 랑 apink(extend) 연결 ->apink 호출
		String msg = apink.this.u_name;   //부모 class에 있는 전역변수를 자식 class전역변수로 이관.
				
		public void call() {
              String msg2 = this.msg + "님 짱!";
              System.out.println(msg2);
            		  
			
		}

	}

}
