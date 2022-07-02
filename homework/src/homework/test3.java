package homework;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
	/*	[TEST1]
	다음 해당 값이 있습니다. 해당 값에 대해 배열로 각각 저장 되도록 합니다.
	honggildong
   결과 h,o,n,g,g,i,d,o,n,g 로 배열이 저장 되어야 합니다. 해당 처리는 외부 class에서 처리가 되도록 합니다. */
		
		
	String oriname = "honggildong";
	
	int w =0;
	int ea = oriname.length();
	//System.out.println(ea);
	
	String name[] = new String[11];
	for(int f=0; f<=ea; f++) {
		name = oriname.split("");
	}
	System.out.println(Arrays.toString(name));

	}
	
}
