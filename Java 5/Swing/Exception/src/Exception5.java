
public class Exception5 {
//역활 : 값 주고, 출력만 함. -->main 에선 exception 사용안함.. 
	public static void main(String[] args) {
		
		words wd = new words();
		try {
			String result = wd.files("");
		System.out.println(result);
		}catch(Exception a) {
		//System.out.println("빈값이 문제가 되어 올바른 값을 전달 받지 못함.");
			System.out.println(a);
			/*if(a.getMessage()!=null) {
				System.out.println(result);
			}*/
		}
		finally {
			try {
			String result = wd.files("홍길동");
			System.out.println(result);
			} catch(Exception e) {
				System.exit(0);
			}
			}

		
	}
}


class words {
	//값을 받고 연산 후 return 
	public String files(String aa)  throws Exception{
		if(aa==null || aa.equals("")) {
		//	Exception ea = new Exception();
				throw new Exception("뭐가 오류 났는지 알려줌.- 값이 비어 있음.");
						
		}else {
			String msg = aa + "님 환영합니다.";
			return msg;
		}
		
	}
	
}
