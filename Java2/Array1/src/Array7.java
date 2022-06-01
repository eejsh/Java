import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {

		/*
		 * 응용문제 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공됩니다. 그 중 레벨데이터 값에 3 미만(3은 미포함) 값만 확인하여
		 * 배열 데이터를 재가공 합니다.
		 *
		 * 홍길동, 이순신, 강감찬, 세종대왕, 유관순, 김유신 6개 4 , 3 , 1 , 1 , 2 , 2 
		 * ["강감찬", "세종대왕", "유관순", "김유신"]
		 */

		String member[] = { "홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신" };
		
		int lv[] = { 4, 3, 1, 1, 2, 2 };

		int n_lv[] = new int[4];

		String new_member[] = new String [8] ;
		
		
		int ea = member.length; // 6개

		int f; // 반복문에 사용할 변수 0~
		int ct = 0; // if문에 사용할 변수

		for (f = 0; f < ea ; f++) { //
                                           
			if (lv[f] < 3) { 
                    	n_lv[ct] = lv[f]; // 새 할당될 n_lv 는 lv[a]에서 (반복문) 1식 추가될때마다 if 문 조건에 맞는 수를 b에 넣으세요.
                	new_member[ct] = member[f];                  	
               	
                  //	System.out.println(member [f]);
                 	
				ct++; // if문에서 1+ 추가
			}

		}
		System.out.println(Arrays.toString(new_member));
		

		
		
		
	}
}
