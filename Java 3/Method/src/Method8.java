public class Method8 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ���� ���α׷��Ӱ� �ش� DB(database) �� �� �� Ȧ������ ���� �� ������ �ް��� �մϴ�. �ش� ������ ��µ� �� �ֵ���
		 * �ڵ带 �ۼ��Ͻÿ�.
		 */
		odbc od = new odbc();
		System.out.println(od.aaa());
	}

}

class odbc  {        

	private int odata[]; // �迭���� ������� �ʵ��� ���. 
	private int count = 0; // Ȧ���ϰ�� +1�� ���� �ϱ� ���� ī���ͺ��� //�ʵ尪
	
	public odbc() {

		int odata2[] = { 15, 22, 17, 14, 32, 35, 19, 33 };
		this.odata = odata2;
		

	}

	public int aaa() {

		int w = 0; // �ε�����ȣ����..
		int ea = this.odata.length;
		while (w < ea) {
			if (this.odata[w] % 2 == 1) {
				this.count++;
			}
			w++;		
			}

		return this.count;

	}

}
