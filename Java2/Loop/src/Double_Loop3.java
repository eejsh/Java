
public class Double_Loop3 {

	public static void main(String[] args) {
		/*
		 * ���� ��°��� ��� �ǵ��� for������ �ۼ��Ͻÿ�. 
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * 7+2=9
		 * 7+3=10
		 * 7+4=11
		 * 7+5=12 ...... 9+5 =14*/

		int a, aa;
		int total;

		for (a = 5; a <= 9; a++) {
			for (aa = 2; aa <= 5; aa++) {
				total = a + aa;
				System.out.println(a + "+" + aa + "=" + total);

				//System.out.println(a+"+"+aa+"="+(a+aa));
				
			}

		}
		
	/*���빮�� double while���� ����
	   9*7=63
	 * 9*6=54
	 * 9*5=45
	 * 8*7=56
	 * 8*6=48
	 * 8*5=40
	 * 7*7=49
	 * 7*6=42
	 * 7*5=35
	 * */

		 int g = 9;
		 int total1 ;
		 
		 while (g>=7) {
			 int gg = 7;
			 while(gg>=5) {
				 total1=g*gg;
				 
		  System.out.println(g + "*"+ gg + "="+ total1);				 
				gg--; 
			 }
			 g--;
		 }
		
		 //������Ǯ��
		 int w = 9;
		 while(w>=7) {                             //7���� 9���� ũ�ų� ������
		    int ww = 5;
		    while(ww>=7) {                            // 5���� 7���� ũ�ų� ������
		    	System.out.println(w + "*" + ww + "=" + (w*ww));
		    			    	ww--;
		    }
		              w--; 
		 }
		 
		 
		 
		 /* ���� ������� ���� do~while ������ �����Ͻÿ�.
		  * 5+4=9
		  * 5+5=10
		  * 5+6=11
		  * 5+7=12
		  * 4+4=8
		  * 4+5=9
		  * 4+6=10
		  * 4+7=11
		  * 3+4=7
		  * 3+5=8
		  * 3+6=9
		  * 3+7=10 */
		 
		 
		 int dw1=5 ;
		 
		 do {
			
			int dw2=4;
			 do {
				 System.out.println(dw1 + "+" + dw2 + "=" + (dw1+dw2) );
				 
				 dw2++;
			 }while(dw2<=7);
			 
			 dw1--;
		 }while(dw1>=3);      //�ε�ȣ..����..��
		 
		 
		 
	}

}
