import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		/*���빮��
		 * 
		 * ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * 1~5 ���� ���ڸ� �Է��� �ֽñ� �ٶ��ϴ�.    ->scanner ���
		 * [�������]
		 * 1 : 5% ��������
		 * 2 : 10% ��������
		 * 3 ~ 4 : �ù�� ����
		 * 5 : ������ȸ��.........
		 * */
		
		
		int user;

    		System.out.println("1~5������ ���ڸ� �ϳ� �Է��� �ּ���.");
		 Scanner sc = new Scanner(System.in);
		 
		 user = sc.nextInt();           //���ڷ� ������� user.next();
		 String msg;
		 
		 switch(user){                 // switch(a)  case "1"  <���ڷ� �޾ƾߵ�. 
			 case 1 :
				 msg = "5% ��������";
			//	 System.out.println("5% ��������");
				 break;
			 
			 case 2 :
				 msg = "10% ��������";
				// System.out.println("10% ��������");
				 break;
				 
			 case 3 :
				 
			 case 4 :
				 msg = "�ù�� ����";
				 //System. out.println("�ù�� ����");
				 break;
				 
			 case 5 :
			 default:
				 msg = "���� ��ȸ��";
				 //    System.out.println("���� ��ȸ��..");
				break; 
			 
		 }   		 System.out.println(msg);
		
		 // switch version ����           �ڹ� ���� 14 �̻���� ����. �ڹ�8����� �ؿ� �ڵ� �ȵ�
		 
        /*  switch (user) {
          //-> �� break ���� Ȱ��.
          case 1 -> {      
        	  msg ="5% ��������";
          }
          case 2 ->{
        	  msg ="10%��������";
          }
          case 3, 4 ->{
        	  msg = "�ù�� ����";
          }
          default ->{
        	  msg ="������ȸ��";
          }
          }
          System.out.println(msg);		 */
        
        sc.close();
        
		 
	}

}
