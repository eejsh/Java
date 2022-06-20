package Swing1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing7 frame = new Swing7();
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
	public Swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("결제버튼");
	
		btn.setFont(new Font("돋움체", Font.PLAIN, 11));
		btn.setBounds(166, 97, 93, 23);
		contentPane.add(btn);
		
		JRadioButton rd1 = new JRadioButton("신용카드");
		rd1.setName("card");      //결제시스템으로 넘길때 사용. 
		//serName은 노출되지 않으며, background에서 해당 속성에 값을 적용하는 것을 말합니다.
		
		
		rd1.setSelected(true);
		rd1.setFont(new Font("돋움체", Font.PLAIN, 11));
		rd1.setBounds(42, 43, 115, 23);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("계좌이체");
		rd2.setName("bank");
		
		rd2.setFont(new Font("돋움체", Font.PLAIN, 11));
		rd2.setBounds(166, 43, 115, 23);
		contentPane.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("무통장입금");
		rd3.setName("nobank");
		rd3.setFont(new Font("돋움체", Font.PLAIN, 11));
		rd3.setBounds(283, 43, 115, 23);
		contentPane.add(rd3);
		
		JPanel mu = new JPanel();
		mu.setToolTipText("test");
		
		mu.setFont(new Font("돋움체", Font.PLAIN, 10));
		mu.setBounds(42, 185, 356, 70);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("무통장 입금"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setFont(new Font("돋움체", Font.PLAIN, 12));
		textField.setBounds(10, 21, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 32, 356, 42);
		contentPane.add(panel);
		
		ButtonGroup gp = new ButtonGroup();     //radio 사용 시 buttongroup 사용해야함. 3개 버튼 묶어서 사용. 안묶으면 별도의 개체.
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		btn.addActionListener(new ActionListener() {
			String pay="";
			public void actionPerformed(ActionEvent e) {
				
		
				if(rd1.isSelected()==true) { //신용카드
					pay = rd1.getName();
					System.out.println(pay);
					System.out.println("신용카드 선택.");
					mu.setVisible(false);
				}
				else if (rd2.isSelected()==true) { //계좌이체
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				}else { //무통장
					mu.setVisible(true);
					
				}
				
				
				
			}
		});
	
		
		
	}
}
