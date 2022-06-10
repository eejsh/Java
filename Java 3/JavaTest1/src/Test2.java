
public class Test2 {

	public static void main(String[] args) {
	
         int a = 55;         

         String msg= "";
         
         if(a>=90) {
        	   msg = "등급 A입니다.";
           }
           else if(a>=70) {
        	   msg = "등급 B입니다.";
           }
           else if (a>=50) {
        	   msg ="등급 C입니다";
           }
           else {
        	   msg ="일반 등급입니다.";
           }

		System.out.println(msg);
		
		
	}

}
