import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
	
		String [] names = new String[3] ;  //강제로 배열만들기
         //      System.out.println(names[0]);      // names[0] = null (값이 없습니다. 비워져있습니다..) 공간만 만들어놨음.
               
         String m [] = {"홍길동", "이순신", "강감찬"};    // 배열값에 데이터가 있는 상태
         int ct= 0;                  //for-each문에 인덱스 번호가 없음으로 새롭게 인덱스 번호를 지정해주기 위한 변수 0으로 잡아줌.
         for(String a : m) {     
        	 System.out.println(ct);
        	     if(a.equals("홍길동")||a.equals("강감찬")) {   
        	    	 //해당 기존 배열값m 중 조건의 맞는 값만 추려서 새로운 배열값에 추가함.    
                     //원래 배열에서 0번 배열이므로 홍길동[0], 강감찬[1] 배열로 들어가게됨. [2] 는 null 로 바귐
        	 names[ct] = a;
        	 ct++;                          //인덱스 번호를 순차적으로 적용하기 위한 증가값
        	 }
         }
         int names_ea = names.length;
         System.out.println(Arrays.toString(names));   //위에서 다시 설정한 새 배열값을 전체적으로 출력해주는변수. arrays.toString(a)
         
		
	}

}
