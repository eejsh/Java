import java.util.Arrays;

public class oop2 {

	public static void main(String[] args) {
		
	array1 ar = new array1 () ;
		
	}

}

class array1 {

	private int ar1[];
	private int ea;
	
	public array1() {
		//배열을 필드에 있는 변수 선언으로 처리하는 방식 (this)
		this.ar1 = new int [] {1,2,3,4,5,6,7};
		this.ea = ar1.length;
		//5이상 배열값 찾기
		int w =0;
		String newdata = "";
		while(w<ea) {
			if(this.ar1[w] >=5) {
				newdata += this.ar1[w] + "," ;  //해당 조건에 맞는 값만 문자열로 변환하여 저장
			}
			w++;
		}
				
		String ar2 [] = newdata.split(",");  // 저장된 문자열을 split으로 구분하여 배열로 전환 (split는 절대 숫자자료형에서는 사용이 안됩니다.)
		
		int ar2_ea = ar2.length;
		int oridata [] = new int [ar2_ea];
		//문자열 갯수만큼 배열 생성자 값을 추가하게 됩니다.
		int ww=0;
		while(ww<ar2_ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]);  //문자를 숫자로 전환하여 신규배열 생성자에 값을 저장.
			ww++;
		}
		
		System.out.println(Arrays.toString(oridata));  
		
	}
	
	
}
