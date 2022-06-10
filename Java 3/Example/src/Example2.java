
public class Example2 {
	//getter - 인수값이 없음 return 
	
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
//			this.aa="정답입니다.";
//		}
//               
//	 }
//
//	public String end() {
//		return this.aa;
//		
//	}	
    
	/*풀이*/
private int val1; //pc
private int val2; //user
private String msg ; //결과메세지    

public void randomok(int pc, int user) {  //setter ->인수값 받음
	
	this.val1 = pc;
	this.val2 = user;
	
	if(this.val1 > this.val2) {
		this.msg = "up 입니다.";
	}
	else if(this.val1 < this.val2) {
		this.msg = "down 입니다.";
	}
	else if(this.val1 == this.val2) {
		this.msg = "대단하십니다. 정답 입니다.";
	}
	
}
public String result() { //getter 인수값없음. return만 보냄.
	
	return this.msg;
			
}

  }
