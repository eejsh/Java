
public class app {

	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ;
		int c ;
		
		// ��Ģ���� ��ȣ : + - * /
		
		// c= a+b =  30
		// c= a-b = -10
		// c= a*b =  200
		// c= a/b =  0..
		
		c = a/b;
		System.out.println(c);

		String a1="ȫ�浿";
		String b1="ȯ���մϴ�";
		String c1 ; 
		c1 = a1+b1 ; // ���� ������ �� +�� ����+���� ���� ǥ���� �� �ֽ��ϴ�.
		
				System.out.println(c1);
		/*
		 * ���빮��
		 * ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
		 ȫ�浿�� �������� 50000 �Դϴ�.
		 ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ�� �� �ֽ��ϴ�. 
		 */
		
		String d1="ȫ�浿";
		
		String e1="�� ��������";
		String f1="�Դϴ�.";
		
		int g1= 50000;
		
		System.out.println(d1+e1+g1+f1);
		
		
		//��;�....!
		
		
		String mname="ȫ�浿";
		int mpoint=50000 ; 
		
		System.out.println(mname+"�� ��������"+mpoint+"�Դϴ�.");
		
		
		String msg = mname+"�� ��������"+mpoint+"�Դϴ�.";
		System.out.println(msg);
		
		
		
		/*���빮��
		 * �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�.
		 * ��ٱ��Ͽ� ���� ��ǰ������ ��� ���ؼ� �� �����ݾ��� 
		 * ��µǵ��� �Ͻÿ�. 
		 * ��, $ �ѱ۷� ��� �Ǿ�� �մϴ�.
		 * 8.25
		 * 4.02
		 * 3.71
		 * ������� ������ ���� ����Ͻÿ�
		 * �� �����ݾ� : $ �Դϴ�.
		 */
		
     String ho="�� �����ݾ��� $" ;
     String he="�Դϴ�." ;
     
     double z1 = 8.25 ;
     double z2 = 4.02 ;
     double z3 = 3.71 ;
	 double z4 ;
		
     z4 = z1+z2+z3 ;
     
	System.out.println(ho+z4+he);
	
	
	System.out.println("�� �����ݾ��� $"+z4+"�Դϴ�.");
	
	
	
	//��
	double p1,p2,p3,p4;
	p1=8.25;
	p2=4.02;
	p3=3.71;
	
	p4=p1+p2+p3 ;
			System.out.println("�� �����ݾ��� $"+p4+"�Դϴ�.");
	
		
			
			

			int k = 3;
			int j = 9;
			double aw = (double)k/j;  //���� ������ �ڷ��� ���� �ִ� �ڵ� - �ؽ�Ʈ����
			                        // double aw = k/j; ����� �Ҽ��� ��������.
			//double aw= (double)k/j; ����� �Ҽ��� ����~!
			
			System.out.println(aw);
			
			
				
		
		
		
	}

}
