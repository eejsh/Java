import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {

		/*
		 * 응용문제 다음 문자배열 데이터 값이 있습니다. a1 : 홍길동, 이순신, 강감찬, 유관순, 김유신 a2 : 100 , 80 , 39 ,
		 * 60, 55 "검색 하고자 하는 이름을 적어주세요" 라고 출력하게 됩니다. 검색어에 이순신 이라고 검색을 하게 되면 이순신님은 80점
		 * 입니다. 라고 출력이 되어야 합니다.
		 * 
		 * main class는 배열값..
		 */

		String a1[] = { "홍길동", "이순신", "강감찬", "유관순", "김유신" }; // a1 배열
		String a2[] = { "100", "80", "39", "60", "55" }; // a2 배열
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요?");
		String usernm = sc.next(); // 사용자가 입력한 데이터 usernm -- 끝


		jumsu j = new jumsu();                          //class 선언하면 새로선언..  class jumsu -> jumsu j로..
		      j.ck(a1, a2, usernm);                     //(jumsu) j .ck라는 메소드에 값을 보낼거임..   J는 위에서 선언
		
		
		    //jumsu j
		
		      
		      
		      class jumsu {

			                 //a1 배열       ,  a2 배열       , 유저가 입력한 내용 usernm
			public void ck(String data1[], String data2[], Straing user) {

				
				
				System.out.println(Arrays.toString(data1)); //data1 배열값을 출력하시오.
				System.out.println(Arrays.toString(data2)); //data2 배열값을 출력하시오.
			
			}
			
			

		}

	}
}

//		String aa[] = { "홍길동", "이순신", "강감찬", "유관순", "김유신" };
//
//		String bb[] = { "100", "80", "39", "60", "55" };
//
//		to1 toto1 = new to1();
//
//		System.out.println("검색하고자 하는 이름을 적어주세요.");
//		Scanner sc = new Scanner(System.in);
//		String user = sc.next();
//		toto1.su1(aa, bb, user);
//
//	}
//
//}
//
//class to1 {
//
//	public void su1(String e[], String f[], String g) {
//
//		int aab = e.length(); // 이름
//		int aac = f.length(); // 점수
//
//		int a; // 반복문 변수
//		int ff = 0;// if문 카운터
//
//		String z;
//
//		for (a = 0; a < aab; a++) {
//
//			int b;
//			for (b = 0; b < aac; b++) {
//
//				if (g.equals(e)) {
//
//				}
//
//			}
//
//		}
//
//	}
//
//}