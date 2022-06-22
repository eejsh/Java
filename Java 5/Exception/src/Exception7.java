import java.util.ArrayList;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		
		/*데이터 파일 {"홍길동",55 , "유관순", "강감찬", 48, "이순신","세종",34,88}
		해당 데이터 값 중 문자값만 출력되도록 재 배열 하시길 바랍니다.
		단, 메인에서는 해당 배열값을 외부 클래스(setter) 로 전송합니다.
		해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
		getter 에서 해당 배열을 return 으로 보내도록 합니다.
		단, 외부 클래스에서 숫자로 있는 배열은 모두 예외처리 되도록 합니다.
		arraylist나 일반 배열.. 출력만.*/

		 Object data [] =  {"홍길동",55 , "유관순", "강감찬", 48, "이순신","세종",34,88};
		 try {
		 redata r = new redata();
		 r.setter(data);
		 LinkedList result = r.getter();     
		 //return 받는 값이 배열 class이므로 해당 class명으로 선언 후 받아야 됩니다.
		 System.out.println(result);
		 	 }catch(Exception a) {
			 if(a.getMessage()!= null) {
				 System.out.println("?");
			 }
		 }
	 }

}
class redata {
	LinkedList<String> redata = new LinkedList<>();
//	LinkedList<String> redata = null;    둘다써도됨.

	public void setter(Object call[]) throws Exception{    
		int ea = call.length; //9개
		int dw=0;
	//	int check = Integer.valueOf((int)call[0]);    --object 자료형일시 별도의 변환 안해도됨. integer.valueof(X)
	//	int check = (int)call[1];                // 숫자형 분리법
    //  String check1 = new String((String)call[0]);    // 문자형 분리법
		do {
     try {  
	//해당 배열을 로드 시 (자료형) 변환을 하는 이유는 Object 배열 이므로 선언하였음. 
	String check = String.valueOf((String)call[dw]);
	this.redata.add(check);
	
}catch(Exception ex) {        
//자신 class에서 문제 발생 시 출력되는 catch문. 단, throw 사용하면 다시 main으로 전달됩니다. 중요사항은 throw로 전달 시 해당 반복문은 종료하게 됩니다.

//System.out.println(ex);
}		dw++;
		}while(dw<ea);
	}
	
	public LinkedList<String> getter() {         
		// 배열 class 이름으로 getter을 만들 수 있습니다.
		return this.redata;
		
	} 
}