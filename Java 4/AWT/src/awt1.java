import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

	public awt1() {
	}

	public static void main(String[] args) { // static ->this ������.

		// frame -> Bound -> object

		Frame fr = new Frame(); // â

		fr.setTitle("AWT ����ȭ��");
		fr.setVisible(true);
		fr.setLayout(null); // �гλ�����.
		fr.setBounds(600, 300, 500, 500); //(ȭ�� x��, ȭ�� y��, ����ũ��, ����ũ��)
		
		
		Button btn = new Button("Ŭ��");
		Button closebtn = new Button("�ݱ�");
		Label msg = new Label("");
		msg.setBackground(Color.red);    //setBackground(color . blue) �����Է�
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(150, 40, 100, 30);		
		msg.setBounds(40,100,300,30);
		
		//objectfmf Frame�� �����ϰ� �˴ϴ�.
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);

		//addActionListener (��ư): �̺�Ʈ �޼ҵ�  ��, This ���� ������.
		closebtn.addActionListener(new ActionListener() {  
			//  new ActionListener() : override �޼ҵ� �ڵ�����
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});		
		
		
	btn.addActionListener(new ActionListener() { //addActionListener : �̺�Ʈ �޼ҵ� �ʵ忡 String�� ����
		
		String a ="ȫ�浿";
		@Override
		public void actionPerformed(ActionEvent e) {
		//	msg.setText("awt�� ó������?");

			msg.setText(this.a);  //this�� �̿��Ͽ� �ڵ鸵 ������.
			
			
		}
	});
		
	}

}
