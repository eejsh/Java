import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {

		/* 정적배열 공간을 만들어서 값 할당. int a[] = new int [2]; a[1] = 32; a[0] = 22;*/

		/*동적배열 공간을 안잡고 무한대로 int b [] = {1,2,3,4} ; int[] c = {1,2,3,4} ; int[] d = new
		 * int [] {1,2,3,4}; */

		/* 2차 배열 [] [] 두개 .. */

		String member2[][] = new String[3][3]; // 정적배열. [3][3] 공간을 할당해놈.
		String member[][] = { { "홍길동", "김유신", "유관순" },   // [0=홍길동][1=김유신][2=유관순]
				                { "25", "31", "22" } };     // [ 0=25 ] [ 1=31 ][ 2=22 ]

		int ea = member.length; // 배열갯수가 몇개 있는지를 확인하는 함수 홍길동.김유신.유관순 , 25.31.22 = 2개
		int data_ea = member[0].length; // 해당 배열에서 데이터객체가 몇개있는지 확인. [0]의 배열개숫 =3개 홍길동. 김유신. 유관순 = 3개의 데이터
		System.out.println(data_ea);

		// System.out.println(member[1][2]); = 22

		int f, ff;
		for (f = 0; f < ea; f++) {        // 큰 반복문은 배열 갯수만큼 loop = 2개 
			// System.out.println(Arrays.toString(member[f]));
			for (ff = 0; ff < data_ea; ff++) { //작은 반복문은 배열에 있는 데이터 갯수 만큼 loop = 3개
				System.out.println(member[f][ff]);
			}
		}
		
		int[][] datas = {
				{1,3,5}	,
				{2,4,6}
		};
		
		
		int fea = datas.length;         //배열 몇개있는지?
		int dea = datas[0].length;      //데이터 몇개가 있는지?
		int total = 0;
		
		int w, ww;
		for(w=0; w<fea; w++) {
			//System.out.println(Arrays.toString(datas[w])); 
			for(ww=0; ww<dea; ww++) {
				total += datas[w][ww];
				//System.out.println(datas[w][ww]);
	
			}
		}
		System.out.println("총 합계는 "+ total + "입니다");
		
		
		
		/*응용문제
		 * 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하시오.  if문 
		 * 1번 데이터 : 11, 42, 22, 16
		 * 2번 데이터 : 7, 33, 10, 29
		 * 총 결과값은 90
		 *  */
		
		int [][] aa = {
				{11,42,22,16} , {7,33,10,29}	
		};
	
        int aa1 = aa.length;   //2개
        int aa2 = aa[0].length; // 4개
        
      //  System.out.println(aa1);
      //  System.out.println(aa2);
		
		
		int e, ee;
		int total2 = 0;
				
		
	 	for(e=0; e<aa1; e++ ) {
	 		//System.out.println(Arrays.toString(aa[e]));
	 		for(ee=0; ee<aa2 ; ee++) {
	 			//System.out.println(aa[e][ee]);
	               if(aa[e][ee] %2==0) {     //||는 다른 조건이 있을때 사용..ㅜ 
	            	 total2 += aa[e][ee];
	            	 }
	    	}
	 			
	 	}
		System.out.println("총 합계는 "+ total2 +" 입니다.");
//		
		 int z = 0; 
		 int total3 = 0;
		 
		
		 while(z<aa1) {
			 
			int zz = 0;
			 while(zz<aa2) {
				 if(aa[z][zz] %2==0) {                               //||는 다른 조건이 있을때 사용..ㅜ 
            
				total3 += aa[z][zz]; 
				}zz++;
							 } z++;
	
		 }
			 System.out.println(total3);
		
			 
			 
			 
			 
   		int ws = 0 ;
   		int to = 0;
   		while(ws < aa.length) {
   			
   			
   			int wz = 0;
   			while(wz < aa[ws].length) {
   				if (aa[ws][wz]%2 ==0)
   					to += aa[ws][wz] ; 
   			}
   			wz++;
   		     	} ws++;
		System.out.println(to);
		
		
		

	 }

}
