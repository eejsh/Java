
public class For1 {

	public static void main(String[] args) {
        // 반목문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법
		// 쇼핑몰, 게시판..등 . 전체(체크박스) 선택  후 삭제 		
		
		int z = 1 ;
		// z++;    +1 증가  출력 후 +1 증가 
		// z--;    +1 감소  출력 후 -1 감소
        // ++z;    +1 증가  +1 증가 후 출력
        // --z ;   -1 감소  -1 감소 후 감소
        // System.out.println(z);

	//for(    초기값 ;   범위값 ; 증가 또는 감소)
      for(int a = 0 ;  a < 10;   a++ ) {   //범위 설정
	//		System.out.println(a);
		}
		
      int b;
      for (b = 5; b <= 10; b++) {
    	 // System.out.println(b);
      }
      
      int c;
      for (c=10; c >3; c --) { // 주의사항 c < 3 0~음수까지 전부 찍혀버리는 상황이 발생함.
    	  System.out.println(c);       
      }
      // 응용문제 20~27 까지 출력하세요.
      
      
      int d ;
      for ( d=20; d<=27; d++) {
    	  System.out.print(d);  //나열식으로 출력됨
    	  }
        
      // 응용문제 39 ~ 21 까지 출력하세요.
      int e;
      for (e=39 ; e>20; e--) {
    	  System.out.print(e+",");
  
      }
      // 1~10 숫자 출력.
       int aa;
       int bb=10;
       for ( aa = 1; aa <= bb; aa++ ) {
    	   System.out.print(aa+",");
       }
    
      /*응용문제 변수 2개를 이용하여 다음 데이터를 출력하시오. 
        55~4까지 출력
      */
       
      /* int cc ;
       int dd=4;
       for ( cc = 55 ; cc >= 4; cc--) {
    	   System.out.print(cc+",");
       } */
       
    	   
       int kk ;
       int hh = 4 ;
       for (kk=55; kk >=4 ; kk--)  {
    	   System.out.print( kk );
       }
       
       
       
      
	}

}
