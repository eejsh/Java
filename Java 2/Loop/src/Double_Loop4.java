
public class Double_Loop4 {

	public static void main(String[] args) {

		/* ���빮�� - ���չݺ��� for, do~while�� ( 2*1 , 3*9) */
		
		
		int f ;
		for (f=2; f<=3; f++) {
			int w=1;
			do {
				System.out.println(f +"*"+ w+"="+(f*w));
				w++;
			}while(w<=9);
			
		}
		
		/*���빮�� 
		 * ������ 7�ܺ��� 9�ܱ���
		 * ��. �� ������ �������� 5������ �������� �մϴ�. 7*1~7*5 .... 9*5 
		 * ����(do~while , while)
		 * */
		
	 	int a = 7 ;
		int to ;
		do {
	
			int b = 1;
			while(b<=5) {
			 to = a * b;
			System.out.println(a + "*" + b + "=" + to );
			 //System.out.println(a + "*" + b + "=" + (a*b));
				b++;        //��ġ�� ���� ���� �ٸ�..�� ����..��
		          }			
			a++;
		}while(a<=9); 
		
		
		
		/*���빮��
		 * 
		 * ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
		 * ��, for ������ �����Ͽ� while������ ���۵ǵ��� �մϴ�.  ū for, ���� while
		 * 
		 * 1*1=1
		 * 2*2=4
		 * 3*3=9
		 * 4*4=16
		 * 5*5=25
		 * 6*6=36
		 * 7*7=49
		 * 8*8=64
		 * 9*9=81
		 * */
		

		int g ;
		int total2;
		
		for(g=1;g<=9;g++)     {
		        int y = g;
		        while(y <= g) {		        	 //for��(ū for��)�� g���� ���� ���ڸ� �״�� �޾Ƽ� �Է� g=y 1=1, 2=2, 3=3, ..
		        	total2 =y*g;                          
		        	System.out.println(g + "*" + y + "=" + total2);
		        	y++;
		        	}
		        }
		
		/*���빮��
		 * �ش� ����� ó�� ����� �ǵ��� ����ݺ����� �̿��Ͻÿ�. ( while ~ do-while��)
		 * 1+1=2
		 * 2+1=3
		 * 2+2=4
		 * 3+1=4
		 * 3+2=5
		 * 3+3=6
		 * 4+1=5
		 * 4+2=6
		 * 4+3=7
		 * 4+4=8  */
		
		
		
		
		
		
	}

}
