import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {

		/*
		 * 배열 + 기본(클래스) 메소드 문제
		 * 
		 * product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고 중 참외, 배, 키위를 삭제하였습니다. 해당 삭제 후 배열을 다시
		 * 재 리스트 하는 코드를 작성하시오. 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며 반복문은 free입니다.
		 * 
		 * 결과 : [수박, 사과, 딸기, 바나나, 망고]
		 */

		String aa[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };

		ffa(aa);
	//	basket(aa);

	}

	public static void ffa(String ff[]) {
		String np[] = new String[5];
		int a;
        int eaa = ff.length;  //배열갯수파악
		int b = 0; //if카운터
        for (a = 0; a < eaa; a++) {
			if (!ff[a].equals("참외") && !ff[a].equals("배") && !ff[a].equals("키위")) {
				np[b]=ff[a];
				b++;
			}
		}
        System.out.println(Arrays.toString(np));
        
        
	}

//	public static void basket(String pd[]) {
//
//		int ea = pd.length; // 배열갯수파악
//		int no = 5;
//		String newproduct[] = new String[no];
//		int idx = 0;  //if 카운터
//
//		for (String p : pd) { // for-each
//
//			if (!p.equals("참외") && !p.equals("배") && !p.equals("키위")) {
//				// newproduct[]안에 if문 안에 맞는조건을 1식 추가하여 넣어주세요.
//				newproduct[idx] = p;
//				idx++;
//			}
//		}
//		System.out.println(Arrays.toString(newproduct));
//	}

}
