
public class Example5 {

	public static void main(String[] args) {

		/*
		 * ���빮�� 5
		 * 
		 * ���� �ڵ带 ���� shile ������ ��ȯ�Ͻÿ�.
		 * 
		 * 
		 * int sum = 0;
		 * int i;
		 * for (i=1 ; i<=12; i++){
		 * if (i%2==0) {
		 * sum =i+sum;
		 * 	System.out.println("1���� 12������ ¦���� �� = " + total);
		 * 
		 * 
		 * 
		 */

		int i = 1;
		int sum = 0;      
/*
		while (i <= 12) {
			if (i % 2 == 0) {
				sum += i;
			}
		i++;

		}   */
//		System.out.println("1���� 12������ ¦���� �� = " + sum);

		
		do {
			
			sum += i;
			i++;
		}while (i<=12) ;
	
		System.out.println(sum);
		
		
		
	}

}