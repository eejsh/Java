package Swing1;

import java.lang.constant.Constable;
import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Swing3 {
//반복문을 이용하여 key 생성 및 배열값 분리작업.
	public static void main(String[] args) {
		String data[]= {"홍길동", "강감찬", "이순신", "유관순"};  //1차 배열형태
		Map<String,String> m = new HashMap<>();
		//key도 반복문으로 넣을수 있음
		int w=0;
		do {
			// 중복되지 않는 키값 생성 + 해당 배열에 있는 index 번호으로 생성해서 값을 넣을수 있음.
//	    m.put("name"+w, data[w]);  //출력 : name0=홍길동
		m.put(String.valueOf(w), data[w]);	//출력 : 0=홍길동
			w++;
		}while(w<data.length);
		System.out.println(m);

		
	  Map<String,String> m2 = new HashMap<>();
		for(String names : data) {
		} 
 		System.out.println(m2);
		
 		//분리작업.
	  String alldata [] = {"names=홍길동","age=25","email=hong@naver.com" };
	  
	  Map<String,String> m3 = new HashMap<>(); //arraylist 적용이 된 상태에서 사용가능.
	  
	  
	  for(int f=0; f<alldata.length; f++) {
		  String key[] = alldata[0].split("="); // =를 기준으로 데이터 분리.
		 m3.put(key[0],key[1]);                      
	  }
	  System.out.println(m3);      // {names=홍길동}
	  System.out.println(m3.get("names")); // 홍길동   
	  

		  
	  
	  
 		
 		
		
		
	}

}
