
public class Exception2 {

	public static void main(String[] args) {
  
//		Exception ex = new Exception();
//		ex.test();      ------->예외처리 문법 오류 try-catch 사용해야댐
		
		
		try {
			//test();  : 메소드 호출 자체 error -> exception과 관계가 없음
			Exception2 ex = new Exception2();
	        String a = "홍길동2";
	        ex.test(a);
	        
			
		}catch(Exception z) {
		System.out.println(z);
		}
	
	}
	public void test(String b) throws Exception,NumberFormatException { 
		//throws는 main 메소드에서 예외처리 없이 해당 메소드를 호출 할 경우를 막기 위해 사용 
		
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;     //코드 맨 밑에 사용하며 throw는 return과 비슷한 성격을 가지고 있음.
		//  예외처리 결과에 대한 값을 main 메소드로 다시 return시킴.
		
	}
		
}
