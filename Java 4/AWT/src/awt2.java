
// awt.*��� �ɼ� ��������        event.*; �̺�Ʈ ���ɼ� ��������.
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane; // ���â �г�

//�ܺ� class�� awt ����          --main class���� �Ⱦ�.
public class awt2 {

	public static void main(String[] args) {

		login lg = new login();
	}
}

class loginok extends login {         //--> ȭ�� ��ȯ�ϴ� �ڽ� Ŭ����.

 public loginok () {
	 
		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	
		
   }
	
}

class login {

	Frame fr = new Frame(); // �ʵ忡 �����ؾߵ�.
	Font ft = new Font("����ü", Font.PLAIN, 20); // ��Ʈ ���� -> ��Ʈü, ����, ũŰ

	TextField mid = new TextField();
	TextField mpw = new TextField();

	Button lg_btn1 = new Button("�α���"); // -->��ư�и�. �α��ι�ư
	Button close_btn3 = new Button("���α׷�����"); // -->��ư�и�. ���� ��ư.
	Button ship_btn2 = new Button("ȸ������");

	Label msg = new Label();
	

	public login() { // -->public�� ���� �ٷ� ����.       //������ > extends abstract (�߻� class)�� ���� �ε��Ͽ� �ʵ忡 �����Ŵ.

		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

		this.mid.setFont(ft); // ���� �Ӽ��� �����ϰ��� �ϴ� ������Ʈ ����
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*'); // �ܵ���ǥ.

		this.lg_btn1 = new Button("�α���");
		this.close_btn3 = new Button("���α׷�����");
		this.ship_btn2 = new Button("ȸ������");

		mid.setBounds(100, 60, 200, 40);
		mpw.setBounds(100, 120, 200, 40);

		lg_btn1.setBounds(100, 180, 200, 40);
		lg_btn1.setBackground(Color.pink); // setBackground(color . 00) �����Է�

		ship_btn2.setBounds(100, 240, 200, 40);

		this.close_btn3.setBounds(100, 300, 200, 40);

		 this.msg.setBounds(100,100,200,20);        
		//this.msg.setBackground(Color.red);  //�� ��ġ Ȯ��.

		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn1);
		this.fr.add(ship_btn2);
        this.fr.add(msg);
        
		
		this.fr.add(this.close_btn3);
		this.clicks();

	}

	public void clicks() { // ��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		
		
	 this.ship_btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
	          fr.setVisible(false);      //�ش� ������ ����
			loginok ok = new loginok();   // ���� �������� �ε��մϴ�. 
			
		}
	});
		
		
		

		this.close_btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���α׷� ���� �̺�Ʈ �ڵ鸵 �޼ҵ�
				System.exit(0);
			}
		});

		this.lg_btn1.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing API ��� �ɼ� �ε�.

			@Override
			public void actionPerformed(ActionEvent e) { // ---->�θ� Ŭ������ ����. this���X
				// �α��� ��ư -> ���̵� �� �н����� ����

				String user_id = mid.getText(); // object��.getText ����ڰ� �Է��� ���� �����ö� ����մϴ�. id ��������.
				String user_pw = mpw.getText(); //  pw��������

				if (user_id.equals("")) { // null ���� ���� �ִ� �����̹Ƿ� .equals("");�� ����.
					alert.showMessageDialog(null, "���̵� �Է��ϼ���.");
					// alert.showMessageDialog(null, "���̵� �Է��ϼ���.","���޼���",JOptionPane.ERROR_MESSAGE);
					// msg.setText("���̵� �Է��ϼ���.");
				}
				else {
					if (user_pw.equals("")) {
						msg.setText("�н����带 �Է��ϼ���.");
					
					}
					else {
						msg.setText("�α����� �����մϴ�.");
						
					}

				}

			}
		});

	}

}