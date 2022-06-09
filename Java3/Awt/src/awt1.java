import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/* GUI ��� : (java7-ver) AWT(abstract window toolkit), SWING (AWT -�׷��������� ���۵�..)
	 * CUI ��� : scanner
	 * 
	 * SWING : jFrame -> jPanel -> jObject
	 * */
	public static void main(String[] args) {
	 // awt �������
		// Frame -> Panel -> Object (��������)
		
		// Object ->Panel -> Frame (�������)
		
		
		popclose pc = new popclose();  
		
		// awt �޼ҵ带 ��ӹ޾� ó��.
		
		Frame fr = new Frame (); //������ â
		fr.setTitle ("����� �α���");    // â �̸�
		fr.setSize(500, 500);         //â ������
		fr.setVisible(true);          //��� ��/��
		
		fr.addWindowListener(pc); 
		
		Panel pa = new Panel();       //�г�
		
		CheckboxGroup radio = new CheckboxGroup();
						
 		TextField id = new TextField(10);   // TextField 10�ڱ���
 		TextField pw = new TextField(10);
 		TextField sa = new TextField(10);  
 		Button b1 = new Button("�α���");  // object
		Checkbox c1 = new Checkbox("�ڵ��α���");
		Checkbox c2 = new Checkbox("������",false, radio);
		Checkbox c3 = new Checkbox("������",true, radio);
		
		fr.addWindowListener(null);
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
	    pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1);    //add�߰� ������Ʈ -> �г�
		fr.add(pa);    //�г� -> ������		

	}
}
class popclose extends WindowAdapter{
	public void WindowClosing (WindowEvent a) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				System.gc();
				
	}
	
}

