import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {

		/*
		 * 응용문제 관리자에서 메뉴를 활성화 하는 프로세서 입니다. 해당 메뉴활성화는 2차 배열이며,메뉴명, 활성화는 Y.N 으로 구분합니다. 해당
		 * 활성화 값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재 구성 후 메인에서 출력되도록 합니다. 결과
		 * :[로켓배송,로캣프레시,골드박스, 추석] 단, private 및 return을 활용하여 프로그램을 작성합니다.
		 */

		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
		
	}

}

/* 반복문 - 7번, y값만 재출력?->if문. */
class menus {

	private String mdata[][];// 2차 배열이니 2차 배열로 선언..
    private String rdata[];
    
	
    String a; //

	public menus() {

		String ms[][] = { { "로켓배송", "로켓프레시", "쿠팡비즈", "골드박스", "이벤트", "설날", "추석" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } };

		this.mdata = ms;

		// System.out.println(Arrays.toString(this.mdata[0])); //구룹 전체확인
		// System.out.println(this.mdata[0][1]); //인덱스 값 확인

		redata();
		
		

	}

	public void redata() {
		// System.out.println(Arrays.toString(this.mdata[0])); 배열로드 확인


		int w = 0;
		int ea = this.mdata[0].length;  //7개
		//System.out.println(ea);
	   
		String ww[] = new String[ea];	//임시변수 ->>mdata에서 임시변수 사용해서 1차배열로 나열
		//String wa[];
	    int ct = 0;   //카운터 사용
	    
		do {
			
			if(this.mdata[1][w].equals("Y")) {
				
			//	System.out.println(this.mdata[0][w]);           //m데이터 0번째 [0~6]번째 
	           	ww[ct] = this.mdata[0][w]; 
			       ct++;		
			}
			w++;
					}while(w<ea);
		
	
		this.rdata = ww;
		
	//	System.out.println(Arrays.toString(ww));
		
	}

	public String[] get() {  //메인class에서 선언 배열값..//String[]
		
		
		return this.rdata;
		
		
		
	}
	
	
	
}

/*
 * class{
 * 
 * int a; ->field 
 * String b;
 * 
 * public aaa() { ->comstructor }
 * 
 * public void        method 
 * public static void method 
 * piblic String abc  method
 */
