import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {

		// 클래스 + 메소드 + 배열

		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 성함을 입력해주세요.");

		String name = sc.next();

		String users[] = { "홍길동", "이순신", "김유신" };

		arrays.lists(users, name); // 배열값, 입력값을 lists로 보내주세요.

		sc.close();

	}
}

class arrays {

	public static void lists(String a[], String n) { // 배열을 받을때

		// System.out.println(Arrays.toString(a));

		/*
		 * 응용문제 사용자가 자신 이름을 입력합니다. 사용자 이름을 해당 class 보내서 등록된 사용자 인지 미 가입자 사용자 인지를 학인하는
		 * 코드를 작성하시오. 등록된 사용자일 경우, "가입이 되어 있습니다." 라고 출력하고 , 확인이 되지 않을 경우 "미가입자 입니다." 라고
		 * 출력하시오.
		 */

		int w=0;                  // 반복문 기본값
		int ea = a.length;      //배열 반복값
		
		String msg = ""; // 메소드로 해당값을 전달할때는 비어있는 값을 명확하게 적용하셔야 합니다.
		// Stirng "" 또는 null int = 0 으로 표현합니다.. 빈값.

		boolean ck = false;

		while (w < ea) {
			if (n.equals(a[w])) {
				msg = "가입이 되어있습니다.";
				ck = true;
			}
			w++;
		}
		if (ck == false) {
			msg = "미가입자 입니다.";
		}

		arrays ar = new arrays();
		ar.message(msg);

		// message(msg); ->static 선언해야됨으로 메모리 할당.. 안쓰는게 좋음

	}

	public void message(String m) {
		System.out.println(m);

	}

}
