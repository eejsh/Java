
public class It {

	public static void main(String[] args) {
		
		
		byte a = 100;
		byte b = 100;
		
		//���ǹ� (if-else)
		
		if(a > b) //if��(if-else)
		{  		
		System.out.println("a���� �� Ů�ϴ�.");
		}
				
		else if // else if ��
		(a < b) {	
		System.out.println("b���� �� Ů�ϴ�.");	
		}
		
		else 	//else �� 
		{
			System.out.println("�� ���� �����ϴ�.");
		}
	
		
		//else ���� ���� ���
		if(a < b) 
		{ System.out.println("a���� �� Ů�ϴ�.");	}
		else if (a < b)
		{ System.out.println("b���� �� Ů�ϴ�."); }
		else if (a == b) 
		{	System.out.println("�� ���� �����ϴ�.");}
		
		// �ε�ȣ ��ȣ : <, >, <=, >=, == 
		
		//ex if�� 3�� �ߺ��ǹǷ� ��� ��������..
			if (a < b) { System.out.println("a���� �� Ů�ϴ�.");	}
			if (a > b) 		{ System.out.println("b���� �� Ů�ϴ�."); }
			if (a==b) {	System.out.println("�� ���� �����ϴ�.");}
		
		
	}

}
