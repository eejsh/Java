public class Method7 {

	public static void main(String[] args) {
		apink ap = new apink("ȫ�浿", 25, "test@test.com", -1000);
		// ap.names();

		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink {

	// class�ȿ� �ʵ�� �θ�
	// private������ class �ʵ忡�� �����ؾ� �մϴ�.
	private String nm;
//	private int age;
	private String email; 
	
	private String email_cp;
	
	private int point;

	// String nm2;

	public void names() { // private�� �ȿ��� ������� ����.

		if(this.nm == "ȫ�浿") {
		this.nm = "hong";             //�ѱ�->����� �ٲܶ� ���.

		String e[] = this.email.split("@");      // �̸��� �ڿ� �̸���ȸ�� ������ �������� ���� �迭�� ������ �۾���  .. split("@")
		
	//	System.out.println(Arrays.toString(e));
		this.email_cp = e[1];
		
		}
		
	}

	public apink(String nm1, int age2, String email3, int point4) { // �ѹ��� ����
		// setter ����

		this.nm = nm1;
		this.email = email3;
		if (point4 < 0) {
			this.point = 0;

		} else {
			this.point = point4;

		}
		//names();   //�߰��� �ε��ϴ� �޼ҵ尡 ���� �켱��µ�. ȫ�浿X->hong
	}

	public String data() {

		names(); //return���� ���������� �ٲ� ������ �¿��� ����.  ->public void ���� ȫ�浿->hong���� ����Ǿ� ������ �� ��µ�.
		
		//return this.nm;  //return�� �� �������� ����ϴ� �ڵ� �Դϴ�. ���� �����߰��Ǹ� ������.
    return this.email_cp;
	
	}

	public int data2() {
		// getter ����
		return this.point;

	}
}