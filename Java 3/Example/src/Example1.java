import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		
	/*	[up & down ����]
	 *  1. pc�� ���ڸ� �ϳ� ����       ��Ʈ - randow 1~10  
	 *  2. �� ��ȸ�� X�� ���ҽ��ϴ�. (�� 5ȸ) 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
	 *  3. ���࿡ PC�� 7�� ������ ���ؿ��� ����� ���ڿ� ��..
	 *     - pc :7 �����:2   => ��� : UP
	 *  4. �� ��ȸ�� 4�� ���ҽ��ϴ�. 1~10��ȣ �� �ϳ��� ��ȣ�� �Է�? 
	 *  5. -pc : 7  ����� :4 => ��� : up
	 *  6. �� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10��ȣ �� �ϳ��� ��ȣ�� �Է�?
	 *  7. pc : 7  ����� : 7  => �����Դϴ�. ��� ���μ����� ����
	 *  
	 *  *�ݺ���, if�� �迭X
	 *  
	 *  A��Ʈ : PC ����, Scanner(5)�̿�
	 *  B��Ʈ : PC���� �������ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó��.
		*/
		 

//		Example2 ex2 = new Example2();
//     int pc = (int)(Math.random()*10+1);
//     Scanner user = new Scanner(System.in);
//      
//     int a;
//     int nu=0; //������
//     for(a=5; a>0; a--) {		
//		System.out.println("1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?");
//		nu = user.nextInt(); 
//		ex2.ab(pc, nu);
//		String ed1 = ex2.end();
//	
//		
//		if(ed1.equals("�����Դϴ�.")) {
//			System.out.println(ed1);
//			System.exit(0);
//					}
//		else {
//			System.out.println(ed1);
//		}
//     }
//     
//    user.close();

		/*  �Ϲ� random ���� (random double �ڷ���)
		 * ��ƿ�� �̿��� ����- 0���� ���������� 10�� ���� +1�ϸ� 1~10��µ� */
		    int pcr1 = (int)(Math.random()*10+1);
	      	System.out.println(pcr1);
		/* ��ƿ ����� random���*/
			Random r = new Random();
			int pcr2 = r.nextInt(10)+1;
			System.out.println(pcr2);	
		
   		
	
	Example2 ex2 = new Example2();
	Scanner sc = new Scanner(System.in);
	

	int w = 5;
	do {
	System.out.println("1~10���� ���ڸ� �Է��ϼ���." + w +"������");	
	int user = sc.nextInt();
	ex2.randomok(pcr1, user);
	String out = ex2.result();  //ex2�� �ִ� result �� �ִ� ���� �޾ƿ�. string return �Ǿ������� string ���� ����
     System.out.println(out);
	 
     //����� Ȯ��.
     //indexof - �ܾ �ִ��� ã�� -1 : ����  0 : ���� , ������ �� �ܾ ã�Ƽ� ���� �����س�
     int check = out.indexOf("����");
     if(check==0) {   //ã�� �ܾ 0���� ������ ���μ��� ����
		 break;
	 } w--;
	 System.exit(0);
	}while(w > 0);
	
	sc.close();
	
	
	
}

}
