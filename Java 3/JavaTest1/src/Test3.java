import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	

		System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.");
		Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
       
        String msg = "";
	    
	    if(user%2==0) {
			msg ="¦���Դϴ�.";
	     }
	    else if (user>=60) { 
	        msg ="60������ �Է� �˴ϴ�.";
              }		
	    else  {
	    	msg ="Ȧ���Դϴ�.";
	     }
		
	    System.out.println(msg);
		sc.close();
	}

}
