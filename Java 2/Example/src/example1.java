
public class example1 { // �⺻Ŭ����.

	public static void main(String[] args) {

		/*
		 * �迭+�⺻(�޼ҵ�)���� //pubilc class example1 �� �⺻Ŭ���� �Դϴ�. . �޼ҽ� ���� �� public void �߰�.
		 * 1�� �迭�� ������ ���� ���� �ֽ��ϴ�. �迭 ����Ʈ 22, 33,44, 55, 66, 77, 88, 99 �̸� �ش� ��ü ���� ��� ����
		 * �� �հ� ���� ������ �޼ҵ忡 ó���ǵ��� �մϴ�. ��, �ݺ����� ������ do~while������ �ۼ� �մϴ�. (�� ���Ѱ� 484)
		 */

		int aa[] = { 22, 33, 44, 55, 66, 77, 88, 99 };

		plus1(aa); // plus1 �� �����ּ���.

		example1 ex = new example1();  
		ex.plus(aa);
		// void = ��ü���� + �ν��Ͻ�(�޸�) ���
		// �޸� �Ҵ缱�� = public�� static �� ������ �޸� �Ҵ� ������ ���־�� �մϴ�.

	}

	// static ���� �޸� �Ҵ���������� ���� �޸� �Ҵ� ���ص��˴ϴ�.
	public static void plus1(int b[]) {

		int aa = 0; 
		int bb = b.length;  //�迭���� �ľ�
		int total = 0;

		do {
        	total += b[aa];
			aa++;
             } while (aa < bb);

		System.out.println("�� ���Ѱ��� " + total + "�Դϴ�.");
}

	public void plus(int c[]) {   //������ Ǯ��
      int ea = c.length;
      int w = 0;
      int total1 = 0;
      do {
    	  total1 = total1+ c[w];
    			  w++;
      }while(w<ea);
      
		System.out.println("���հ谪"+ total1 );
		
	}

}
