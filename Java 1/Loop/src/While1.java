
public class While1 {

	public static void main(String[] args) {
		
		int a = 1 ;         // while ���۰�
 		while (a < 11) {    // while ������, ���ᰪ (��� ��������)
			System.out.print(a+",");
			a++;            //���� �Ǵ� ����
		}
	
 		int b = 10 ;
 		while (b >= 5) {
 			System.out.print(b+",");
 			b--;
 		}
		
 	/*���빮��
 	 * ���� ������ while������ �ۼ��Ͻÿ�.
 	 * 22���� 16���� ���ڸ� ����Ͻÿ�
 	 * */
 		
 		// �ݺ����� ���ڿ�(string) ������ 
	 int c = 22;
	 while (c >=16) {
		 System.out.print(c+",");
		// printf("%d ", c);
		 c--;
	 }
	
	/*  int aa = 1;    // �ʱⰪ
	  int bb = 10;   // ���ᰪ
	  
	  while(aa <= bb) { //�ݺ��� ����
		  System.out.printf("%d ",aa);
		  aa++ ; //����
	  }   */
		
    /*���빮��
     * ���� �ΰ��� �̿��Ͽ� ������ �°� ���� ����Ͻÿ�.
     * 99~47 ���� ���
     */
		int a1 = 99 ;
		int a2 = 47 ;
		while (a1>=a2) {
			System.out.printf("%d ",a1);
		a1--;
		
		}
		
		
	}

}
