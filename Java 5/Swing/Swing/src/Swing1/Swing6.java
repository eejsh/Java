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
		tel.setFont(new Font("����ü", Font.PLAIN, 11));
		tel.setBounds(25, 48, 175, 27);
		contentPane.add(tel);
		tel.setColumns(10);
		
		

		JButton btnNewButton = new JButton("������ȣ �ޱ�");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 11));
		btnNewButton.setBounds(269, 48, 141, 27);
		contentPane.add(btnNewButton);
		
		msg = new JLabel("New label");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(25, 108, 385, 27);
		contentPane.add(msg);

		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			
			}
		});
		// addKeyListener Ű�� ���� ��� ����Ǵ� �̺�Ʈ Ŭ����
		tel.addKeyListener(new KeyAdapter() {    
			//keypressed : Ű�� �������� �۵�
			//keyReleased : Ű�� �����ٰ� up �Ǿ����� �۵�
			//keyTyped : Ű�� ���ڸ� �Է� ������ 
			@Override
			public void keyTyped(KeyEvent k) {

			int i = tel.getText().length();
			if(i<11) {
				k.consume(); //��ȭ��ȣ 11�� �̻� �ԷºҰ��ϰ� ����. 
			}	
//			System.out.println(k);
//			System.out.println(k.getKeyChar());
//			System.out.println(k.getKeyCode());
		 int n = Integer.valueOf(k.getKeyChar());  // --> �ƽ�Ű �ڵ�� �����..      //���ڿ��̴� valueof  ,  paserint=> object�� ����.
		 System.out.println(n);
		 if(n >=48 && n <= 57 ) {    //system.out ������ �������� ����getkeychar()��������, integer����� �ƽ�Ű�ڵ�� ����    // �ƽ�Ű�ڵ� 48 = 0, 57=9 �̹Ƿ� �������� ���ؾߵ�..��
		     msg.setText("");
		 }else {
			// msg.setText("���ڸ� �Է��ϼ���.");
//			 if(!Character.isDigit(n)) {
//		     k.consume(); }
			 msg.setText("���ڸ� �Է��ϼ���");
			 k.consume();  //keyTyped�� �̿�, consume �ش� �̿�� null �� �Էµ�.
			 
		 }
		     
			 
			
			}
		});
		
		
		
	}

}
