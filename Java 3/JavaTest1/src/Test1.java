import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		
	    System.out.println("on, off �� �ϳ��� �Է��ϼ���");

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
			msg=" �߸� �Է��ϼ̽��ϴ�";
		}
		System.out.println(msg);
	
		sc.close();
	
	}

}
