
public class Class3 {

	public static void main(String[] args) { 
         //자료형 [데이텨형]	    변환     .. 자바에선 자료형으로 쓰이나 다른언어에서는 데이터형으로 자주 쓰임.     *ㅇㅇㅇ자바언어 / [ㅁㅁㅁ] 공용언어로 쓸꺼임..*
        // double -> int로 변환	
		double a = 137.5; 
	    int b = (int)a;       // 위에서 더블로 받은 a값을 int로 변환시킴

	    //double->int로 변환   
	    int c = 35 ;
	    double d =(double)c;       // int c=35를 double 35.0으로 변환시킴             
	    		
	    System.out.println(d);
		
	    //string ->int            
	    String x = "35";
	    String x2 = "156";
	      int z = Integer.parseInt(x);    // 문자에서 숫자로 바로 변환시킴  / parseInt = int형에 사용하는 산술연산 언어.  
	   // int z = Integer.valueOf(x);       //함수를 거쳐서 변환.  valueof(메소드(메소드함수))->parseint  =  /return integer.valueof(parseint(s,10) ;
	      //valueof 클래시 메소드(메소드함수) -> parseInt
	    
	      int total = Integer.parseInt(x) + Integer.parseInt(x2);
	      
	   // 문자열을 숫자로 변환하여 산술계산을 처리함
	      System.out.println(total);
	    
           //Long 사용시 Long.parseLong 사용.
	       String j = "923456789";
           String j2 = "9234567892";
           
          // int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
           long total2 = Long.parseLong(j) + Long.parseLong(j2); //int의 범위를 넘어가면 long 으로.. Long.parselong
        	 	   
        	double total3 = (double)total2;
        	
           System.out.println(total2);
	    
           System.out.println(total3);
	    
           
            //문자(char) ''-> 문자(String)    :   기본 지식만 제공.
           char p = 'M';     //char 사용시 ''사용.
           
           String f = String.valueOf(p);         //문자이기 때문에 parse 필요없음.  ex / if문으로 처리해서..m->남자.. 잘쓸일은없음.
           
           
           System.out.println(f);
               
	    
	  
	    
	}

}
