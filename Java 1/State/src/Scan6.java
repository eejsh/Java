import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		//�ΰ��� �� �Է�...
		//alt Ű ������ ����Ű ��� �� �ٺ��� ����..
		
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");
	
		String m = mid.next( ) ; //����ڰ� ���̵� �Է�
		
				
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		
		String p = mpass.next() ; //����ڰ� �н����� �Է�
		
		
	 //   System.out.printf(  "���̵�:%s, �н�����:%s ", m, p );	
		
	    
	    /*[�α��� ���α׷�]
	     * ȸ������ ���̵��  jung, su
	     * �н�����
	     * jung : j1234
	     * su : ssh
	     * �ش� ���̵� �ܿ� �������� "���Ե��� ���� ����� �Դϴ�." ��� ��� �մϴ�.
	     * ���� �н����尡 Ʋ����� ȸ�������� �ٽ� Ȯ���ϼ���.
	     * ���̵� �� �н����尡 ��� ���� ��� " �α��� �Ǽ̽��ϴ�." ��� ���
	     * */
	
		
		/*
	 String nn1 = "jung";
     String nn2 = "su";
     
     String pw1 = "j1234";
     String pw2 = "ssh" ;
    
     if(m.equals(nn1) && p.equals(pw1)) {
    	 if(m.equals(nn2) && p.equals(pw2)){
    		 System.out.println("�α��� �Ǽ̽��ϴ�.");
    	 }
    	 else if (nn1 )
    	 
    	 }
     
     
     */
   
		
		
		
		
     
		
		   //scanner ���� equals �Լ����
     if (m.equals("jung")  ||  p.equals("su" ))  {
	       if (m.equals("jung") &&  p.equals("j1234") )  {
	       System.out.println("�α��� �Ǽ̽��ϴ�.") ;
		    } 
	       else if  ( m.equals("su") && p.equals("ssh")) {
	
		System.out.println("ȸ�������� �ٽ� Ȯ�� �� �ּ���"); 
		}

	else {
		System.out.println("���Ե��� ���� ������Դϴ�.") ;
	}
     } 
		
     
       mid.close();
	 mpass.close();
	
	}
	
	}
     
