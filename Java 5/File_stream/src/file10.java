import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OuputStream (output) - �ֻ��� 
//(����) FileOutputStream, objectOutputStream... AudioInputStream
public class file10 {

	public static void main(String[] args) { 
	
	//	String a ="ȫ�浿"; //����
		String a = "123456789";
		byte[] b = a.getBytes();  //getByte("�����Ŷ") �޼ҵ� ( a.getBytes("UTF8"); )
		//byte[] : ���ڿ��� ASCII ������ �迭�� �����Ҷ� ���.
		System.out.println(Arrays.toString(b)); //�ƽ�Ű�ڵ� [49,50,51,52,53,54,55,56,57]
		OutputStream os = System.out; // ��¸� ���
		
		try{  
  			os.write(b,0,b.length);  //(byte�迭�̸�, �迭��ȣ(0���ͽ���), �迭ũ��) ���ڷ� �ٲ��� //  �ƽ�Ű�ڵ带 �⺻����(123456789)�� ��������.
			os.flush();    // �����Ʈ
			
			//System.out.println(os);
		}catch(Exception z) {
			
		}
		
		// ������ ASCII�ڵ�
		
		
		
		
	}

}
