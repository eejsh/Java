//Thread 사용방식
public class Thread1 {

	public static void main(String[] args) {

		/* extends thread */
		int w = 0;
		while (w < 6) { // -->5개 thread 돌아감.
//		box b = new box(w);
//    Thread t = new Thread(b);
//	t.start();      //thread--->start사용
			w++;
		}

		/* Interface Runnable Thread */

		for (int f=0; f<10; f++) {
			//thread 메소드를 호출하여 해당 class에 CPU 한개를 할당합니다.  .
			box2 b2 = new box2(f);
			Thread t2 = new Thread(b2);  // thread 선언 ( thread로 작동시킬 class 명)	// 새 thread 선언- 같은 class를 여러개로 분할하기.
			t2.start(); //run메소드를 작동시키기 위한 명령어
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
	public void run() {       //thread의 기본 메소드. 

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