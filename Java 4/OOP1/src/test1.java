
public class test1 {

	public static void main(String[] args) {
		// 이순신90,90,90, 홍길동40,40,40, 유관순100,100,100
		String array[][] = { {"이순신","홍길동","유관순"},{"90","40","100"} };
		//,{"88","60","70"},{"70","100","55"}};
		
              int z, zz;
              
              for(z=0; z<3; z++) {  //3번.
            	for(zz=z; zz<=z; zz++) {   //1바퀴
            		
            	System.out.println(array[0][zz]+array[1][zz]);
            	
            	}
            	  
              }
              
		
		
		
		
		
		
		
		
		
		// 1+1~1+5, 2+1~2+5, 3+1~ 3+5
		int w = 1;
		int f; // for문만 변수 밖으로 빼도됨.

		while (w < 5) {
			for (f = 1; f < 6; f++) {
			//	System.out.println(w + "+" + f + "=" + (w + f));
			}
			w++;
		}

	}

}
