
public class While2 {

	public static void main(String[] args) {
		
		int a = 1 ;  //����
		int b = 4 ;  
		int c;
		while ( a<10 ) {   // a<10 = 9�� �ݺ�
			//a++ ;   a���� +1�� ���Ͽ� ����ϱ� ������ ���� ����
			c = b * a;    //�����
	     	//System.out.print(c+",");
			a++;  // ��ġ�� ���� ���� �ٸ� (����ġ�� ����.��������)
		}
		
		/*���빮��
		 *  56, 49, 42, 35, 28, 21   / �ش繮�� �ش���� ������ȵ� ��
		 * 7��. 7*8=56 
		 * 
		 * */
		int aa = 8; //����  8*7=56 �⺻ ������ ��Ƽ� ������ ���.
		int bb = 7; //
		int cc;
		
		while (aa > 2 ) {          
			cc = bb * aa ;
			System.out.print(cc+",");
			aa--; 
		}
		
	  int kk = 7 ;             //�ݺ������� �޾ư��� ����
	  int jj = 8 ;
	  int zz ; 
	  
	  while ( jj > 2 ) {
				  zz = kk * jj;
		  System.out.println(zz);
		  		  jj--;
	  }
	  
	  
		/* ���빮��
		 * 
		 * ���� ��� ���� Ȯ�� �Ͻ� �� �ش� ������� �´� �ڵ带 �ۼ��Ͻÿ�.
		 * 4,7,10,13,16,19,22,
		 
		 * */
		
		 int a1 = 3 ;

		 int b1 = 1 ;

		 int c1 ;
	 
		 while ( b1 <= 7) {
			 c1 = (b1 * a1 ) + 1 ;
			 System.out.println(c1);
			 b1 ++ ;
		 }
		 
			 
		
		
		
		
		
	}

}
