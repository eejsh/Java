package Swing1;

import java.util.HashMap;
import java.util.Map;

public class Swing2 {

	public static void main(String[] args) {
	//	ArrayList, LinkedList  (�迭��) add, remove, get, size
	// map (�迭Ű, �迭��)  -> add ��� put ���, remove, get, size.
	// map : �迭Ű�� ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�. (�ӵ� �ֻ��)
	// ���� Ű�� ��� �� �������� ����� ������ ���ŵ˴ϴ�.
	// Ű ���� ���� �ߺ� ��Ű�� ����.
				
		// hashmap ->��ƿ, �Ϲ������� ��ȣȭ�� �Ǿ�����. 
		
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(hashmap) -> 8X21949CB(�ߺ����� �߻����� ����)
		
		m.put("hong", "ȫ�浿");        //hong = key, ȫ�浿 = ��
	//	m.put("hong", "������");   m.get("hong") --> ȫ�浿�� �ƴ� ���������� ���  hong=ȫ�浿, hong=������ ������ hong������ �����.
		m.put("kang","������");
			System.out.println(m.get("hong"));          
		
		int a = 10;
		a = 40;
		System.out.println(a);

//		m.put("", "�����ż�");  //���ִ� Ű�� ����� �� �� ������, map �������� �ùٸ��� ����.
//		System.out.println(m);   // -->( =�����ż�, )
		
		m.put("park", "");
		if(m.get("park").equals("")) { //key�� ������ ���� ������ ���.
			m.put("park", "��");
		}
		System.out.println(m.get("park"));

		m.remove("hong"); 
		System.err.println(m);
		
		//����ȸ�� ����. id.pw.email �� �ϸ� ���� ->�ּ�,��ȭ��ȣ�� �������: key�� ������ ���� �������� .. ���� �ֹ��� �ּ�.��ȭ��ȣ �ۼ� 

		// map :key,  �������� �ڷ����� ����� �� ����.
		Map<String, Integer> m2 = new HashMap<>();  //key�� String, ���� integer�� ����
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2);  //-> {level=5, age=32}
		System.out.println(m2.get("age")); // ->32
		System.out.println(m2.keySet());  // key�� ���
		
		System.out.println(m2.values());  // ���� ���
		
		System.out.println(m2.containsKey("tel"));  //�ش� Ű�� �ִ��� Ȯ�� (false:����, true:����)
		
		
		
		
	}

}
