
public class Time3 {

	public static void main(String[] args) {

		/*
		 * try { //->�޼ҵ� �ȿ� ���� �ٷ� �۵�����. System.out.println("��������"); Thread.sleep(5000);
		 * System.out.println("��������");
		 * 
		 * } catch (InterruptedException a) { System.out.println(a); }
		 */

		/*
		 * ���빮�� �ܺ� class�� �ֽ��ϴ�. ��, ����class���� �ش� �ܺ� class�� �ε��մϴ�. 8�ʵ���
		 * "ó�����Դϴ�.... ��ø� ��ٷ� �ּ���." �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻��մϴ�. 8�� ���Ŀ� return����
		 * "�Ա��� ��� ó�� �Ǿ����ϴ�" ��� ���ڸ� �޵��� �Ͻʽÿ�.
		 */
   bank b = new bank();
   b.bankmoney();
		
//		
//   ABC A = NEW ABC();
//   SYSTEM.OUT.PRINTLN(A.RUN());
   
	}

}

class bank {
	
public void bankmoney () {
	try {
	//	System.out.println("ó�����Դϴ�. ��ø� ��ٷ� �ּ���..");
		System.out.println("test1");
		int c = 10/0;
		Thread.sleep(1000);
		System.out.println("test2");
//		String kkk = this.msg();
//		System.out.println(kkk);
	}catch(InterruptedException a) {
		System.out.println("test3");
//		System.out.println(a);
	}
}}


//public String msg () {
//	return "�Ա��� ��� ó���Ǿ����ϴ�.";
//}
//}
//
//
//
//class abc {
//	private String msg = "";
//
//	public void tca() {
//		try {
//            this.msg = "ó���� �Դϴ�..... ��ø� ��ٷ� �ּ���.";
//            System.out.println(msg);
//			Thread.sleep(8000);
//		} catch (InterruptedException a) {
//			System.out.println(a);
//		}
//		this.msg = "�Ա��� ��� ó���Ǿ����ϴ�.";
//       
//	}
//	public String run() {
//		return this.msg;
//	}
//}