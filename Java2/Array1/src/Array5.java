import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		
		// 빈 매열 변수에 해당 데이터가 있는 배열로 커스텀 방법.
		
		//숫자
		
		int a [ ]  =  new int [3] ;           // 3개의 공간만 제공함  new int [3] 3개.
		int b [ ]  = { 1, 2, 3, 4, 5, 6, 7};   // 7개의 객체가 있는 상황  [0~6]      // 배열개수가 없으면 반복문이 안돌아서 length
		
		int ea = b.length;           // b의 배열안에 몇개의 데이터 객체가 들어있는지를 파악해야 반복문에 사용이 가능합니다. (1~7)
		
		
		int w = 0;   //데이터 배열값에 무조건 0부터 시작.  do~while문에 사용하기 위한 변수
		             // 배열이 없으면 1부터 시작해도되나 배열이 있을경우 무조건 0부터 시작해야댐
	
		int a_ea = a.length;      // a의 공간에 몇개 할당되었는지 한번더 체크
		
	    
		int ct=0;   //if문에서 쓰일 카운터 
		
	   do {                //0<3 
	    	if(b[w]%2==0 && ct<a_ea    ) {       //b의 배열값에서 짝수이면.
	                  a[ct] = b[w];   
	      // int [3] 의 공간에 ct 0~3의 값이 들어가면 저장 / b [1~2~3~4~5~6~7]
	                  ct++;
			}
			
		//	System.out.println(b[w]);   b의 배열값에서 0~6회 돌린값.
			w++;
		}while(w<ea);
	   System.out.println(Arrays.toString(a));
		
		
  
	    while(w<ea) {
	    	if(b[w]%2==0 && ct< a_ea){             //if b의 배열의 값 중 짝수만 && 새로운 a 배열에 전체 객체 크기 만큼만
	    		a[ct] = b[w];               
	    		ct++;                        //위 조건에 맞을 시 인덱스 번호를 +1식 증가시킴
	    	}
             w++;	    	
	    }
	    
	    System.out.println(Arrays.toString(a));
	    
	

	}

}
