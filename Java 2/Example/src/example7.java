import java.util.Arrays;

public class example7 {

	public static void main(String[] args) {
	
			
		/* ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 * [data]
		 * ["ȫ�浿" , "�հ�"]
		 * ["�̼���" , "�հ�"]
		 * ["������" , "���հ�"]
		 * ["������" , "�հ�"]
		 * ["������" , "���հ�"]
		 * ["�庸��" , "���հ�"]
		 * ������ �迭 �����̸�, �ش� �� �� �հ��ڸ� ��µǵ��� �մϴ�.
		 * ��, �迭���� �ܺ� class �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 * ��� : ȫ�浿 �̼��� ������  */
		
        name.abc1(); //class��_�޼ҵ常�������.
        
		//name n = new name();
		//n.name();       --�޸� ž��
		
        
        
        
        
        
	}

}

class name{
	
	public static void abc1() {
		
	String aa [][] = { {"ȫ�浿", "�հ�"},
			           {"�̼���", "�հ�"}, 
			           {"������", "���հ�"},
			           {"������", "�հ�"},
			           {"������", "�հ�"},
			           {"�庸��", "���հ�"}};
	
	
	int ea = aa.length;  //6
	
	int a ;
	
	for(a=0; a<ea; a++) {
		if(aa[a][1].equals("�հ�")) { 
	  //	System.out.println(aa[a][0]); 
		
	 	System.out.printf("%s�� %s �Դϴ�." + aa[a][0],aa[a][1]);
		
		}
 	}
	
	
		
			
			
		
		
		
		
		

	
	}
	
}