import java.awt.*;
import java.awt.event.*;
//AWT 환경설정 제작   
public abstract class awt5_abstract { 

	
	public abstract String singok();                //-리턴  .getter
	public abstract void idcheck(String id);        //setter 
    public abstract void dataload();                //setter

    
    Frame fr = new Frame();
    
    Button bt = null;                   //중복체크
    TextField mid = null;              // 입력
    Label msg = new Label();        // 라벨
    Button close = null;               // 종료
    
    
    public void design() {
       this.fr.setBounds(200,200,300,450);	
       this.fr.setLayout(null);
       this.fr.setVisible(true);
       
       this.bt = new Button("중복체크");
       this.close = new Button("종료");
       this.mid = new TextField();
      // this.mid = new TextField(null);


       this.bt.setBounds(190, 100, 80, 25);
       
       this.mid.setBounds(30, 100, 150, 25);
       
       this.msg.setBackground(Color.lightGray);
       this.msg.setBounds(25, 130, 250, 25);       

       this.close.setBounds(190, 400, 80, 25);
       
       //frame
     this.fr.add(this.bt);
     this.fr.add(this.mid);
     this.fr.add(this.msg);
     this.fr.add(this.close);
       

      this.click();  //awt 디자인이 완류 후 해당 핸들링 메소드로 이동.
    }
  
    public void click() {  //중복버튼 

    	
    	this.bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// setText(출력), getText(입력값 가져오기)
		//awt5_abstract.this.msg.setText("체크완료"); // -->확인 후 삭제..  
				
				
				String userid = awt5_abstract.this.mid.getText();     //지역변수
			//	if(userid==null) {
					if(userid.equals("")) {
				      msg.setText("아이디를 입력하세요.");	
				      
				
				}
				else {
				     idcheck(userid);   //awt5의 아이디체크부분으로 넘김.
				     String result = singok();
				  if(result==null) { 
					 msg.setText("사용가능한 아이디 입니다.");
				  }
				  else {
					  msg.setText("다른아이디를 입력해 주십시오");
				  }
				     
				}
				
			}
		});
    	//종료버튼
    	
    	this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
    	
    	
    	
    	
    	
    }

    
}

