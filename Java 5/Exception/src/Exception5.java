
public class Exception5 {
//��Ȱ : �� �ְ�, ��¸� ��. -->main ���� exception ������.. 
	public static void main(String[] args) {
		
		words wd = new words();
		try {
			String result = wd.files("");
		System.out.println(result);
		}catch(Exception a) {
		//System.out.println("���� ������ �Ǿ� �ùٸ� ���� ���� ���� ����.");
			System.out.println(a);
			/*if(a.getMessage()!=null) {
				System.out.println(result);
			}*/
		}
		finally {
			try {
			String result = wd.files("ȫ�浿");
			System.out.println(result);
			} catch(Exception e) {
				System.exit(0);
			}
			}

		
	}
}


class words {
	//���� �ް� ���� �� return 
	public String files(String aa)  throws Exception{
		if(aa==null || aa.equals("")) {
		//	Exception ea = new Exception();
				throw new Exception("���� ���� ������ �˷���.- ���� ��� ����.");
						
		}else {
			String msg = aa + "�� ȯ���մϴ�.";
			return msg;
		}
		
	}
	
}
