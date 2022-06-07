
public class Method1 {

	public static void main(String[] args) {

		tests t = new tests();
		t.a1++;
//		t.a2++;
		t.name1();
     
		tests tt = new tests();
		tt.a1++;
//		tt.a2++;
		tt.name1();
	
		
		t.b1 += "유관순";
//		t.b2 += "유관순";
		t.name2();
		tt.b1 += "강감찬";
//		tt.b2 += "강감찬";
		tt.name2();

	}
}

class tests{

	int a1 = 1;         //(동적변수)
	// 새로운 객체 생성 및 class를 호출 시 1이라는 숫자를 다시 가지게 됩니다. 새로등록->초기화
	
	public static int a2 = 1;  //(정적변수) -> ★메모리 저장시켜서 계속 사용할 경우 사용. (int, string)
	// 새로운 객체 생성 및 class를 호출 하더라도 1이라는 숫자가 아닌 메모리에 등록된 최종값을 지속적으로 가지게 됩니다.->메모리 저장된값
		
	String b1 ="이순신"; 

	public static String b2 = "홍길동";    // 원래 있던 데이터에서 추가 시 static 넣어서 변수선언하면 기존 데이터에 추가됨 (기억시킴)
	//예시)"홍길동" +  님 환영합니다., "홍길동" + 님 결제금액은 1000원 입니다., "홍길동" +님 쿠폰20%입니다. ="홍길동"이라는 변수는 계속적으로 사용할때 쓰임. 
	
	//piublic static string b2[] = {"홍길동"};
	
public void name1() {
//	System.out.println(a1+ "a");
//	System.out.println(a2+ "b");
	
}
	
public void name2( ) {

System.out.println(b1 + "b1");
System.out.println(b2 + "b2");

	
}


}