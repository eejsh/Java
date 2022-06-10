import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("번역하고 색상을 한글로 표기 하십시오 [빨강, 주황, 노랑, 초록]");
		
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		String msg = "";
		
		switch(user) {
		case  "빨강" :{
		    msg = "Red";	
			break;
		}
		case "주황" :{
		    msg = "Orange";	
			break;
		}		
		case"노랑" :{
		    msg = "Yellow";	
			break;
		}
		case "초록" :{
			msg = "Green";
		  break;
		}
		default : {
			msg = "해당 단어는 번역이 되지 않습니다.";
		}
			}
		System.out.println(msg);
		
		sc.close();
	}

}
