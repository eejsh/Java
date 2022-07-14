
public class test7 {

	public static void main(String[] args) {

			/*
		 * 응용문제
		 * 다음 숫자 배열이 있습니다. 해당 배열값을 짝수, 홀수 각각 값을 가져와서 배열로 처리 합니다. 
		 * 결과 :짝수 2,6,10,22,42,50 , 홀수 1,7,11,15,43,51
		 */

		int aa[] = { 1, 2, 6, 7, 10, 11, 15, 22, 42, 43, 50, 51 };
		int go1 =0;
		int go2 =0;
		test1 t1 =null;
		test2 t2 =null;
			for(int f=0; f<aa.length; f++) {
			if(aa[f]%2==0) {
			go1 = aa[f];
			 t1 = new test1(go1);
			}
			else {
			go2 = aa[f];
			 t2 = new test2(go2);
				
			}
		}
		t1.start();
		t2.start();
	}

}

class test1 extends Thread {
	static ArrayList<Integer> aa = new ArrayList<>();
	public test1(int go1) {
		this.aa.add(go1);
	}
	@Override
	public void run() {
		System.out.println(this.aa);
	}
}

class test2 extends Thread {
    static ArrayList<Integer> bb = new ArrayList<>();
	public test2(int go2) {
	this.bb.add(go2);
		}
	@Override
	public void run( ) {
		System.out.println(this.bb);

	}
}
