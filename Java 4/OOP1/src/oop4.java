
public class oop4 {
	// �߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {

		// ab_1 a1 = new ab_1(); ������. ��ü�� ����, -> abstract �ڵ� ����ȭ. ǥ��ȭ�ڵ�.

		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		System.out.println(ab.c());
		ab.ab_a();

	}
}

abstract class ab_1 { // �߻�Ŭ���� : �ܺο��� �ε尡 ���� �ȵ�. ��ü���൵ �ȵ�. �������ʴµ� ��Ƽ�����Ѵ�.
    public int c;
	public void ab_a() { // free ( �μ��� ���� �߻� �޼ҵ�) -����ص� �ǰ� ���ص��ǰ�.
    	
        // System.out.println("�θ� Ŭ���� �Դϴ�.");
	}
	public void ab_a(int a) {  //free �μ��� �޴� �߻�޼ҵ� 

	}
    public abstract void ab_c();   //free ���� ������ �ڽ� class���� ���.
    
	public abstract int b(); // �߻� �޼ҵ� (free����) ��ü ���� �ȵ� (extends���� �ҷ��� ��ߴ�)
	// public abstract int c() ; //�۽��� �÷��������� --> ���Ŀ� ����������, ������ �����Ҽ� ����

}

class ab_2 extends ab_1 {
	@Override
	public void ab_c() {
	}
	
	@Override
	public void ab_a(int a) {
             }
	
	@Override
	public int b() { // ���� �޼ҵ� - �߻�޼ҵ带 �޾ƿͼ� �� [abstract���� int�� �޾������� public int�� �޾ƾߴ�]
		return 55;
	}

	public int c() { // -> abstract int c
		return 99;
	}

}
