
public class Exception6 {

	public static void main(String[] args) {
	
		/*[응용문제]
		 * 사용자가 45*3+16+5+22*8 해당 연산값의 최종값을 외부 클래스로 전송합니다. // 짝수
		 * 해당 외부 클래스 에서는 해당 값이 짝수일 경우 예외오류를 발생 하며, 홀수 일 경우 홀수값 입니다로 회신되도록 합니다.*/
		try {
			int sum = 45*3+16+5+22*8+1;
			cul cl = new cul();
			cl.cul_method(sum);//getter
			String result = cl.cul_method(sum);
			System.out.println(result);
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
}

class cul{
	// 자료형 메소드에서 return 값이 숫자,문자, object에 따라 자료형이 선언되어 생성.
	public String cul_method (int s) throws Exception { //최종 나가는 값만 문자면됨. 들어오는 값은 숫자로 들어와두됨..
	
		if(s%2==0) {
			Exception ec = new Exception("예외처리 발생으로 재 확인이 필요합니다.");
			throw ec;
		}
		else {
	     String msg = "홀수입니다.";
			return msg;
	     
		}
	}
}
		
//		int total =0;
//		String result = "";
//		add a1 = new add();
//		try {
//			total = 45*3+16+5+22*8;
//			if(total%2 ==0) {
//			result ="짝수";
//			}
//			else {
//			result ="홀수";
//			}
//			a1.abc(result);
//		
//		}catch(Exception e) {
//		System.out.println(e);
//		}
//		
//	}
//
//}
//class add {
//	
//	public String abc (String a) throws Exception{
//		
//		if(a.equals("짝수")) {
//			throw new Exception("짝수 입니다");
//		}
//		else {
//			String msg = "홀수 입니다.";
//			return msg;
//		}
//	}
//}
