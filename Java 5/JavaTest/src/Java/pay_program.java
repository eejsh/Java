package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {

		payoll py = new payoll();
		py.start();

		int result[] = py.check();
	System.out.println("총 이체한 금액은 " + result[0] +"이고, 총 잔고금액은 " + result[1] + " 입니다." );
	}

}


class payoll extends pay_abstract {
	String filename =null;
	int total = 0;
	int all_money = this.money; // 현재 통장에 있는 잔고금액을 가져옴.
	
	//입금파트
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c=0;
		int m_in = 0;  // 재무과 담당자가 입력하는 급여
	
		while(c<this.em_name.size()) {
		System.out.println("이체를 시작합니다. ["+this.em_name.get(c)+"]에게 이체 하실 금액을 입력해 주세요.");
        m_in = sc.nextInt();
        this.all_money -=m_in;
		this.total += m_in;   // 이체된 전체 금액
		c++;	}
		sc.close();
		
		}
	@Override
	public void start() {
//		this.em_name.add("test");
		
		try {
			this.filename = "C:\\Java Test\\JavaTest\\src\\Java\\employee.txt";
			this.db();
			this.input_sc();
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	
	@Override
	void db() throws IOException{
		this.em_name = new ArrayList<>();  //빈배열
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
	//System.out.println((char)this.fr.read());   // (this.fr.getEncoding())인코딩 형식 확인. - 파일 로드 확인.
		
		/////buffer 주의사항 : 한번찍으면 카운팅됨. 
		
    BufferedReader br = new BufferedReader(fr);
 //   System.out.println(br.readLine());          
	String data = br.readLine();
	String user[] = data.split(",");
	System.out.println();
	int ea = user.length;
	int w = 0;
	while(w<ea) {
		this.em_name.add(user[w]);
		w++;
	}
	br.close();
	
   // String test = br.readLine().split(","); // buffer 휘발성이니 배열 한번 받아야됨.
	
	}
	@Override
	public int[] check() {
//		int aa = 10;
//		int bb = 20;
		
		return new int[] {this.total, this.all_money };
	}
	
	
}