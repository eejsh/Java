package Ab;
//interface : ������� : �޼��常 ����, �߰��� ������ ó�� �ϴ� ������ default�� �߰���.(java 14.ver ����)

public interface method_2inter {  //interfaca���� �ʵ忡 ���� ����.
//interfaca�� �޼ҵ��̹Ƿ� �ʵ忡 �ڷ����� ������ �� ����.  -eX)public String members2; -> �ȵ�.X
	
	public String names();

	default void setbox(String name) { // setter
		System.out.println(name);
	}

	default String box3() { // getter
		// interface���� default �����ϸ� ���� �޼ҵ带 ��밡��.

		return null;
	}

}

interface method_2re extends method_2inter {   
//interface�� extends�� ���� interface�� �ε� �� �� �ֽ��ϴ�.
	
	
	
	
}