package Ab2;

public class Example1 {

	public static void main(String[] args) {

		home h[] = { new computer(), new monitor(), new phone() };

		// �߿�
//		phone ph = new phone();
//		ph.broken(39);

		home2 h2[] = { new phone() }; // extends�� home�� �ε��Ͽ���.
		h2[0].broken(11);

//		h[0].broken(40);
//		h[1].broken(0);
//		h[2].broken(19);

	}

}

/*
 * ���빮�� �޴����� �߰� ����� �ʿ��մϴ�. �޴��� ���� �� �ּ����� (20) -> ���� �۵��� 40 �̻�, 80�̻� �Ǹ� ����. 1)������
 * ���޵�����, ȭ���� ���峯 ��� (�������ε� �۵��� �ȵǴ� ���) ---- 20 ~ 39 2)������ ���޵�����, ������ �ȵ� ���.
 * (������ �ƿ� �ȵǴ� ���) ----- 20 ����.
 */
class computer implements home {
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���������� !!");

	}

	@Override
	public void poweroff() {
		System.out.println("��ǻ�� �����ߴ� !!");
	}

	@Override
	public void broken(int n) {

		if (this.bk <= n) {
			System.out.println("��ǻ�� ����");
		} else if (this.bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}

class monitor implements home {
	@Override
	public void poweron() {
		System.out.println("����� ���������� !!");
	}

	@Override
	public void poweroff() {
		System.out.println("����� �����ߴ� !!");
	}

	@Override
	public void broken(int n) {

		if (this.bk <= n) {
			System.out.println("����� ����");
		} else if (this.bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}

	}
}

class phone implements home, home2 {
	@Override
	public void poweron() {

		System.out.println("�޴��� ���������� !!");
	}

	@Override
	public void poweroff() {
		System.out.println("�޴��� �����ߴ� !!");
	}

	@Override
	public void broken(int n) {

		if (this.bk <= n) {
			System.out.println("�޴��� ����");
		}

		// 40
		else if (this.bk2 > n && n > 20) {
			this.powch1();
		} // 20
		else if (this.bk3 > n) {
			this.powch2();

		} else if (this.bk > n && n < 80) {
			this.poweron();
		} 
//		else {
//			this.poweroff();
//		}
	}

	@Override
	public void powch1() { // 20~40
		System.out.println("������ ��� ���� ȭ����峲");
	}

	@Override
	public void powch2() { // 0~20
		System.out.println("������ ������ ��������");
	}

	@Override
	public void powerchk1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerchk2() {
		// TODO Auto-generated method stub
		
	}

}

	
	
	

