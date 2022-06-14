public class Example1 {

	public static void main(String[] args) {

		// abstract 응용문제

		/*
		 * 1차배열 값이 있습니다. 해당 배열 값을 모두 더한 값을 출력합니다. 단 abstract 기본 void method 이름은 sender
		 * 가지고 있습니다. 최종 값 출력은 sender에서 출력 되도록 합니다. 배열은 abstract에서 사용합니다.
		 * 
		 * 배열데이터 : 6,13,22,9,12,64,32,47,39
		 */
//		load ld = new load ();
//		ld.sender();

		arr1 ar = new arr1();

	}
}
//
//abstract class add {
//
//	public abstract void sender();        
//    public int a [] = {6,13,22,9,12,64,32,47,39};
//	public int ea = a.length;
//    
//}	
//class load extends add {
//	@Override
//	public void sender() {      
//		
//		int f; 
//		int total = 0;
//		for(f=0; f<this.ea; f++) {
//			total += this.a[f];
//		}
//		System.out.println("값: " + total);  } }

abstract class vdata {
	public abstract void sender();
}

class arr1 extends vdata {

	private int alldata[];

	public arr1() {
		this.alldata = new int[] { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
		this.sender();
	}

	@Override
	public void sender() {
		int w = 0;
		int total = 0;
		while (w < this.alldata.length) {
			total += this.alldata[w];
			w++;
		}
		System.out.println("총 합계 " +total);
	}

}
