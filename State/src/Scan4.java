import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {

	Scanner a = new Scanner(System.in) ;
	
	System.out.println("입력할 내용을 적어주세요.");
	
	String memo = a.nextLine() ;
	 
    //String memo = a.next() ;  : 스페이스바 입력 까지만 적용.
	//                             a.nextline() :  스페이스바 포함 입력 적용
	
	System.out.println(memo);	
	
            a.close();                     //  Scanner 종료를 기본으로 적용 해주어야 합니다. (종료 안하면 메모리가 계속 잡혀있음.)
                                                    
	
	String mid = "park" ;       
           int age = 25 ;           
           /* [중요사항]
              %d : byte,int    (숫자)약자
              %s : string  + 숫자  , 문자. 숫자 약자
              %f : float , double (소수점)약자
              %t : date, time (시간. 날짜)  약자
              %b: boolean  true, false(참.거짓) 약자
           */
           
       //    System.out.println(mid + "님의 나이는" + age + "입니다");
           
           //System.out.printf( "%d님" ,mid  );
           
           System.out.printf("%s님의 나이는 %d 입니다.",mid,age);
     
           //printf :  f는 format을 뜻함           
   
	
           
           	
	
	
	}

}
