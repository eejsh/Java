package box;  // package는 메인 java를 실행시키면 함게 실행되는 java 파일 로드 형태입니다.

public class Class1 {
//public class 메인 클래스에만 들어갈 수있음 . 기본
	public static void main(String[] args) {  
               		//main은 package 중에서 실행되는 최초의 java 파일에만 적용됩니다. (패키지 사용시 메인에만 함수 들어가야댐 public static void.. 메인에만 잡음)
	
		Class2 c2 = new Class2();
		
		 System.out.println(c2.names);
	 
		
		 Adata a = new Adata();    //class2.java에 별도로 Adata클래스 객체를 로드함.
		 System.out.println(a.names);
		 
		 
		 
		
	}

}
