
public class class3 {

	public static void main(String[] args) {

		// abstract ȣ���ϸ� �ȵ�. ---extend �� mother ȣ��.
		apink m = new apink();
		m.f_method("�̺���");

		apink.cafe LA = m.new cafe();
		LA.call();
	}

}

abstract class father {  //�߻�class
	public String u_name; // ���� ����  (abstract �� �������� �߻󺯼� �ƴ�) // this�� ���������� ȣ��.
	//public abstract String u_name -->�߻� ��������

	public abstract void f_method(String name); // �߻� �޼ҵ�      //--->f_mother���� �Ȱ��� ���;ߴ�

}

class apink extends father {

	@Override
	public void f_method(String name) {  //�߻� �޼ҵ带 ���� �޼ҵ�� ��ȯ.  // main���� �� ����.
		this.u_name = name;            // �߻� �޼ҵ忡 �ִ� ���� ������ ���� �̰���.

	}

	class cafe {     //father �� apink(extend) ���� ->apink ȣ��
		String msg = apink.this.u_name;   //�θ� class�� �ִ� ���������� �ڽ� class���������� �̰�.
				
		public void call() {
              String msg2 = this.msg + "�� ¯!";
              System.out.println(msg2);
            		  
			
		}

	}

}
