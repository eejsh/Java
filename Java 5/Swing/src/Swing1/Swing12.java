package Swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;

public class Swing12 extends JFrame {
	private String imgdata[] = {"appe1.jpg","appe2.jpg","appe3.jpg","appe4.jpg","appe5.jpg"};
	public int count =0;
	public String url = "C:\\Java 5\\Swing\\src\\Swing1\\";  // 절대경로 잡아놈.
	
	//http://www.naver.com/1.jpg , C:\Java 5\Swing\src\Swing1\\1.jpg :절대경로
	//  ./1.jpg,      ../1.jpg 상대경로.
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing12 frame = new Swing12();
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
	public Swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBounds(10, 134, 668, 521);
		contentPane.add(lb);
		
		JButton prev = new JButton("이전");
		prev.setBorder(new LineBorder(Color.GRAY));

		prev.setBounds(10, 33, 137, 34);
		contentPane.add(prev);
		
		JButton next = new JButton("다음");
		
		next.setBorder(new LineBorder(Color.GRAY));
		next.setBounds(541, 33, 137, 34);
		contentPane.add(next);

		prev.addActionListener(new ActionListener() { //이전
			public void actionPerformed(ActionEvent e) {
				Swing12.this.count--;
				 if(Swing12.this.count < 0) {
					 Swing12.this.count=0;
					 
				 }
				 
				//System.out.println(Swing12.this.count);
				 ImageIcon v = new ImageIcon(url+imgdata[Swing12.this.count]);
				 lb.setIcon(v);
				 
			}
		});
	
		
		next.addActionListener(new ActionListener() { //다음
			public void actionPerformed(ActionEvent e) {
				Swing12.this.count++;
				 if(Swing12.this.count > imgdata.length-1 ) {
					 Swing12.this.count = imgdata.length-1;
					 
			}
				 ImageIcon v = new ImageIcon(url+imgdata[Swing12.this.count]);
				 lb.setIcon(v);
				 
				 //System.out.println(Swing12.this.count);
			}
				 
		});
		
		
	
	}

}


