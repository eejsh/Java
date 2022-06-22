package Swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class Swing11 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing11 frame = new Swing11();
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
	public Swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("�̹����ε�");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 10));
		
		btnNewButton.setBounds(10, 10, 110, 23);
		contentPane.add(btnNewButton);
		
		JLabel lb = new JLabel("");
		lb.setBounds(10, 38, 418, 217);
		contentPane.add(lb);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//imageicon : �̹��� ������ �ε��� �� ����մϴ�.
				ImageIcon img = new ImageIcon("C:\\Java 5\\Swing\\src\\Swing1\\appe.jpg");
				Image reimg = img.getImage();
				
				//getScaledInstance (����ũ��, ����ũ��, ��ȯ���)      
				//scale_smooth : �ε巴�� ����.
				//scale_fast : ������ ���� (pix�� ����)
				//scale_default : �̹����� ������ �ִ� �ػ󵵿� ���缭 ����.
				//SCALE_AREA_AVERAGING : ����� �ػ� ��հ����� ����.
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_AREA_AVERAGING);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);
  
				
			}
		});
	}

}
