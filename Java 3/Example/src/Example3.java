
public class Example3 {

	public static void main(String [] args) {
	
		inherit2 ih2 = new inherit2();
		ih2.it("ȫ�浿", "aaa5");
		ih2.print(); 
	}
	
}
class inherit1{
	
	private String nm;  // inherit1 �ش� �κп����� �۵�
	protected String pw;  //inherit1, inherit2���� ��� �۵��ǵ��� �ϸ�, �ܺο��� �ε����. (�ܺο��� ������ �������� extends, -���� class������ ��밡��.)
	//static String aa;
	public String aa;    //private���� ���� �κ��� inherit2������ ��� �� �� �ֵ��� �ϱ�����
		
	public void it(String d1, String d2) {
	 this.nm = d1;
	 this.pw = d2;
	 //aa = this.nm;         //private-> static ���� �ѹ� ��ħ.->��밡��
	 this.aa = this.nm;  //privata -> public���� ��ħ->��밡��
	 
		
		
	}
//	public String aa = nm;
	
}

class inherit2 extends inherit1{  // �ַΰ�����..
	
	public void print() {
		System.out.println(this.aa + " " + this.pw);
	
}
	
}