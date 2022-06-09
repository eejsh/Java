
public class Example2 {
	
	private int pcint;
	private int userint;
    private String aa = null;

    public void ab(int pc, int nu) {
                
        this.pcint = pc;
		this.userint = nu;
        
	
		if(this.pcint > this.userint) {
			this.aa = "up";
        }
		else if(this.pcint < this.userint) {
            this.aa = "down";	
		}
		else if (this.pcint == this.userint) {
			this.aa="정답입니다.";
		}
               
	 }

	public String end() {
		return this.aa;
		
	}	
	
}
