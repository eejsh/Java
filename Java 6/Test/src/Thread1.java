//Thread는 메인 class에서 사용 안함.   extends,  implement--(interface에서 사용)  (둘다 속도 비슷 interface나 class나 맞춰서사용)

public class Thread1 {

	public static void main(String[] args) {
		//	class box extends Thread 메인클래스에서 사용하지 않음...
		
		// 순차적으로 처리해야되는 경우는 일반 class 사용 (중간에 문제가 생길 시 다음 순서는 무조건 대기..)
		// thread 는 복합적으로 처리할 때 사용  (중간에 문제가 생겨도 빠른 순서대로 처리 가능)
		
		class_box cb = new class_box();
		for(int a=0; a<10; a++) {
		//	cb.run("클래스 처리현황" + a);     //class_box로 값 보내기.
		}
		
		cpu_box cp = null; 
		//Thread를 이용하여 먼저 처리 된 결과순으로 나오도록 합니다.
		for(int b=0; b<10; b++) {
		cp = new cpu_box("쓰레드 처리현황" + b);
//		cp.start();                //cpu_box - Thread
		}
		/*Thread를 이용하여 강제 예외처리 방식 이며 문제가 발생하더라도 해당 문제가 발생한 Thread만 예외처리, 그 외 사항은 모두 처리하는 예시 */
		call_box bb = null;
		
		int w=0;
		String msg = "";
		String msg2 = "";
		// String msg = null -> null이라는 값이 들어간 상태.
		while(w<10) {
			if(w == 5) {
				msg2 = "5";      
			}
			else {
				msg2 = ""; 
			}
			bb = new call_box(msg+msg2);  //null,null
			bb.start();
			w++;
		}
			
		
	}
}

class call_box extends Thread{
	String callname = null;
	
	public call_box(String z) {
		
	this.callname =z;
	}
	@Override
	public void run() {

		try {  //if 밖으로 예외처리    throw 강제로 예외처리 한담 확인하는 방법..
	
			if(this.callname.length() > 0) {
       //문제 발생 시 강제 에러발생시킬때 사용 throw  (throws아님)
	    Exception aaa = new Exception();
	    throw aaa;
	    // throw new Exception(); 
		
		
		}
		else {
			System.out.println(this.callname.length());
		}

		}catch(Exception e) {
		System.out.println("해당 값 중 잘못된 값이 발생 하였습니다.");	
		}
		finally {
			
		}
				
	}
}



class cpu_box extends Thread {    //Thread class  - 5번 호출하면 1-5까지 순차적으로 도는게 아니라 12345 한번에 작동
	//thread는 무조건 run이라는메소드 있어야함.
	String name = null;
	public cpu_box(String a) {
		this.name=a;
		

	}
	@Override
	//인수값을 받지못함. -- 필드로 선언해서 값받을수있음. this. cpu_box 메소드 추가하여 처리..
	public void run() {
		System.out.println(this.name);
		
	}
}

class class_box{ //12345 순차적으로 기다렸다가 돌아감
		public void run(String name) {
		System.out.println(name);

		}
}