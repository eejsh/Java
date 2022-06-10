import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
     	System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		int a=1;
		int total=1;
		
		if(user<0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
			}			
		else {	
			do {
			total = a * user;
			System.out.println(user + "*" + a + "=" + total);
			a++;
	    	}while(a<=9);
     	}
		
	 sc.close();
		
	}
	
}
