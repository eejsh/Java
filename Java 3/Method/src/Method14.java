
public class Method14 {

	public static void main(String[] args) {

		Mbc m = new Mbc();
		Mbc m2 = new Mbc("이순신1");

	}

}

class Mbc {
//한 class에서 여러방향으로 줄수있고, 모을수도있음. 인수값에 따라..
	public Mbc() {       //일반 construct
		System.out.println("구조1");
		test();

	}

	public Mbc(String user) {  //construct 인수값이 있는 
		System.out.println(user);
		test(user);

	}

	
//	public Mbc(int user) { // String, int, double, boolean 등 여러 변수 가능.
//		System.out.println(user);
//	}
//		test(user);
//	} construct에서 인수값은 자료형으로 구분되어 집니다.
	
	
	
	
	
	
	
	
	
	public void test() {
		System.out.println("메소드");
           total();

	}

	public void test(String user) {  //인수값이 있는 method 입니다.
		System.out.println(user);
           total();
      
	}
   public static void total() {
	   
	   System.out.println("시스템종료2");
	   
   }
}