package Swing1;

public class Swing1 {

	public static void main(String[] args) {
		
		// wrapper class (box ����)
		// float, char, byte, long, short (�⺻Ÿ��)
		// wrapper class : Byte, Integer, Long, Double  wrapper class�� ����.
		/*�ڽ̰� �ڽ��� ���� ���� equals�� ����ؾ߸� �񱳰� �̷����.*/
	
		Integer a = new Integer (20);  // new integer -> �ڽ̻���
		int b = new Integer(20);    // int�� ���� newinteger�� �Ѱ����� int 20�� ����  -> ��ڽ� ����
	//	if(a.equals(b)) {  -> �Ѵ� new integer �ڽ̻��¸� equals�� ���ؾߵ�. 
		if(a==b) {
		
			System.out.println(a+b);
		}
		
		Integer a1 = new Integer(30);   // new integer -> �ڽ̻���
		Integer b1 = new Integer(30);   // new integer -> �ڽ̻���
	    if(a1.equals(b1)) {  //-> �Ѵ� new integer �ڽ̻��¸� equals�� ���ؾߵ�. 
		
			System.out.println(a1+b1);
		}
	    
	    Integer c = 40;
	    int d =new Integer(40);
	    System.out.println(c+d);
		
		
		Integer no = new Integer( 99);  //�ڽ� ����
	    Integer bb = no.intValue(); //��ڽ�
	    
	    System.out.println(bb);
		
	    
	    
		
	}

}
