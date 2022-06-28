package java_test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args)  {
	basket b = new basket();
		b.basket();
		

	}

}

class basket extends home3_1{
	
   static int total = 0; // 최종 값.
   
	public void basket() {
    String user[] = { "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" };
	int w=0;
    int ea = this.momey.length; //6
    while(w<ea ) {
      	String data1[] = this.momey[w].split("=");
    //  	System.out.println(Arrays.toString(datas)) ;
      	String data2[] = user[w].split("=");
               
              int aa = Integer.valueOf(data1[1]);
              int bb = Integer.valueOf(data2[1]);
              total += (aa*bb);
      	w++;
    }
        System.out.printf("장바구니의 총 금액은 %s 입니다." ,total);    
 		
	}   
}

