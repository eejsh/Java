
public class Class7 {

	public static void main(String[] args) {

//class�� �⺻ �޼ҵ� ��ü�� ����.
		String mid = "hong";
		String mname = "ȫ�浿";

		java1 jv1 = new java1(mid, mname);

	}

}

class java1 {

	// java1 class�� main���� ��ü���� �� �ν��Ͻ��� �����ϸ� �ٷ��۵��ϴ� class �⺻ �޼ҵ� �Դϴ�.

	public java1(String a, String b) { // class�� �⺻���� ����ϴ� �޼ҵ� (public�� ����� ��� class��� ������ ����)

		// public java( String a, String b) // �⺻�޼ҵ� class = public�� ������ ���ƾ���.
		System.out.println(a + b);
		java2();             // void �޼ҵ带 �ٷ� ȣ�� �� �� �ֽ��ϴ�.

	}

	public void java2 () {
		System.out.println("test");
	}

}