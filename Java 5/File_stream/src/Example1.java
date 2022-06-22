import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException{
	
		/* [응용문제]
		 * 해당 사용자가 영화제목을 검색합니다.
		 * 해당 영화 제목에 맞는 데이터값이 있을 경우 영화 전체에 대한 정보를 출력하게 됩니다.
		 * 힌트: scanner 사용
		 * [범죄도시] - 추천5, 2022년 4월 개봉
		 * "검색할 영화제목을 입력하세요? :뽀로로
		 * 검색한 영화는 확인되지 않습니다.
		 */
		
		List<String> mlist = Files.readAllLines(Paths.get("C:\\Java 5\\File_stream\\src\\movie_db.txt"));
//		System.out.println(mlist);
     	
		ArrayList<String > ml = new ArrayList<>(mlist);
		Scanner sc = new Scanner(System.in);

		int ea = ml.size();//14
		
		
		try {
		System.out.println("검색할 영화 제목을 입력하세요?");	
		
		String user = new String(sc.nextLine()).intern();
		String sub;
	
		for(int f=0; f<ea; f++) {
			if(user!=null) {
			ml.get(f).indexOf(user);
		
		
			
			
		  }
		else {
			System.out.println("검색한 영화는 확인 되지 않습니다.");
			break;
			
		} }
  }
		
		
		
		catch(Exception i){
		}
		
		
		
		
		
		
		
		
		
		
//--------------------------	
	}

}
