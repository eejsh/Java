
public class For_plus {

	public static void main(String[] args) {

		/*1���� 10���� ��� ���ڸ� ���� ��� ���� ����Ͻÿ�.*/
		
		int f ;              //f �ݺ���
		int total = 0 ; 
		 //       f<11 = 1~10 �ݺ�
		for (f=1 ; f<11; f++ ) {         // total �������� �ݺ� ���� ���������� ������Ŵ 
			
	    //	 total = total + f;
            total += f; 
		}
		System.out.println("�� �հ�:"+total);

		// += (���ϱ��Ҵ� ��ȣ) -= (�����Ҵ� ��ȣ)   *= (���ϱ��Ҵ� ��ȣ) /= (�������Ҵ� ��ȣ) 
		// b = b-f; ->      b -= f ;       �������.
		
	
		/* ���빮�� 
		 * ��ü ���� 500 �� �ֽ��ϴ�.
		 * �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��� ������ 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�.
		 * ����� 404
		 * */
		/*
		int a1 ;
		int tto = 500 ;
		
		for ( a1=1 ; a1<9 ; a1++ ) {		
			tto = tto - 12 ;
		}
		
		System.out.println("����� :" + tto );
    	*/	
		
	int alls = 500 ;
	int m = 12 ;
	int w ;
	for (w=1 ; w <9 ; w++) {
		// alls = alls - m ;
		// alls -= m;
		// alls -= 12;
		
		alls = alls - 12 ;
	}
		
	System.out.println(alls);
	
	
	/* ���빮��
	 * 
	 * ������ 2�� 2*1 ~ 2*9������ �� �հ踦 ����Ͻÿ�.
	 *         ���� �հ� 90
	 * */
	
	
	}

}



