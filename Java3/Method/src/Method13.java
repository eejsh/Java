
public class Method13 {

	public static void main(String[] args) {
		// extends : inherit (���)

		/*
		 * ���� �θ� class�� construct �ι��� �μ����� �����ϸ� �ڽ� class�� �ε带 ���ϴ� ������ �߻���. ��, �ڽ� class����
		 * �μ����� �����Ͽ� construct �� ����� ���� ����.
		 * 
		 * 
		 */

		mth1 m1 = new mth1();

		mth2 m2 = new mth2(50);

	}

}



class mth1 {

	public int on;

	public mth1() { // public�� �μ��� ������ extends���� ������. public �� �μ��� �����ʴ°� ����. void�� �������.

		this.on = 20;

		System.out.println("mth1");

	}
}

class mth2 extends mth1 {

	public mth2(int z) { // extends �ڽ� class�� �μ��� �־�ε�.
            this.on = 50;
		System.out.println("mth2");
		System.out.println(this.on);

	}

}