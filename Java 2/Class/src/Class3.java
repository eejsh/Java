
public class Class3 {

	public static void main(String[] args) { 
         //�ڷ��� [��������]	    ��ȯ     .. �ڹٿ��� �ڷ������� ���̳� �ٸ������� ������������ ���� ����.     *�������ڹپ�� / [������] ������� ������..*
        // double -> int�� ��ȯ	
		double a = 137.5; 
	    int b = (int)a;       // ������ ����� ���� a���� int�� ��ȯ��Ŵ

	    //double->int�� ��ȯ   
	    int c = 35 ;
	    double d =(double)c;       // int c=35�� double 35.0���� ��ȯ��Ŵ             
	    		
	    System.out.println(d);
		
	    //string ->int            
	    String x = "35";
	    String x2 = "156";
	      int z = Integer.parseInt(x);    // ���ڿ��� ���ڷ� �ٷ� ��ȯ��Ŵ  / parseInt = int���� ����ϴ� ������� ���.  
	   // int z = Integer.valueOf(x);       //�Լ��� ���ļ� ��ȯ.  valueof(�޼ҵ�(�޼ҵ��Լ�))->parseint  =  /return integer.valueof(parseint(s,10) ;
	      //valueof Ŭ���� �޼ҵ�(�޼ҵ��Լ�) -> parseInt
	    
	      int total = Integer.parseInt(x) + Integer.parseInt(x2);
	      
	   // ���ڿ��� ���ڷ� ��ȯ�Ͽ� �������� ó����
	      System.out.println(total);
	    
           //Long ���� Long.parseLong ���.
	       String j = "923456789";
           String j2 = "9234567892";
           
          // int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
           long total2 = Long.parseLong(j) + Long.parseLong(j2); //int�� ������ �Ѿ�� long ����.. Long.parselong
        	 	   
        	double total3 = (double)total2;
        	
           System.out.println(total2);
	    
           System.out.println(total3);
	    
           
            //����(char) ''-> ����(String)    :   �⺻ ���ĸ� ����.
           char p = 'M';     //char ���� ''���.
           
           String f = String.valueOf(p);         //�����̱� ������ parse �ʿ����.  ex / if������ ó���ؼ�..m->����.. �߾���������.
           
           
           System.out.println(f);
               
	    
	  
	    
	}

}
