
public class Method2 {

	public static void main(String[] args) {
		
		/* default package�� ��� �� �ش� class ���� ȣ���ϸ��.
		 ��, package�� ���� ���� ���� ���� ��ܿ� package�� �����ؾ���.
		--------------------------------------------------------
		tests ts = new tests();   -?���� package�̸� �ҷ��ͼ� ��밡��
		ts.a2++;
		System.out.println(ts.a2); */
		 
		
		Info i = new Info();
		
	//	i.data1(20);
	    i.data2(20);
	    i.data3(20);
	    System.out.println(i.data3(20));  // public int data�� �ִ� return���� �޾Ƽ� ���
	    
	   String result =  i.data4("ȫ�浿");       
	   //ȫ�浿�� data4�� �ְ�, return���� ���� �޾ƿ�.
	   //data4 �޼ҵ� return ���� result ������ �޾Ƽ� ó����.
	   System.out.println(result);
	     
	    
		
		
	}

}

class Info {
	
	/* static �Ǵ� void �޼ҵ忡�� return �̶�� ��ɾ ������� ����  */
	
	public static void data1(int abc) {
//	int z = abc + 20;
//	System.out.println(z);
		
		
		
		
	}

	public void data2(int abc) {
//		int z = abc + 20;
//		System.out.println(z);
		
		
		
		
		
	}
	
	public int data3(int abc) {      // return �Լ��� ���� (static , void���� ������)   
		//�ڷ��� �޼ҵ��� �ϸ�, ������ return ����ؾ���. System.out.println(z); ����ڰ� ������� ���մϴ�.
		
		int z = abc + 20;
        return z;
	}
	
	
	public String data4(String abc )	{
		String z = abc + "�� ȯ���մϴ�.";
		return z;
	}
	
	
	
	
	
	
	
}
