
public class Method6 {

	public static void main(String[] args) {
		/*private�� ���� ��ü ���� ����2 */

		insert i = new insert();
		
		String userid = "admin";
		String skey = "1123234";
				
	  String result = i.checks(skey);
	  System.out.println(result);	
		
	}

}//����ȭ�� ���ʹ��.. - �ܺ� class ���� ���ö� ���͸�..���ÿ��� ����Ҽ�����../ ���Ȼ�, �ܺ� �����Ϳ��� �ɷ����� �� ���.
                                                // ���밳�� �� �� ���. 
class insert{
	String userid = null;
	private String key = "a123456";   //�ش� class���� ����Ǵ� key��
	
	public String checks(String bb) {                //�ڷ������� �޼ҵ� �����
		
	//	this.key = bb;             //key���� bb���� ����
		String msg = null;
		if(key.equals("a1234567")) {       //�ش� key��(private) �� �ܺ�class ���� �Ѿ���� �μ����� ��
			 if(userid.equals("hong")){   // id Ȯ��
				 msg = "�����͸� Ȯ���߿� �ֽ��ϴ�.";
			 }
			 else{
				 msg =" �ش� ������ ���� Ȯ������ ���մϴ�. ";
				
			}
		}
		else {               //�ܺ� class���� �ùٸ� Ű���� ���޵��� ���� ���
			msg = "error";
		}
		//return null;  // ó���� �� ������ üũ �� ���� �ȶ�
		    return msg;  // ���� ����� ���� return���� ȸ��.
        
	}
	
}