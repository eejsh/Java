package Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		/* [���빮��]
		 * ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷� �Դϴ�.
		 * ���μ��� ���� �� "���ڸ� �Է��� �ּ��� : " ��� �Է��մϴ�. �� 6���� ���ڸ� �Է¹ް� �˴ϴ�.
		 * �׸��� lotto.txt ��� ������ �ε��Ͽ� ����ڰ� �Է��� ���� ����� ���Ͽ� ��� ��������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 * [�������]
		 * �ζ� ��� : �� 3���� ��ȣ�� ���߼̽��ϴ�.
		 * */

		lotto lt = new lotto();
        lt.setter();
	
	}

}

class lotto {
	Scanner sc = null;
	LinkedList<Integer> k = null;
	String url ="C:\\Java Test\\JavaTest\\src\\Java\\lotto.txt";
			
	public void setter() {
		try {
		this.fileload();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
	
	public String getter() {
		return null;
		
	}
	public void fileload() throws IOException {
		
		try {
	
	//	InputStream is = new FileInputStream("���")
		FileInputStream fi = new FileInputStream(this.url); 
		//	System.out.println(fi.available()); //ASCII �ڵ� �ε�.  abailable ���� ��üũ��Ȯ�� �Լ�
			byte[] temp = new byte[fi.available()];  // ���� ������ ����.
	
			int ea = fi.read(temp);
		//	System.out.println(fi.read(temp));// -1 :������ Ȯ��
			String test = new String(temp); //string test = new String(temp, "UTF8"), (temp, 0, ea)
		//	System.out.println(test); //sysout �� �ݺ��� �������.
			int w=0;
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	
	}
	
}