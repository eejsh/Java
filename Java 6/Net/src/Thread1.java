//Thread �����
public class Thread1 {

	public static void main(String[] args) {

		/* extends thread */
		int w = 0;
		while (w < 6) { // -->5�� thread ���ư�.
//		box b = new box(w);
//    Thread t = new Thread(b);
//	t.start();      //thread--->start���
			w++;
		}

		/* Interface Runnable Thread */

		for (int f=0; f<10; f++) {
			//thread �޼ҵ带 ȣ���Ͽ� �ش� class�� CPU �Ѱ��� �Ҵ��մϴ�.  .
			box2 b2 = new box2(f);
			Thread t2 = new Thread(b2);  // thread ���� ( thread�� �۵���ų class ��)	// �� thread ����- ���� class�� �������� �����ϱ�.
			t2.start(); //run�޼ҵ带 �۵���Ű�� ���� ��ɾ�
		}
	}
}

//extends thread
class box extends Thread {
	int no = 0;

	public box(int a) {
		this.no = a;
	}

	@Override
	public void run() {       //thread�� �⺻ �޼ҵ�. 

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(this.no);
	}

}

class box2 implements Runnable {
	int no = 0;

	public box2(int b) {
		this.no = b;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) { 	}
		System.out.println(this.no);
	}

	
}