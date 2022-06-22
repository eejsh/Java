/*
Exception[예외처리사항]  : try~catch 와 함께 사용하게 됩니다. (문제되는것을 확인하기 위해 사용 , 배열,통신,파일에서 많이 발생)
-RuntimeException : error발생 시 예외처리 체크를 안함 - Null, class, Arraysize
-otherException : 예외처리 체크사항 모두 함.                     
20000->200,000?

[Exception]          ___import없음

Arithmetic : 0으로 나눌때 발생
NullPointer : Null 객체를 참조할때
ClassCast : 클래스형 변환
NumberFormat :  숫자형으로 변환
ArrayIndexOutofBound : 배열 참조 시 index번호 오류 발생시
IOException : 입출력 문제 발생  -- 자주쓰임
Exception : 전체 예외처리 현황  -- 자주쓰임
*/

public class Exception1 {

	public static void main(String[] args) {
		int a ;  //전역변수
		String b = "a1";
		try {                                   // try : 해당 값을 int로 변경함  (1)
			a = Integer.valueOf(b);              //error 발생  :  a1문자인데 강제로 숫자로 변환 시 a라는 문자로 인하여 오류발생함. int a1(X)  (2)
		}catch(Exception z) {
			System.out.println(z); //  (3) 어떤 부분에서 문제가 발생?  : java.lang.NumberFormatException: For input string: "a1"  : 대표 Exception 사용해도 예외처리사항 출력됨 
		}
		finally {                   //exception에서 예외처리발생 해결방안을 사용하기 위해 finally사용
		
			b = b.replaceAll("[a-zA-Z]",""); // 데이터 재처리(4)
			a = Integer.valueOf(b);         // 다시 문법을 제작성 해서 사용. (5)
		}
		System.out.println(a);   //-> ina a =>"1" 로 변경되서 1 출력됨.  (6) 최종 결과값 출력
	}
}
