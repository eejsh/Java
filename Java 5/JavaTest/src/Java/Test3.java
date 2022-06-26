package Java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JProgressBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Test3 extends JFrame {

	private JPanel ab;
	private JTextField atf;
	private JTextField ctf;
	private JTextField textField;
	private JTextField last;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 frame = new Test3();
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
	
	
	
	
	
	public Test3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		ab = new JPanel();
		ab.setForeground(Color.WHITE);
		ab.setToolTipText("\uCEA0\uD551\uC7A5 \uC608\uC57D \uC2DC\uC2A4\uD15C");
		ab.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ab);
		ab.setLayout(null);
		
		JRadioButton bt1 = new JRadioButton("남양주");
		bt1.setSelected(true);
		bt1.setBounds(30, 58, 115, 23);
		ab.add(bt1);
		
		JLabel la1 = new JLabel("");
		la1.setBorder(new LineBorder(Color.BLACK));
		la1.setFont(new Font("돋움", Font.PLAIN, 12));
		la1.setBounds(10, 42, 568, 62);
		la1.setBorder(new TitledBorder("캠핑 장소를 선택하세요."));
	
		
		ab.add(la1);
		
		
		JRadioButton bt2 = new JRadioButton("충북음성");
		bt2.setBounds(160, 58, 115, 23);
		ab.add(bt2);
		
		JRadioButton bt3 = new JRadioButton("춘천");
		bt3.setBounds(290, 58, 115, 23);
		ab.add(bt3);
		
		JLabel su = new JLabel("");
		su.setFont(new Font("돋움", Font.PLAIN, 12));
		su.setBorder(new LineBorder(Color.BLACK));
		su.setBounds(10, 114, 568, 62);
		su.setBorder(new TitledBorder("인원수를 입력하세요."));
		
		ab.add(su);
		
		
		atf.setBounds(136, 135, 96, 21);
		ab.add(atf);
		atf.setColumns(10);
		
		ctf = new JTextField();
		ctf.setBounds(378, 135, 96, 21);
		ab.add(ctf);
		ctf.setColumns(10);
		
		JLabel day = new JLabel("");
		day.setFont(new Font("돋움", Font.PLAIN, 12));
		day.setBorder(new LineBorder(Color.BLACK));
		day.setBounds(10, 186, 568, 62);
		day.setBorder(new TitledBorder("캠핑 날짜 입력"));
		ab.add(day);
		
		textField = new JTextField();
		textField.setBounds(112, 207, 137, 21);
		ab.add(textField);
		textField.setColumns(10);
		
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 268, 416, 37);
		ab.add(progressBar);
		
		JButton Rebut = new JButton("\uC608\uC57D\uD558\uAE30");
		Rebut.setBounds(436, 268, 142, 37);
		ab.add(Rebut);
		
	
		
		
		JButton close = new JButton("종료");
		close.setBounds(436, 418, 142, 37);
		ab.add(close);
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.exit(0);	
			}
		});
		
		
		last = new JTextField();
		last.setBounds(32, 353, 521, 37);
		ab.add(last);
		last.setColumns(10);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(10, 328, 568, 88);
		ab.add(label3);
		label3.setBorder(new TitledBorder("확인 및 입금하실 금액"));
		label3.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("\uC131\uC778");
		lblNewLabel.setBounds(59, 138, 50, 15);
		ab.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCCAD\uC18C\uB144(\uB9CC10\uC138\uC774\uC0C1)");
		lblNewLabel_1.setBounds(263, 138, 105, 15);
		ab.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uCEA0\uD551\uB0A0\uC9DC");
		lblNewLabel_2.setBounds(32, 210, 70, 15);
		ab.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC608\uC2DC)2022-06-24");
		lblNewLabel_3.setBounds(279, 210, 249, 15);
		ab.add(lblNewLabel_3);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(bt1);
		bg.add(bt2);
		bg.add(bt3);
		
		
		
	Rebut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			
			if(bt1.isSelected()==true) {
				
				
			}
			else if(bt2.isSelected()==true) {
				
				
			}
			else {
				
				
			}
			
			
			
			
			
			
			
			
			
			}
			
		});
		
		
		
		
		
		
		
		
	}
}
