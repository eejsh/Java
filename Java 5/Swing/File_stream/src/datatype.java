import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		
		//intern() : equals�� ������� �ʰ� == (�ε��ȣ) �� ��� ����.
		//new String : �Ҽ��� ���� �����й��� �ڷ��� 
		String data2[] = {"ȫ�浿","�̼���"};
		String data[] = new String [] {"ȫ�浿"};
		
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String ("ȫ�浿").intern();
		String d = new String ("ȫ�浿");
		String h = new String(data2[0]).intern();
		String h2 = new String(data2[1]).intern();
		String h3 = new String(data2[1]).intern();
		String e = data[0];

//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();     //intern() �߰��� equsls ��� ���ص���.
		String g = new String(a);
	
		
		System.out.println(h==h3);
		
//		if(a==f) {
//			System.out.println("���� �����ϴ�.");
//		}	
//		if(c.equals(e)) {
//			System.out.println("���� �����ϴ�.");
//		}
//		
		

	}

}
