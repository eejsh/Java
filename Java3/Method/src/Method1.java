
public class Method1 {

	public static void main(String[] args) {

		tests t = new tests();
		t.a1++;
//		t.a2++;
		t.name1();
     
		tests tt = new tests();
		tt.a1++;
//		tt.a2++;
		tt.name1();
	
		
		t.b1 += "������";
//		t.b2 += "������";
		t.name2();
		tt.b1 += "������";
//		tt.b2 += "������";
		tt.name2();

	}
}

class tests{

	int a1 = 1;         //(��������)
	// ���ο� ��ü ���� �� class�� ȣ�� �� 1�̶�� ���ڸ� �ٽ� ������ �˴ϴ�. ���ε��->�ʱ�ȭ
	
	public static int a2 = 1;  //(��������) -> �ڸ޸� ������Ѽ� ��� ����� ��� ���. (int, string)
	// ���ο� ��ü ���� �� class�� ȣ�� �ϴ��� 1�̶�� ���ڰ� �ƴ� �޸𸮿� ��ϵ� �������� ���������� ������ �˴ϴ�.->�޸� ����Ȱ�
		
	String b1 ="�̼���"; 

	public static String b2 = "ȫ�浿";    // ���� �ִ� �����Ϳ��� �߰� �� static �־ ���������ϸ� ���� �����Ϳ� �߰��� (����Ŵ)
	//����)"ȫ�浿" +  �� ȯ���մϴ�., "ȫ�浿" + �� �����ݾ��� 1000�� �Դϴ�., "ȫ�浿" +�� ����20%�Դϴ�. ="ȫ�浿"�̶�� ������ ��������� ����Ҷ� ����. 
	
	//piublic static string b2[] = {"ȫ�浿"};
	
public void name1() {
//	System.out.println(a1+ "a");
//	System.out.println(a2+ "b");
	
}
	
public void name2( ) {

System.out.println(b1 + "b1");
System.out.println(b2 + "b2");

	
}


}