import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException{
	
		/* [���빮��]
		 * �ش� ����ڰ� ��ȭ������ �˻��մϴ�.
		 * �ش� ��ȭ ���� �´� �����Ͱ��� ���� ��� ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
		 * ��Ʈ: scanner ���
		 * [���˵���] - ��õ5, 2022�� 4�� ����
		 * "�˻��� ��ȭ������ �Է��ϼ���? :�Ƿη�
		 * �˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.
		 */
		
		List<String> mlist = Files.readAllLines(Paths.get("C:\\Java 5\\File_stream\\src\\movie_db.txt"));
//		System.out.println(mlist);
     	
		ArrayList<String > ml = new ArrayList<>(mlist);
		Scanner sc = new Scanner(System.in);

		int ea = ml.size();//14
		
		
		try {
		System.out.println("�˻��� ��ȭ ������ �Է��ϼ���?");	
		
		String user = new String(sc.nextLine()).intern();
		String sub;
	
		for(int f=0; f<ea; f++) {
			if(user!=null) {
			ml.get(f).indexOf(user);
		
		
			
			
		  }
		else {
			System.out.println("�˻��� ��ȭ�� Ȯ�� ���� �ʽ��ϴ�.");
			break;
			
		} }
  }
		
		
		
		catch(Exception i){
		}
		
		
		
		
		
		
		
		
		
		
//--------------------------	
	}

}
