package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_more {

//arraylist 2차 배열형태 , 다차원도포함
	public static void main(String[] args) {

		String member_data[][] = new String[][] {
				{ "홍길동", "SKT", "010-1236-4879", "45", "종로구", "hong@gmail.com", "2200" },
				{ "김도형", "LG", "010-1267-5879", "25", "강남구", "kim@nate.com", "2100" } };

		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
        
		// String[] : 2차배열 문자
		// Integer[] : 2차배열 숫자
		
		
		int w = 0;
		
		while (w<list.size()) {   //2바퀴 돌아감. 
			System.out.println(list.get(0)[w]);   // w 반복문 부분 / [2] 인덱스 2번 = 전화번호 정보만 삭다 출력가능..ㅠ
			w++;
		}
		
		
	
		
		
	}

}
