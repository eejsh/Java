import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {

		/*
		 * ���빮�� 10�� ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�. ���� �׸��� ��ü 3���� �̸�, ��� true �� ����ǿ��߸� ����
		 * ���μ����� ����˴ϴ�.
		 * 
		 * ����ڿ��� ���� �Ǵ� ������ ������ �����ϴ�. "���� �׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ��� ������(1), ���Ǿ��� (2) ///
		 * ���� �׸� �� �Ѱ����� �������� ���� ��� "��� �����ϼž߸� ����˴ϴ�." ��� ����մϴ�. ��� ���� �Ͽ��� ���
		 * "ȸ�������� �Ϸ� �Ǿ����ϴ�. ��� ����մϴ�.
		 */

	
		Scanner sc = new Scanner(System.in);

        int user; // ���� �Է°�
		int a = 1; // �ݺ�
       	user = sc.nextInt();

	
         do {
			if (user != 2);
		      	{     break;
			      }
			
			else {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			}
		 	
			a++;
		} while (a<3);

         System.out.println();
         
         
		// System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
 
		
	/* int w = 1;
	 int agree ;
	 boolean all_agree = false ;  // ó���� �� ���Ǿȵ������Ƿ� �⺻�� false�� 
	 
	 do {
		 System.out.println("�����׸� �����Ͻðڽ��ϰ�? ������-1, ���Ǿ���-2");
	      agree = sc.nextInt();
	      
	      if(agree==1) {
	    	  all_agree = true;
	      }
	      else {
	    	  all_agree = false;
	    	  break;
	      }
		 w++;
	 }while(w<=3);
		
     if(all_agree==false) {
     System.out.println("��� �����ϼž� ����˴ϴ�.");
      }
     else {
   	 System.out.println("ȸ�������� �Ǿ����ϴ�.");
      }
	 
	 
     sc.close();*/
     
	}

}
