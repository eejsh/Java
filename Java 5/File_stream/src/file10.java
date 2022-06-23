import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OuputStream (output) - 최상위 
//(하위) FileOutputStream, objectOutputStream... AudioInputStream
public class file10 {

	public static void main(String[] args) { 
	
	//	String a ="홍길동"; //문자
		String a = "123456789";
		byte[] b = a.getBytes();  //getByte("언어패킷") 메소드 ( a.getBytes("UTF8"); )
		//byte[] : 문자열을 ASCII 형태의 배열로 변경할때 사용.
		System.out.println(Arrays.toString(b)); //아스키코드 [49,50,51,52,53,54,55,56,57]
		OutputStream os = System.out; // 출력만 사용
		
		try{  
  			os.write(b,0,b.length);  //(byte배열이름, 배열번호(0부터시작), 배열크기) 문자로 바꿔줌 //  아스키코드를 기본문자(123456789)로 변역해줌.
			os.flush();    // 출력파트
			
			//System.out.println(os);
		}catch(Exception z) {
			
		}
		
		// 무조건 ASCII코드
		
		
		
		
	}

}
