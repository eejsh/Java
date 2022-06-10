import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		
	    System.out.println("on, off 중 하나를 입력하세요");

		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		String msg = "";
		
		if(user.equals("on")) {
			msg = "true";
			}
		else if (user.equals("off")) {
			msg = "false";
			}
		else {
			msg=" 잘못 입력하셨습니다";
		}
		System.out.println(msg);
	
		sc.close();
	
	}

}
