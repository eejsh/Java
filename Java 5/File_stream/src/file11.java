import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream�� �̿��� ���Ϸε�
public class file11 {

	public static void main(String[] args)throws IOException {
		
		try {
		
		FileInputStream fs = new FileInputStream("C:\\Java 5\\File_stream\\src\\list.txt");
	
		System.out.println(fs.available());   //���� ��ü ������ Ȯ��. - �̹������� ���.   availalble : ���� ��ü ũ��
		byte temp[] = new byte[fs.available()];   //������ �뷮�迭���� ( ���� ũ�⿡ ���� �������ְ� �����)
		int ea = fs.read(temp);          
		String data = new String (temp, "UTF-8"); 
		System.out.println(data);
		
		//	InputStream fs = new FileInputStream("C:\\Java 5\\File_stream\\src\\list.txt");
	/*	byte temp[] = new byte[1024*16];  //1024*16 = ����ũ�� : byte�� ũ�� ��������� ����. ����� �����Ͱ� Ŀ��.OR // eX)�̸��� 2mb���ϸ� �÷��ּ���->��������
		int ea = fs.read(temp); // ASCII code�� ��ü�� �о ea�� �޵��� ��.
		String data = new String(temp,"UTF-8"); //String �������·� �迭�� �޾Ƽ� ���
		System.out.println(data);    */
		
		
		}catch(Exception e) {
			
		}
		
		
		
	}

}
