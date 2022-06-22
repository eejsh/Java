/*
Exception[����ó������]  : try~catch �� �Բ� ����ϰ� �˴ϴ�. (�����Ǵ°��� Ȯ���ϱ� ���� ��� , �迭,���,���Ͽ��� ���� �߻�)
-RuntimeException : error�߻� �� ����ó�� üũ�� ���� - Null, class, Arraysize
-otherException : ����ó�� üũ���� ��� ��.                     
20000->200,000?

[Exception]          ___import����

Arithmetic : 0���� ������ �߻�
NullPointer : Null ��ü�� �����Ҷ�
ClassCast : Ŭ������ ��ȯ
NumberFormat :  ���������� ��ȯ
ArrayIndexOutofBound : �迭 ���� �� index��ȣ ���� �߻���
IOException : ����� ���� �߻�  -- ���־���
Exception : ��ü ����ó�� ��Ȳ  -- ���־���
*/

public class Exception1 {

	public static void main(String[] args) {
		int a ;  //��������
		String b = "a1";
		try {                                   // try : �ش� ���� int�� ������  (1)
			a = Integer.valueOf(b);              //error �߻�  :  a1�����ε� ������ ���ڷ� ��ȯ �� a��� ���ڷ� ���Ͽ� �����߻���. int a1(X)  (2)
		}catch(Exception z) {
			System.out.println(z); //  (3) � �κп��� ������ �߻�?  : java.lang.NumberFormatException: For input string: "a1"  : ��ǥ Exception ����ص� ����ó������ ��µ� 
		}
		finally {                   //exception���� ����ó���߻� �ذ����� ����ϱ� ���� finally���
		
			b = b.replaceAll("[a-zA-Z]",""); // ������ ��ó��(4)
			a = Integer.valueOf(b);         // �ٽ� ������ ���ۼ� �ؼ� ���. (5)
		}
		System.out.println(a);   //-> ina a =>"1" �� ����Ǽ� 1 ��µ�.  (6) ���� ����� ���
	}
}
