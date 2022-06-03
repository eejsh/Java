import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		 * 다음 사용자가 복권 관련 프로그램을 요청 하였습니다. 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 * "1~46 번 사이의 숫자를 입력해 주세요." 라고 출력합니다.=5번 출력 사용자가 5개의 숫자를 배열로 생성합니다. (main에 처리)
		 * 외부 class를 이용하여 pc가 직접 당첨번호 5개를 랜덤하게 뽑아냅니다. pc가 뽑은 5개의 숫자를 배열로 생성합니다. 
		 * (외부 class method로 생성)
		 
		 * 별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열 데이터와 pc가 뽑은 배열 데이터를 해당 method로 전달하여, 출력하시면 됩니다. 
		 * 단, 모든 사용하는 반복문은 무조건 do~while 문으로 작성합니다.
		 * 사용자가 받은 값을 a로 보내고, b로..? b에서 뽑은 가격을 a+b
		 */

		System.out.println("1~46번 사이의 숫자를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		
		int nw [] = new int[5];
		
		int a = 0; // for문
		
		do {
        	int userin = sc.nextInt();   //유저 입력부분
           nw[a] = userin;                // 새 배열 5개에 userin 에서 받은 숫자를 배열로 나열   nw[0~5]번을 넣어주세요.
		   a++;
		}while(a<5);
		// System.out.println(Arrays.toString(nw));
	
	number nm = new number();
	nm.pcnm(nw);
	
	
	
	}

}

class number {

	public void pcnm(int unw[]) { // pc(5)

	Random ro = new Random();    //random 객체 생성 및 인스턴스 적용 -> 메모리에 작동됨.
    int c = 0;
    
    int nnw [] = new int [5];       // 랜덤 숫자에 배열 나열 해주세요.
    
      do {
        nnw[c] = ro.nextInt(45+1) ; 	  
    	  c++;
      }while(c<5);
    //  System.out.print(Arrays.toString(nnw));
   
      ro=null;
      allnm(unw, nnw);
	}

	public static void allnm(int userno[], int pcno[]   ) { // 사용자(5), PC(5)   //메인에서 하나 받고, aa에서 받고...

		
		System.out.println("유저 :"+ Arrays.toString(userno));
		System.out.println("PC : "+ Arrays.toString(pcno));
		
		
		

	}

}
