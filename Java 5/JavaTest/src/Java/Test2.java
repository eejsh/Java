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
	System.out.println("��ü�� �����մϴ�."+ this.worker[w] + "�� ���� ��ü�Ͻ� �ݾ��� �Է��� �ּ���.");
	money = sc.nextInt();
	
	total += money;
	    w++;
		}
	total1 = this.totalmoney -total ;
	
	System.out.println("�� ��ü�� �ݾ���" +total1+ " �� �̸�, �� �ܰ�ݾ��� " + total +" �� �Դϴ�.");
		
		
	}
	
}
