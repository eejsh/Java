
public class For2 {

	public static void main(String[] args) {
       
		/*int a;   //for �� �ʱⰪ
		int b=2; //���꿡 ����� ��
		int c;   //������ ����� ���
		
		for (a=1; a<=9; a++) {
			c = b * a ;  //������� �۾�
			//System.out.print(b*a);
	       	System.out.print(c+" ");  //���� �� ������� �����.
		}
 		 */
		/* ���빮��
		 * ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�.
		 * 45, 40, 35, 30, 25, 20,
		 * */
		
	//for(�ʱⰪ ; ������(���������); ���� �Ǵ� ����)
	 /*	int a1;     // for ���� ���� ��
		int b1=5;   // ���꿡 ����� �� - 5�� �����
		int c1;     // ��갪
                  //4�� �ݺ�
	   for (a1=9; a1>=4; a1--)  {
		      //a1 * 5 
		   c1 = a1 * b1 ;
			System.out.print(c1","); }
	   */
	 
	/* ���빮��
	 * ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ����Ͻÿ�.
	 * 11,22,33,44,55,66,77,88,99
	 * */	
		
		int aa1; //���ʺ���
		int bb1=11; //���� ��밪
		int cc1; //��갪
		    //11*1 ; 11*9 		
		for (aa1=1; aa1<=9; aa1++){
			cc1 = bb1 * aa1 ;
			System.out.print(cc1+",");
		}
		int z;  // for
		int x;  // �����
		        //z<100 100�� �ݺ�, z<9 9�� �ݺ�         
		for (z=1; z<10; z++) {
		    x = (10*z)+z;
		  // x = 11*z; 
		    System.out.print(x+",");
		}
		
				// 5~25
		
		int aaa1;
		int aaa2=5;
		int aaa3;
		 // 1���� ����; 5�� �ݺ�; �������� 
		for (aaa1=1; aaa1<6; aaa1++){ 
		     aaa3 = aaa1*aaa2;
			System.out.print(aaa3+" ");
			
		}

		
	}

}
