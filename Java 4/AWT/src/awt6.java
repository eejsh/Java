/*awt6_
 * 
 * ������ȣ �߼� �ý���. -- 4���� ��ȣ 0~9 ����
 * ������ȣ�� �ùٸ��� �ƹ��͵� �Է¾��ϸ� ������ȣ�� ��������..
 *��ư ���� �����ߵ�.
 *pc�� ���� ��ȣ�� console��
 **/

public class awt6 {

	public static void main(String[] args) {

		numcheck nc = new numcheck();
		nc.ckframe();
	}

}
class numcheck extends awt6_abstract {
	private int pcnum;

	@Override
	public int oknumber(int numbers) { // ������ȣ ����.
		this.pcnum = numbers;
		System.out.println(pcnum);
		return this.pcnum;

	}
	
	@Override
	public int allok() {
		return pcnum;
			
	}

	@Override
	public int userok(int userck) {
		// TODO Auto-generated method stub
		return 0;
	}

}