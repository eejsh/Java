import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
	
		String [] names = new String[3] ;  //������ �迭�����
         //      System.out.println(names[0]);      // names[0] = null (���� �����ϴ�. ������ֽ��ϴ�..) ������ ��������.
               
         String m [] = {"ȫ�浿", "�̼���", "������"};    // �迭���� �����Ͱ� �ִ� ����
         int ct= 0;                  //for-each���� �ε��� ��ȣ�� �������� ���Ӱ� �ε��� ��ȣ�� �������ֱ� ���� ���� 0���� �����.
         for(String a : m) {     
        	 System.out.println(ct);
        	     if(a.equals("ȫ�浿")||a.equals("������")) {   
        	    	 //�ش� ���� �迭��m �� ������ �´� ���� �߷��� ���ο� �迭���� �߰���.    
                     //���� �迭���� 0�� �迭�̹Ƿ� ȫ�浿[0], ������[1] �迭�� ���Ե�. [2] �� null �� �ٱ�
        	 names[ct] = a;
        	 ct++;                          //�ε��� ��ȣ�� ���������� �����ϱ� ���� ������
        	 }
         }
         int names_ea = names.length;
         System.out.println(Arrays.toString(names));   //������ �ٽ� ������ �� �迭���� ��ü������ ������ִº���. arrays.toString(a)
         
		
	}

}
