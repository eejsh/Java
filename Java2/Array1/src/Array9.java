import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		/*���빮�� 
		 * 2���� ������ �迭�� �ֽ��ϴ�. �ش� ������ �迭�� ���� ���ó�� ���� ����Ͻÿ�.
		 * ����ݺ����� �����ص��ǰ� ����ص��ǰ�..............
		 * for~dowhile~~
		 * 
		 * 1�� data : ���ѹα� , �Ϻ� , �߱� , ��Ʈ�� , �±�
		 * 2�� data :    40  , 35  , 70 ,  55  ,  32 
		 * ��� data 
		 * [ "���ѹα�(40)", "�Ϻ�(35)", "�߱�(70)", "��Ʈ��(55)", "�±�(32)"
		 * 
		 * */

		
//		String d1 = "���ѹα�";
//		int d2 = "40";
//		String d3 = (d1+ "(" + d2 + ")" );
//				
//	    
//		String data [][]  = {
//				{"���ѹα�", "�Ϻ�","�߱�", "��Ʈ��", "�±�" },
//				{"40", "35", "70", "55", "32" }				
//					};
	///�迭 array�� �ΰ��� ��ġ���� = �ش�Ǵ� ������ŭ�� ������ �ε�..�ݺ��� 1��.
		// array�� �ΰ�=�ΰ��� �ݺ��� 2��
		
		//String newdata = new String[data[0].length];
        //String newdata = new String[5];
		
		
//		int ar = data.length;
//		int ar2 = data[0].length;   //��ü�� ��
//		String newdata[] = new String[ar2];
//
//		int ww=0;
//		
//		do {
//				
//				//	System.out.println(data[w][0]);
//
//				newdata[ww] = data[0][ww] + "(" + data[1][ww] +")" ;
//				ww++;
//				
//			}while(ww<ar2);
//			
//			
//		
//		System.out.println(Arrays.toString(newdata));
//		
		
		
		
		
		/*�ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�.
		 * �� �迭���� �ε��������� ��ȣ�� ���ؼ� ¦��,Ȧ�������� �迭 ��� �����ͷ� �缳�� �Ͻʽÿ�.
		 * Adata = 5 17 19 22 33 
		 * Bdata = 1  2  3  4  5
		  Result = ["¦��","Ȧ��","Ȧ��","¦��","¦��"]
		 * 
		 * */
		
	/*	int [][] aaa = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		
		int f1 = aaa.length;             
		int f2 = aaa[0].length;          
		int newaaa[] = new int[f2];
		
		int h ;
		int total3 = 0;
		
		
		for(h=0; h<f2; h++) {
			newaaa[h]= aaa[0][h]+ aaa[1][h];
	        
	            if(newaaa[0] 2%==0 ) 
			      
			 
			 {
				 
			 }
		
		}
		
		System.out.println(Arrays.toString(newaaa)); */
		
		int A1[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5} 
				};
		
        int data_ea = A1[0].length;         
        int f = 0;                           
        int total;
        String Result;
        String Result_data[] = new String[data_ea];
        
        
        while(f < data_ea) { 
        	
        	total = A1[0][f] + A1[1][f] ;
        	if(total %2==0) {
        		Result = "¦��"; 
        				
        	}
        	else {
        		Result = "Ȧ��";
        	}
        	Result_data[f] = Result;
        	
        	f++;
        }
		System.out.println(Arrays.toString(Result_data));
		
		
		
		
		

	}

}
