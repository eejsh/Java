public class Example5 {

	public static void main(String[] args) {

		/*
		 * extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��Ͻÿ�. ���� �ΰ��� �Է��մϴ�. �ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ�մϴ�.
		 * ù��° ���ڰ� �ι�° ���ں��� Ŭ ��� 2 > 1 ù��° ���ں��� �ι��� ���ڰ� Ŭ ��� 1 < 2 ù��° ���ڰ� �ι��� ���ڶ� ���� ���
		 * 2=2
		 * 
		 * ù���� ���ڰ� ���� ��� : �ش� �ΰ��� ���� ��ģ ����� ��� �ι�° ���ڰ� ���� ��� : �ش� ���� ��ŭ ���ڸ� ��� ���� ��� ����
		 * ��� ù��°�� �ι�°���ڰ� ���� ��� : �ش簪�� �����ϴ�. ��� �޼��� ���
		 */


		int a = 5;
		int b = 6;

		exam2 ex = new exam2();
		ex.exam1_method(a, b);

		int result = ex.exam2_method();
		System.out.println("��������� : " + result);
        System.exit(0);
	}

}

class exam1 {
	protected int ex_sum=0;
    private int no1;
    private int no2;
	
	public void exam1_method(int ex1no, int ex2no) {

		this.no1=ex1no;
		this.no2=ex2no;
		
		if (ex1no > ex2no) {
			this.ex_sum = ex1no + ex2no;
		}

		else if (ex1no < ex1no) {
              exam2_loop();
	
		} else {
			System.out.println("�ش簪�� �����ϴ�.");
			System.exit(0);
		}

	}
	
	public void exam2_loop(){
          int w =   this.no1;
           while(w<this.no2) {
        	   this.ex_sum += w; 
        	w++;
           }
	}
	
}

class exam2 extends exam1 {

	public int exam2_method(){

		return this.ex_sum;
	}
	
}
