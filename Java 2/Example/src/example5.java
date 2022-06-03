public class example5 {
	public static void main(String[] args) {
/* 2차배열 + 기본(클래스) 메소드 문제
 * 등록된 고객 중 vip 고객만 리스트를 출력하시오.
 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
 * user_level : gold vip guest gold vip vip guest
 * 
 * 결과출력 : 이순신, 세종대왕, 김유신
 */
		// [그룹인덱스][데이터인덱스]
		
		String user[][] = { {"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"} , 
			                 {"gold", "vip", "guest","gold", "vip","vip" , "guest"}	};
		

 
		/* static이 아닐시
		*     example5 ex = new example5();
		*     ex.vipuser(user);      =>메모리할당
		*/
		
		vipuser(user);
		
	}

	public static void vipuser(String bb[][]) {

		
		int aea = bb.length;   // 2개의 배열 [홍길동]~~[gold~~]
		int bea = bb[0].length; // [0]번 그룹에 [홍길동.이순신.강감찬.유관순.세종대왕.김유신.계백장군.] 7개

	    int w = 0;                //사용자
	    
		
	    while(w <aea ) {
	    	
	    	int ww=0;
	    	while(ww<bea) {
	    
	    		if (bb[w][ww].equals("vip")) {
	    			System.out.println(bb[0][ww]);    // w을 넣으면 vip만 뽑음으로 0번줄에 있는 이름을 빼고 싶으면 [0][ww]
	    		}
            
	    		ww++;
	    	}
	    	w++;
	    }
	    
		
		
	
		
		
		/*int c = 0;
		while (c < bea) {        //0<6
		 	if (bb[1][c].equals("vip")) {         //bb의 2번째 배열을 0~6 반복 gold,vip,guest,gold,vip,vip,guest 반복=> vip 문구가 맞으면
				System.out.printf("%s ", bb[0][c]);     //bb 에서 vip 인 0번째배열에 이름을 출력
			      }
			 c++;                                  // 0.1.2.3.4.5.6 =7번
                  	}*/ 
         


   }
}
