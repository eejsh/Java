
public class Method12 {

	public static void main(String[] args) {
	
		//extend �� ����� �ڽ� class�� �ε��ϰ� �Ǹ� �ڵ����� �θ� class�� �Բ� ����� �����մϴ�. (��ġ �������)
		

		bbox2 bx = new bbox2();
		bx.b2("�̼���");
        System.out.println(bx.abc());  //�޼ҵ� ���� ��ӹ���
        
		
		
	}

}



class bbox {   //���� �ܺ� class1 main ���� �ʿ��� ������ üũ       //�θ�class

	protected String user_info;

	private String user_pw;
	public String user_rpw;  //private���� bbox2�� �Ѿ�� ������ �ѹ� ��ġ�� public string user_rpw;

	public bbox( ) {
		this.user_info = "ȫ�浿";
		this.user_pw = "abcd";

		this.user_rpw = this.user_pw.replace("abcd", "Ox5%3#df2");

		
		
	}
	

public String abc() {
	String email  = "hong@nate.com";
	
	return email;
	
}



}


class bbox2 extends bbox  {   //bbox�� ���� ��� ������ bbox2�� �����ϰԵ�.   //�ڽ�class   
	//��, bbox �߿��� private���� ���õ� ���� �������� ����.
    
	
	// extends -> bbox�� �ִ� �ڵ带 ���� ����. ��, �μ����� ������ �ε� �ȵ�

	public void b2(String nm) {
	//�ش� ���� �μ����� �����Ͽ� bbox class �� �ִ� �ʵ�� �� user_info�� �����ϰ� �Ǵ� ����.
		
		this.user_info = nm;
		
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);

	}


}

