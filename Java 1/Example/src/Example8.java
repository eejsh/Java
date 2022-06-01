import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {

		/*
		 * 응용문제
		 * 
		 * 
		 * 사용자 패스워드는 a1234 입니다.
		 * 
		 * 사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다음과 같이 출력되도록 합니다. "패스워드 횟수 제한으로 가가운 지점에 방문하셔야
		 * 합니다.
		 * 
		 * 단, 패스워드가 맞을 경우 "로그인 되었습니다." 라고 되어야 합니다.
		 */

		/*
		 * int = f; for(f=1; f<30; f++) { if (f==10) { System.out.println(f); break;
		 * //반복문을 강제 종료 할때 사용합니다. } System.out.println(f); }
		 */

		final String pw = "a1234";

		/*
		 * System.out.println("비밀번호를 입력해주세요"); Scanner sc = new Scanner(System.in);
		 * 
		 * int ru = 3;
		 * 
		 * do { String user = sc.next();
		 * 
		 * if (user.equals(pw)) { System.out.println("로그인 되었습니다."); break;
		 * 
		 * } else { System.out.println("비밀번호가 틀립니다."); } ru++;
		 * 
		 * } while (ru >= 1); System.out.println("횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
		 * 
		 */

		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "패스워드를 입력해 주세요."; // 문자 조건이 바뀜

		while (c < 4) {
			System.out.println(msg);
			String userpw = sc.next();
			if (pw.equals(userpw)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				msg = "올바른 패스워드를 넣어주세요.";
				c--; // 횟수 줄이기..
				if (c == 0) {
					System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
				}
			}
			w++;
		}
        sc.close();
        
	}

}
