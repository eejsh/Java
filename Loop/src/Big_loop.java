import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {

		/* 1~100 ��ü �հ� for ������ �����Ͻÿ� */

		/*int a;
		int total= 0;
		for (a = 1; a <= 100; a++) {
			total += a;
		}
	    	System.out.println(total);*/

		/*1���� 100���� ���� �������................?*/
		
		int f;
		//biginteger : �ڹٿ��� ��� ������ ���� ������ �� �ִ� ������ �ڷ���.�Լ�    
		BigInteger aa = new BigInteger("1");             
		// �հ�ġ�� ����� ��������       1�� ���ʰ����� ����. �� ""�� ������ �����ؾߵ�.
		for(f=1; f<=10; f++) {
			aa = aa.multiply(BigInteger.valueOf(f));   
			/* multiply: ��Ģ���� ���ϱ⸦ �����.
			* add : ��Ģ���꿡 ���ϱ⸦ �����.
			* subtract : ��Ģ���� ���⸦ �����.
			 * divide : ��Ģ���� �����⸦ �����.
			*/ 
		}
		
		System.out.println(aa);
		
		
		
		
		
	}

}
