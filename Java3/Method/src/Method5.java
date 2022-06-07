
public class Method5 {

	public static void main(String[] args) {

    cdb c = new cdb();
//    c.d1 = "홍길동";
//    c.data2();
//    c.d3 = "이순신";
//    c.data1();
//    c.d3="유관순";
//    System.out.println(c.data3());
 
    
   // c.d2 = "강감찬"; - private로 선언한 객체이므로 main class에서 로드 못함.


      c.data2("강감찬");
     
      String result =  c.data3();
      System.out.println(result);
	
      c.d1="유관순";
	  cdb.data1();
      
	}

}


class cdb {
	String d1 = null;  /*void, 자료형메소드 로드 가능 */
	private String d2 = null;            //d2 (private) main class로 값이 안감. sub class 에서만 사용 가능.

	public static String d3;         /*다 사용 가능.*/
	
	public static void data1 (){ // static 자료형 외에는 로드가 불가능함.
	//	System.out.println(d1); //인식자체가 안됨.  
		System.out.println(d3);
		
	   // System.out.println(this.d2); ---> static 에는 this 사용 못함.
	  String d1= " ";
	  System.out.println(d1);    
		
	 
	}
	public void data2(String user) {
	//	System.out.println(d1 + "public void");
		
		this.d2 = user;
		System.out.println(this.d2);
		
	}
	public String data3() {
		//String a = " ";
		//String a = null;
		
		
		String a = this.d2;	
		return a;  
		
	}
	
}