package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
	    // ArrayList��� util �޼ҵ忡�� ����ϴ� �κ�.
		// add(�߰�). get(�����ͷε�). remove(����), size(index ����)
        // Array.asList : �ε��� �迭 ������ ����
		// �߿� : add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰���. ��, Index ��ȣ�� ���� �� ���� �����ϸ� �ش� Index�κп� �߰��� �˴ϴ�.
		// arraylist������  Int -> Integer ����ؾߵ�.
		String member[] = {"�̼���", "ȫ�浿", "������", "������"};
      
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		//System.out.println(mb);		
	    int ea = mb.size();    //����
	    //System.out.println(ea);
		mb.add("������");       // �迭�� ������ �߰�
		//System.out.println(mb);
	    mb.remove(1);     //�ε���[1] �� �ִ� ������ ����.
	    //System.out.println(mb);
	    mb.add(3,"�������");      // �ε���[3]�� ��������߰�
	    //System.out.println(mb);
	
	    String checks = mb.get(2);     //�ش�Ǵ� �迭���� �������ÿ�.
	    //System.out.println(checks);
	    
	    
	    /*���빮��
	     * �� �����ʹ� {15,22,37,8,11,19,41};  �Դϴ�.
	     * �ش� �� �����͸� Ŀ���� �Ͽ� ���� ���ó�� ����Ͻÿ�.
	      ����� : [7,15,22,8,11,39,41]*/
	    Integer numbers[] = {15,22,37,8,11,19,41};
	    
	    
	    ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(numbers)); 
//	    nb.add(0,7);
//	    nb.remove(3);
//	    nb.add(5,39);
//	    nb.remove(6);

	    nb.remove(2);
	    nb.remove(4);
	    nb.add(0,7);
	    nb.add(5,39);
	    System.out.println(nb);
	    
	    
	    
	    
	
	}

}
