package App;

public class App1 {
/*App1��� �⺻ ����class �̸� abox�� main�� ������ ����.*/
	public static void main(String[] args) {
		//method11���� �ε��� ��� �ش� �ܺ� blue Ŭ������ �ε��Ͽ� ��½��� method11���� �ε� �� �� �ֵ��� ��.

		blue b = new blue();

		System.out.println(b.box());

	}

	public void abox() {
		System.out.println("test import");

	}

}


//blue �� ������ �ܺ� class �̸�, method 11 ���� �������� �ڵ鸵�� �Ұ�����.
class blue {

	private String msg;

	public String box() {
		this.msg = "ȯ���մϴ�";
		return this.msg;

	}

}