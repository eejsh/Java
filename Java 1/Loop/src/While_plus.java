
public class While_plus {

	public static void main(String[] args) {
		// 5~10 R���� ���� �հ� ���� ����ϼ���.
		
		int w = 5;  //  �ʱⰪ. (5 ����)
		int total = 0 ; //���� ī���� . �հ�ġ�� ������Ű�� ���� ������
		while (w < 11) {      //5���� 10 ����  ���ϱ�   +=, -=, *=, /=, %=
		//   total = total + w; 
		   total += w;
		
			w++;
		}
		System.out.println("�հ� "+ total);
		
		/*3���� 8���� ���� �� �հ踦 ����Ͻÿ�..*/
		
		int w1 = 3 ;
	                           	// �հ踦 ���� �� 1 �⺻������ ����.
		int to1 = 1 ;           // ���� �� 1���� ����. ������ 1�� �߰������� 0 ���� ����. (1*0=0, 1+0=1)
		while (w1 < 9) {
			
			to1 *= w1;
			w1++;
			
		}
		System.out.println("�հ� "+to1);
		
		
		
		
		
	}

}
