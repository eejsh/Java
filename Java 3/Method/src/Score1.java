import java.util.Scanner;
public class Score1 {
	
	static String [] msg = {"�˻��� ������ �л����� �Է��� �ּ���.", "�˻��� ������� �Է��ϼ���?[��ü,����,����,����,����]" }; //�޼��� ��� ���� static ��빫��..
	//gtdata() : return �޼ҵ�
	public static void main(String[] args) {
	//����� ���� �Է� �� ������� ���

		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
 	    System.out.println(msg[0]);
		String name = text.next();   // �̸��� ������ üũ�ؾߵ�.
	    sc.stdata(name, null);      //Score2�� �޼ҵ�� ����� �� ��������
	   
	    String check = sc.gtdata();        // return ���� string���� �޾����Ƿ� string���� �޾ƾߵ�.
	
	    
	    
	    if(check.equals("true")) {      // ���ڷ� ���±⶧���� ���ڷ�
	    	//check==true (boolean ���� ���)
	    	System.out.println(msg[1]);
              // �˻��� �����Ϳ� �̸��� ���� ��, 
	         String subject = text.next();   //�����Է�
	         sc.stdata(name,subject);  //->�̸�, ����� ���� ������
	                           //          System.out.println(sc.gtdata());//���Ȯ��
	    	
	         String score = sc.gtdata();

	         if(subject.equals("��ü")) {
	    		
	        	String score2[] = score.split(",");   //�迭�����
	            System.out.printf("���������� : ���� %S��, ���� %s��, ���� %s��, ���� %s��",score2[0],score2[1],score2[2],score2[3]);
	        		}
	    	else {
	    			System.out.println("����������: " + subject + " " + score + "��");
	         	}
	    }
	    
	    else {
	    	System.out.println("�ش� ����ڴ� �������� �ʽ��ϴ�.");
	        System.exit(0);           // 0 : ��������, 1 :����������
	    }	    
	    text.close();
	    System.gc();
	    
		
		
	

	}

}
