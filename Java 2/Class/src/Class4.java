public class Class4 {

	public static void main(String[] args) {

		Member mb = new Member();
	
		
		// ��ü : Member
		// mb : �ν��Ͻ�
		// new Member(): �޸𸮿� �ν��Ͻ����� �����Ͽ� ����� �� �ֵ��� ��. - ������ ������ �޸��Ҵ�,,,,

		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 25 * mb.user_agree;
		System.out.println(total);

		final int agree = mb.user_agree;
		// member �ν��Ͻ� �ʵ尪�� �ε��մϴ�. => agree��� �ʵ� ��������� ����

		mb.user_agree = 80; // �޸𸮿� ��ϵ� �ʵ�� �ش�Ǵ� ���� ������. ���� 6������ �ִ����� 80���� ����

		System.out.println(mb.user_agree);
		System.out.println(agree);

		/*
		 * �Ϲ� Ŭ���� �޼ҵ�κ� �Ϲ� Ŭ���� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 �����ϴ�. ��? static ��ü�� �޸�
		 * �ν��Ͻ��� ����Ѵٴ� ���Դϴ�. static = �޸� �ν�. �޸𸮿� �ٷ� �־��ֱ�..
		 * 
		 */
		coupon.events();
		mb.Member_event();

	}

}



class Member { // Ŭ����
	// ���� ��Ʈ�� �ڷ������� ������ ����
	String user_name; // ���� �ʵ�� (user_name) �� ����.
	int user_age;
	int user_level;
	int user_agree = 6; // ���� �ʵ�� �ʵ尪(1)�� ����.
	//�ʵ� ���� ���� ���ϸ� �� �� new ��ü�� ���� ����,, ���� �ʵ尪�� �����ߴٸ� new �����ؾߵ�.

	public static void Member_event() { // �ٸ� Ŭ������ �ִ� �޼ҵ带 �۵��ϰ� ������ pubilc stacit void �����ؾߵ�.
              coupon.events();      
  //class�� ���� �޼ҵ带 �ٷ� ȣ���� �� ����. ��, event��� �޼ҵ忡 �����ʵ� �� �����ʵ尪�� class�� �����ϰ� �Ǹ� �׶��� ��ü+�ν��Ͻ��� �����ؾ߸� �ε� �˴ϴ�.
              

	}

}

class coupon {
	public static void events() {

		int cp = 30;       //�޼ҵ� �Լ��� ����...... ���࿡ �ʵ� �����ϸ� member�� new �Ҵ��ؾߵ�.
		System.out.println(cp);

	}
}

/*
 * �ϳ��� project �� ���� �ٸ� package�� �ѹ� ����� Class���� �ٸ� ������ ����Ͻ� �� �����ϴ�. �ٸ�������Ʈ�� ����..
 * Class �����ܾ� �� �����������..
 */
