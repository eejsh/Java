
public class Do1 {

	public static void main(String... args) {
      /*
       int a = 1 ;         //초기값
       do {
    	   System.out.println(a+",");
    	    	   a++ ; //증가 또는 감소
       }while(a < 11) ;  //범위값 , 종료값  (반복할 수)

       
       */
       
     /*응용문제
      * 
      * 5~0까지 출력되는 do~while 문을 작성하시오.
      * 
      * */
       
       int a1 = 5 ;
       do {
    	   System.out.print(a1+",");
       a1--;
       }while (a1 >= 0) ;
       
       
       
       int c = 50 ; //기초값
       int d = 60 ; //종료값
       
       do {
    	   System.out.print(c+" ");
    	   c++;
       }while (c <= d) ;
       
       
       
       
       
       
	}

}
