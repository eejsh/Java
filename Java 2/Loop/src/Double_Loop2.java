
public class Double_Loop2 {

	public static void main(String[] args) {
		
		//���� �ݺ����� while��
		
		int w = 1;
		
		while(w<=3) {
			int ww = 1;   // ū �ݺ����ȿ� ���;� �Ʒ� while���� ������ �ٲ�. ū while�� ������ ������ ������ 1ȸ�� �ޱ⶧���� �ݺ��� �ȵ� / (reset�� �ȵ�)
			              // ���� while���� �ʱⰪ�� ū �ݺ��� �ȿ� ����
    		 while ( ww<=4) {
		  //		 System.out.println(w+"+"+ww);
				 ww++;
			 }
			
			w++;
		}
		
		
		//���� �ݺ����� do~while��
		
		
		int dw = 1;
		do {
			  // do while �� �Ǵ� while�� ���� �ʱⰪ�� ū �ݺ��� �ȿ� ����
		 int ddw = 1;
		     do {
                        // System.out.println(dw + "+"+ ddw);		    	 
		    	 ddw++;
		     }while(ddw<=4); /// ���� �ݺ��� ����

			dw++;
		}while(dw<=3); //ū �ݺ��� ����
		
		
		
		
		

	}

}
