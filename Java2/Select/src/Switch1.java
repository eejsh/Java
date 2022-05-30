
public class Switch1 {              //온라인 설문조사.선택문 ,게임 룰렛.. 등

	public static void main(String[] args) {
		
		
		/*switch-case  + break = 선택문.  3개 같이 들어감
		 * 
		 * 입력된 값 기분으로 case가 발동하여 출력값을 선택하게 됩니다.
		 * default는 내용 중 같은 내용이 존재하지 않을 경우 작동되는 문법입니다.
		 * switch(인자값.)
		 * 결과값이 정해져 있는데 많지 않을 경우 switch문이 빠르게 돌아감. //이후는확장함수
		 *  */
		// 위에서 int 숫자변수가 들어가면 case에도 숫자변수가 들어가야됨. (문자가들어가면 문자)
		int n = 3;
		switch(n) {
		case 1:             
		     System.out.println("옵션1을 선택하셨습니다.");
		break;
		
		case 2:             
	     System.out.println("옵션2을 선택하셨습니다.");
	     break;
		
		case 3:             
		     System.out.println("옵션3을 선택하셨습니다.");
		     break; 
	     case 4:
		 default:
	     System.out.println("선택한 값이 없습니다.");
	      break;
		
		}
		
		String user = "leesunsin";          // 문자 switch문의 인자값 전달.
		switch(user) {                //복합 case 형태 입니다.
		case "이순신":
		case "이 순신":
		case "leesunsin":             
		System.out.println("a조 입니다.");
		break;
		
		case "홍길동":
		System.out.println("b조 입니다.");
		break;
		
		case "유관순":
	    System.out.println("c조 입니다.");
	    break;
	     
	    default:
	    System.out.println("나머지는 D조 입니다.");
	    break;
	    
		}
		
		
		

	}

}
