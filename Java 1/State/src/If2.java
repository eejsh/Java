
public class If2 {

	public static void main(String[] args) {

		
		String mid1 = "hong" ;
		String mid2 = "kim" ;
		String mpass = "a123456" ; 
		
		
		
		// password�� ���ڷ� �ν�.
				
	   /* String mid1, mi2 ;
		mid1 ="hong";
		mid2 ="kim";  */
		
		/* �ش� ���ǹ��� ���ڷ� Ȯ���ϴ� �������� �̸�, else���� �����ϴ� �ι� */

		
		if ( mid1=="hong") {
	    System.out.println("ȯ���մϴ�.");
		}

		else if (mid1 == "park") // �߰��� �񱳴���� ���� ���

			System.out.println("ȯ���մϴ�.");
			
	    else {
	    	System.out.println("���Ե��� ���� ����� �Դϴ�.");
	    }
		
		
		/*���̵�. �н����带 ��� �����ϴ� ���� ����*/
  
		
		if(mid2=="kim") {  //ū if��
			 if(mpass=="a123456") {  //���� if��
				
				 System.out.println("�α��� �ϼ̽��ϴ�.");}
			 
			 else { System.out.println("�н����尡 Ʋ���ϴ�."); }   
			 }
		
		
		else {System.out.println("���Ե��� ���� ������Դϴ�."); 	}

		
		
		
		
		
	}

}
