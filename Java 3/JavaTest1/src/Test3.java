import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	

		System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다.");
		Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
       
        String msg = "";
	    
	    if(user%2==0) {
			msg ="짝수입니다.";
	     }
	    else if (user>=60) { 
	        msg ="60까지만 입력 됩니다.";
              }		
	    else  {
	    	msg ="홀수입니다.";
	     }
		
	    System.out.println(msg);
		sc.close();
	}

}
