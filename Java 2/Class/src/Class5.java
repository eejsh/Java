import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		Member2.lists2();
		
		Member2 mb2 = new Member2 ();  
		//static �� ���� �Լ��̹Ƿ� ��ü �� �ν��Ͻ��� �����ؾߵ�  = Member2 mb2 = new Menmber2();
		mb2.lists();            //�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��

		
		Member2.lists3("������",12345);        //class Member2�� �ִ� lists3�� �ִ�..string nm ���κ���
		                                //string user_name = nm; �� ��ó�� �� ���. ex ->�ݺ���, �迭�� ����Ұ��� ��. 
		
		
		
		
		/*���빮�� for_in �̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�. 
		 * ���α׷� ���� �� ������ ���� ������ �մϴ�.
		 * 
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���."
		 * [���] �ش� �޼ҵ忡�� ����ؾߵ�. 
		 *  ���� ����ڰ� 3���� �Է� ��, 3*1=3.......3*9=27  ��µǾ���..
		 *  for��...��
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
	 	System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���.");
		int usersc = sc.nextInt();
		Member2.for_in(usersc);         //for_in���� �����ߵ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		sc.close();
		
		
	}

}




class Member2 {

	public void lists() {                        //�޸� �Ҵ����� ����      static ������ ��� �Ҵ�������� class5 ���� new Member2(); �����������.
    // �޸𸮿� ������ �Ҵ���� �޼ҵ� �Լ��� ����, ���������� �ε����� ����.
	String a = "ȫ�浿" ;
	//System.out.println(a);
	
	}
	
	public static void lists2() {                //�޸� �Ҵ���
		String a = "�̼���" ;
	//	System.out.println(a);

	}
   
	
	/*member2 �� �Ϲ��Լ�(�޸�) list3 �޼ҵ� �ȿ� 3���� �ʵ带 �����մϴ�. ����user_name, ���� user_tel, ���� user_point 
	 * ���ڰ��� �ֱ�..       */
    public static void lists3(String nm, int pw) {
    	// mn�� �޼ҵ忡�� ���޹޴� ���� �ٷ� ����� ��� (nm.equals("������"))
    	
    	
    	String user_name = nm ;
    	int user_pw = pw;           //�޼ҵ忡 ��ü ���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���޹޴� ����
 
    	
    //	System.out.println(nm); = "������"���� ��µ�  string nm ->������
    	
    	if(nm.equals("������") &&  user_pw==123456   ) {           //string nm->string user_name=nm -> if������ �ٲ��� ����� ���..
   // 		System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�.");
    		
    	}
    	
    	//else if~~
    	else {
   // 		System.out.println("��ȸ���Դϴ�.");
    	}
    		
    	
    }
    
    
    
    
    public static void for_in (int usersc) {    //�� scanner���� ���� �޾ƿ;ߴ�.........
    	int userf = usersc;
    	
    	int a ; 
        int total = 1;
    	for(a=0; a <= 9; a++) {
    	  	total = a * userf;
    		
    	 // 	System.out.println(total);
    	  	System.out.println(userf + "*" + a + "=" + total);
    	  	
    	  	
    	}
    	
    }
	
}