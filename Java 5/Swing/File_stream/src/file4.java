import java.io.FileWriter;

//���� ���� [write]
public class file4 {

	public static void main(String[] args) throws Exception{
	//FileWriter : ���� ������ �߰� class..
		
		try {String user[] = {"ȫ�浿40","������60","������100","������300"};
		FileWriter fw = new FileWriter("C:\\Java 5\\File_stream\\src\\array.txt",true);  // true ��� �� ���� �Է»��� �ʱ�ȭ ���� ����.
		//FileWriter fw = new FileWriter("C:\\Java 5\\File_stream\\src\\array.txt");  // ���� ���ϰ� �ٷ� �����, ���� �Է»��� �ʱ�ȭ �� ���ۼ�.
		for(int f=0; f<user.length; f++) {
				System.out.print(user[f]);
			fw.write(user[f]);	      //write : ����, �迭������ ���� ���Ͽ� ������. 
			}
			fw.close(); //���� ���»��� ���� �Ͽ� �����մϴ�.
		}catch(

			
				
	Exception x)
	{
		System.out.println("test1");

    	}
   }
}


