package Java;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		
		pay p = new pay();
		p.mpay();
		
		
	}

}

class pay implements Test2_inter1 {
	
	Scanner sc = new Scanner(System.in);
	int ck1;
	
	public void mpay() {
	int ea = this.worker.length; //6
	int money;
	int total1=0;
	int total=0;

 
	int w=0;
	while(w < ea) {
	System.out.println("이체를 시작합니다."+ this.worker[w] + "님 에게 이체하실 금액을 입력해 주세요.");
	money = sc.nextInt();
	
	total += money;
	    w++;
		}
	total1 = this.totalmoney -total ;
	
	System.out.println("총 이체한 금액은" +total1+ " 원 이며, 총 잔고금액은 " + total +" 원 입니다.");
		
		
	}
	
}
