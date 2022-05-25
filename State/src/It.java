
public class It {

	public static void main(String[] args) {
		
		
		byte a = 100;
		byte b = 100;
		
		//조건문 (if-else)
		
		if(a > b) //if문(if-else)
		{  		
		System.out.println("a값이 더 큽니다.");
		}
				
		else if // else if 문
		(a < b) {	
		System.out.println("b값이 더 큽니다.");	
		}
		
		else 	//else 문 
		{
			System.out.println("두 값이 같습니다.");
		}
	
		
		//else 문이 없는 경우
		if(a < b) 
		{ System.out.println("a값이 더 큽니다.");	}
		else if (a < b)
		{ System.out.println("b값이 더 큽니다."); }
		else if (a == b) 
		{	System.out.println("두 값이 같습니다.");}
		
		// 부등호 기호 : <, >, <=, >=, == 
		
		//ex if문 3개 중복되므로 사용 하지않음..
			if (a < b) { System.out.println("a값이 더 큽니다.");	}
			if (a > b) 		{ System.out.println("b값이 더 큽니다."); }
			if (a==b) {	System.out.println("두 값이 같습니다.");}
		
		
	}

}
