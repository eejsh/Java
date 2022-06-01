
public class Double_Loop2 {

	public static void main(String[] args) {
		
		//더블 반복문의 while문
		
		int w = 1;
		
		while(w<=3) {
			int ww = 1;   // 큰 반복문안에 들어와야 아래 while문의 변수가 바뀜. 큰 while문 밖으로 나가면 변수가 1회만 받기때문에 반복이 안됨 / (reset이 안됨)
			              // 작은 while문의 초기값을 큰 반복문 안에 적용
    		 while ( ww<=4) {
		  //		 System.out.println(w+"+"+ww);
				 ww++;
			 }
			
			w++;
		}
		
		
		//더블 반복문의 do~while문
		
		
		int dw = 1;
		do {
			  // do while 문 또는 while문 같이 초기값을 큰 반복문 안에 설정
		 int ddw = 1;
		     do {
                        // System.out.println(dw + "+"+ ddw);		    	 
		    	 ddw++;
		     }while(ddw<=4); /// 작은 반복문 범위

			dw++;
		}while(dw<=3); //큰 반복문 범위
		
		
		
		
		

	}

}
