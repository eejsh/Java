
public class Switch1 {              //�¶��� ��������.���ù� ,���� �귿.. ��

	public static void main(String[] args) {
		
		
		/*switch-case  + break = ���ù�.  3�� ���� ��
		 * 
		 * �Էµ� �� ������� case�� �ߵ��Ͽ� ��°��� �����ϰ� �˴ϴ�.
		 * default�� ���� �� ���� ������ �������� ���� ��� �۵��Ǵ� �����Դϴ�.
		 * switch(���ڰ�.)
		 * ������� ������ �ִµ� ���� ���� ��� switch���� ������ ���ư�. //���Ĵ�Ȯ���Լ�
		 *  */
		// ������ int ���ں����� ���� case���� ���ں����� ���ߵ�. (���ڰ����� ����)
		int n = 3;
		switch(n) {
		case 1:             
		     System.out.println("�ɼ�1�� �����ϼ̽��ϴ�.");
		break;
		
		case 2:             
	     System.out.println("�ɼ�2�� �����ϼ̽��ϴ�.");
	     break;
		
		case 3:             
		     System.out.println("�ɼ�3�� �����ϼ̽��ϴ�.");
		     break; 
	     case 4:
		 default:
	     System.out.println("������ ���� �����ϴ�.");
	      break;
		
		}
		
		String user = "leesunsin";          // ���� switch���� ���ڰ� ����.
		switch(user) {                //���� case ���� �Դϴ�.
		case "�̼���":
		case "�� ����":
		case "leesunsin":             
		System.out.println("a�� �Դϴ�.");
		break;
		
		case "ȫ�浿":
		System.out.println("b�� �Դϴ�.");
		break;
		
		case "������":
	    System.out.println("c�� �Դϴ�.");
	    break;
	     
	    default:
	    System.out.println("�������� D�� �Դϴ�.");
	    break;
	    
		}
		
		
		

	}

}
