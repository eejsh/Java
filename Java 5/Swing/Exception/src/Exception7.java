import java.util.ArrayList;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		
		/*������ ���� {"ȫ�浿",55 , "������", "������", 48, "�̼���","����",34,88}
		�ش� ������ �� �� ���ڰ��� ��µǵ��� �� �迭 �Ͻñ� �ٶ��ϴ�.
		��, ���ο����� �ش� �迭���� �ܺ� Ŭ����(setter) �� �����մϴ�.
		�ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		getter ���� �ش� �迭�� return ���� �������� �մϴ�.
		��, �ܺ� Ŭ�������� ���ڷ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		arraylist�� �Ϲ� �迭.. ��¸�.*/

		 Object data [] =  {"ȫ�浿",55 , "������", "������", 48, "�̼���","����",34,88};
		 try {
		 redata r = new redata();
		 r.setter(data);
		 LinkedList result = r.getter();     
		 //return �޴� ���� �迭 class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� �˴ϴ�.
		 System.out.println(result);
		 	 }catch(Exception a) {
			 if(a.getMessage()!= null) {
				 System.out.println("?");
			 }
		 }
	 }

}
class redata {
	LinkedList<String> redata = new LinkedList<>();
//	LinkedList<String> redata = null;    �Ѵٽᵵ��.

	public void setter(Object call[]) throws Exception{    
		int ea = call.length; //9��
		int dw=0;
	//	int check = Integer.valueOf((int)call[0]);    --object �ڷ����Ͻ� ������ ��ȯ ���ص���. integer.valueof(X)
	//	int check = (int)call[1];                // ������ �и���
    //  String check1 = new String((String)call[0]);    // ������ �и���
		do {
     try {  
	//�ش� �迭�� �ε� �� (�ڷ���) ��ȯ�� �ϴ� ������ Object �迭 �̹Ƿ� �����Ͽ���. 
	String check = String.valueOf((String)call[dw]);
	this.redata.add(check);
	
}catch(Exception ex) {        
//�ڽ� class���� ���� �߻� �� ��µǴ� catch��. ��, throw ����ϸ� �ٽ� main���� ���޵˴ϴ�. �߿������ throw�� ���� �� �ش� �ݺ����� �����ϰ� �˴ϴ�.

//System.out.println(ex);
}		dw++;
		}while(dw<ea);
	}
	
	public LinkedList<String> getter() {         
		// �迭 class �̸����� getter�� ���� �� �ֽ��ϴ�.
		return this.redata;
		
	} 
}