import java.awt.*;
import java.awt.event.*;

class awt4_class {
protected int a;

//awt4.java와 연계

	public void view() { // 실행할곳.
		decorate dec = new decorate();   // awt4.java 자식 class 로 가져갈수 있게 첨부터 로드하면 편함. class-public void 안에 들어와야 작동.
		TextField input = new TextField();      // 사용자가 쓰는 값.
		
		Frame f = new Frame();

	//	Label lb = new Label();      
	    TextArea lb = new TextArea();
		
		f.setBounds(200, 200, 300, 300);
		f.setVisible(true);
		f.setLayout(null); // -bound사용.

		Button btn = new Button("계산");
		Button closebtn = new Button("닫기");
	
		lb.setBackground(Color.gray);
		input.setBounds(50, 50, 100, 25);
		btn.setBounds(180, 50, 80, 25);
		closebtn.setBounds(50, 200, 80, 25);
		lb.setBounds(50, 100, 200, 100);

		f.add(lb);
		f.add(input);
		f.add(btn);
		f.add(closebtn);
	
		btn.addActionListener(new ActionListener() {  //계산     // 하나의 class 취급함.

			@Override
			public void actionPerformed(ActionEvent e) {
			    try { 
				
				int c = Integer.parseInt(input.getText());
				dec.btn_push(c);             // 사용자가 입력한 값을 btn_push 메소드 전달
				lb.setText(dec.calls());     // awt4.java에 있는 getter 메소드 값 받음.
				
			    }catch(Exception aaa) {
			        lb.setText("숫자만 입력하세요");
			    	//System.out.println("숫자만 입력하세요");
			        
			        
			    }

			}
		});  //여기까징..

		closebtn.addActionListener(new ActionListener() {  //닫기버튼

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

}
