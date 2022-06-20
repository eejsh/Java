package Swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing5 frame = new Swing5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Swing5() {
		/*frame을 absolute 형태로 layer를 변경 합니다.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.WHITE, 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton but = new JButton("아이디 체크");  //아이디확인 버튼
		but.setActionCommand("");

		but.setFont(new Font("돋움체", Font.PLAIN, 12));
		but.setBackground(Color.WHITE);
		but.setBorder(new LineBorder(Color.LIGHT_GRAY));
		but.setBounds(167, 116, 105, 32);
		
		contentPane.add(but);
		
		text = new JTextField();
		text.setFont(new Font("돋움체", Font.PLAIN, 12));
		text.setBounds(157, 42, 124, 32);
		contentPane.add(text);
		text.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(38, 190, 362, 32);
		contentPane.add(msg);
		
		// 핸들링 class가 Object 보다 상위 코드에 있으면 해당 Object를 로드못함으로 밑으로 변경해줘야함.
		but.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {
				
				
				if(text.getText().equals("")) {
					msg.setText("아이디를 입력하세요.");
				}
				else {
				int le = text.getText().length();  //입력 문자 갯수.
				if(le < 5 ) {
					msg.setText("아이디는 다섯자 이상 사용 가능합니다.");
					
				}else {
					msg.setText("아이디 검토 중입니다....");
					
				}
					
				}
				
			}
		});
		
		
		
		
	}
}
