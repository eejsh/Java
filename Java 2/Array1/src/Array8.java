import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {

		/* �����迭 ������ ���� �� �Ҵ�. int a[] = new int [2]; a[1] = 32; a[0] = 22;*/

		/*�����迭 ������ ����� ���Ѵ�� int b [] = {1,2,3,4} ; int[] c = {1,2,3,4} ; int[] d = new
		 * int [] {1,2,3,4}; */

		/* 2�� �迭 [] [] �ΰ� .. */

		String member2[][] = new String[3][3]; // �����迭. [3][3] ������ �Ҵ��س�.
		String member[][] = { { "ȫ�浿", "������", "������" },   // [0=ȫ�浿][1=������][2=������]
				                { "25", "31", "22" } };     // [ 0=25 ] [ 1=31 ][ 2=22 ]

		int ea = member.length; // �迭������ � �ִ����� Ȯ���ϴ� �Լ� ȫ�浿.������.������ , 25.31.22 = 2��
		int data_ea = member[0].length; // �ش� �迭���� �����Ͱ�ü�� ��ִ��� Ȯ��. [0]�� �迭���� =3�� ȫ�浿. ������. ������ = 3���� ������
		System.out.println(data_ea);

		// System.out.println(member[1][2]); = 22

		int f, ff;
		for (f = 0; f < ea; f++) {        // ū �ݺ����� �迭 ������ŭ loop = 2�� 
			// System.out.println(Arrays.toString(member[f]));
			for (ff = 0; ff < data_ea; ff++) { //���� �ݺ����� �迭�� �ִ� ������ ���� ��ŭ loop = 3��
				System.out.println(member[f][ff]);
			}
		}
		
		int[][] datas = {
				{1,3,5}	,
				{2,4,6}
		};
		
		
		int fea = datas.length;         //�迭 ��ִ���?
		int dea = datas[0].length;      //������ ��� �ִ���?
		int total = 0;
		
		int w, ww;
		for(w=0; w<fea; w++) {
			//System.out.println(Arrays.toString(datas[w])); 
			for(ww=0; ww<dea; ww++) {
				total += datas[w][ww];
				//System.out.println(datas[w][ww]);
	
			}
		}
		System.out.println("�� �հ�� "+ total + "�Դϴ�");
		
		
		
		/*���빮��
		 * �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���Ͻÿ�.  if�� 
		 * 1�� ������ : 11, 42, 22, 16
		 * 2�� ������ : 7, 33, 10, 29
		 * �� ������� 90
		 *  */
		
		int [][] aa = {
				{11,42,22,16} , {7,33,10,29}	
		};
	
        int aa1 = aa.length;   //2��
        int aa2 = aa[0].length; // 4��
        
      //  System.out.println(aa1);
      //  System.out.println(aa2);
		
		
		int e, ee;
		int total2 = 0;
				
		
	 	for(e=0; e<aa1; e++ ) {
	 		//System.out.println(Arrays.toString(aa[e]));
	 		for(ee=0; ee<aa2 ; ee++) {
	 			//System.out.println(aa[e][ee]);
	               if(aa[e][ee] %2==0) {     //||�� �ٸ� ������ ������ ���..�� 
	            	 total2 += aa[e][ee];
	            	 }
	    	}
	 			
	 	}
		System.out.println("�� �հ�� "+ total2 +" �Դϴ�.");
//		
		 int z = 0; 
		 int total3 = 0;
		 
		
		 while(z<aa1) {
			 
			int zz = 0;
			 while(zz<aa2) {
				 if(aa[z][zz] %2==0) {                               //||�� �ٸ� ������ ������ ���..�� 
            
				total3 += aa[z][zz]; 
				}zz++;
							 } z++;
	
		 }
			 System.out.println(total3);
		
			 
			 
			 
			 
   		int ws = 0 ;
   		int to = 0;
   		while(ws < aa.length) {
   			
   			
   			int wz = 0;
   			while(wz < aa[ws].length) {
   				if (aa[ws][wz]%2 ==0)
   					to += aa[ws][wz] ; 
   			}
   			wz++;
   		     	} ws++;
		System.out.println(to);
		
		
		

	 }

}
