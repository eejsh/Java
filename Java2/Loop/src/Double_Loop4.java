
public class Double_Loop4 {

	public static void main(String[] args) {

		/* 응용문제 - 복합반복문 for, do~while문 ( 2*1 , 3*9) */
		
		
		int f ;
		for (f=2; f<=3; f++) {
			int w=1;
			do {
				System.out.println(f +"*"+ w+"="+(f*w));
				w++;
			}while(w<=9);
			
		}
		
		/*응용문제 
		 * 구구단 7단부터 9단까지
		 * 단. 각 구구단 곱셈값은 5까지만 나오도록 합니다. 7*1~7*5 .... 9*5 
		 * 제약(do~while , while)
		 * */
		
	 	int a = 7 ;
		int to ;
		do {
	
			int b = 1;
			while(b<=5) {
			 to = a * b;
			System.out.println(a + "*" + b + "=" + to );
			 //System.out.println(a + "*" + b + "=" + (a*b));
				b++;        //위치에 따라 값이 다름..ㅠ 조심..ㅠ
		          }			
			a++;
		}while(a<=9); 
		
		
		
		/*응용문제
		 * 
		 * 다음 결과값을 확인하여 코드를 작성합니다.
		 * 단, for 문으로 시작하여 while문으로 제작되도록 합니다.  큰 for, 작은 while
		 * 
		 * 1*1=1
		 * 2*2=4
		 * 3*3=9
		 * 4*4=16
		 * 5*5=25
		 * 6*6=36
		 * 7*7=49
		 * 8*8=64
		 * 9*9=81
		 * */
		

		int g ;
		int total2;
		
		for(g=1;g<=9;g++)     {
		        int y = g;
		        while(y <= g) {		        	 //for문(큰 for문)의 g에서 받은 숫자를 그대로 받아서 입력 g=y 1=1, 2=2, 3=3, ..
		        	total2 =y*g;                          
		        	System.out.println(g + "*" + y + "=" + total2);
		        	y++;
		        	}
		        }
		
		/*응용문제
		 * 해당 결과값 처럼 출력이 되도록 더블반복문을 이용하시오. ( while ~ do-while문)
		 * 1+1=2
		 * 2+1=3
		 * 2+2=4
		 * 3+1=4
		 * 3+2=5
		 * 3+3=6
		 * 4+1=5
		 * 4+2=6
		 * 4+3=7
		 * 4+4=8  */
		
		
		
		
		
		
	}

}
