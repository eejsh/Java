import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
	
		
		try {
	ex e = new ex();
	e.loader("ok");
			
			// �ڱ� �ڽ��� �ٷ� ���ܻ�Ȳ���� ����.
//			Exception aaa = new Exception();
//			throw aaa;  //throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class�� return �� 
			//---------------- try��, ���� �� �������� �ڵ忡 ���;ߴ�. try�ۿ��� �۵��ȵ�. ex�� �ȳѾ�� main���� ��---exception e ���.
		
		//}catch(Exception|NumberFormatException e) {   catch �ΰ����� �ϳ� ��� �� |���� �����Ͽ� �߰��ϸ��.
		}catch(Exception e) {
		if(e.getMessage()!=null)
			System.out.println(e);
		}
//		}catch(IOException g) {
//			System.out.println(g);
//		}      --->filereader ��� ����.. 
		
	}
}
class ex{
	Exception ep = null;

	public void loader(String a)throws Exception {  //throws �� try~catch�� �ޱ� ���� class �ε� 
	/*�߸��� �������� : �ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ��. */
	/*	if(a=="ok") {   //data != ok �̹Ƿ� exception->throw �Ѿ catch exception���� �Ѿ.
			int keycode = Integer.valueOf(a);  //���������� �޾����� loader class ��ü���� ������ �߻�. 
		}
		else {
			//�ش� ������ �ڽ��� �������׿� ���� ����ó���� �߸��� ���			
			System.out.println("test");
            this.ep = new Exception();       //throw�� �� ����� ���. 
    		throw this.ep; */
		
		/*�ߵȹ���~!*/
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}else {
				System.out.println("test");
		 	}
 	    }
		catch(Exception e) {
		  System.out.println(e.getMessage());
		  //�ڽ��� ���� ������ ���� �޾Ƽ� Ȯ����
		  this.ep = new Exception();
		  throw this.ep;
		  
	  }
   }
}
