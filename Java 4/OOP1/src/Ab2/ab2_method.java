package Ab2; 
import Ab.method_1;  // package Ab���� main class�� �ε���.

public class ab2_method {
	public static void main(String[] args) {
         //@Override  main class�� Ab-method1 �� �������̵� ��.

		Ab.method_1 at = new Ab.method_1();        // ab�� �ִ� method_1�� ��������. ������ class�� public�� �־�߸� ������ �� ����.
//		at.recall();                //public �޼ҵ� ����
//		at.name();                  // protected �޼ҵ� ����.
		at.main(args);              // main �޼ҵ� ����       --Ab-method1 main�� �� ����ͼ� ���.
		
		//private�� �������. [����ȭ]
		
		
		
		
	}

}
