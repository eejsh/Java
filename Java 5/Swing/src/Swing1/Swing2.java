package Swing1;

import java.util.HashMap;
import java.util.Map;

public class Swing2 {

	public static void main(String[] args) {
	//	ArrayList, LinkedList  (배열값) add, remove, get, size
	// map (배열키, 배열값)  -> add 대신 put 사용, remove, get, size.
	// map : 배열키가 기반이기 때문에 키를 통해서 데이터를 확인합니다. (속도 최상급)
	// 같은 키를 사용 시 마지막에 적용된 값으로 갱신됩니다.
	// 키 값을 절대 중복 시키지 않음.
				
		// hashmap ->유틸, 일반적으로 암호화가 되어있음. 
		
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(hashmap) -> 8X21949CB(중복값이 발생하지 않음)
		
		m.put("hong", "홍길동");        //hong = key, 홍길동 = 값
	//	m.put("hong", "강감찬");   m.get("hong") --> 홍길동이 아닌 강감찬으로 출력  hong=홍길동, hong=강감찬 마지막 hong값으로 변경됨.
		m.put("kang","강감찬");
			System.out.println(m.get("hong"));          
		
		int a = 10;
		a = 40;
		System.out.println(a);

//		m.put("", "박혁거세");  //비여있는 키를 사용은 할 수 있으나, map 원리에는 올바르지 않음.
//		System.out.println(m);   // -->( =박혁거세, )
		
		m.put("park", "");
		if(m.get("park").equals("")) { //key는 있지만 값이 비여있을 경우.
			m.put("park", "박");
		}
		System.out.println(m.get("park"));

		m.remove("hong"); 
		System.err.println(m);
		
		//간편회원 가입. id.pw.email 만 하면 가입 ->주소,전화번호는 비어있음: key는 있지만 값은 비여저있음 .. 추후 주문때 주소.전화번호 작성 

		// map :key,  여러개의 자료형을 사용할 수 있음.
		Map<String, Integer> m2 = new HashMap<>();  //key는 String, 값은 integer로 받음
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2);  //-> {level=5, age=32}
		System.out.println(m2.get("age")); // ->32
		System.out.println(m2.keySet());  // key만 출력
		
		System.out.println(m2.values());  // 값만 출력
		
		System.out.println(m2.containsKey("tel"));  //해당 키가 있는지 확인 (false:없음, true:있음)
		
		
		
		
	}

}
