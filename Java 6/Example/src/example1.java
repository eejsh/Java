import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Arraylist
public class example1 {

	public static void main(String[] args) {
	
		
		String color [] = {"red", "blue", "green"};
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(color));
		System.out.println(al);

		al.remove(1);
		System.out.println(al);
		
		int number[] = {1,2,3,4};
		Integer number2[] = { number[0],number[1],number[2],number[3]}; //Integer�� ������ȯ.
		
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(number2));    //����... ���ڰ� ���ڷ� ���� ���� ����.
		
		int abc [] = {3,4,7,9,10 };
		
		List<Object> al3 = new ArrayList<>(Arrays.asList(abc));  // ��, object�� ��ü 1���� ��ü�� �ν��ϱ� ������ �ٷ� ����ϱ� ����.
	   
		Object test = al3.get(0); //int->object�� ���� �� �� �ε� �ϱⰡ ����..
		
		
		List al5 = new ArrayList<>();
		int w= 0;
		while(w<abc.length) {
			al5.add(abc[w]);
			w++;
			
		}
		int num = Integer.parseInt(al5.get(1).toString());
			System.out.println(num);
		
		
		
		List al4 = new ArrayList<>();  // ��.
		
		al4.add("A");
		al4.add(10);
		al4.add("B");
		al4.add(20);
		al4.add(30);
		
		String munja = String.valueOf(al4.get(0).toString());
		System.out.println(munja);
		
		int check = Integer.parseInt(al4.get(0).toString());
		System.out.println(check);
		
		
		/* ����..
		 * 
		 *  arraylist�� ������ �̿��Ͽ� ������� ��� �ǵ��� �մϴ�.
		 *  ���õ����� => { "red", "green", "blue","pink", "orange", "black", "white", "hotpink", "gray" }
		 *  �ش� ������ ���� �� �� 6�� �̸��� ���� ��� ���� �� 
		 *  ��� �迭 ������ �����Ͻÿ�.. 
		 *  orange, hotpink
		 *  
		 *  ��������, �ٽ� ��迭 �ϴ��� arraylist �� �迭.
		 *  */
		
		
		
		
		
	}

}
