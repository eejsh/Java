import java.io.FileWriter;

//파일 쓰기 [write]
public class file4 {

	public static void main(String[] args) throws Exception{
	//FileWriter : 문자 데이터 추가 class..
		
		try {String user[] = {"홍길동40","김유신60","강감찬100","유관순300"};
		FileWriter fw = new FileWriter("C:\\Java 5\\File_stream\\src\\array.txt",true);  // true 사용 시 기존 입력사항 초기화 하지 않음.
		//FileWriter fw = new FileWriter("C:\\Java 5\\File_stream\\src\\array.txt");  // 검토 안하고 바로 써버림, 기존 입력사항 초기화 후 재작성.
		for(int f=0; f<user.length; f++) {
				System.out.print(user[f]);
			fw.write(user[f]);	      //write : 문자, 배열데이터 값을 파일에 적용함. 
			}
			fw.close(); //파일 오픈사항 종료 하여 적용합니다.
		}catch(

			
				
	Exception x)
	{
		System.out.println("test1");

    	}
   }
}


