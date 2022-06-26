package Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		/* [응용문제]
		 * 사용자가 6개의 숫자를 입력하는 로또 프로그램 입니다.
		 * 프로세서 시작 시 "숫자를 입력해 주세요 : " 라고 입력합니다. 총 6번의 숫자를 입력받게 됩니다.
		 * 그리고 lotto.txt 결과 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇개를 맞췄는지를 검토하는 프로그램 코드를 작성하시오.
		 * [결과예시]
		 * 로또 결과 : 총 3개의 번호를 맞추셨습니다.
		 * */

		lotto lt = new lotto();
        lt.setter();
	
	}

}

class lotto {
	Scanner sc = null;
	LinkedList<Integer> k = null;
	String url ="C:\\Java Test\\JavaTest\\src\\Java\\lotto.txt";
			
	public void setter() {
		try {
		this.fileload();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
	
	public String getter() {
		return null;
		
	}
	public void fileload() throws IOException {
		
		try {
	
	//	InputStream is = new FileInputStream("경로")
		FileInputStream fi = new FileInputStream(this.url); 
		//	System.out.println(fi.available()); //ASCII 코드 로드.  abailable 파일 전체크기확인 함수
			byte[] temp = new byte[fi.available()];  // 파일 사이즈 설정.
	
			int ea = fi.read(temp);
		//	System.out.println(fi.read(temp));// -1 :읽은거 확인
			String test = new String(temp); //string test = new String(temp, "UTF8"), (temp, 0, ea)
		//	System.out.println(test); //sysout 을 반복문 돌리면됨.
			int w=0;
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	
	}
	
}