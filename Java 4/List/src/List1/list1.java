package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
	    // ArrayList라는 util 메소드에서 사용하는 부분.
		// add(추가). get(데이터로드). remove(삭제), size(index 갯수)
        // Array.asList : 로드할 배열 변수를 적용
		// 중요 : add는 일반적으로 무조건 맨 뒤에 데이터가 추가됨. 단, Index 번호를 적용 후 값을 실행하면 해당 Index부분에 추가가 됩니다.
		// arraylist에서는  Int -> Integer 사용해야됨.
		String member[] = {"이순신", "홍길동", "유관순", "강감찬"};
      
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		//System.out.println(mb);		
	    int ea = mb.size();    //갯수
	    //System.out.println(ea);
		mb.add("김유신");       // 배열에 데이터 추가
		//System.out.println(mb);
	    mb.remove(1);     //인덱스[1] 에 있는 데이터 삭제.
	    //System.out.println(mb);
	    mb.add(3,"세종대왕");      // 인덱스[3]에 세종대왕추가
	    //System.out.println(mb);
	
	    String checks = mb.get(2);     //해당되는 배열값을 가져오시오.
	    //System.out.println(checks);
	    
	    
	    /*응용문제
	     * 본 데이터는 {15,22,37,8,11,19,41};  입니다.
	     * 해당 본 데이터를 커스텀 하여 다음 결과처럼 출력하시오.
	      결과값 : [7,15,22,8,11,39,41]*/
	    Integer numbers[] = {15,22,37,8,11,19,41};
	    
	    
	    ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(numbers)); 
//	    nb.add(0,7);
//	    nb.remove(3);
//	    nb.add(5,39);
//	    nb.remove(6);

	    nb.remove(2);
	    nb.remove(4);
	    nb.add(0,7);
	    nb.add(5,39);
	    System.out.println(nb);
	    
	    
	    
	    
	
	}

}
