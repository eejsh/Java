import java.awt.*;
import java.awt.event.*;
//AWT ȯ�漳�� ����   
public abstract class awt5_abstract { 

	
	public abstract String singok();                //-����  .getter
	public abstract void idcheck(String id);        //setter 
    public abstract void dataload();                //setter

    
    Frame fr = new Frame();
    
    Button bt = null;                   //�ߺ�üũ
    TextField mid = null;              // �Է�
    Label msg = new Label();        // ��
    Button close = null;               // ����
    
    
    public void design() {
       this.fr.setBounds(200,200,300,450);	
       this.fr.setLayout(null);
       this.fr.setVisible(true);
       
       this.bt = new Button("�ߺ�üũ");
       this.close = new Button("����");
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
       

      this.click();  //awt �������� �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�.
    }
  
    public void click() {  //�ߺ���ư 

    	
    	this.bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// setText(���), getText(�Է°� ��������)
		//awt5_abstract.this.msg.setText("üũ�Ϸ�"); // -->Ȯ�� �� ����..  
				
				
				String userid = awt5_abstract.this.mid.getText();     //��������
			//	if(userid==null) {
					if(userid.equals("")) {
				      msg.setText("���̵� �Է��ϼ���.");	
				      
				
				}
				else {
				     idcheck(userid);   //awt5�� ���̵�üũ�κ����� �ѱ�.
				     String result = singok();
				  if(result==null) { 
					 msg.setText("��밡���� ���̵� �Դϴ�.");
				  }
				  else {
					  msg.setText("�ٸ����̵� �Է��� �ֽʽÿ�");
				  }
				     
				}
				
			}
		});
    	//�����ư
    	
    	this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
    	
    	
    	
    	
    	
    }

    
}

