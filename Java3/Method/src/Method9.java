import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {

		/*
		 * ���빮�� �����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ��� �Դϴ�. �ش� �޴�Ȱ��ȭ�� 2�� �迭�̸�,�޴���, Ȱ��ȭ�� Y.N ���� �����մϴ�. �ش�
		 * Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �� ���� �� ���ο��� ��µǵ��� �մϴ�. ���
		 * :[���Ϲ��,��Ĺ������,���ڽ�, �߼�] ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */

		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
		
	}

}

/* �ݺ��� - 7��, y���� �����?->if��. */
class menus {

	private String mdata[][];// 2�� �迭�̴� 2�� �迭�� ����..
    private String rdata[];
    
	
    String a; //

	public menus() {

		String ms[][] = { { "���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } };

		this.mdata = ms;

		// System.out.println(Arrays.toString(this.mdata[0])); //���� ��üȮ��
		// System.out.println(this.mdata[0][1]); //�ε��� �� Ȯ��

		redata();
		
		

	}

	public void redata() {
		// System.out.println(Arrays.toString(this.mdata[0])); �迭�ε� Ȯ��


		int w = 0;
		int ea = this.mdata[0].length;  //7��
		//System.out.println(ea);
	   
		String ww[] = new String[ea];	//�ӽú��� ->>mdata���� �ӽú��� ����ؼ� 1���迭�� ����
		//String wa[];
	    int ct = 0;   //ī���� ���
	    
		do {
			
			if(this.mdata[1][w].equals("Y")) {
				
			//	System.out.println(this.mdata[0][w]);           //m������ 0��° [0~6]��° 
	           	ww[ct] = this.mdata[0][w]; 
			       ct++;		
			}
			w++;
					}while(w<ea);
		
	
		this.rdata = ww;
		
	//	System.out.println(Arrays.toString(ww));
		
	}

	public String[] get() {  //����class���� ���� �迭��..//String[]
		
		
		return this.rdata;
		
		
		
	}
	
	
	
}

/*
 * class{
 * 
 * int a; ->field 
 * String b;
 * 
 * public aaa() { ->comstructor }
 * 
 * public void        method 
 * public static void method 
 * piblic String abc  method
 */
