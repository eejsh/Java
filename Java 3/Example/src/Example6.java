import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
/* ���빮��
 * ��ǰ ������ 42000�� �Դϴ�.
 * ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
 * �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� �����ݾ��� ��½�Ű�� extends�� �����Ͻø� �˴ϴ�. 
 * ��, 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
 * ����ڰ� �ִ� ���� �Ҽ� �ִ� ������ 5�� �Դϴ�.
 * ���� ������� main method���� ��� �մϴ�.
 */
		
	    System.out.println("��ǰ ������ �Է����ּ���.[���� ������ 5�� �Դϴ�.]");
	    Scanner sc = new Scanner(System.in);
	    
	    int f;
        int user;
	    
        user = sc.nextInt();
        if(user>=5 ) {
         System.out.println("���� ������ 5������ �Դϴ�.");
         System.exit(0);
         }
        
	    sp2 s2 = new sp2();
		s2.to1(user);
	    s2.print();
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
		
		System.out.println("�� �ݾ� : "+ this.total );
		
	}
}