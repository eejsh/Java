
public class Method3 {

	public static void main(String[] args) {
		/*
		 * [응용문제] 인수값 2개의 숫자를 적용하여 계산되도록 합니다. 최종 계산값을 받아서 결과를 출력하시오. 
		 * 157 ,* 45 /  최종결과값 출력 : 7065  
		 */

		math ma = new math();

		int result = ma.m(157, 45);
		System.out.println(result);

		ma.m2(); // m2 메소드 호출
		ma.m();  // 변수값없어야 m 이름 사용가능.
		
		
		
		
		/*응용문제
		 * 다음 숫자 하나를 해당 메소드로 전달 하게 됩니다.
		 * 해당 메소드에서는 다음과 같이 처리 됩니다.
		 * 숫자 3을 전달하면 3*1~3*9 까지의 모든 결과값을 더하여 sysout으로 출력 되도록 하십시오.
		 * */
		
		int result1 = ma.ab(3);
	     System.out.println("결과:"+result1); // 3을 보내서 int ab에서 반복문 돌고 return to로 받음.
		
		String ck = ma.mb("hong");
		System.out.println(ck);

	}

}

class math {

	public int m(int a, int b) {
		int c = a * b;
		return c;

	}
	public void m() {   //int m 에 변수값이 없으면 사용불가능 하나 변수값이 있으면 중복m 사용가능.
		System.out.println("연습입니다.");
		
	}
	public void m2() {

		int z = m(100, 200);
		System.out.println(z);
	}

	
public int ab(int f) {
	
	int g;
	int to=0;
	
	for(g=1; g<=9; g++) {
		to += (g * f);    // to = to + (g*f);
	}
   return to; //result1 로 보냄      반복문 안에 return 사용안됨.->무조건 반복문 밖에서 선언해야됨.
	
   
//   int w =1;
//   while(w<=9) {
//	   to += f * w;
//	   w++;
//   } return to;  
 
   /*return 사용 시 절대 반복문 안에 적용하면 안됩니다. 
    또한 조건문이라도 더블로 return 사용 안됩니다.*/
   
}
public String mb(String mid) {
    String msg =" ";
 
   
    
	//String aa = mid;
	if(mid.equals("hong")) {
	//	return "ok";
	msg ="ok";
	
	}
	else {
	//return "cancel";
	msg = "cancel";
		
	}
	return msg;      // 마지막값을 뽑아서 return으로 보내야됨.
	
	//Ex: 스위치문이 10개 이상이면 10개 다 보내느니 답만 처리하여 보내는게 좋음.
	
	/* 해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴 */
	
	
	
}
	
	
	
	
	
}