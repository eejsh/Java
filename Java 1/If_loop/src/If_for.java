
public class If_for {

	public static void main(String[] args) {
	 final int a = 1;  // final �� ���� ���� ���� ����� �����.
	 /*����� ���� ������ �ʴ� ���� ����. (���밪)*/
	 final String name = "ȫ�浿";  // ���ڿ� ���밪
	 System.out.println(name);
	 System.out.println(a);
		
	 final int ct = 5;  // ���밪 . ������         ex ���̵�
	 int f;              //   �ݺ���
	 boolean ok = false; // ct=55 -> ok ���    // ���ǿ� ���� true or false �� ����. 
	 for (f=1;f<=10;f++) {  //1~10���� �ݺ� if(f==ct)�� ���ڰ� ������ if(ok==false)�� �Ѿ�� ���
	     if (f==ct) {         // �ݺ��� ���� �������� ���� ��� 
	    	 System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
	         ok = true;        // int ������ ���ǿ� �´� ���ڰ� ������ boolean ���� false�� true�� ����Ǿ� ��ϵ� ����Ȯ�ε��ϴ� ���.
	         // ���ǿ� ���� ���� ����
	     }
	                           //else ����ϸ� ���� true ���� �ٽú���ǹǷ� 2���� ������ ���� ��� if�� �߰�.	 
	 }
 
                                  //for�� ����	 
	 if (ok == false) {     
		 // ���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ�.
			System.out.println("Ȯ���� ���� ���� �����Դϴ�.");
			
		}

		/*�� 20���� ���� �ݺ��մϴ�. ���� Ȧ�� ���� ����մϴ�.*/ 
		
	 int ff ;
	 String odd="" ;          //odd Ȧ��, even ¦��
	 
	 for(ff=1;ff<=20;ff++) {
		 if(ff%2!=1) {    // ������ ������ �Ͽ� ���� ���� 1 �̸� Ȧ��, 0�̸� ¦��
			 System.out.print(ff+" ");
			 
		 }
	 
		 else {
			  // ���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
			odd +=ff+" " ; // ff + " " + odd ;   //�߰� �� ��� " " �� ������ Ȱ�� �Ͽ� ������.
	 }
	 }
	 System.out.print(odd);
	
	     
		
	}

}
