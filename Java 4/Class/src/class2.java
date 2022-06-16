
public class class2 {

	public static void main(String[] args) {

		/*
		 * [응용문제] 더블class를 이용하여 자식 class에 결과값을 출력하는 프로세서를 제작하시오. class는 2가지 있습니다. 부모
		 * class 명은 mother 자식 class 명은 child
		 * 
		 * main class 에서 mother class로 값을 전달합니다. 30, 50 숫자값을 적용합니다. 
		 * child 에서 부모 class에 있는 값을 받아 두개의 숫자를 곱한결과값을 출력하시오.
		 */
		mother mo = new mother ();
		mo.m_method(30,50);
		
		mother.child mc = mo.new child ();
		mc.c_method();
	
		
	}

}

class mother{
	int aa;
	int bb;
	
	public void m_method (int a, int b) {
		
	this.aa = a;
	this.bb = b;
	}
	class child{  
		int aa = mother.this.aa;
		int bb = mother.this.bb;
		    
		 //결과출력
		public void c_method () {
		int c =  this.aa * this.bb;
		System.out.println(c);
		
		}
	}
		
}
