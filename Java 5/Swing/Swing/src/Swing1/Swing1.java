package Swing1;

public class Swing1 {

	public static void main(String[] args) {
		
		// wrapper class (box 상태)
		// float, char, byte, long, short (기본타입)
		// wrapper class : Byte, Integer, Long, Double  wrapper class의 형태.
		/*박싱과 박싱을 비교할 때는 equals를 사용해야만 비교가 이루어짐.*/
	
		Integer a = new Integer (20);  // new integer -> 박싱상태
		int b = new Integer(20);    // int로 받음 newinteger가 넘겨지고 int 20만 남음  -> 언박싱 상태
	//	if(a.equals(b)) {  -> 둘다 new integer 박싱상태면 equals로 비교해야됨. 
		if(a==b) {
		
			System.out.println(a+b);
		}
		
		Integer a1 = new Integer(30);   // new integer -> 박싱상태
		Integer b1 = new Integer(30);   // new integer -> 박싱상태
	    if(a1.equals(b1)) {  //-> 둘다 new integer 박싱상태면 equals로 비교해야됨. 
		
			System.out.println(a1+b1);
		}
	    
	    Integer c = 40;
	    int d =new Integer(40);
	    System.out.println(c+d);
		
		
		Integer no = new Integer( 99);  //박싱 상태
	    Integer bb = no.intValue(); //언박싱
	    
	    System.out.println(bb);
		
	    
	    
		
	}

}
