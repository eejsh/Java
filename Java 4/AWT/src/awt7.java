import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	
	Checkbox ck = null;
	static boolean  agree = false;
    
	public static void main(String[] args) {
		
		Frame fr = new Frame();
		
		fr.setBounds(200, 100, 350, 180);
		fr.setLayout(null);
		fr.setVisible(true);
		Checkbox ck = new Checkbox("������");   //üũ�ڽ�
		Choice se = new Choice();          
		ck.setBounds(30, 40, 100, 30);
		se.setBounds(30, 130, 150, 80);

		se.add("skt");
		se.add("kt");
		se.add("Lgt");
		se.add("�˶���");
		
		
		fr.add(ck);
     	fr.add(se);

     	//addItemListener: checkbox, choice ���� ����� 
     	
		ck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			String checks = (String)e.getItem();
				System.out.println(checks);
			
				 System.out.println(e.getStateChange());  // üũ�ڽ��� 1, 2�� ����. 1: check (üũ �Ȼ���) 2: nucheck (üũ �ȵȻ���)
				
				 
				 if(e.getStateChange() == 1) {
				//	 System.out.println("�����ϼ̽��ϴ�.");
					agree = false;
				 }
				 else{
			     	agree = true;
					 
					 //	 System.out.println("���Ǹ� �ϼž� �մϴ�.");
				 }
				 System.out.println(agree);
				 
			}
		});
		se.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
		
				String change = (String)e.getItem();
				System.out.println(change);
				
				
			}
		});

	}

}
