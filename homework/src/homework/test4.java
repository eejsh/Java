package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {

		/*	[TEST1]

				영어단어장 프로그램을 제작해야 합니다.
				다음과 같은 예제를 활용합니다.
				1.입력  2.검색  3.가장 긴 단어찾기
				> 1
				> 영어단어 : apple
				> 한국어 : 사과
				1.입력  2.검색  3.가장 긴 단어찾기
				> 1
				> 영어단어 : banana
				> 한국어 : 바나나
				1.입력  2.검색  3.가장 긴 단어찾기
				> 1
				> 영어단어 : kiwi
				> 한국어 : 키위
				1.입력  2.검색  3.가장 긴 단어찾기 
				> 2
				> kiwi
				> 키위
				1.입력  2.검색  3.가장 긴 단어찾기 
				> 2
				> 키위
				> kiwi
				1.입력  2.검색  3.가장 긴 단어찾기
				> 3
				> banana
				다음과 같이 작동되는 프로세서를 제작하시오.
				* 2. 검색은 한글, 영문 모두 검색이 되어야 합니다.
				* 3. 가장 긴 단어찾기는 무조건 영어로만 검색이 됩니다.
				* 해당 각 파트별(1,2,3) 선택에 따른 메소드는 별도로 분리하여 코드를 제작되도록 합니다.  */
	
	 word wd = new word();
	 wd.a();
	}
}
class word{
	Scanner sc = new Scanner(System.in);
	String userk[] = new String[3];
	String usere[] = new String[3];
	
public void a() {
	int no =0;	
	System.out.println("영어단어장 1.입력 2.검색 3.가장 긴 단어");
	no = sc.nextInt();
	if(no==1) {
		input();
	}else if(no==2) { 
		search();
	}
	else if(no==3) { longword();
	}else {
	 System.out.println("잘못 입력하셨습니다.");
	 }
  }
	
public void input( ) {
	for(int p=0; p<=2; p++) {
	 System.out.println("영어단어 : ");
	 this.usere[p] = this.sc.next();

	 System.out.println("한국어 단어 : ");
	 this.userk[p] = this.sc.next();

	 
//	 System.out.println(Arrays.toString(this.usere));
//	 System.out.println(Arrays.toString(this.userk));
   }
	
    a();
}
public void search() {

    System.out.println("검색할 단어? ");
    String ab = this.sc.next().intern();
    
    
//	 System.out.println(userk);
//	   System.out.println(usere);
	
	for(int z=0; z<this.usere.length; z++) { // 영어 입력
	    if(this.usere[z].indexOf(ab)!= -1 ) {
	    	System.out.println(this.userk[z]);
	    	
	    }else if(this.userk[z].indexOf(ab)!= -1) {
	    	System.out.println(this.usere[z]);
	    }
	} 
	a();
    	}
public void longword() {

	int s = 0;
	int z = 0;
	while(s < this.usere.length )	{
	     if(this.usere[z].length() < this.usere[s].length() ) {
	    	z=s; 
	     }
		s++;
	}
	System.out.println(this.usere[z]);
	this.sc.close();
   
	
}
}
