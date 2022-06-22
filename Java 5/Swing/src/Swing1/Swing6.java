package Swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;
	private JLabel msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing6 frame = new Swing6();
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
	public Swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
	
		tel.setBackground(Color.LIGHT_GRAY);
		tel.setFont(new Font("돋움체", Font.PLAIN, 11));
		tel.setBounds(25, 48, 175, 27);
		contentPane.add(tel);
		tel.setColumns(10);
		
		

		JButton btnNewButton = new JButton("인증번호 받기");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 11));
		btnNewButton.setBounds(269, 48, 141, 27);
		contentPane.add(btnNewButton);
		
		msg = new JLabel("New label");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(25, 108, 385, 27);
		contentPane.add(msg);

		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			
			}
		});
		// addKeyListener 키를 누를 경우 적용되는 이벤트 클래스
		tel.addKeyListener(new KeyAdapter() {    
			//keypressed : 키를 눌렀을때 작동
			//keyReleased : 키를 눌렀다가 up 되었을때 작동
			//keyTyped : 키에 문자를 입력 받을때 
			@Override
			public void keyTyped(KeyEvent k) {

			int i = tel.getText().length();
			if(i<11) {
				k.consume(); //전화번호 11자 이상 입력불가하게 설정. 
			}	
//			System.out.println(k);
//			System.out.println(k.getKeyChar());
//			System.out.println(k.getKeyCode());
		 int n = Integer.valueOf(k.getKeyChar());  // --> 아스키 코드로 변경됨..      //문자열이니 valueof  ,  paserint=> object로 받음.
		 System.out.println(n);
		 if(n >=48 && n <= 57 ) {    //system.out 에서는 정상적인 문자getkeychar()보이지만, integer변경시 아스키코드로 변경    // 아스키코드 48 = 0, 57=9 이므로 범위설정 잘해야됨..ㅠ
		     msg.setText("");
		 }else {
			// msg.setText("숫자만 입력하세요.");
//			 if(!Character.isDigit(n)) {
//		     k.consume(); }
			 msg.setText("숫자만 입력하세요");
			 k.consume();  //keyTyped를 이용, consume 해당 이용시 null 로 입력됨.
			 
		 }
		     
			 
			
			}
		});
		
		
		
	}

}
