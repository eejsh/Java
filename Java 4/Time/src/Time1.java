
public class Time1 {
/* try~catch �� : ����ó�� ��� ����  */
// �۵�  ���������涧..
	public static void main(String[] args) {
		// 1~10

		int f;

		for (f = 1; f <= 10; f++) {
			try {    // ���� �߻��� �ڵ� �� ����.
				Thread.sleep(1000);  //1000 = 1��
				//Thread.sleep : �Ͻ���������
				
				System.out.println(f);
			} catch (InterruptedException e) {  
				     /*InterruptedException e  ���� �߻� ��� ó���ϱ� ���� ����. */
                     
			}
		}

	}
}
