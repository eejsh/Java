public class example5 {
	public static void main(String[] args) {
/* 2���迭 + �⺻(Ŭ����) �޼ҵ� ����
 * ��ϵ� �� �� vip ���� ����Ʈ�� ����Ͻÿ�.
 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
 * user_level : gold vip guest gold vip vip guest
 * 
 * ������ : �̼���, �������, ������
 */
		// [�׷��ε���][�������ε���]
		
		String user[][] = { {"ȫ�浿","�̼���","������","������","�������","������","����屺"} , 
			                 {"gold", "vip", "guest","gold", "vip","vip" , "guest"}	};
		

 
		/* static�� �ƴҽ�
		*     example5 ex = new example5();
		*     ex.vipuser(user);      =>�޸��Ҵ�
		*/
		
		vipuser(user);
		
	}

	public static void vipuser(String bb[][]) {

		
		int aea = bb.length;   // 2���� �迭 [ȫ�浿]~~[gold~~]
		int bea = bb[0].length; // [0]�� �׷쿡 [ȫ�浿.�̼���.������.������.�������.������.����屺.] 7��

	    int w = 0;                //�����
	    
		
	    while(w <aea ) {
	    	
	    	int ww=0;
	    	while(ww<bea) {
	    
	    		if (bb[w][ww].equals("vip")) {
	    			System.out.println(bb[0][ww]);    // w�� ������ vip�� �������� 0���ٿ� �ִ� �̸��� ���� ������ [0][ww]
	    		}
            
	    		ww++;
	    	}
	    	w++;
	    }
	    
		
		
	
		
		
		/*int c = 0;
		while (c < bea) {        //0<6
		 	if (bb[1][c].equals("vip")) {         //bb�� 2��° �迭�� 0~6 �ݺ� gold,vip,guest,gold,vip,vip,guest �ݺ�=> vip ������ ������
				System.out.printf("%s ", bb[0][c]);     //bb ���� vip �� 0��°�迭�� �̸��� ���
			      }
			 c++;                                  // 0.1.2.3.4.5.6 =7��
                  	}*/ 
         


   }
}
