package Ab;
//interface : 원래기능 : 메서드만 선언, 추가로 연산을 처리 하는 형태의 default가 추가됨.(java 14.ver 부터)

public interface method_2inter {  //interfaca에는 필드에 선언 못함.
//interfaca는 메소드이므로 필드에 자료형을 선언할 수 없음.  -eX)public String members2; -> 안됨.X
	
	public String names();

	default void setbox(String name) { // setter
		System.out.println(name);
	}

	default String box3() { // getter
		// interface에는 default 선언하면 연산 메소드를 사용가능.

		return null;
	}

}

interface method_2re extends method_2inter {   
//interface에 extends로 무보 interface를 로드 할 수 있습니다.
	
	
	
	
}