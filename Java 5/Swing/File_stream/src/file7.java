import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

/*���� ��ɾ� 
 read(), readLine(), next(), nextLine(); */
//BufferReader : output)
public class file7 {

	public static void main(String[] args) throws IOException {

		try {
			
			FileReader fr = new FileReader("C:\\Java 5\\File_stream\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read()); 1���� Ȯ��..��
	
			//bufferReader : Temp(�ӽ������) ȿ�������� ������ ���� ������ ������ �� �ֽ��ϴ�.
			BufferedReader bf = new BufferedReader(fr);
		//	BufferedReader bf2 = new BufferedReader(fr);
		//	BufferedReader bf3 = new BufferedReader(fr);
		//	bf.close();   //--> bf2,3 �ѹ����� �� ����.
			
//			System.out.println(bf.readLine());  //--buffer 1��° �� ���
//			System.out.println(bf.readLine());  //--buffer 2��° �� ���
			//�ӽ� ����ҿ��� ����� ���� �� ��ü �Ѱ��� �������� �ε��ϰ� �˴ϴ�.
			//�״��� ���빮 ������ݺ����ϸ��.
		
			//buffer�� �ּ� ���� ����Ͽ��� ��� ������ �������� �����.
			/*���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �˴ϴ�. if(bf.readLine()!=null) {System.out.println(bf.readLine());}  if���� ���-�ѹ� �۵� �� .. ���۵�..*/
			//����Լ� ����ؾߵ�.
			
			
		/*�ݺ������� ���	int w = 0;
			while(w<=1) {
				String data = bf.readLine();
				System.out.println(data);
				w++;
		} */
			
			/*buffer�� �ӵ��� ������� ��� �κп� ������ ���� �Ǵ� �迭�� ���� �� ����ϴ°��� �����մϴ�.*/
	        String line = "";
	    	while((line=bf.readLine())!=null) {
			System.out.println(line);       //�ܵ�X ������ �ڷ��� �ѹ� ���ļ� ���(���)	
			}
			
	    	/*������ ������ ���ΰ����� Ȯ��*/
	    	/*LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� class �Դϴ�. */
	    	FileReader fr2 = new FileReader("C:\\Java 5\\File_stream\\src\\buffer.txt",Charset.forName("UTF8"));
	    	LineNumberReader li = new LineNumberReader(fr2);
	    	int ea = 0;
	    	while(li.readLine()!=null) {
	    		ea = li.getLineNumber();  //2��.. bf ������ ����ؼ� fr �����ͼ� ����ؾߵ�.
	    	}
	    	System.out.println(ea);      
	//    	System.out.println(fr2.readLine()); //--> null fr2, bf�Ѵ� ����..
	    	
	    	
		}catch(Exception z) {
			System.out.println(z);
		}
		
///////////////////////////////////////////		
	}

}
