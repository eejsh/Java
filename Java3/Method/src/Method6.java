
public class Method6 {

	public static void main(String[] args) {
		/*private에 대한 객체 선언 형태2 */

		insert i = new insert();
		
		String userid = "admin";
		String skey = "1123234";
				
	  String result = i.checks(skey);
	  System.out.println(result);	
		
	}

}//은닉화의 기초방식.. - 외부 class 에서 들어올때 필터링..사용시에도 사용할수있음../ 보안상, 외부 데이터에서 걸러야할 때 사용.
                                                // 공용개발 할 때 사용. 
class insert{
	String userid = null;
	private String key = "a123456";   //해당 class에서 적용되는 key값
	
	public String checks(String bb) {                //자료형태의 메소드 사용함
		
	//	this.key = bb;             //key값을 bb에서 받음
		String msg = null;
		if(key.equals("a1234567")) {       //해당 key값(private) 과 외부class 에서 넘어오는 인수값과 비교
			 if(userid.equals("hong")){   // id 확인
				 msg = "데이터를 확인중에 있습니다.";
			 }
			 else{
				 msg =" 해당 데이터 값을 확인하지 못합니다. ";
				
			}
		}
		else {               //외부 class에서 올바른 키값이 전달되지 않을 경우
			msg = "error";
		}
		//return null;  // 처음에 빈값 넣으면 체크 시 에러 안뜸
		    return msg;  // 최종 결과에 대한 return으로 회신.
        
	}
	
}