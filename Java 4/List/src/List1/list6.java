package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		// 문자와 숫자 배열사용

		Scanner sc = new Scanner(System.in);
		int w = 0;
		ArrayList list = new ArrayList(); //자료형이 없는 상태. 비어있는 배열.
		
//		list.add(10);
//		list.add("홍길동");
//		list.add(52);
		
		while (w < 5) {
			System.out.println("데이터를 입력해 주시길 바랍니다.");
			String user = sc.next();
			list.add(user);
			w++;
		}

		System.out.println(list);

		
		/*숫자 입력사한만 모두 더함*/
		int ww= 0;
		int total = 0;
		do {
			try { 
				Object k = list.get(ww);     
				// 배열 자료가 숫자 + 문자 형태로 구성이 되어있을 경우는 Object 매개타입으로 설정합니다.
			
				int numbers = Integer.parseInt(k.toString());  
			         //해당 매개 타입을 문자화 하여 parseInt로 재검증 함.       
			total += numbers;
				
			}catch(Exception aa) {   //배열의 매개타입이 숫자가 아닐 경우 (예외상황발생) --> 캐치선언만 하고 비워놓기..
			
			}
			ww++;
		}while(ww<list.size());
		System.out.println("입력한 모든 배열의 숫자의 합은 " +  total + " 입니다.");
		
		
		sc.close();
		
		Object a =list.get(0);
		System.out.println(list.size());
		//[10,홍길동,52] = 0번에 숫자이므로 오류남. 	String a =list.get(0);   ---> Object! 숫자, 문자열을 객체로 인식함.
//		Object a =list.get(0);
//	    System.out.println(list.size());
		
	    
	    
	    
	}

}
