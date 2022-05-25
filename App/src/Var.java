
public class Var {
	// var - 변수 , 변수:지속적으로 변하는 수 ex(id-상수, pw나 전화번호 등 -변수)
	public static void main(String[] args) {
		/*
		
		 * string (a1)<아무거나써도됨. 숫자만 먼저 안나오면됨.ex(1A-안됨)
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The local variable a1 may not have been initialized at Var.main(Var.java:11)
		 * <- 11번줄에서 에러..ㅜ
		 * 
		 * ; 줄 종료
		 * 
		 */
		
		
		//1. 변수 1. 선언방식 - 변수만 선언
        //string 문자 자료형. - 그 다음파일 참조
		String a1;  //a1. 변수명을 지정
		a1 = "이순신 입니다.";
		a1 = "홍길동 입니다.";
		

		
		// =:값을 넘겨주는 기호(뒤에있는 값을 출력) ==:값이 같은 기호
		
		System.out.println(a1);
		// 변수명을 만든 후 값을 지정하여 넘겨주는 형태 . 선언값
	
	   //2. 변수+값을 같이 선언하는 방식 
		String b1="이순신 입니다.";
		System.out.println(b1);
		
		//변수확인 사항
		  a1 = "이순신 입니다.";  // 기존에 가지고 있는 데이터는 삭제되고, 새로운 값으로 재설정됨. 
		  
		 System.out.println(a1);
		 

		  
		 
		
		
	}
}
