
public class oop3 {

	public static void main(String[] args) {
//multi Thread(��Ƽ������) : start, run, sleep, setStop
		
		// ������(Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����.
		// Multi Thread(��Ƽ������) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���û��.
		// my.publb(); -->����
		//my.run(); ------> �ܺ� ���� ���ư��� ����Ŭ���� ���ư�
 
		Thread my = new mythread();  // �θ�޼ҵ� = �ڽĸ޼ҵ� 
		//�⺻ ������� : �ڽĸ޼ҵ� = �ڽĸ޼ҵ� 
		// �θ�(thread=>���̾���)�� �������� �ڽ� ����
		Thread my2 = new test2();
		
		my.start();    //--->start �ϸ� �۵��� ����. ��.�ܺ�Ŭ���� ���ÿ� ���ư� 
		my2.start();   // thread �޼ҵ忡 �⺻ run�� �۵��ϱ� ���� ��ŸƮ��ɾ�.

		//��Ƽ������ -> ����, ������, ���� �ѹ��� ���ư��°��� ����. [��Ƽ�׽�ŷ]
		
		int ct = 1;
		while (ct <= 10) {

			System.out.println("����Ŭ���� : " + ct);
			ct++;
		}

	}

}
//��Ƽ������� public�� ��밡��.
class test2 extends Thread{
	@Override
	public void run(){
		int ct = 1;
		while (ct <= 10) {
			System.out.println("�ܺ�Ŭ����2 : " + ct);
			ct++;
		}
	}
}

      // �ڽ�              �θ�
class mythread extends Thread {  //thread : JVM�� �⺻���� ž�� �Ǿ� �ִ� �޼ҵ� Thread�� �ܵ����� ������� ����.
	
	// public void publb() { // �θ𿡰� �ִ¸޼ҵ尡 �ƴ�.
	@Override	
	public void run() {   // run �̶� : ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�
		int w = 1;
		while (w <= 10) {
			System.out.println("�ܺ�Ŭ���� : " + w);
			w++;
		}

	}
}


