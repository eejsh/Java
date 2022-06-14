
public class Time3 {

	public static void main(String[] args) {

		/*
		 * try { //->메소드 안에 있음 바로 작동가능. System.out.println("수업시작"); Thread.sleep(5000);
		 * System.out.println("수업종료");
		 * 
		 * } catch (InterruptedException a) { System.out.println(a); }
		 */

		/*
		 * 응용문제 외부 class가 있습니다. 단, 메인class에서 해당 외부 class를 로드합니다. 8초동안
		 * "처리중입니다.... 잠시만 기다려 주세요." 해당 메소드에서 즉각적으로 8초동안 로딩이 발생합니다. 8초 이후에 return으로
		 * "입금이 모두 처리 되었습니다" 라는 문자를 받도록 하십시오.
		 */
   bank b = new bank();
   b.bankmoney();

   
	}

}

class bank {
	
public void bankmoney () {
	try {
		System.out.println("처리중입니다. 잠시만 기다려 주세요..");
//		System.out.println("test1");
//		int c = 10/0;
		Thread.sleep(1000);
//		System.out.println("test2");
		String kkk = this.msg();
		System.out.println(kkk);
	}catch(InterruptedException a) {
//		System.out.println("test3");
		System.out.println(a);
	}
}}


public String msg () {
	return "입금이 모두 처리되었습니다.";
