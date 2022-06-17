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
		Button btn = new Button("검색");

		search.setBounds(10, 30, 150, 25);
		btn.setBounds(200, 30, 80, 25);

		fr.add(search);
		fr.add(btn);
 

 
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String sh = search.getText();
				if (sh.equals("")) {
					System.out.println("검색어를 입력해 주세요.");

				}

				else {

					try {
						Desktop.getDesktop().browse(  
								//Desktop.getDesktop().browse : awt에서 운영체제 환경에 있는 기본브라우저를 사용하게 됨.
								//URI : java.net API 함수 (네트워크 파트 입니다) - 경로외에 파라미터 값을 말합니다.
								//http:://nate.com/indet.html /-> URI /  ?query=" -> 파라미터
								new URI("https://search.naver.com/search.naver?query=" + sh));
					} catch (Exception zz) {
						System.out.println("URL 오류 발생");
					}

				}

			}

		});

 }
 

}
