import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("�����ϰ� ������ �ѱ۷� ǥ�� �Ͻʽÿ� [����, ��Ȳ, ���, �ʷ�]");
		
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		String msg = "";
		
		switch(user) {
		case  "����" :{
		    msg = "Red";	
			break;
		}
		case "��Ȳ" :{
		    msg = "Orange";	
			break;
		}		
		case"���" :{
		    msg = "Yellow";	
			break;
		}
		case "�ʷ�" :{
			msg = "Green";
		  break;
		}
		default : {
			msg = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�.";
		}
			}
		System.out.println(msg);
		
		sc.close();
	}

}
