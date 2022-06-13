
public class oop3 {

	public static void main(String[] args) {
//multi Thread(멀티쓰레드) : start, run, sleep, setStop
		
		// 쓰레드(Thread) : 프로세서 내부에서 독립적으로 실행되는 작업을 말함.
		// Multi Thread(멀티쓰레드) : 프로세서 내부에서 두가지 이상의 작업을 동시사용.
		// my.publb(); -->오류
		//my.run(); ------> 외부 먼저 돌아가고 내부클래스 돌아감
 
		Thread my = new mythread();  // 부모메소드 = 자식메소드 
		//기본 사용형태 : 자식메소드 = 자식메소드 
		// 부모(thread=>비이었음)를 기점으로 자식 생성
		Thread my2 = new test2();
		
		my.start();    //--->start 하면 작동은 랜덤. 내.외부클래스 동시에 돌아감 
		my2.start();   // thread 메소드에 기본 run을 작동하기 위한 스타트명령어.

		//멀티쓰레드 -> 음악, 유투브, 문서 한번에 돌아가는것을 말함. [멀티테스킹]
		
		int ct = 1;
		while (ct <= 10) {

			System.out.println("내부클래스 : " + ct);
			ct++;
		}

	}

}
//멀티스레드는 public만 사용가능.
class test2 extends Thread{
	@Override
	public void run(){
		int ct = 1;
		while (ct <= 10) {
			System.out.println("외부클래스2 : " + ct);
			ct++;
		}
	}
}

      // 자식              부모
class mythread extends Thread {  //thread : JVM에 기본으로 탑재 되어 있는 메소드 Thread는 단독으로 사용하지 않음.
	
	// public void publb() { // 부모에게 있는메소드가 아님.
	@Override	
	public void run() {   // run 이란 : 멀티메소드 기본 실행 메소드
		int w = 1;
		while (w <= 10) {
			System.out.println("외부클래스 : " + w);
			w++;
		}

	}
}


