import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException {

		try {
			//createDirectories : �ű� ���丮 ����
			//Files.createDirectories(Paths.get("C:\\Java 5\\File_stream\\src\\test.txt"));			

			
			/* ���� ����
			Path data1 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db.txt");
			Path data2 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db2.txt");  // �״�� �����ϱ�
			Files.copy(data1, data2);  (������ ������, ���絥���� �̸�)
			*/

		
			/*�ٸ� ���丮�� �̵�
			Path data3 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db2.txt");
			Path directory =Paths.get("C:\\memo\\movie_db2.txt";)
			Files.move(directory, data3);
			 */
			
			/*�ش����� �����
			Path data3 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db2.txt");
			Files.delete(data3);
			*/
			
			/*�ش����� ����*/
			Path data3 = Paths.get("C:\\Java 5\\File_stream\\src\\movie_db3.txt");
			Files.createFile(data3);
			
			
			
					
		}
	   catch(Exception z) { 	}
		

	
	
		
	}

}
