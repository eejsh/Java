
public class Example1 {

	public static void main(String[] args) {

		// abstract ���빮��
		
		/*1���迭 ���� �ֽ��ϴ�. �ش� �迭 ���� ��� ���� ���� ����մϴ�.
		 * �� abstract �⺻ void method �̸��� sender ������ �ֽ��ϴ�.
		 * ���� �� ����� sender���� ��� �ǵ��� �մϴ�.
		 * �迭�� abstract���� ����մϴ�.
		 * 
		 * �迭������ : 6,13,22,9,12,64,32,47,39
		 */
		load ld = new load ();
		ld.sender();
	}
}

abstract class add {

	public abstract void sender();        
    public int a [] = {6,13,22,9,12,64,32,47,39};
	public int ea = a.length;
    
}	
class load extends add {
	@Override
	public void sender() {      
		
		int f; 
		int total = 0;
		for(f=0; f<this.ea; f++) {
			total += this.a[f];
		}
		System.out.println("��: " + total);
		
	}
	
}