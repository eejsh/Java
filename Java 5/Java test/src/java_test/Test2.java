package java_test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args)  {
		
		/*각각의 개당 가격이 있습니다.
		해당 장바구니는 갯수만큼 전체 값을 계산하여 총 결제 할 금액을 출력하는 프로그램을 작성하시오.
		
		[결과출력]
구매하시고자 하는 총 결제 금액은 :  XXXXX 원 입니다.
※ 각각 1개당 가격 관련 사항 배열은 직접 제작하시길 바라며, 해당 배열 기본가격 절대 값이 변하지 않아야 합니다.
각각 1개당 가격 관련 사항은 별도의 java 파일에서 로드 하여 가져오시길 바랍니다.
		*/
	basket b = new basket();
	b.basket_data();
	System.out.println("최종 결제 금액은" + b.total +"입니다.");
	}
	
} 
class basket extends Test2_data{      //Test2_data.java 연결
	static int total = 150;   //최종적 ststic올려도됨
	public void basket_data() {
		String user[] = { "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" };
System.out.println(Arrays.toString(this.momey));
	
	}


}