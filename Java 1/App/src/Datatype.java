
public class Datatype {

	public static void main(String[] args) {
		// string - ���ڿ�, ""������ ���ڷ� �ν� - string���� ""�ʼ�
		// �ڷ��� - byte, short ��������� ������ �뷮 ����
		// ��� ���� int ������. 
		

		String a = "1234";  //����. ���ڷ� �νľ���.
		System.out.println(a);
		/*������*/
		byte b = 127;  // byte : -128~127 (�ڹٿ��� ����ϴ� ���� ��������. ����(123456789)/�Ǽ�12.1(����������)
		
		System.out.println(b);

		short c = 32767; //short : -32,768~32,767
		System.out.println(c);
		
		int d = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 999999999; 
		// long : 9,000,000........ (0�� 18��) �⺻ �޷θ� �Ҵ翡�� �߰� ����� ���ɹ����� �þ.
		// long ���� ���� �������� l �Է� - l=������ Ǯ�� / �� ���� �޸� �Ҵ緮 ������.
		System.out.println(f);
		/*������ ��*/
		
		
        /*�Ǽ���*/
		// float , double  ex-������ �� �ִ� �ڵ�
	    // �ѹ� ���������� �ܾ� ��� ����..
		
		
		float z = 3.5f;     //3.482480000000+38  (f ������ ��� �ؾ��� (, . ���ڷ� �ν���)
		System.out.println(z);
		
		double k = 44.5;     // 1.784+308   (d�� ��/�� ��ε�) 
		//������ d �߰� �Ͽ��ߵǳ� (double k=44.5k;), ���� ������ ���� ����      
		System.out.println(k);
		
		/*�Ǽ��� ��*/
		
		
		
		
	}

}
