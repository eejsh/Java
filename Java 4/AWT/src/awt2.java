
// awt.*모든 옵션 가져오기        event.*; 이벤트 모든옵션 가져오기.
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane; // 경고창 패널

//외부 class로 awt 생성          --main class에서 안씀.
public class awt2 {

	public static void main(String[] args) {

		login lg = new login();
	}
}

class loginok extends login {         //--> 화면 전환하는 자식 클래스.

 public loginok () {
	 
		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	
		
   }
	
}

class login {

	Frame fr = new Frame(); // 필드에 생성해야됨.
	Font ft = new Font("굴림체", Font.PLAIN, 20); // 폰트 설정 -> 폰트체, 굵기, 크키

	TextField mid = new TextField();
	TextField mpw = new TextField();

	Button lg_btn1 = new Button("로그인"); // -->버튼분리. 로그인버튼
	Button close_btn3 = new Button("프로그램종료"); // -->버튼분리. 종료 버튼.
	Button ship_btn2 = new Button("회원가입");

	Label msg = new Label();
	

	public login() { // -->public만 들어가면 바로 실행.       //연습용 > extends abstract (추상 class)를 먼저 로드하여 필드에 적용시킴.

		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

		this.mid.setFont(ft); // 글자 속성을 적용하고자 하는 오브젝트 선택
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*'); // 외따음표.

		this.lg_btn1 = new Button("로그인");
		this.close_btn3 = new Button("프로그램종료");
		this.ship_btn2 = new Button("회원가입");

		mid.setBounds(100, 60, 200, 40);
		mpw.setBounds(100, 120, 200, 40);

		lg_btn1.setBounds(100, 180, 200, 40);
		lg_btn1.setBackground(Color.pink); // setBackground(color . 00) 색상입력

		ship_btn2.setBounds(100, 240, 200, 40);

		this.close_btn3.setBounds(100, 300, 200, 40);

		 this.msg.setBounds(100,100,200,20);        
		//this.msg.setBackground(Color.red);  //라벨 위치 확인.

		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn1);
		this.fr.add(ship_btn2);
        this.fr.add(msg);
        
		
		this.fr.add(this.close_btn3);
		this.clicks();

	}

	public void clicks() { // 버튼에 관한 모든 핸들링 메소드 집합소
		
		
	 this.ship_btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
	          fr.setVisible(false);      //해당 프레임 종료
			loginok ok = new loginok();   // 다음 프레임을 로드합니다. 
			
		}
	});
		
		
		

		this.close_btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 프로그램 종료 이벤트 핸들링 메소드
				System.exit(0);
			}
		});

		this.lg_btn1.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing API 경고 옵션 로드.

			@Override
			public void actionPerformed(ActionEvent e) { // ---->부모 클래스를 따라감. this사용X
				// 로그인 버튼 -> 아이디 및 패스워드 검토

				String user_id = mid.getText(); // object명.getText 사용자가 입력한 값을 가져올때 사용합니다. id 가져오기.
				String user_pw = mpw.getText(); //  pw가져오기

				if (user_id.equals("")) { // null 또한 값이 있는 상태이므로 .equals("");가 빈값임.
					alert.showMessageDialog(null, "아이디를 입력하세요.");
					// alert.showMessageDialog(null, "아이디를 입력하세요.","경고메세지",JOptionPane.ERROR_MESSAGE);
					// msg.setText("아이디를 입력하세요.");
				}
				else {
					if (user_pw.equals("")) {
						msg.setText("패스워드를 입력하세요.");
					
					}
					else {
						msg.setText("로그인을 진행합니다.");
						
					}

				}

			}
		});

	}

}