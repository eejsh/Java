
public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[][] = { { "�̼���", "ȫ�浿", "������" }, { "90", "40", "100" }, { "88", "60", "70" },
				{ "70", "100", "55" } };

		// �̼��� 90 88 70
		// ȫ�浿 40 60 100
		// ������ 100 70 55
		
		
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
