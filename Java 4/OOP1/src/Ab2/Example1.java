package Ab2;

public class Example1 {

	public static void main(String[] args) {

		home h[] = { new computer(), new monitor(), new phone() };

		// 중요
//		phone ph = new phone();
//		ph.broken(39);

		home2 h2[] = { new phone() }; // extends로 home을 로드하였음.
		h2[0].broken(11);

//		h[0].broken(40);
//		h[1].broken(0);
//		h[2].broken(19);

	}

}

/*
 * 응용문제 휴대폰에 추가 기능이 필요합니다. 휴대폰 고장 시 최소전원 (20) -> 정상 작동은 40 이상, 80이상 되면 고장. 1)전원은
 * 공급되지만, 화면이 고장날 경우 (공급중인데 작동이 안되는 경우) ---- 20 ~ 39 2)전은은 공급되지만, 충전이 안될 경우.
 * (공급이 아예 안되는 경우) ----- 20 이하.
 */
class computer implements home {
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원공급중 !!");

	}

	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원중단 !!");
	}

	@Override
	public void broken(int n) {

		if (this.bk <= n) {
			System.out.println("컴퓨터 고장");
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
		System.out.println("모니터 전원공급중 !!");
	}

	@Override
	public void poweroff() {
		System.out.println("모니터 전원중단 !!");
	}

	@Override
	public void broken(int n) {

		if (this.bk <= n) {
			System.out.println("모니터 고장");
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

		System.out.println("휴대폰 전원공급중 !!");
	}

	@Override
	public void poweroff() {
		System.out.println("휴대폰 전원중단 !!");
	}

	@Override
	public void broken(int n) {

		if (this.bk <= n) {
			System.out.println("휴대폰 고장");
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
		System.out.println("전원은 들어 오나 화면고장남");
	}

	@Override
	public void powch2() { // 0~20
		System.out.println("전원은 들어오나 충전고장");
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

	
	
	

