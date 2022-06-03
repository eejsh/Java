
public class example1 { // 기본클래스.

	public static void main(String[] args) {

		/*
		 * 배열+기본(메소드)문제 //pubilc class example1 가 기본클래스 입니다. . 메소스 문제 시 public void 추가.
		 * 1차 배열에 다음과 같이 값이 있습니다. 배열 리스트 22, 33,44, 55, 66, 77, 88, 99 이며 해당 전체 값을 모두 더한
		 * 총 합계 값을 별도의 메소드에 처리되도록 합니다. 단, 반복문은 무조건 do~while문으로 작성 합니다. (총 더한값 484)
		 */

		int aa[] = { 22, 33, 44, 55, 66, 77, 88, 99 };

		plus1(aa); // plus1 로 보내주세요.

		example1 ex = new example1();  
		ex.plus(aa);
		// void = 객체생성 + 인스턴스(메모리) 등록
		// 메모리 할당선언 = public에 static 이 없으면 메모리 할당 별도로 해주어야 합니다.

	}

	// static 들어가면 메모리 할당되있음으로 별로 메모리 할당 안해도됩니다.
	public static void plus1(int b[]) {

		int aa = 0; 
		int bb = b.length;  //배열개수 파악
		int total = 0;

		do {
        	total += b[aa];
			aa++;
             } while (aa < bb);

		System.out.println("총 더한값은 " + total + "입니다.");
}

	public void plus(int c[]) {   //선생님 풀이
      int ea = c.length;
      int w = 0;
      int total1 = 0;
      do {
    	  total1 = total1+ c[w];
    			  w++;
      }while(w<ea);
      
		System.out.println("총합계값"+ total1 );
		
	}

}
