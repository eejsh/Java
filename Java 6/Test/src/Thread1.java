//Thread�� ���� class���� ��� ����.   extends,  implement--(interface���� ���)  (�Ѵ� �ӵ� ��� interface�� class�� ���缭���)

public class Thread1 {

	public static void main(String[] args) {
		//	class box extends Thread ����Ŭ�������� ������� ����...
		
		// ���������� ó���ؾߵǴ� ���� �Ϲ� class ��� (�߰��� ������ ���� �� ���� ������ ������ ���..)
		// thread �� ���������� ó���� �� ���  (�߰��� ������ ���ܵ� ���� ������� ó�� ����)
		
		class_box cb = new class_box();
		for(int a=0; a<10; a++) {
		//	cb.run("Ŭ���� ó����Ȳ" + a);     //class_box�� �� ������.
		}
		
		cpu_box cp = null; 
		//Thread�� �̿��Ͽ� ���� ó�� �� ��������� �������� �մϴ�.
		for(int b=0; b<10; b++) {
		cp = new cpu_box("������ ó����Ȳ" + b);
//		cp.start();                //cpu_box - Thread
		}
		/*Thread�� �̿��Ͽ� ���� ����ó�� ��� �̸� ������ �߻��ϴ��� �ش� ������ �߻��� Thread�� ����ó��, �� �� ������ ��� ó���ϴ� ���� */
		call_box bb = null;
		
		int w=0;
		String msg = "";
		String msg2 = "";
		// String msg = null -> null�̶�� ���� �� ����.
		while(w<10) {
			if(w == 5) {
				msg2 = "5";      
			}
			else {
				msg2 = ""; 
			}
			bb = new call_box(msg+msg2);  //null,null
			bb.start();
			w++;
		}
			
		
	}
}

class call_box extends Thread{
	String callname = null;
	
	public call_box(String z) {
		
	this.callname =z;
	}
	@Override
	public void run() {

		try {  //if ������ ����ó��    throw ������ ����ó�� �Ѵ� Ȯ���ϴ� ���..
	
			if(this.callname.length() > 0) {
       //���� �߻� �� ���� �����߻���ų�� ��� throw  (throws�ƴ�)
	    Exception aaa = new Exception();
	    throw aaa;
	    // throw new Exception(); 
		
		
		}
		else {
			System.out.println(this.callname.length());
		}

		}catch(Exception e) {
		System.out.println("�ش� �� �� �߸��� ���� �߻� �Ͽ����ϴ�.");	
		}
		finally {
			
		}
				
	}
}



class cpu_box extends Thread {    //Thread class  - 5�� ȣ���ϸ� 1-5���� ���������� ���°� �ƴ϶� 12345 �ѹ��� �۵�
	//thread�� ������ run�̶�¸޼ҵ� �־����.
	String name = null;
	public cpu_box(String a) {
		this.name=a;
		

	}
	@Override
	//�μ����� ��������. -- �ʵ�� �����ؼ� ������������. this. cpu_box �޼ҵ� �߰��Ͽ� ó��..
	public void run() {
		System.out.println(this.name);
		
	}
}

class class_box{ //12345 ���������� ��ٷȴٰ� ���ư�
		public void run(String name) {
		System.out.println(name);

		}
}