import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {

		/*
		 * ���빮��
		 * 
		 * 
		 * ����� �н������ a1234 �Դϴ�.
		 * 
		 * ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��µǵ��� �մϴ�. "�н����� Ƚ�� �������� ������ ������ �湮�ϼž�
		 * �մϴ�.
		 * 
		 * ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� �Ǿ�� �մϴ�.
		 */

		/*
		 * int = f; for(f=1; f<30; f++) { if (f==10) { System.out.println(f); break;
		 * //�ݺ����� ���� ���� �Ҷ� ����մϴ�. } System.out.println(f); }
		 */

		final String pw = "a1234";

		/*
		 * System.out.println("��й�ȣ�� �Է����ּ���"); Scanner sc = new Scanner(System.in);
		 * 
		 * int ru = 3;
		 * 
		 * do { String user = sc.next();
		 * 
		 * if (user.equals(pw)) { System.out.println("�α��� �Ǿ����ϴ�."); break;
		 * 
		 * } else { System.out.println("��й�ȣ�� Ʋ���ϴ�."); } ru++;
		 * 
		 * } while (ru >= 1); System.out.println("Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
		 * 
		 */

		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "�н����带 �Է��� �ּ���."; // ���� ������ �ٲ�

		while (c < 4) {
			System.out.println(msg);
			String userpw = sc.next();
			if (pw.equals(userpw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			} else {
				msg = "�ùٸ� �н����带 �־��ּ���.";
				c--; // Ƚ�� ���̱�..
				if (c == 0) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}
			}
			w++;
		}
        sc.close();
        
	}

}
