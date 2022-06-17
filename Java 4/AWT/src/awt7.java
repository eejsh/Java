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
		Checkbox ck = new Checkbox("동의함");   //체크박스
		Choice se = new Choice();          
		ck.setBounds(30, 40, 100, 30);
		se.setBounds(30, 130, 150, 80);

		se.add("skt");
		se.add("kt");
		se.add("Lgt");
		se.add("알뜰폰");
		
		
		fr.add(ck);
     	fr.add(se);

     	//addItemListener: checkbox, choice 에서 사용함 
     	
		ck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			String checks = (String)e.getItem();
				System.out.println(checks);
			
				 System.out.println(e.getStateChange());  // 체크박스를 1, 2로 받음. 1: check (체크 된상태) 2: nucheck (체크 안된상태)
				
				 
				 if(e.getStateChange() == 1) {
				//	 System.out.println("동의하셨습니다.");
					agree = false;
				 }
				 else{
			     	agree = true;
					 
					 //	 System.out.println("동의를 하셔야 합니다.");
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
