package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		
		
		/*[���빮��]
		 * ����ڰ� ���ڱݾ��� �Է��մϴ�
		 * �ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�. 
		 * 0~n���� �Է°����ϸ�, �ش� �ݾ��� ��� ������ ���� �հ�ݾ��� ��Ű�ÿ�
		 * 
		 * 500 600 500 400 200 100 50 50
		 �� �Ա� �ݾ��� 2400�� �Դϴ�.* 
		 * */
		
		String usernb;
		
		LinkedList<Integer> bank = new LinkedList<>();  //��.
		
		Scanner sc = new Scanner(System.in);
	
		int w = 0;
        int total = 0;
		do {
			System.out.println("�Ա��� �ݾ��� ��������");
			String money = sc.next();
			try {
				int addm = Integer.parseInt(money);
				bank.add(addm);
                total += addm;
              }catch(Exception e) {
				System.out.println("�ݾ��� ���ڷθ� �Է��ϼ���.");
			}
			
			w++;
		}while(w<8);             //Ƚ���� ���ع����� �߸� �Է��� ���� Ƚ�������� �Ǿ����. --> ���ѷ������.
		
		System.out.println("��ü �Ա��� �� �ݾ��� "+ total + "�Դϴ�.");
		
		
		sc.close();
		
	}

}
