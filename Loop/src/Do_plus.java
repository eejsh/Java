
public class Do_plus {

	public static void main(String[] args) {
        
		/* do ~ while : 30 ~ 35 ���� �հ�ġ�� ����Ͻÿ�. */
		
		int w = 30 ;
		int total = 0 ; 
		do{
		    total += w;	
			w++;
			}while (w <= 35);
		System.out.println(total); 
		
   // ���빮��  189�� �ֽ��ϴ�. �� 1~10 ���� �հ�ġ�� 189�� �� �� �հ踦 ����Ͻÿ�.
		
		int a1 =189;
		int a = 1 ;
	    int to1 = 0; 	
		do {
			to1 += a  ;
			a++;
		}while (a <= 10);
		
		System.out.println(a1-to1);
		
		int ww = 1 ;
		int total2 = 189;    // ���鼭 �� 189-10-9-8-7-6-5-4-3-2-1 
		do {
		total2 -= ww ;
	       	ww++ ;
		} while ( ww <= 10) ;
		System.out.println( "����� " +total2 );
		
		
	}

}
