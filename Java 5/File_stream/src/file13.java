import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException {

		try {
			//createDirectories : 신규 디랙토리 생성
			//Files.createDirectories(Paths.get("C:\\Java 5\\File_stream\\src\\test.txt"));			

			
			/* 파일 복사
			Path data1 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db.txt");
			Path data2 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db2.txt");  // 그대로 복사하기
			Files.copy(data1, data2);  (복사할 데이터, 복사데이터 이름)
			*/

		
			/*다른 디렉토리로 이동
			Path data3 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db2.txt");
			Path directory =Paths.get("C:\\memo\\movie_db2.txt";)
			Files.move(directory, data3);
			 */
			
			/*해당파일 지우기
			Path data3 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db2.txt");
			Files.delete(data3);
			*/
			
			/*해당파일 생성*/
			Path data3 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db3.txt");
			Files.createFile(data3);
			
			
			
					
		}
	   catch(Exception z) { 	}
		

	
	
		
	}

}
