
public class Example4 {

	public static void main(String[] args) {
		
		/*���빮��
		 * �ΰ��� ���� �ܺ� class�� �����ϴ�. �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
		 * ��������� ������ �����ϴ�.
		 * 3,10�� ������ �Ǹ� �ΰ��� ���� ���մϴ�. 
		 * ������ �ܺ� Ŭ�������� �ش� ������� ����ϴµ�, �ΰ��� �� ���� ¦��, Ȧ�������� ����ϴ� extends�� ���� �ϼ���.
		*/
		a2 a = new a2();  // extends ���� ���� a1�� ����ְ� a2�� ���(�Ҽ�)�ȴٰ� �����ϸ��.
		
		//  a.ans();  // �ڽİ��� ���� ȣ���ϸ� 0������ ���� ������ ���� �ٸ�/
		
		a.aaa1(3, 10);  // a2 �ȿ� aaa1�� ��.
		a.ans();        // a2 �ڽ�(class)��� ȣ��.
		
	}
}

class a1 {                                // a1,a2 �� ���̸� extends���ٰ� ȣ���ϸ��
	//private int aa;
	//private int bb;
	protected int cc;
	protected String msg;
	
	public void aaa1 (int ab1, int ab2 ) {
	 //this.aa = ab1;
	 //this.bb = ab2;
  
	 this.cc = ab1 + ab2;
		
	}
}

class a2 extends a1{
	public void ans () {
    
		if(this.cc%2==0) {
			msg= "¦��";
		}
		else  {
			msg="Ȧ��";
		}
		System.out.println(msg);
				
	}
}