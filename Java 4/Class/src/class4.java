import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : ȫ�浿, �̼���, ������ ������ �����Ͱ� �ֽ��ϴ�. ����class���� ���ڸ� �ϳ� �����մϴ�. ��, ���ڰ� null ����
		 * �� ������, �迭�����Ϳ� ������� "������"�̶�� ���� ���� �ֽ��ϴ�. �ܺ� class : data_list �̸�, �߻� class
		 * :v_constuct �Դϴ�. �ܺ� class �ȿ� ���� Ŭ�������� check �Դϴ�. [�������] main class ���� ��������
		 * �����Ұ�� ���� class ���� "�ش� ����ڴ� �����ڰ� �ƴմϴ�" ���. main class ���� �̼����� ������ ��� ����
		 * class���� "�ش� ����ڰ� �ֽ��ϴ�" ��� ���. ��, arraylist�� �迭�� �ε��Ͻʽÿ�.
		 */

		data_list da = new data_list();
		da.userinput("������");

	}

}

abstract class v_constuct {
	String user_name;
	public abstract void userinput(String nm);
}

class data_list extends v_constuct {

	@Override
	public void userinput(String nm) {

		if (nm == null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");

		} else {
			this.user_name = nm;
			check ck = new check(); // ����->�ܺ� ȣ�� ����.
			ck.db(); // ckeck�� db�� �ѱ�.
		}

	}

	class check {             //�θ� Ŭ������ �ִ� ���� ���� �ڽ� Ŭ������ �̰�
		String user_name = data_list.this.user_name;            
		String data_list[];  // �ʵ忡 �迭�� �޴� ��ü�� ����(�ۿ��� �ȵ��� ������ check���� ������ �˼��ϸ� �۵��ӵ�����. -->�޸𸮰���-->�̸� ������ ����)
		ArrayList<String> ar = null; // arraylist ��ƿ�� �ʵ忡 ���� ��. ��ü�� ���� ��.public �� �ִ� data_list ������.
		public void db() {
			// �ش� �ʵ忡 �ִ� arraylist�� �ν��Ͻ��� ������.
			this.data_list = new String[] { "ȫ�浿", "�̼���", "������" };
			this.ar = new ArrayList<>(Arrays.asList(this.data_list));
			this.compare(); // ���� db�� ����� ������ ���ϴ� �޼ҵ� /compare�� �ѱ�. 
		}

	public void compare() {

		int ea = this.ar.size();
		int dw = 0;
		boolean bl = false;  //���Ȯ��.
		do {
			if(this.user_name.equals(this.ar.get(dw))) {
			bl =true;
			}
			dw++;
		}while(dw<ea);
		if(bl==true) {
			System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
		}
		else {
			System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
		}
		
	}

	}

}