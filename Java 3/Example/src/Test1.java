import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력해주세요.");
		String userad = sc.nextLine();
		System.out.println("전화번호를 입력해 주세요.");
		String usernb = sc.nextLine();
		
	    System.out.println("해당 정보를 확인해 주세요. 주소 : " + userad + " 전화번호 : " + usernb);
	
	   sc.close();
	   
	    int a;
	    int b = 7;
	    int c = 1;
	    for (a=9; a>=5; a--) {
	    	c = a * b;
	    	System.out.printf(c+" ");
	    }
	   
	   
	    int a1;
	    int b1;
	    int total = 0;
	    for(a1=1; a1<=5; a1++) {
	    	for(b1=1; b1<=9; b1++) {
	             total += b1 + a1;
	    	}	 
	    }
	    System.out.println(total);
	    	
	
	}

}
