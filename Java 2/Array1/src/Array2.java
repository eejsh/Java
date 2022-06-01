
public class Array2 {

	public static void main(String[] args) {
		
		/*hong, kim, park, lee, jang, jung
		 
		 * */

		
		
		
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};		
		System.out.println(id[1]);
		//int word = id[1].length();  // 단어 갯수 파악할대도 length 사용.
		//System.out.println(word);
		
		/*응용문제 : 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배당값 중 사용자 아이디 3단어 이상만 출력하시오. */
		
		int member = id.length;		  // 전체 회원수를 파악하기 위함.
        int w=0;
        int word;                    // 각각의 배열 데이터의 문자 갯수 파악
        while(w<member) {
            word = id[w].length();  //아이디 중 단어 갯수를 파악하세요.
        	if(word>3) {            // 워드 안에 3글자 이상(불포함= 3단어 불포함, 4단어부터)아이디만 뽑아주세요.
            	System.out.println(id[w]);
            }
        	w++;
        }
		
		
		/*응용문제
		 * 배열 데이터는 다음과 같습니다.
		 * 15 60 11 14 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오. */
        		
	   int no[] = {15,60,11,14,27};
	   int nb = no.length;  //배열안에 있는 데이터의 갯수를 파악하기. 총 5개의 숫자가 있습니다.
	   int ww=0;      //반복문에 들어갈 변수
	   int to1=0;    //덧셈으로 0이 기본으로 들어가야됨.
	   
	   while(ww<nb) {         //0~ nb(5회)
		   to1 += no[ww];  // to = to + ww
		   System.out.println(to1);
		   ww++;
	   }
	   
	   
	   /*
	    * int nb = no.length = 배열 숫자의 갯수를 파악합니다. = 총5개를 가지고있음.
	    * while 조건  ww (0) < nb (5) 회 반복합니다.
	    * total 갑은 no(배열에서 1~5개 즉 15, 60, 11, 14, 27의 숫자가 한번식들어오고) 
	    *           ww는 총 덧셈횟수로 돕니다. (15+0)+(60+0)+(11+0)+(14+0)+(27+0)
	              total 가격은 15+60+11+14+27 = 127이 나옴니다.
	    */
	   
	   int date[] = {15,60,11,14,27};
    //	   System.out.println(date[0]); //15가 찍힘  date[1]=60, date[2]=11, date[3]=14,date[4]=27
	   
	   int total = 0;          //덧셈의 기본값
	   int date_ea = date.length; //(-1) 만약 반복문에서 >= 부등호를 사용하고 싶으면 date_ea=date.length-1를 해주면됩니다. (배열의 기본값은 0부터 카운트)
	   int dw = 0;   // 배열의 숫자시작은 0부터 시작함!!!!!!
	   do {
		   total += date[dw];
		   dw++;
	   }while(dw<date_ea);
	   System.out.println("총 합계는 " + total);
	   
	   
	   
	   
        
        
		
		
	}

}

