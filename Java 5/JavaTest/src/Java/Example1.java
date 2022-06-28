package Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		/* [응용문제]
		 * 사용자가 6개의 숫자를 입력하는 로또 프로그램 입니다.
		 * 프로세서 시작 시 "숫자를 입력해 주세요 : " 라고 입력합니다. 총 6번의 숫자를 입력받게 됩니다.
		 * 그리고 lotto.txt 결과 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇개를 맞췄는지를 검토하는 프로그램 코드를 작성하시오.
		 * [결과예시]
		 * 로또 결과 : 총 3개의 번호를 맞추셨습니다. */

		try {
		lotto lo = new lotto();
		lo.user();
		}catch(Exception a) {
		}

	}
}
class lotto{
ArrayList<String> abc = new ArrayList<>();
 int abcd[] = new int [6];
	public void ad() throws IOException{
		try {
		FileReader fr = new FileReader("/Users/hwangjiseon/Desktop/java/home/HOME/src/lotto.txt");
		BufferedReader br = new BufferedReader(fr);
		int w =0;
		while(w<6) {
			String data = br.readLine();
			this.abc.add(data);
			this.abcd[w] = Integer.parseInt(this.abc.get(w)); 
			w++;

		}

		fr.close();   
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	public void user() {
	System.out.println(Arrays.toString(this.abcd));
	Scanner sc = new Scanner(System.in);
	int user = 0;
	int usernb[] = new int [6];
	int total = 0;

	for(int f=0; f<6; f++) {
		System.out.println("6개의 숫자 입력?"+ (f+1) + "회");	
		    usernb[f] += sc.nextInt();
	}
	sc.close();

       for(int zz=0; zz<6; zz++) {
    	 for(int oo=0; oo<6; oo++) {
    	if(usernb[zz]==this.abcd[oo]) {
    	total++;
    	    }	 
    	 }
     }
  }
}
