import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//Files�� �ش� ��� ������ �迭�� ���۽�Ű�� ���.
public class file8 {

	public static void main(String[] args) throws IOException {
		
		//List : �ֻ��� �迭 class
		//files : �ű� IO class �Դϴ�. �����ϰ� readAllLines(��ü ������ �ѹ��� ��� ����) ����. 
		//Files + Paths.get("���ϰ��");

		List<String> data = Files.readAllLines(Paths.get("C:\\Java 5\\File_stream\\src\\buffer.txt"));
		System.out.println(data);
		
	
		//���� : �޸� �Ҵ��� ����, �ѱ۾����Ŷ�� �����ؾ� ��.
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\Java 5\\File_stream\\src\\buffer.txt"));
		System.out.println(new String(data2));  
		
		
	}

}
