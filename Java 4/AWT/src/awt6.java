/*awt6_
 * 
 * 인증번호 발송 시스템. -- 4개의 번호 0~9 랜덤
 * 인증번호가 올바른지 아무것도 입력안하면 인증번호를 넣으세요..
 *버튼 먼저 눌러야됨.
 *pc가 뽑은 번호는 console로
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
	public int oknumber(int numbers) { // 인증번호 받음.
		this.pcnum = numbers;
		System.out.println(pcnum);
		return this.pcnum;

	}
	
	@Override
	public int allok() {
		return pcnum;
			
	}



}
