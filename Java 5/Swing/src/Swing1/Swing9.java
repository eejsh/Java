package Swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class Swing9 extends JFrame {
//jediterpane�� �Խ��� ���� ��� �Ǵ� �Է� �� ����� �Ǹ�, ���̺긮�����ۿ����� HTML�� �ε��Ͽ� ����� ���� �ֽ��ϴ�.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing9 frame = new Swing9();
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
	public Swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("���̺긮�� ����");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 768, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html");
		webpage.setText("<h1>����</h1>"
				+"<a href='http://daum.net'><img src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRz8Jqv-qf5WyNCGm-BkaUB5GOGrZMVQPZCYg&usqp=CAU'></a>"
		        +"<br><font color ='red'>�޷�</font>" 
				+"<br><input type='text' id = 'name'>"
		        +"<br><input type='checkbox'>������"
		        );
				
		
		
	}
}
