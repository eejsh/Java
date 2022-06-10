public class Example5 {

	public static void main(String[] args) {

		/*
		 * extends를 사용하여 다음 결과에 대한 코드를 작성하시오. 숫자 두개를 입력합니다. 두개의 숫자를 확인하여 다음과 같이 체크합니다.
		 * 첫번째 숫자가 두번째 숫자보다 클 경우 2 > 1 첫번째 숫자보다 두번재 숫자가 클 경우 1 < 2 첫번째 숫자가 두번재 숫자랑 같을 경우
		 * 2=2
		 * 
		 * 첫번재 숫자가 작을 경우 : 해당 두개의 값을 합친 결과값 출력 두번째 숫자가 작을 경우 : 해당 범위 만큼 숫자를 모두 더한 결과 값을
		 * 출력 첫번째와 두번째숫자가 같을 경우 : 해당값이 같습니다. 라고 메세지 출력
		 */


		int a = 5;
		int b = 6;

		exam2 ex = new exam2();
		ex.exam1_method(a, b);

		int result = ex.exam2_method();
		System.out.println("최종결과값 : " + result);
        System.exit(0);
	}

}

class exam1 {
	protected int ex_sum=0;
    private int no1;
    private int no2;
	
	public void exam1_method(int ex1no, int ex2no) {

		this.no1=ex1no;
		this.no2=ex2no;
		
		if (ex1no > ex2no) {
			this.ex_sum = ex1no + ex2no;
		}

		else if (ex1no < ex1no) {
              exam2_loop();
	
		} else {
			System.out.println("해당값이 같습니다.");
			System.exit(0);
		}

	}
	
	public void exam2_loop(){
          int w =   this.no1;
           while(w<this.no2) {
        	   this.ex_sum += w; 
        	w++;
           }
	}
	
}

class exam2 extends exam1 {

	public int exam2_method(){

		return this.ex_sum;
	}
	
}
