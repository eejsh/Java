import java.util.Arrays;

public class example7 {

	public static void main(String[] args) {
	
			
		/* 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 * [data]
		 * ["홍길동" , "합격"]
		 * ["이순신" , "합격"]
		 * ["강감찬" , "불합격"]
		 * ["김유신" , "합격"]
		 * ["유관순" , "불합격"]
		 * ["장보고" , "불합격"]
		 * 다차원 배열 형태이며, 해당 값 중 합격자만 출력되도록 합니다.
		 * 단, 배열값을 외부 class 안에 메소드에서 처리가 되도록 합니다.
		 * 결과 : 홍길동 이순신 김유신  */
		
        name.abc1(); //class명_메소드만때리면됨.
        
		//name n = new name();
		//n.name();       --메모리 탑재
		
        
        
        
        
        
	}

}

class name{
	
	public static void abc1() {
		
	String aa [][] = { {"홍길동", "합격"},
			           {"이순신", "합격"}, 
			           {"강감찬", "불합격"},
			           {"김유신", "합격"},
			           {"유관순", "합격"},
			           {"장보고", "불합격"}};
	
	
	int ea = aa.length;  //6
	
	int a ;
	
	for(a=0; a<ea; a++) {
		if(aa[a][1].equals("합격")) { 
	  //	System.out.println(aa[a][0]); 
		
	 	System.out.printf("%s님 %s 입니다." + aa[a][0],aa[a][1]);
		
		}
 	}
	
	
		
			
			
		
		
		
		
		

	
	}
	
}