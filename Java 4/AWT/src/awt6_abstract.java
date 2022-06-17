
//인증번호시스템 - awt6.java 연계
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class awt6_abstract {
	static String pc = "";   //pc random 메모리에 올림.
	
	//setter
	public abstract void setter(String userno);

	//getter
	public abstract void getter() ;
	
	
	Frame fr = new Frame();
	Button bt = null; // 인증번호확인
	Button bt1 = null;
	TextField mid = null; // 입력칸
	Label msg = new Label(); // 메세지 출력
	Button close = null;

	public void design() {

		this.fr.setBounds(300, 300, 400, 180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);

		this.bt = new Button("인증번호발송");
		this.bt1 = new Button("인증확인");
		this.close = new Button("닫기");
		this.mid = new TextField();

		this.bt.setBounds(30, 40, 100, 25);
		this.bt.setBackground(Color.LIGHT_GRAY);

		this.bt1.setBounds(270, 80, 100, 25); // 인증확인
		this.bt1.setBackground(Color.LIGHT_GRAY);

		this.mid.setBounds(30, 80, 140, 25); // 인증번호 입력칸

		this.msg.setBounds(30, 120, 250, 25);
		this.msg.setBackground(Color.lightGray);

		this.close.setBounds(340, 40, 30, 25);

		// frame
		this.fr.add(bt);
		this.fr.add(bt1);
		this.fr.add(close);
		this.fr.add(mid);
		this.fr.add(msg);

		
		this.click();
		
	}

	
	public void click() {
	
	this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
				
				
				System.out.println(e);
			}
		});
		
	this.bt.addActionListener(new ActionListener() {     //인증번호 발송
		@Override
		public void actionPerformed(ActionEvent e) {
			//반복문으로 4자리 만들어야됨..ㅠ
		Random ra = new Random();
	//	System.out.println(pc);
		pc = "";
		for(int f=1; f<5; f++) {
		pc += String.valueOf(ra.nextInt(10));
		} 
	
		
		}
	});	
	
	this.bt1.addActionListener(new ActionListener() {   //인증확인
	
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(awt6_abstract.this.mid.getText().equals("")) {
				awt6_abstract.this.msg.setText("인증번호를 입력해 주시길 바랍니다..");
				
			}
			else {
				setter(mid.getText());
				msg.setText(getter());
			}
		

			
			
			
		}
	});	
		
		
		
		
		
	}
}











//public abstract class awt6_abstract {
//
//	public abstract int oknumber(int numbers); // 인증번호 
//	public abstract int allok();
//
//	Frame fr = new Frame();
//
//	Button bt = null; // 인증번호확인
//	Button bt1 = null;
//
//	TextField mid = null; // 입력칸
//
//	Label msg = new Label(); // 메세지 출력
//	Button close = null;
//
//	public void ckframe() {
//
//		this.fr.setBounds(300, 300, 400, 180);
//		this.fr.setLayout(null);
//		this.fr.setVisible(true);
//
//		this.bt = new Button("인증번호발송");
//		this.bt1 = new Button("인증확인");
//		this.close = new Button("닫기");
//		this.mid = new TextField();
//
//		this.bt.setBounds(30, 40, 100, 25);
//		this.bt.setBackground(Color.LIGHT_GRAY);
//
//		this.bt1.setBounds(270, 80, 100, 25); // 인증확인
//		this.bt1.setBackground(Color.LIGHT_GRAY);
//
//		this.mid.setBounds(30, 80, 140, 25); // 인증번호 입력칸
//
//		this.msg.setBounds(30, 120, 250, 25);
//		this.msg.setBackground(Color.GREEN);
//
//		this.close.setBounds(340, 40, 30, 25);
//
//		// frame
//		this.fr.add(bt);
//		this.fr.add(bt1);
//		this.fr.add(close);
//		this.fr.add(mid);
//		this.fr.add(msg);
//
//		this.click();
//
//	}
//
//	public void click() {
//		this.bt.addActionListener(new ActionListener() { // 인증번호 발송.
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				int pc = (int) (Math.random() * 10000 + 1 - 1000) + 1000;
//				awt6_abstract.this.oknumber(pc);
//
//			}
//		});
//
//		this.bt1.addActionListener(new ActionListener() { // 인증확인
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				String oo = awt6_abstract.this.mid.getText();
//			
//				
//		      try {
//		    	  
//		    	  int ok = Integer.parseInt(oo);
//		    	  awt6_abstract.this.allok();
//		    	  int result = allok();
//		    	  if (result == ok) {
//		    		  msg.setText("인증이 완료되었습니다.");
//		    	  } else {
//		    		  msg.setText("인증번호를 다시 확인하세요.");
//		    		  
//		      }}
//		      
//		    	  catch(Exception z) {
//		    	  msg.setText("숫자 4자리를 입력하세요. ");
//		      }
//	 	}
//	});
//
//		this.close.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
//
//	}
//
//}