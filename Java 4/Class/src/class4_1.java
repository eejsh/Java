import java.util.ArrayList;
import java.util.Arrays;

public class class4_1 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : ȫ�浿, �̼���, ������ ������ �����Ͱ� �ֽ��ϴ�. ����class���� ���ڸ� �ϳ� �����մϴ�. ��, ���ڰ� null ����
		 * �� ������, �迭�����Ϳ� ������� "������"�̶�� ���� ���� �ֽ��ϴ�. �ܺ� class : data_list �̸�, �߻� class
		 * :v_constuct �Դϴ�. �ܺ� class �ȿ� ���� Ŭ�������� check �Դϴ�. [�������] main class ���� ��������
		 * �����Ұ�� ���� class ���� "�ش� ����ڴ� �����ڰ� �ƴմϴ�" ���. main class ���� �̼����� ������ ��� ���� class
		 * ���� "�ش� ����ڰ� �ֽ��ϴ�" ��� ���. ��, arraylist�� �迭�� �ε��Ͻʽÿ�.
		 * 
		 */

		datalist1 dl = new datalist1();
		dl.data1("������");

		datalist1.check dlc = dl.new check();
		dlc.che();

	}

}

abstract class vconstuct {
	String lists[] = { "ȫ�浿", "�̼���", "������" };
	ArrayList<String> u_list = new ArrayList<>(Arrays.asList(lists));
	String userck;

}
class datalist1 extends vconstuct {

	public void data1(String user) {
		this.userck = user;
	}

	class check {
		public void che() {
			String usname = datalist1.this.userck; // üũ�̸�
			String msg = "";

			int f;
					int ea = datalist1.this.u_list.size(); // �迭 ����. -3��
			for (f = 0; f < ea; f++) {
				if (datalist1.this.u_list.get(f).equals(usname)) {
				msg ="ȸ������";
				}
				System.out.println(msg);
			}

		}

	}
}
