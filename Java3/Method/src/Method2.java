
public class Method2 {

	public static void main(String[] args) {
		
		/* default package를 사용 시 해당 class 명을 호출하면됨.
		 단, package로 묶여 있을 경우는 제일 상단에 package를 선언해야함.
		--------------------------------------------------------
		tests ts = new tests();   -?같은 package이면 불러와서 사용가능
		ts.a2++;
		System.out.println(ts.a2); */
		 
		
		Info i = new Info();
		
	//	i.data1(20);
	    i.data2(20);
	    i.data3(20);
	    System.out.println(i.data3(20));  // public int data에 있는 return에서 받아서 출력
	    
	   String result =  i.data4("홍길동");       
	   //홍길동을 data4로 주고, return에서 값을 받아옴.
	   //data4 메소드 return 값을 result 변수로 받아서 처리함.
	   System.out.println(result);
	     
	    
		
		
	}

}

class Info {
	
	/* static 또는 void 메소드에는 return 이라는 명령어를 사용하지 못함  */
	
	public static void data1(int abc) {
//	int z = abc + 20;
//	System.out.println(z);
		
		
		
		
	}

	public void data2(int abc) {
//		int z = abc + 20;
//		System.out.println(z);
		
		
		
		
		
	}
	
	public int data3(int abc) {      // return 함수만 가능 (static , void에는 사용안함)   
		//자료형 메소드라고 하며, 무조건 return 사용해야함. System.out.println(z); 사용자가 사용하지 못합니다.
		
		int z = abc + 20;
        return z;
	}
	
	
	public String data4(String abc )	{
		String z = abc + "님 환영합니다.";
		return z;
	}
	
	
	
	
	
	
	
}
