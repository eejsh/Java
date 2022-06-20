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
		
		JButton btn = new JButton("������ư");
	
		btn.setFont(new Font("����ü", Font.PLAIN, 11));
		btn.setBounds(166, 97, 93, 23);
		contentPane.add(btn);
		
		JRadioButton rd1 = new JRadioButton("�ſ�ī��");
		rd1.setName("card");      //�����ý������� �ѱ涧 ���. 
		//serName�� ������� ������, background���� �ش� �Ӽ��� ���� �����ϴ� ���� ���մϴ�.
		
		
		rd1.setSelected(true);
		rd1.setFont(new Font("����ü", Font.PLAIN, 11));
		rd1.setBounds(42, 43, 115, 23);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("������ü");
		rd2.setName("bank");
		
		rd2.setFont(new Font("����ü", Font.PLAIN, 11));
		rd2.setBounds(166, 43, 115, 23);
		contentPane.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("�������Ա�");
		rd3.setName("nobank");
		rd3.setFont(new Font("����ü", Font.PLAIN, 11));
		rd3.setBounds(283, 43, 115, 23);
		contentPane.add(rd3);
		
		JPanel mu = new JPanel();
		mu.setToolTipText("test");
		
		mu.setFont(new Font("����ü", Font.PLAIN, 10));
		mu.setBounds(42, 185, 356, 70);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("������ �Ա�"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setFont(new Font("����ü", Font.PLAIN, 12));
		textField.setBounds(10, 21, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 32, 356, 42);
		contentPane.add(panel);
		
		ButtonGroup gp = new ButtonGroup();     //radio ��� �� buttongroup ����ؾ���. 3�� ��ư ��� ���. �ȹ����� ������ ��ü.
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		btn.addActionListener(new ActionListener() {
			String pay="";
			public void actionPerformed(ActionEvent e) {
				
		
				if(rd1.isSelected()==true) { //�ſ�ī��
					pay = rd1.getName();
					System.out.println(pay);
					System.out.println("�ſ�ī�� ����.");
					mu.setVisible(false);
				}
				else if (rd2.isSelected()==true) { //������ü
					System.out.println("������ü ����");
					mu.setVisible(false);
				}else { //������
					mu.setVisible(true);
					
				}
				
				
				
			}
		});
	
		
		
	}
}
