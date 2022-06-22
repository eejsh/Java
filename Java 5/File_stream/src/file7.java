import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

/*공통 명령어 
 read(), readLine(), next(), nextLine(); */
//BufferReader : output)
public class file7 {

	public static void main(String[] args) throws IOException {

		try {
			
			FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read()); 1글자 확인..ㅠ
	
			//bufferReader : Temp(임시저장소) 효율적으로 파일을 보다 빠르게 가져올 수 있습니다.
			BufferedReader bf = new BufferedReader(fr);
		//	BufferedReader bf2 = new BufferedReader(fr);
		//	BufferedReader bf3 = new BufferedReader(fr);
		//	bf.close();   //--> bf2,3 한번ㅇ에 다 닫힘.
			
//			System.out.println(bf.readLine());  //--buffer 1번째 줄 출력
//			System.out.println(bf.readLine());  //--buffer 2번째 줄 출력
			//임시 저장소에서 저장된 내용 중 전체 한개의 라인으로 로드하게 됩니다.
			//그다음 내용문 보려면반복문하면됨.
		
			//buffer는 최소 값을 출력하였을 경우 무조건 다음라인 출력함.
			/*조건문 사용시에도 한번 작동이 이루어지게 됩니다. if(bf.readLine()!=null) {System.out.println(bf.readLine());}  if문에 사용-한번 작동 후 .. 오작동..*/
			//재귀함수 사용해야됨.
			
			
		/*반복문으로 출력	int w = 0;
			while(w<=1) {
				String data = bf.readLine();
				System.out.println(data);
				w++;
		} */
			
			/*buffer는 속도가 빠른대신 사용 부분에 무조건 변수 또는 배열로 받은 후 사용하는것을 권장합니다.*/
	        String line = "";
	    	while((line=bf.readLine())!=null) {
			System.out.println(line);       //단독X 무조건 자료형 한번 거쳐서 사용(재귀)	
			}
			
	    	/*데이터 문서의 라인갯수를 확인*/
	    	/*LineNumberReader : 파일 전체 라인 갯수를 확인하는 class 입니다. */
	    	FileReader fr2 = new FileReader("C:\\Java 5\\File_stream\\src\\buffer.txt",Charset.forName("UTF8"));
	    	LineNumberReader li = new LineNumberReader(fr2);
	    	int ea = 0;
	    	while(li.readLine()!=null) {
	    		ea = li.getLineNumber();  //2줄.. bf 위에서 사용해서 fr 가져와서 사용해야됨.
	    	}
	    	System.out.println(ea);      
	//    	System.out.println(fr2.readLine()); //--> null fr2, bf둘다 못씀..
	    	
	    	
		}catch(Exception z) {
			System.out.println(z);
		}
		
///////////////////////////////////////////		
	}

}
