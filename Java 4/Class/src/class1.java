/* �θ� class �� �ڽ�(����) class ����*/
public class class1 {

	public static void main(String[] args) {
/*�θ� �ν��Ͻ��� ������ ���� ������ �ڽ� class �� ���� ȣ������ ����.*/
		
		parents p = new parents();      // �θ� class�� ���� �ν��Ͻ��� �÷��ߴ� ->��������.
	 p.p_box();     //--->�θ� �޼ҵ� ȣ�� ���� ���(ȫ�浿)
	 
	 parents.child pc = p.new child();
	// �θ�class.�ڽ�class �̸����� = �θ�class��.new �ڽ�Ŭ������ (�ν��Ͻ��� ����) /(��=�׾ȿ� �ִ� classȣ��)
	 pc.c_box();          
		
	}

}

//�������� public void �ȿ����� �����ִ� ����
//�������� class �ȿ��� �����ִ� ����.
class parents{       //�θ�class            �����ʿ��� ���̻��.
	
	String a = "ȫ�浿";       // �θ�filed�� �ִ� ��������  (this)
	String b;
	class child{     //�ڽ�class                //parents �ʵ忡���� class child
		int a = 20;   // �ڽ� class�� ��������
		
		public void c_box() {       //�ڽ� �޼ҵ�
			double c = 10.5;
	
			System.out.println(c);               //--> �ڽ� ���� �������� : 10.5   
			System.out.println(this.a);          //--> �ڽ� class ���� �������� : 20
			System.out.println(parents.this.a);  //--> �θ� class ���� ��������  : ȫ�浿  
			System.out.println(parents.this.b);
		}
	}
      public void p_box() {         // �θ� �޼ҵ�
//    	   class p_aaa{
//    		   
//    	   }----------�޼ҵ� �ȿ� class ����. 
    	  
    	  String a = "�̼���";        //p_box�� �ִ� �������� ����
    	  this.b=a;  // --> ���������� �θ�class ���������� ��������.
    	  System.out.println(a);     
    	  System.out.println(this.a);  //�θ� �ʵ忡 �ִ� a�� ��������.
      }
}
