
public class class2 {

	public static void main(String[] args) {

		/*
		 * [���빮��] ����class�� �̿��Ͽ� �ڽ� class�� ������� ����ϴ� ���μ����� �����Ͻÿ�. class�� 2���� �ֽ��ϴ�. �θ�
		 * class ���� mother �ڽ� class ���� child
		 * 
		 * main class ���� mother class�� ���� �����մϴ�. 30, 50 ���ڰ��� �����մϴ�. 
		 * child ���� �θ� class�� �ִ� ���� �޾� �ΰ��� ���ڸ� ���Ѱ������ ����Ͻÿ�.
		 */
		mother mo = new mother ();
		mo.m_method(30,50);
		
		mother.child mc = mo.new child ();
		mc.c_method();
	
		
	}

}

class mother{
	int aa;
	int bb;
	
	public void m_method (int a, int b) {
		
	this.aa = a;
	this.bb = b;
	}
	class child{  
		int aa = mother.this.aa;
		int bb = mother.this.bb;
		    
		 //������
		public void c_method () {
		int c =  this.aa * this.bb;
		System.out.println(c);
		
		}
	}
		
}
