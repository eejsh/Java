import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
     	System.out.println("���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		int a=1;
		int total=1;
		
		if(user<0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
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
