package Swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Swing10 extends JFrame {

	private JPanel contentPane;
	
	public String list [] = {"skt","kt","lgt","알뜰폰"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing10 frame = new Swing10();
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
	public Swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		setContentPane(contentPane);
		
		
		//String list[] = {"skt","kt","lgt","알뜰폰"};
		contentPane.setLayout(null);
		
		JComboBox cb = new JComboBox(list);
		cb.setBounds(81, 62, 185, 45);
		cb.setFont(new Font("돋움체", Font.PLAIN, 12));
		contentPane.add(cb);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.GRAY));
		msg.setForeground(Color.WHITE);
		msg.setBounds(81, 166, 185, 45);
		
		
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			
			int v = cb.getSelectedIndex();	  // 배열 index 형태로 로드. 단, 필드에 배열이 선언되어야 함.

			//	String data = String.valueOf(cb.getSelectedItem());
			//	String data = cb.getSelectedItem().toString();
			//	String data = String.valueOf(e.getItem());
			//	String data = e.getItem().toString();

			//	msg.setText(e.getItem());
			//	msg.setText(data);        
			msg.setText(Swing10.this.list[v]);
				
				
			}
		});
	
		
	
		
		
	}

}
