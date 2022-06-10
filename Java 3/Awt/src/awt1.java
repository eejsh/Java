import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/* GUI 모드 : (java7-ver) AWT(abstract window toolkit), SWING (AWT -그래픽적으로 업글됨..)
	 * CUI 모드 : scanner
	 * 
	 * SWING : jFrame -> jPanel -> jObject
	 * */
	public static void main(String[] args) {
	 // awt 생성방식
		// Frame -> Panel -> Object (생성순서)
		
		// Object ->Panel -> Frame (적용순서)
		
		
		popclose pc = new popclose();  
		
		// awt 메소드를 상속받아 처리.
		
		Frame fr = new Frame (); //프레임 창
		fr.setTitle ("사용자 로그인");    // 창 이름
		fr.setSize(500, 500);         //창 사이즈
		fr.setVisible(true);          //사용 유/무
		
		fr.addWindowListener(pc); 
		
		Panel pa = new Panel();       //패널
		
		CheckboxGroup radio = new CheckboxGroup();
						
 		TextField id = new TextField(10);   // TextField 10자까지
 		TextField pw = new TextField(10);
 		TextField sa = new TextField(10);  
 		Button b1 = new Button("로그인");  // object
		Checkbox c1 = new Checkbox("자동로그인");
		Checkbox c2 = new Checkbox("동의함",false, radio);
		Checkbox c3 = new Checkbox("동의함",true, radio);
		
		fr.addWindowListener(null);
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
	    pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1);    //add추가 오브젝트 -> 패널
		fr.add(pa);    //패널 -> 프레임		

	}
}
class popclose extends WindowAdapter{
	public void WindowClosing (WindowEvent a) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				System.gc();
				
	}
	
}

