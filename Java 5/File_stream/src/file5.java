import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner�� �̿��� ���� �ε��   ��ĳ�ʵ� IO  (output)
public class file5 {

	public static void main(String[] args) throws IOException {

		//system.in : input 
		//system.out : output
		try {
		FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\\\db.txt",Charset.forName("UTF8"));
			
	//	File fr = new File("C:\\Java 5\\File_stream\\src\\db.txt");	 ---> ���� ��ȯ�� �ȵ� ms949>utf8.. 

		Scanner sc = new Scanner(fr);  //system.in (in:����� �����Է�), (fileReader : ������ �ε�)
	/*	for(;;) { //loop�� ����ó���� ���� �� ����.
		String result = sc.nextLine();   // ���Ϸε� �� �Է°��� result ���� (�������� ��ĳ�ʷε�), ���� �ε�� nextLine �� �⺻�� 
		if(result==null) {
		System.out.println(result);  //���
		}
		else { sc.close(); break;  }
		} */ 
		int count = 0;
			while(sc.hasNext()) {   // hasnext() : true �� ��� ���� false�� ������.
			sc.nextLine();
			count++;
		System.out.println(count);
		sc.close();
		fr.close();
		
			}
		}
		catch(IOException a) {	
			
		}
		

	}
}
