package hw;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		
		
/*
{"사과=2000","딸기=1500","키위=2500"}

[출력순서]
"해당 상품을 선택해 주세요? [1.사과, 2.딸기, 3.키위]" 2
"해당 상품 갯수를 입력해 주세요? " 5
"구매한 하신 총 가격은 7500원 입니다."

* abstract 를 무조건 사용합니다.
*/
	product pd = new product();
	pd.ab();
	
	
	int result = pd.finaltotal();

   if(result < 0) {
	   System.out.println("구매하신 총 가격은 " + result + " 입니다. ");
    }else {
    	
    	System.out.println("선택한 과일이 없습니다. ");
    	System.exit(0);
    }
	
	
	}
	
}
abstract class fruit{

public abstract int finaltotal();
public abstract void ab();

public final String bas[] = {"사과=2000", "딸기=1500", "키위=2500"};
}
class product extends fruit{
	Scanner sc = new Scanner(System.in);
	int total;
 	@Override
   public void ab() {
 	System.out.println("상품을 선택해 주세요??");
    int user = sc.nextInt();
    System.out.println("상품 갯수를 선택해 주세요?");
    int usernum = sc.nextInt();
    int ea = this.bas.length;
 	int bb[] = new int [ea];
 
 	for(int f=0; f<ea; f++) {
 	String data1[]= this.bas[f].split("=");
 	bb[f] = Integer.parseInt(data1[1]); 

 	  if(user==1) {
 		  total = bb[0] * usernum;
 	  }else if(user==2) {
 		  total = bb[1]*usernum;
 	  }
 	  else if(user==3) {
 		  total =bb[2] * usernum;
 	  }else {
 		 break;
 		 
 	  }
 	
 	sc.close();
 	  
 	}
 
 	
 	}

@Override
	public int finaltotal() {
		return this.total;
	}	   
	   
}

