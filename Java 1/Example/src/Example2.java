import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		/*  ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, ������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
		 *  "�����ܿ� ���� ���ڸ� �Է��ϼ���" ��� �޼����� ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���Ͽ�,
		 *  ���Ѱ��� ���� ¦�� ���� Ȧ�� ������ ����Ͻø� �˴ϴ�.
		 *  ��, �ش� �ݺ����� for~ do while �� �� �Ѱ����� �����Ͽ� �ۼ��Ͻÿ�.
		 *  (�հ�)
		 *  ��.�ݺ��� �ȿ� ������ �ȵ�. �ݺ����ȿ� ���ǹ��� ������ �ȵ˴ϴ�...........
		 *  */
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���");
		int gu = sc.nextInt() ;
		
		int a = 1;    //����	
		int to =0 ;

	    do {  
		  
	    	// to = gu ;	
	    	
	       to += (gu * a) ;                
		      a++; 
		      
	     }while(a<=9) ;
	    if (to %2 == 0) {
	    	System.out.println("¦�� �Դϴ�. " ) ;
	    	}
	    
	    else  {
	      System.out.println("Ȧ�� �Դϴ�. ");
	    }
	    
	    
	  sc.close(); */
	
		//Ǯ��
	  
	  Scanner sc1 = new Scanner(System.in);
	  String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���";
	  String msg2 ;        // �޼��� ����
	  System.out.println(msg);
	  int user = sc1.nextInt();
	  int f = 1;
	  int total = 0 ;  // ���� �� �ʱⰪ�� 0�̿��� �ǰ�, ���ϱ��� ��� 1�̿���
	 
	  do {
	//	  total = total + (user * f); // total += user + f;
		  f++;
		  
	  }while (f < 10) ;
 	  //  System.out.println(total);
	 
 	  if (total % 2 ==0 ) {
		  msg2 = "¦��" ;
	  }
	  else {
		  msg2 ="Ȧ��" ;
	  }
       System.out.println("������� " + msg2 + " �Դϴ�.");
       
       sc1.close();
       
	}
	

}

