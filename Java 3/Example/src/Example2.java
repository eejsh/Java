
public class Example2 {
	//getter - �μ����� ���� return 
	
//	private int pcint;
//	private int userint;
//    private String aa = null;
//    public void ab(int pc, int nu) {
//                
//        this.pcint = pc;
//		this.userint = nu;
//        
//	
//		if(this.pcint > this.userint) {
//			this.aa = "up";
//        }
//		else if(this.pcint < this.userint) {
//            this.aa = "down";	
//		}
//		else if (this.pcint == this.userint) {
//			this.aa="�����Դϴ�.";
//		}
//               
//	 }
//
//	public String end() {
//		return this.aa;
//		
//	}	
    
	/*Ǯ��*/
private int val1; //pc
private int val2; //user
private String msg ; //����޼���    

public void randomok(int pc, int user) {  //setter ->�μ��� ����
	
	this.val1 = pc;
	this.val2 = user;
	
	if(this.val1 > this.val2) {
		this.msg = "up �Դϴ�.";
	}
	else if(this.val1 < this.val2) {
		this.msg = "down �Դϴ�.";
	}
	else if(this.val1 == this.val2) {
		this.msg = "����Ͻʴϴ�. ���� �Դϴ�.";
	}
	
}
public String result() { //getter �μ�������. return�� ����.
	
	return this.msg;
			
}

  }
