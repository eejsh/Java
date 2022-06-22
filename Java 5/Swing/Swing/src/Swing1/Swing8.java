package Swing1;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

//progress바 사용법 - 파일첨부...이럴때 사용..



public class Swing8 extends JFrame {

    JProgressBar progress=null;
    JLabel Label =null;
    
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing8 frame = new Swing8();
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
	
	
	
	public Swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar(); 
		this.progress.setStringPainted(true);
		this.progress.setEnabled(false);
		this.progress.setBounds(25, 57, 384, 31);
		contentPane.add(this.progress);
		
		this.Label = new JLabel("");
		this.Label.setBounds(25, 111, 387, 15);
		contentPane.add(this.Label);
		
		//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행되도록 적용함.
		Timer t = new Timer();
		TimerTask Task= new TimerTask() {
		
			@Override
			public void run() {
			
				pstart();
				
			}
		};
		t.schedule(Task,0);
		
	}
	
	public void pstart() {           //timer 없으면 바로 실행하자마자 sleep에서 프로그램종료..
		
		int w = 0;
		
		try {
			while(w<=100) {
	      this.progress.setValue(w); //setValue  해당 기본값을 말함.
		 Thread.sleep(100);
	
		 
		 
		 w++;
			}
		}catch(Exception k) {
			System.out.println("오류발생");
		}
		
		
		if(this.progress.getValue()==100) {
			
			this.Label.setText("다운로드가 모두 완료되었습니다.");
		}
		
		
		
		
	}
}
