import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

	    /*3.4, 1.6, 4.2, 5.3, 4.7 .. 24.0 ,11.5, 11.0       �Ҽ����� ������ int ���� ������..  
	     * { 5,10, 15, 20, 30}	     */
	
		int data[] = {5,10,15,20,25,30,35} ;
		/*
		 * for~each ���� ��� �Ҷ��� �ε��� ��ȣ�� �ʿ� ���� ����� ���� for each���.
		 * for, while, do~while���� ��� �� ���� �ε��� ��ȣ�� �ʿ��Ҷ� ���.
		 * [0][1][2] .... : �ε��� ��ȣ   */ 
	    for(int f : data) {         //int F �� ���������� data �迭���� �޾Ƽ� �����ŵ�ϴ�. ������
	    	 if(f %2 == 0) {  // f �� 0���� �������� �ֵ��� ǥ�����ּ���.	    	
	    //	System.out.println(f);}
		      }
	    }
		 
	/* String pay[] = {"�������Ա�", "�ſ�ī��", "�޴���", "��ǰ��", "����"};   //���� ���ù迭
	   Scanner sc = new Scanner(System.in);
	   System.out.println("�����ϰ��� �ϴ� ���¸� ������ �ּ���.");
	
	   String pm = sc.next();
	   
	   for(String z : pay ) {      // �迭 �����Ͱ� �����̹Ƿ� �������� ���� �������� ����ؾ� �մϴ�.
		   //pay �迭 ������ ��� ������... �Ϲ� �ݺ����� string�� ������ for~each�������� string ��밡��
	       if(pm.equals(z)) {
	      //	   System.out.println(pm+" ���� ���� ���� �˴ϴ�.");
	    	   if(z.equals("�޴���")) {
	    		   System.out.println("���� �ý��� �������� �ش� ������ ��� �Ͻ� �� �����ϴ�.");
	    	  }
	    	   else {
	    		   System.out.println(pm+" ���� ���� ���� �˴ϴ�.");
	          }
  	       }
	  }
	  
	 sc.close(); */
	    /* ���빮��
	     * 
	     * �ֹ�����. 
	     * �ܹ��� �ĵ� �� ������ ��, ġŲ ���� �� .. 
	     * ���� -> �ܹ���, ġŲ
	     * {"�ܹ���", "����", "ġŲ", "Ŀ��"}
	     * "Q. �ֹ��ϰ��� �ϴ� ������ ������ �ּ���."
	     * �ش� ������ �� 4���� ����� �˴ϴ�.
	     * ��, "�ֹ�����"��� ����ڰ� �Է½�,�� ��� �ֹ��� ����Ǹ�, �ֹ� ������ ����Ͻø� �˴ϴ�.*/
	
	  String food [] = {"�ܹ���","����","ġŲ","Ŀ��"};
	  
	  Scanner user = new Scanner(System.in);
	  
	  String cho   ;
	  
	  for(String a : food) {	
		  System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
		  user.next();
         	  if(user.equals(a)) {
         	  
         	  
         	     if(user.equals("�ֹ�����")) {
         	       	System.out.println("�ֹ��������");
         	    	 break;
         	    }
         	  
         	  }
        
       }
	  
		  
	  
       
     
 
	    }
	
}

