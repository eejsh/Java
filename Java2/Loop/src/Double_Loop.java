import java.text.SimpleDateFormat;

import java.util.Date;

// import java.util.Scanner;  ex ��ĳ�� ��� ���� �� ���� �� ctrl +shift + O Ű ������ �Ⱦ��� ���� ������. 

public class Double_Loop {

	public static void main(String[] args) {

	Date today = new Date();

	//	System.out.println(today);
	
	SimpleDateFormat date = new SimpleDateFormat("yy��MM��dd��"); // �ҹ��� mm�� ��, �빮��MM�� �� �� ǥ�� (mm-dd���� ���� ��-�����)
		// format = �޸� ��� ������ ���

	System.out.println(date.format(today));
	SimpleDateFormat time = new SimpleDateFormat("H:m:s");
	System.out.println(time.format(today)); 
    //	format �԰�ȭ�� ���·� ���� ǥ���� �� ����ϰ� �˴ϴ�. 

	//	int f;
		// for(f=1 ; f<=10; f++ ) //1�� ����

	//	for (f = 1; f <= 10; f = f + 2) // 2�� ����
		//	System.out.println(f + " ");

		/* ���빮��
		 * 3���� ��ǰ * "���ڵ�� ��ǰ�� �Է½����ּ���" ����ڰ� �ݾ��� �Է��ϰ� ����		 * 		 * "���� %�� �������ּ���."
		 * 
		 * ���� ���� �ݾ��� �ֽ��ϴ�.		 * 		 * ���� �ݾ��� 60,000�� �Դϴ�.		 * 
		 * ��, "���� %�� �Է��� �ּ���" ��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ�, ���� �ݾ��� ���� �Ǿ� ��µǵ��� �մϴ�.		 * 
		 */

		/*int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a; // = 2000���� ��.
		// ���� �� - 2000�� �������� ��.
		double c = money - b;
		System.out.println(c); */
		/* 10000*0.8 = 8000 (20%����)
		 * 10000 / 20 =500��... X*/
		  // double c = money - b;
		 //    System.out.println(c);  */
			
			
			
		// ���� �ݺ����� for ��	
		int f, ff;
		int total ;
		for (f=1; f<=3; f++) {
	        for ( ff=1; ff<=4; ff++) {   // ���� ū �ݺ����� ����� ������ ���� �ݺ����� ����ϸ�ȵ� =>Loop �߻�
	         	   total = f+ff;
	  System.out.println(f +"+"+ff +"="+ total );      	                    
	      }
	}
				
	}

}