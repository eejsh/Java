import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//fileoutputStream
public class file12 {

	public static void main(String[] args) throws IOException{
		
		String test = "�����Դϴ�";
		
	//	FileOutputStream os = new FileOutputStream("C:\Java 5\File_stream\src\\array.txt"); �ƹ��ų�~
		OutputStream os = new FileOutputStream("C:\\Java 5\\File_stream\\src\\array.txt");
		byte[] data = test.getBytes();  //���� -> ASCII��ȯ
		os.write(data);
		os.flush(); 
		//Stream�� ����� ��� ���� �޸𸮿� �ְ� �˴ϴ�.
		//flush()�� �޸𸮰��� ��� ���� �۾��� �ϰ� �˴ϴ�. ��Ȥ ������ �����Ͱ� ������ �������� flush() �߰��ϴ°� ����.
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
