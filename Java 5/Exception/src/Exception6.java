
public class Exception6 {

	public static void main(String[] args) {
	
		/*[���빮��]
		 * ����ڰ� 45*3+16+5+22*8 �ش� ���갪�� �������� �ܺ� Ŭ������ �����մϴ�. // ¦��
		 * �ش� �ܺ� Ŭ���� ������ �ش� ���� ¦���� ��� ���ܿ����� �߻� �ϸ�, Ȧ�� �� ��� Ȧ���� �Դϴٷ� ȸ�ŵǵ��� �մϴ�.*/
		try {
			int sum = 45*3+16+5+22*8+1;
			cul cl = new cul();
			cl.cul_method(sum);//getter
			String result = cl.cul_method(sum);
			System.out.println(result);
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
}

class cul{
	// �ڷ��� �޼ҵ忡�� return ���� ����,����, object�� ���� �ڷ����� ����Ǿ� ����.
	public String cul_method (int s) throws Exception { //���� ������ ���� ���ڸ��. ������ ���� ���ڷ� ���͵ε�..
	
		if(s%2==0) {
			Exception ec = new Exception("����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�.");
			throw ec;
		}
		else {
	     String msg = "Ȧ���Դϴ�.";
			return msg;
	     
		}
	}
}
		
//		int total =0;
//		String result = "";
//		add a1 = new add();
//		try {
//			total = 45*3+16+5+22*8;
//			if(total%2 ==0) {
//			result ="¦��";
//			}
//			else {
//			result ="Ȧ��";
//			}
//			a1.abc(result);
//		
//		}catch(Exception e) {
//		System.out.println(e);
//		}
//		
//	}
//
//}
//class add {
//	
//	public String abc (String a) throws Exception{
//		
//		if(a.equals("¦��")) {
//			throw new Exception("¦�� �Դϴ�");
//		}
//		else {
//			String msg = "Ȧ�� �Դϴ�.";
//			return msg;
//		}
//	}
//}
