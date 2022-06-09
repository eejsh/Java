import java.util.Scanner;
public class Score1 {
	
	static String [] msg = {"검색할 데이터 학생명을 입력해 주세요.", "검색할 과목명을 입력하세요?[전체,국어,수학,과학,역사]" }; //메세지 계속 사용시 static 사용무관..
	//gtdata() : return 메소드
	public static void main(String[] args) {
	//사용자 정보 입력 및 결과정보 출력

		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
 	    System.out.println(msg[0]);
		String name = text.next();   // 이름만 보내서 체크해야됨.
	    sc.stdata(name, null);      //Score2에 메소드로 사용자 및 점수전달
	   
	    String check = sc.gtdata();        // return 에서 string으로 받았으므로 string으로 받아야됨.
	
	    
	    
	    if(check.equals("true")) {      // 문자로 보냈기때문에 문자로
	    	//check==true (boolean 쓸떄 사용)
	    	System.out.println(msg[1]);
              // 검색할 데이터에 이름이 있을 시, 
	         String subject = text.next();   //과목입력
	         sc.stdata(name,subject);  //->이름, 과목명 같이 보내기
	                           //          System.out.println(sc.gtdata());//결과확인
	    	
	         String score = sc.gtdata();

	         if(subject.equals("전체")) {
	    		
	        	String score2[] = score.split(",");   //배열만들기
	            System.out.printf("점수데이터 : 국어 %S점, 수학 %s점, 과학 %s점, 역사 %s점",score2[0],score2[1],score2[2],score2[3]);
	        		}
	    	else {
	    			System.out.println("점수데이터: " + subject + " " + score + "점");
	         	}
	    }
	    
	    else {
	    	System.out.println("해당 사용자는 존재하지 않습니다.");
	        System.exit(0);           // 0 : 정상종료, 1 :비정상종료
	    }	    
	    text.close();
	    System.gc();
	    
		
		
	

	}

}
