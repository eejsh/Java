import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args){
	
		/* [응용문제]
		 * 해당 사용자가 영화제목을 검색합니다.
		 * 해당 영화 제목에 맞는 데이터값이 있을 경우 영화 전체에 대한 정보를 출력하게 됩니다.
		 * 힌트: scanner 사용
		 * [범죄도시] - 추천5, 2022년 4월 개봉
		 * "검색할 영화제목을 입력하세요? :뽀로로
		 * 검색한 영화는 확인되지 않습니다.
		 */
		
		try {  // 파일 로드 및 메소드 전달
		Scanner sc = new Scanner(System.in);
		System.out.println("1번. 개봉영화,  2번 개봉예정 영화  : ");
		int user = sc.nextInt();
		if(user==1) {
			movie m =new movie("movie_db.txt");
		}
		else if(user==2) {
	    	System.out.println("서비스 준비중입니다...");
	    	sc.close();
		}
		    
			
		}catch(Exception k) {
		if(k.getMessage()!=null) {
			System.out.println("현재 서비스가 정상적이지 않습니다..");
     		}
		}
	}
}
	
	class movie{
		private String path = "C:\\Java 5\\File_stream\\src\\";               //경로
		private BufferedReader bf = null;
		private FileReader fr = null;
		private ArrayList<String> list = null;        
		private Scanner sc = null;
		
		public movie(String filename) throws IOException {
		try {
		
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.coustom();
			this.fr.close();
			this.bf.close();

			this.search();
		
		}catch(Exception a) {
			System.out.println("찾는 영화가 없습니다.");
	}
	}
		
	
	public void coustom() throws IOException {
		this.bf = new BufferedReader(this.fr);   //buffer에만 올리는 용도로 사
		//System.out.println(this.bf.readLine());

		String datas=this.bf.readLine();
		//반복문!!! - 처음에 읽고 들어가기때문에 [1]부터 시작함으로 String 빈값을 한번 넣어야됨. string data = null -> 0번에 빈값부터 시작.[null, [0][1][2]...]
		//String datas = this.bf.readline(); 0번 값을 임의로 넣어주기. [0]부터 시작하게됨.
		
		this.list = new ArrayList<>();         //공간 만들어서 사용.
		
	//	while(datas=this.bf.readLine())!=null) {
		do{
			this.list.add(datas);
			}while((datas=this.bf.readLine())!=null);    //bf의 라인이 없을떄까지?
		 //    System.out.println(this.list);  ->데이터 확인
	}

      public void search() {
    	  this.sc = new Scanner(System.in);
    	  System.out.println("검색할 영화 제목을 입력해 주세요 : ");
    	  //indexof, contanis
    	 String subject = this.sc.next().intern();
    	 boolean call= false;
    	 
    	 if(subject=="종료"){
    		 sc.close();
    		 System.out.println("끗");
    		 System.exit(0);
    	 }
    	 
    	 for(String moviesb : this.list) {
 
//    		 if(moviesb.indexOf(subject)!=-1) {    
//    			 System.out.println(moviesb);
//    		 }
 	
    		 if(moviesb.contains(subject)) {
    		System.out.println(moviesb);
    		call = true;
    		 }
    	 }
    		if(call==false) {
    			System.out.println("데이터를 확인 할 수 없습니다.");
    		}
    	//	sc.close();
    	this.search();        //재귀함수 --> search로 감

    	 
    	
    	  
    	  
    }
		
}
	
