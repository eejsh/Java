
public class oop5 {
//abstract ���� �⺻���� �μ������� �߻� �޼ҵ带 ���� �ѱ�.
	public static void main(String[] args) {

		load1 ld1 = new load1();
		ld1.datain(20, 30);
		ld1.call();

		load2 ld2 = new load2();
		ld2.datain(20, 30);
		ld2.call();

	}

}

abstract class abclass {
	int data1, data2;

	public void datain(int d1, int d2) { 
		// �⺻�߻� �޼ҵ��̸�, ��� �����͸� �μ��� �޾Ƽ� thisó��.
		// ��, �ܺ� Ŭ�������� �������� ����.

		this.data1 = d1;
		this.data2 = d2;
	}// �Ҵ縸 ����.

	public abstract void plus(); // load 1,2 -> plus
	// ������ class �⺻���� plus �޼ҵ�� ������ ������

	public void call() {
		this.plus(); // �θ� �۵�.
	}

}

class load1 extends abclass {

//	public void call(int i) {
//		this.avg();                     // -->�����ε�
//	}
	
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
		}
}

class load2 extends abclass {
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();   //(2)
	}
	public void avg() {
		System.out.println("ȫ�浿"); //����Լ��� plus�� ����.(1)
	}
}
