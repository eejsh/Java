package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
	//배열 수가 많아야 차이가 남. linkedlist 
		
		Integer	a[] = { 3,6,9,12,15 };
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
				ln.add(33);
			System.out.println(ln);
	
	
			
	     Scanner sc = new Scanner(System.in);
   		 LinkedList<Integer> list = new LinkedList<>();     // -> 빈 배열 생성
			
			String  user;	  
		
			//for(;;) -for의 무한루프, do{ }while?
			
			while(true) { // 무한루프
				
				System.out.println("숫자를 입력하세요");
				user = sc.next();         //- 숫자 1을 넣어도 문자 1임. 
				try {    // 사용자가 입력한 값이 오류가 있는지 확인하는 파트
	                int number = Integer.parseInt(user);    // 문자 1을 숫자 1로 변경 
	                list.add(number);
	          
	                int ea = list.size();
	                if(ea>4) { 
	                	break;	     //정지.     //5개까지 배열이 입력되면 무한루프를 빠져나옴
	                }
				} catch(Exception e) {    // 오류가 발생 하였을 경우 작동되는 파트
					System.out.println("해당 입력사항은 문자 입니다. \n 숫자만 제발 입력하세요.");   //-->예외처리 시 사용함.
					//break;
				}
		
				}
			System.out.println(list);  //--break 있을시 작동.
				
			sc.close();
				
				
	}

}
