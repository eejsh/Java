package java_test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args)  {
		
		/*������ ���� ������ �ֽ��ϴ�.
		�ش� ��ٱ��ϴ� ������ŭ ��ü ���� ����Ͽ� �� ���� �� �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		[������]
�����Ͻð��� �ϴ� �� ���� �ݾ��� :  XXXXX �� �Դϴ�.
�� ���� 1���� ���� ���� ���� �迭�� ���� �����Ͻñ� �ٶ��, �ش� �迭 �⺻���� ���� ���� ������ �ʾƾ� �մϴ�.
���� 1���� ���� ���� ������ ������ java ���Ͽ��� �ε� �Ͽ� �������ñ� �ٶ��ϴ�.
		*/
	basket b = new basket();
	b.basket_data();
	System.out.println("���� ���� �ݾ���" + b.total +"�Դϴ�.");
	}
	
} 
class basket extends Test2_data{      //Test2_data.java ����
	static int total = 150;   //������ ststic�÷�����
	public void basket_data() {
		String user[] = { "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" };
System.out.println(Arrays.toString(this.momey));
	
	}


}