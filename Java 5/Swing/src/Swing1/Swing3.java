package Swing1;

import java.lang.constant.Constable;
import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Swing3 {
//�ݺ����� �̿��Ͽ� key ���� �� �迭�� �и��۾�.
	public static void main(String[] args) {
		String data[]= {"ȫ�浿", "������", "�̼���", "������"};  //1�� �迭����
		Map<String,String> m = new HashMap<>();
		//key�� �ݺ������� ������ ����
		int w=0;
		do {
			// �ߺ����� �ʴ� Ű�� ���� + �ش� �迭�� �ִ� index ��ȣ���� �����ؼ� ���� ������ ����.
//	    m.put("name"+w, data[w]);  //��� : name0=ȫ�浿
		m.put(String.valueOf(w), data[w]);	//��� : 0=ȫ�浿
			w++;
		}while(w<data.length);
		System.out.println(m);

		
	  Map<String,String> m2 = new HashMap<>();
		for(String names : data) {
		} 
 		System.out.println(m2);
		
 		//�и��۾�.
	  String alldata [] = {"names=ȫ�浿","age=25","email=hong@naver.com" };
	  
	  Map<String,String> m3 = new HashMap<>(); //arraylist ������ �� ���¿��� ��밡��.
	  
	  
	  for(int f=0; f<alldata.length; f++) {
		  String key[] = alldata[0].split("="); // =�� �������� ������ �и�.
		 m3.put(key[0],key[1]);                      
	  }
	  System.out.println(m3);      // {names=ȫ�浿}
	  System.out.println(m3.get("names")); // ȫ�浿   
	  

		  
	  
	  
 		
 		
		
		
	}

}
