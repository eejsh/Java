import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {

 /* [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
  * 
  * Q. ���� ���� ��ȣ�� �Է��ϼ���?
  * 
  *  ���� 220524 
  *  
  *  ����ڰ� ���� 220524 �ܿ� �Է½�  "������ȣ�� Ʋ���ϴ�" �Է�
  *  ������ ������ȣ �Է� �� "���� Ȯ�εǼ̽��ϴ�" ��� ����մϴ�.
  *  
  *   �� 220524�� java ���� �� ���� ���� ����Ǵ� ������ ó���ϼ���. 
  * */
		
		int sc = 220524 ;   // ������ȣ�� ���´ٰ� ���� �Ͽ�..
		/*
		Scanner n1 = new Scanner(System.in) ; 
		System.out.println("Q . �������� ��ȣ�� �Է��ϼ���?");
		 int n2 =  n1.nextInt() ;                     //�����  ���� �Է�

		 if ( n2 == sc ) {
			System.out.println("���� Ȯ�εǼ̽��ϴ�.");
		}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		} 
	
	n1.close();   // scanner �ݱ�.. [ ��ĳ�ʺ�����.close() ;   ]
	
	*/
	
		
		Scanner h = new Scanner(System.in) ;   // ��ĳ�ʸ� ���Ӱ� ����. system in ���� ���� h���� �ذڴٰ� �Ҵ���
		System.out.println("������ȣ�� �Է��ϼ���");

		int uesr1 = h.nextInt() ; 
		if (uesr1==sc ) {
			System.out.println("���� Ȯ�� �Ǽ̽��ϴ�.");
		}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
			
		
		}
		h.close();
		
		
		
		/* [ Scanner ���ǻ��� ]
		 *  Scanner �� import ���
		 *  ������� (����ڰ� � ���� �Է��ϴ����� ���� ����)
		 *  �ش� ����ڰ� �Է��� ���� �޴� ������ ����
		 *  

		 *  [���빮��]
		 * 
		 *  ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
		 *  ù��° ���� ���� �Է��ϼ���?
		 *  �ι�° ���� ���� �Է��ϼ���?
		 *  
		 *  ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����Ͻʽÿ�.
		 *  
		 *  ��, �ش� ������� 100 ���� �� ��� ��� �޼�����  "�ش� 100������ ����� �Դϴ�." ��� �����Ͻð�
		 *  100 �̻��� ��� "�ش� ���� 100 �̻� ����� �Դϴ�." ��� ����մϴ�.
		 *  
		 *  
		 * */
		

		Scanner n1 = new Scanner(System.in) ; 
		System.out.println("ù��° ���ڰ��� �Է��ϼ���");
		int B1 = n1.nextInt() ; // ���� �Է� 
		
		Scanner n2 = new Scanner(System.in) ;
	    System.out.println("�ι�° ���ڰ��� �Է��ϼ���");

	    int B2 = n2.nextInt() ;
	    
        if ( B1*B2 < 100 ) {
        	System.out.println("�ش� ���� 100 ������ ����� �Դϴ�.");
        }
        else if (B1*B2 > 100){
        	System.out.println("�ش� ���� 100 �̻��� ����� �Դϴ�.");
        } 
        


		n1.close() ; // ��ĳ��1����
		n2.close() ; // ��ĳ��2����
		
	}

}
