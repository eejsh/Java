package Ex;

public class Example5 {

	public static void main(String[] args) {
		
	multi8 m8 = new multi8();
    m8.gugudan(8);
	
	int to = m8.getter();
	System.out.println("8단 모두 더한 값  : " +to);
	
	}

}

abstract class gogo {
	
 public abstract void gugudan(int z);
 public abstract int getter();
	
}

class multi8 extends gogo{
    int totla = 0;
    int zz;
	
	@Override
	public void gugudan(int aa) {
		this.zz = aa;
		int w =0;
		
		while(w<=9) {
		
			this.totla += ( this.zz * w) ;
			
			w++;
		}
		
	}

	@Override
	public int getter() {
		
		return this.totla;
	}
	
	
	
	
	
}
