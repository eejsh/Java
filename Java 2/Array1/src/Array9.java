import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		/*응용문제 
		 * 2개의 데이터 배열이 있습니다. 해당 데이터 배열을 다음 결과처럼 값을 출력하시오.
		 * 더블반복으로 사용안해도되고 사용해도되고..............
		 * for~dowhile~~
		 * 
		 * 1번 data : 대한민국 , 일본 , 중국 , 베트남 , 태국
		 * 2번 data :    40  , 35  , 70 ,  55  ,  32 
		 * 결과 data 
		 * [ "대한민국(40)", "일본(35)", "중국(70)", "베트남(55)", "태국(32)"
		 * 
		 * */

		
//		String d1 = "대한민국";
//		int d2 = "40";
//		String d3 = (d1+ "(" + d2 + ")" );
//				
//	    
//		String data [][]  = {
//				{"대한민국", "일본","중국", "베트남", "태국" },
//				{"40", "35", "70", "55", "32" }				
//					};
	///배열 array가 두개면 합치려면 = 해당되는 갯수만큼만 돌려서 로드..반복문 1개.
		// array가 두개=두개면 반복문 2개
		
		//String newdata = new String[data[0].length];
        //String newdata = new String[5];
		
		
//		int ar = data.length;
//		int ar2 = data[0].length;   //객체의 수
//		String newdata[] = new String[ar2];
//
//		int ww=0;
//		
//		do {
//				
//				//	System.out.println(data[w][0]);
//
//				newdata[ww] = data[0][ww] + "(" + data[1][ww] +")" ;
//				ww++;
//				
//			}while(ww<ar2);
//			
//			
//		
//		System.out.println(Arrays.toString(newdata));
//		
		
		
		
		
		/*해당 두개의 배열 데이터가 있습니다.
		 * 각 배열별로 인덱스가같은 번호를 더해서 짝수,홀수인지를 배열 결과 데이터로 재설정 하십시오.
		 * Adata = 5 17 19 22 33 
		 * Bdata = 1  2  3  4  5
		  Result = ["짝수","홀수","홀수","짝수","짝수"]
		 * 
		 * */
		
		
		int A1[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5} 
				};
		
        int data_ea = A1[0].length;         
        int f = 0;                           
        int total;
        String Result;
        String Result_data[] = new String[data_ea];
        
        
        while(f < data_ea) { 
        	
        	total = A1[0][f] + A1[1][f] ;
        	if(total %2==0) {
        		Result = "짝수"; 
        				
        	}
        	else {
        		Result = "홀수";
        	}
        	Result_data[f] = Result;
        	
        	f++;
        }
		System.out.println(Arrays.toString(Result_data));
		
		
		
		
		

	}

}
