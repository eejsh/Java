//thread는 결과값이 순차적으로 안나옴...
public class Thread2 {

	public static void main(String[] args) {

		/*응용문제  Thread를 이용하여 각각 배열의 값을 내림차순으로 모두 더하여 결과를 출력하는 응용프로그램을 제작하시오. */
		/*힌: 6이라는 배열값이 인수값으로 thread로 전달, 6+5+4+3+2+1= 최종 결과값만 print*/
		int data []  = { 6, 9, 10, 15, 3, 17 };
		
		int ea = data.length;
		
		plusbox pb = null;
		for(int a=0; a<ea; a++) {
		pb = new plusbox(data[a]);
		pb.start();
			
		}
		
	}
}
class plusbox extends Thread{
	int number=0;
	public plusbox(int no) {   // Thread에서 값을 사용하기 위한 기본 메소드.
		this.number =no;
		
		
	}
	
	@Override
	public void run(){  //run 메소드는 절대인수값을 못받음.
	//반복문..         
	//  값 확인. :System.out.println(this.number);
		int sum = 0;
		for(int z=this.number; z>0; z--) {
			sum += z;
		}
		System.out.println(sum);
		
		
		
	}
	
}
		
		
		
		
		
//		
//		abc a = null;
//
//		for(int f=0; f<data.length; f++) {
//		a = new abc(data[f]);
//		a.start();
//		}
//	}
//
//}
//
//class abc extends Thread{
//int zz = 0;	
//public void abc (int z) {//		
// this.zz = z;
//		
//	
//	@Override
//	public void run() {
//  int total =0;
//	int w =0;
//	while(w > zz.length) {
//		z--;
//
//	}
//}