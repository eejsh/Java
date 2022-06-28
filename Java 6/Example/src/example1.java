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
		Integer number2[] = { number[0],number[1],number[2],number[3]}; //Integer로 수동변환.
		
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(number2));    //망함... 숫자가 통자로 들어가서 재사용 못함.
		
		int abc [] = {3,4,7,9,10 };
		
		List<Object> al3 = new ArrayList<>(Arrays.asList(abc));  // 단, object는 전체 1개의 객체로 인식하기 때문에 바로 출력하기 힘듬.
	   
		Object test = al3.get(0); //int->object로 적용 시 재 로드 하기가 힘듬..
		
		
		List al5 = new ArrayList<>();
		int w= 0;
		while(w<abc.length) {
			al5.add(abc[w]);
			w++;
			
		}
		int num = Integer.parseInt(al5.get(1).toString());
			System.out.println(num);
		
		
		
		List al4 = new ArrayList<>();  // 빈값.
		
		al4.add("A");
		al4.add(10);
		al4.add("B");
		al4.add(20);
		al4.add(30);
		
		String munja = String.valueOf(al4.get(0).toString());
		System.out.println(munja);
		
		int check = Integer.parseInt(al4.get(0).toString());
		System.out.println(check);
		
				/* 숙제..
		 * 
		 *  arraylist을 무조건 이용하여 결과값을 출력 되도록 합니다.
		 *  원시데이터 => { "red", "green", "blue","pink", "orange", "black", "white", "hotpink", "gray" }
		 *  해당 데이터 색상 값 중 6자 미만의 색상만 모두 삭제 후 
		 *  결과 배열 값으로 생성하시오.. 
		 *  orange, hotpink
		 *  
		 *  날리던가, 다시 재배열 하던가 arraylist 로 배열.
		 *  */
		
		
		
		String data[] = { "red", "green", "blue","pink", "orange", "black", "white", "hotpink", "gray" };
		
		ArrayList<String> color = new ArrayList<>();
		
		int word;	
		for(int f=0; f<data.length; f++) {
			word = data[f].length();
			if(  word >= 6  ) {
				color.add(data[f]);
			}
		}
		System.out.println(Arrays.asList(color));
		
		
		
	}

}
