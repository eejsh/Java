package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {

		payoll py = new payoll();
		py.start();

		int result[] = py.check();
	System.out.println("�� ��ü�� �ݾ��� " + result[0] +"�̰�, �� �ܰ�ݾ��� " + result[1] + " �Դϴ�." );
	}

}


class payoll extends pay_abstract {
	String filename =null;
	int total = 0;
	int all_money = this.money; // ���� ���忡 �ִ� �ܰ�ݾ��� ������.
	
	//�Ա���Ʈ
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c=0;
		int m_in = 0;  // �繫�� ����ڰ� �Է��ϴ� �޿�
	
		while(c<this.em_name.size()) {
		System.out.println("��ü�� �����մϴ�. ["+this.em_name.get(c)+"]���� ��ü �Ͻ� �ݾ��� �Է��� �ּ���.");
        m_in = sc.nextInt();
        this.all_money -=m_in;
		this.total += m_in;   // ��ü�� ��ü �ݾ�
		c++;	}
		sc.close();
		
		}
	@Override
	public void start() {
//		this.em_name.add("test");
		
		try {
			this.filename = "C:\\Java Test\\JavaTest\\src\\Java\\employee.txt";
			this.db();
			this.input_sc();
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	
	@Override
	void db() throws IOException{
		this.em_name = new ArrayList<>();  //��迭
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
	//System.out.println((char)this.fr.read());   // (this.fr.getEncoding())���ڵ� ���� Ȯ��. - ���� �ε� Ȯ��.
		
		/////buffer ���ǻ��� : �ѹ������� ī���õ�. 
		
    BufferedReader br = new BufferedReader(fr);
 //   System.out.println(br.readLine());          
	String data = br.readLine();
	String user[] = data.split(",");
	System.out.println();
	int ea = user.length;
	int w = 0;
	while(w<ea) {
		this.em_name.add(user[w]);
		w++;
	}
	br.close();
	
   // String test = br.readLine().split(","); // buffer �ֹ߼��̴� �迭 �ѹ� �޾ƾߵ�.
	
	}
	@Override
	public int[] check() {
//		int aa = 10;
//		int bb = 20;
		
		return new int[] {this.total, this.all_money };
	}
	
	
}