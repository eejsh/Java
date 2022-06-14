
public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[][] = { { "이순신", "홍길동", "유관순" }, { "90", "40", "100" }, { "88", "60", "70" },
				{ "70", "100", "55" } };

		// 이순신 90 88 70
		// 홍길동 40 60 100
		// 유관순 100 70 55
		
		
		int ea = array.length; //4
		int a_ea= array[0].length; //3
		
		int f, ff ;
		
		for(f=0; f<=ea; f++) {
			for(ff=0; ff<=a_ea; ff++) {
				
				System.out.println(array[ff][f]);
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
