
public class Switch_Loop {

	public static void main(String[] args) {
        // 디폴트가 없을수 있음         
	    //스위치 문에서 반복문 사용시 case 안에서 끝내야됨. 스위치문 안에 if문만 돌고 값이 안뜸.
		
		String sign ="*";
		int total ;   // case에 맞춰서 0, 1이 들어가야됨
		/*case 안에 각각 반복문을 사용할 수 있스빈다.
		 * 또한 동일한 변수명을 사용해도 가능하며, 
		 * case 각각의 다르게 작동하기 때문에 문제가 되는 사항은 없습니다.
		 * 단, case 는 하나의 조건이 맞을 경우 나머지 case 는 절대 작동하지 않습니다.
		 * 
		 * */
		
		switch (sign) {

		case "+" ->{
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
			 //total = total + f;
			 total += f;
			}     		
			System.out.println("총1~5까지 계산된 값은 "+ total);   
		}
		
		case "-" ->{
			total = 0;
			
				
		}
		case "*" ->{
			int f = 1;
			
			total = 1;
			do {
                 total *= f;
                        f++ ;
			}while(f<=5);
			System.out.println(total);   // 총 곱하기 값만 나오려면 case-if 문 밖으로 보내면 됨.
		}
		
		case "/" ->{
			total = 0;
		}
		
	}		
	
		
		
	}

}
