import java.awt.*;
import java.awt.event.*;

public class awt4 {

	public static void main(String[] args) {
		// awt4_class.java�� ����

		decorate de = new decorate();
		de.view();

	}
}

class decorate extends awt4_class { // �ڵ鸵.

	public String aws = "";
	public void btn_push(int c) {
		/*����ڰ� �Է��� ���ڸ� �������� �������� �ۼ�*/
		int a=1;
		
		do {
			int k = a*c;
			aws += c + " * " + a + " = " + k + "\n" ;
		  a++;
		}while(a <= 9);
				
	}

	public String calls() {
    
		return aws;
    
		
	}

}





/*Ǯ��

int ff ;
for(ff=1; ff<=9; ff++) {
	int k = c * ff;
	prf = pfr + c + "*" + ff + "=" + k;
	prf +=  c + "*" + ff + "=" + k;
}
this.aws = prf;
}

public String calls(){

return this.aws;
}

*/

