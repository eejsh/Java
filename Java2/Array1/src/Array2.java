
public class Array2 {

	public static void main(String[] args) {
		
		/*hong, kim, park, lee, jang, jung
		 
		 * */

		
		
		
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};		
		System.out.println(id[1]);
		//int word = id[1].length();  // �ܾ� ���� �ľ��Ҵ뵵 length ���.
		//System.out.println(word);
		
		/*���빮�� : �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� ��簪 �� ����� ���̵� 3�ܾ� �̻� ����Ͻÿ�. */
		
		int member = id.length;		  // ��ü ȸ������ �ľ��ϱ� ����.
        int w=0;
        int word;                    // ������ �迭 �������� ���� ���� �ľ�
        while(w<member) {
            word = id[w].length();  //���̵� �� �ܾ� ������ �ľ��ϼ���.
        	if(word>3) {            // ���� �ȿ� 3���� �̻�(������= 3�ܾ� ������, 4�ܾ����)���̵� �̾��ּ���.
            	System.out.println(id[w]);
            }
        	w++;
        }
		
		
		/*���빮��
		 * �迭 �����ʹ� ������ �����ϴ�.
		 * 15 60 11 14 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�. */
        		
	   int no[] = {15,60,11,14,27};
	   int nb = no.length;  //�迭�ȿ� �ִ� �������� ������ �ľ��ϱ�. �� 5���� ���ڰ� �ֽ��ϴ�.
	   int ww=0;      //�ݺ����� �� ����
	   int to1=0;    //�������� 0�� �⺻���� ���ߵ�.
	   
	   while(ww<nb) {         //0~ nb(5ȸ)
		   to1 += no[ww];  // to = to + ww
		   System.out.println(to1);
		   ww++;
	   }
	   
	   
	   /*
	    * int nb = no.length = �迭 ������ ������ �ľ��մϴ�. = ��5���� ����������.
	    * while ����  ww (0) < nb (5) ȸ �ݺ��մϴ�.
	    * total ���� no(�迭���� 1~5�� �� 15, 60, 11, 14, 27�� ���ڰ� �ѹ��ĵ�����) 
	    *           ww�� �� ����Ƚ���� ���ϴ�. (15+0)+(60+0)+(11+0)+(14+0)+(27+0)
	              total ������ 15+60+11+14+27 = 127�� ���ȴϴ�.
	    */
	   
	   int date[] = {15,60,11,14,27};
    //	   System.out.println(date[0]); //15�� ����  date[1]=60, date[2]=11, date[3]=14,date[4]=27
	   
	   int total = 0;          //������ �⺻��
	   int date_ea = date.length; //(-1) ���� �ݺ������� >= �ε�ȣ�� ����ϰ� ������ date_ea=date.length-1�� ���ָ�˴ϴ�. (�迭�� �⺻���� 0���� ī��Ʈ)
	   int dw = 0;   // �迭�� ���ڽ����� 0���� ������!!!!!!
	   do {
		   total += date[dw];
		   dw++;
	   }while(dw<date_ea);
	   System.out.println("�� �հ�� " + total);
	   
	   
	   
	   
        
        
		
		
	}

}

