//������ȣ�ý��� - awt6.java ����
import java.awt.*;
import java.awt.event.*;

public abstract class awt6_abstract {

   public abstract int oknumber(int numbers);    //������ȣ ���� getter
   
   public abstract int userok(int userck); //����Ȯ��.
   public abstract int allok();
   
   
     Frame fr = new Frame();
     
     Button bt = null;   //������ȣȮ��
     Button bt1 = null;
     
     TextField mid = null; //�Է�ĭ

     Label msg = new Label(); //�޼��� ���
     Button close = null;
     
	
	public void ckframe() {
		
		this.fr.setBounds(300, 300, 400, 180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);

		this.bt = new Button("������ȣ�߼�");
		this.bt1 = new Button("����Ȯ��");
		this.close = new Button("�ݱ�");
		this.mid = new TextField();
		
	    this.bt.setBounds(30, 40, 100, 25);
	    this.bt.setBackground(Color.LIGHT_GRAY);
	
	    this.bt1.setBounds(270, 80, 100, 25);    //����Ȯ��
	    this.bt1.setBackground(Color.LIGHT_GRAY);
		    
		this.mid.setBounds(30, 80, 140, 25);   //������ȣ �Է�ĭ
		
		this.msg.setBounds(30, 120, 250, 25);
		this.msg.setBackground(Color.GREEN);
	
		this.close.setBounds(340, 40, 30, 25);
	
		
		//frame
		this.fr.add(bt);
		this.fr.add(bt1);
		this.fr.add(close);
		this.fr.add(mid);
		this.fr.add(msg);
		
		
		this.click();
		
	}
	
    public void click() {
    	this.bt.addActionListener(new ActionListener() { //������ȣ �߼�.
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int	pc= (int)(Math.random()*10000);
				awt6_abstract.this.oknumber(pc);
				
		 		
				
			}
		});
    	
			
    	this.bt1.addActionListener(new ActionListener() {   //����Ȯ��
			@Override
			public void actionPerformed(ActionEvent e) {
		 
				
			String oo = awt6_abstract.this.mid.getText();
			int ok = Integer.parseInt(oo);
			awt6_abstract.this.userok(ok);
			
			int result = allok();
			if(result == ok) {
				msg.setText("������ �Ϸ�Ǿ����ϴ�.");
			}
			else {
				msg.setText("������ȣ�� �ٽ� Ȯ���ϼ���.");
			}


				
			}
		});
    	
    	this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
    	
    	
    	
    }

	
	
	
	
}
