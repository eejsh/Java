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
		 Example2 ex2 = new Example2();
		 

     int pc = (int)(Math.random()*10+1);
     Scanner user = new Scanner(System.in);
      
     int a;
     int nu=0; //������
     for(a=5; a>0; a--) {		
		System.out.println("1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?");
		nu = user.nextInt(); 
		ex2.ab(pc, nu);
		String ed1 = ex2.end();
	
		
		if(ed1.equals("�����Դϴ�.")) {
			System.out.println(ed1);
			System.exit(0);
					}
		else {
			System.out.println(ed1);
		}
     }
     
     user.close();
     
     
     
   
   
		
}
	}
