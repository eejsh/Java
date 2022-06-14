package Ab;

//method_1a.java 랑 결합
public class method_1 extends ide_mth1 {       // main 클래스를 extends ide_mth1 묶으면 ab2_method로 끌고감
	//package Ab2에서 import 할 수 있도록 하며, 외보클래스도 동일하게 모두 가져오게 함.
	

	public void recall() {                 // Ab2 패키지와 공유설정 메소드
		System.out.println("test");
	}
	protected static void name(){          //protected + static을 적용해야만 Ab2패키지와 공유가됨.
		System.out.println("홍길동");
	}
	
	public static void main(String[] args) {
		//  Arrays.sort : 배열 오름차순 정렬 (숫자,한글,영문)
		//  단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬합니다. ex(APPLE , apple)
		
		
	/*	int number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data);  //오름차순으로 인덱스 정렬
		System.out.println(Arrays.toString(number_data)); */
		
	/*	String user_data[] = {"홍길동","이순신","장보고","김유신","jang","apple","Apple","1"};
		Arrays.sort(user_data);        // 한글도 ㄱㄴㄷ... 순으로 정렬 가능.
		System.out.println(Arrays.toString(user_data)); */
	
		
		/*변수를 2개 생성해서 하나는 문자, 숫자
		 * 현재 가입된 사용자에 아이디를 확인 후 해당 포인트가 적립되도록 합니다.
		 * 단, 기존 포인트 + 적립금 포인트에 대한 결과를 출력하셔야 합니다.
		 * 출력은 메인 class에서 사용함.
		 * 
		 * 
		 * 배열 데이터 :   String member_ship [][]= {
	  	       {"kim", "park", "seo", "oh", "lee", "jang", "jeong","cho", "ha","hwang"},
	  	       {"1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800"} };
		
		 */
		
		 String a = "park";                //800 + 2000 = 2800
		 int b = 2000;
		 // String c = "감소";  		 
		 
         ide_mth1 m1 = new ide_mth1();
         m1.setter(a, b);
	     System.out.println(m1.getter());
		
	}

}
class ide_mth1 extends mth1{
	
private String member_ship[][];
private String data1;
private int data2;
private int ea;
private int total=0;
private String msg = "";



public ide_mth1() {
	this.member_ship = new String[][]{
	  	       {"kim", "park", "seo", "oh", "lee", "jang", "jeong","cho", "ha","hwang"},
	  	       {"1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800"} 
	  	       };
	this.ea = this.member_ship[0].length;  //10
	
}
@Override
public void setter(String data1, int data2) {   // 해당 메소드 적용..        method_1a abstract-가져오기. 반복문..?

	this.data1 = data1;
	this.data2 = data2;
//	if(this.data3.equals("증감") {
//		this.loops();               
//	}
//	
//	else {       this.loops2();    "감소." 수식.  }

	this.loops(this.data1, this.data2, this.ea);   	// data1,data2를 loops로 넘김
} 
public void loops(String a, int b, int c) {                     //실제 만든 메소드      // static쓰면 this 사용못함.

	int w = 0;
	while(w<c) {

	if (this.member_ship[0][w].equals(a)) {
		
	 this.total = Integer.parseInt(this.member_ship[1][w]) + data2 ;
		
	   }  w++;		
	}
	this.msg ="증감";
	}
@Override
public void setter(int data3[]) {
}

@Override
public String getter() {  // 사용자 이름이랑 포인트 합산 해서같이 보내기위해 String으로 받음.
	String print = this.data1 + "님 포인트가 " +  this.total+ " " + this.msg + " 되었습니다." ;
	return print;

   }
}

