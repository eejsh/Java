import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
/* 응용문제
 * 상품 가격은 42000원 입니다.
 * 사용자가 해당 상품 갯수를 입력하게 됩니다.
 * 해당 상품 가격에 맞는 갯수만큼 곱하여 최종 결제금액을 출력시키는 extends를 제작하시면 됩니다. 
 * 단, 42000는 절대 숫자가 바뀌면 안됩니다.
 * 사용자가 최대 구매 할수 있는 갯수는 5개 입니다.
 * 최종 결과값은 main method에서 출력 합니다.
 */
		
	    System.out.println("상품 갯수를 입력해주세요.[구매 갯수는 5개 입니다.]");
	    Scanner sc = new Scanner(System.in);
	    
	    int f;
        int user;
	    
        user = sc.nextInt();
        if(user>=5 ) {
         System.out.println("구매 갯수는 5개까지 입니다.");
         System.exit(0);
         }
        
	    sp2 s2 = new sp2();
		s2.to1(user);
	    s2.print();
		
		sc.close();
	}

}
class sp1{
	
	protected int aa = 42000;
	protected int total;
	private int un ;

	public void to1( int usernb) {

	this.un = usernb;
		
	this.total = this.aa* this.un;

	
	}
	
}

class sp2 extends sp1 {
	
	public void print () {
		
		System.out.println("총 금액 : "+ this.total );
		
	}
}
