
public class test7 {

	public static void main(String[] args) {

		/*
		 * 응용문제
		 * 다음 숫자 배열이 있습니다. 해당 배열값을 짝수, 홀수 각각 값을 가져와서 배열로 처리 합니다. 
		 * 결과 :짝수 2,6,10,22,42,50 , 홀수 1,7,11,15,43,51
		 */

		int aa[] = { 1, 2, 6, 7, 10, 11, 15, 22, 42, 43, 50, 51 };

		Thread my = new test1();
		Thread my2 = new test2();
		
		for(int f=0; f<aa.length; f++){
			
			if(aa[f] %2 ==0) {
				
				my.start();
			}
			else {
				my2.start();
				
			}
			
		}
		
		
	}

}

class test1 extends Thread {
	@Override
	public void run() {

		int even[] = new int[6];
		System.out.println(11);

	}

}

class test2 extends Thread {
	@Override
	public void run() {
		int odd[] = new int[6];
		System.out.println(22);
		
	}

}
