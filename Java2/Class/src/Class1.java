
public class Class1 {

	public static void main(String[] args) {  // �Ϲ� main �Լ�
		
          Adata a = new Adata();   //Adata Class���� �ε� 
          Bdata b = new Bdata();   //Bdata Class ���� �ε� 
          
          
          System.out.println(a.aa);    //Adata class�ȿ� aa��� ���� �ڷ��� ��ü���� ������.
          //�ش�Ǵ� class�� �ε�, Ŭ���� �ȿ� ������   -aŬ���� �ȿ� aa ������
		  System.out.println(b.aa);    //Bdata class�ȿ� bb��� ���� �ڷ��� ��ü���� ������.
		  // b Ŭ���� �ȿ� aa ������ . �ٸ��� �� 
		
		  
		  Cdata c = new Cdata();
		 /* Cdata �ȿ� ���� �ڷ����� ������ => ���� �⺻�Լ����� ���� �Է��� �� ��ü ���� �޾� ��������� ����� = (�ν��Ͻ�����)	 
		  * 
		  * 
		  * */
		  
		  c.aa = 10;
		  c.bb = 30;
		  c.cc = c.aa+c.bb;
		  
		  System.out.println(c.cc);
		 // System.out.println(c.cc);
		  
		  
		  
		
	}

}


//aa�� ������ �ٸ� Ŭ������ �ֱ� ������ ���� �ߺ����� �ʽ��ϴ�.
class Adata{
      String aa ="ȫ�浿";

}

class Bdata{
	String aa ="�̼���";
	
}


class Cdata{         
	
	//�ش� Cdata �� �ִ� Ŭ�������� �ڷ����� ���� ������ ���� �մϴ�.
	//��, ��� ������ �Լ��� ���� ��Ȳ������ ���� �Ǵ� sysout�� ������� ���մϴ�.

	
	int aa;  
	int bb;
	int cc;
//	int cc = aa + bb ; 
	
	
	
}
