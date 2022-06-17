package Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

/*회원정보 DB가 있는 상황입니다.
 * 해당정보중에서 naver.com 메일 주소를 사용하는 고객 인원수를 출력합니다.    --빅데이터 분석.
 * (이름만 출력하시오.)
 * 단, DB를 로드시 추상class 에서 로드가 되도록 합니다.
 *["이름","통신사","전화번호","나이","주소","이메일","포인트"]
 * indexof();
 * */	
	
/*	{
 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
}	*/
	
		user_list ul = new user_list();
		ul.setter("@naver.com");
		int total = ul.getter();
		System.out.println("네이버 가입자는 총 :" + total + "입니다.");
		
	}
}


abstract class basic{
	
   String arr[][] ;
   ArrayList<String> ar1 = null;
   public abstract void setter(String mail);
   public abstract int getter();
   public abstract void db();
   
  
}
	
class user_list extends basic{

	int ea = 0;
	int total = 0;
	
	
	@Override
	public void setter(String mail) {
   //System.out.println(mail);		 -->값 확인.
	  db();
	//	int f;
	

        //System.out.println( this.arr[f][5]);      -->이메일주소.  
		
		
		//arraylist 사용시.
//		for(f=0; f<ea; f++) {
//	    this.ar1 = new ArrayList<>(Arrays.asList(this.arr[f][5]));
//         
//	    if(this.ar1.get(0).indexOf(mail)!= -1)  //indexof 는 배열에서 사용못함.
//          	this.total += 1;    //----naver.com이 있는 경우
//       	}
//	
		//원시 상태의 배열 사항으로 카운팅을 하게 됨 - indexFo -1(없음), -1의 모든 정수는 값이 있음 
		for(int f=0; f<this.ea; f++) {
			if(this.arr[f][5].indexOf(mail)!= -1) {
				this.total += 1;
				
			}
			
		}
		
		//arraylist로 생성시 메모리 할당 오버되는 상황이 발생할 수 있음.
		
		
           	
	
	
	}
	@Override
	public int getter() {
		int t = this.total;
		return t;
	}
	

	@Override
	public void db() {
		this.arr = new String [][] {
				 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
				} ;
		
				this.ea = this.arr.length;  //11
		//this.ar1 = new ArrayList<>(Arrays.asList(this.arr[0]));  // 1번째 줄 데이터 가져옴.
			
	}
}







