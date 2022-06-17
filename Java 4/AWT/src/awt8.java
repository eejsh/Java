import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class awt8 {
	TextField search = null;
 public static void main(String[] args) {

		Frame fr = new Frame();

		fr.setBounds(200, 100, 350, 180);
		fr.setLayout(null);
		fr.setVisible(true);

		TextField search = new TextField();
		Button btn = new Button("�˻�");

		search.setBounds(10, 30, 150, 25);
		btn.setBounds(200, 30, 80, 25);

		fr.add(search);
		fr.add(btn);
 

 
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sh = search.getText();
				if (sh.equals("")) {
					System.out.println("�˻�� �Է��� �ּ���.");

				}

				else {

					try {
						Desktop.getDesktop().browse(  
								//Desktop.getDesktop().browse : awt���� �ü�� ȯ�濡 �ִ� �⺻�������� ����ϰ� ��.
								//URI : java.net API �Լ� (��Ʈ��ũ ��Ʈ �Դϴ�) - ��οܿ� �Ķ���� ���� ���մϴ�.
								//http:://nate.com/indet.html /-> URI /  ?query=" -> �Ķ����
								new URI("https://search.naver.com/search.naver?query=" + sh));
					} catch (Exception zz) {
						System.out.println("URL ���� �߻�");
					}

				}

			}

		});

 }
 

}
