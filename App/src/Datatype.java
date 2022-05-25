
public class Datatype {

	public static void main(String[] args) {
		// string - 문자열, ""없을시 숫자로 인식 - string사용시 ""필수
		// 자료형 - byte, short 사용이유는 데이터 용량 절약
		// 통계 사용시 int 사용안함. 
		

		String a = "1234";  //문자. 숫자로 인식안함.
		System.out.println(a);
		/*정수형*/
		byte b = 127;  // byte : -128~127 (자바에서 사용하는 가장 작은단위. 정수(123456789)/실수12.1(소주점단위)
		
		System.out.println(b);

		short c = 32767; //short : -32,768~32,767
		System.out.println(c);
		
		int d = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 999999999; 
		// long : 9,000,000........ (0이 18개) 기본 메로리 할당에서 추가 적용시 가능범위가 늘어남.
		// long 사용시 숫자 마지막에 l 입력 - l=리미터 풀기 / 단 사용시 메모리 할당량 높아짐.
		System.out.println(f);
		/*정수형 끝*/
		
		
        /*실수형*/
		// float , double  ex-계산수식 시 넣는 코드
	    // 한번 변수선언한 단어 사용 자제..
		
		
		float z = 3.5f;     //3.482480000000+38  (f 무조건 사용 해야함 (, . 문자로 인식함)
		System.out.println(z);
		
		double k = 44.5;     // 1.784+308   (d를 유/무 모두됨) 
		//원래는 d 추가 하여야되나 (double k=44.5k;), 버전 업으로 삭제 가능      
		System.out.println(k);
		
		/*실수형 끝*/
		
		
		
		
	}

}
