
public class Switch_Loop {

	public static void main(String[] args) {
        // ����Ʈ�� ������ ����         
	    //����ġ ������ �ݺ��� ���� case �ȿ��� �����ߵ�. ����ġ�� �ȿ� if���� ���� ���� �ȶ�.
		
		String sign ="*";
		int total ;   // case�� ���缭 0, 1�� ���ߵ�
		/*case �ȿ� ���� �ݺ����� ����� �� �ֽ����.
		 * ���� ������ �������� ����ص� �����ϸ�, 
		 * case ������ �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ �����ϴ�.
		 * ��, case �� �ϳ��� ������ ���� ��� ������ case �� ���� �۵����� �ʽ��ϴ�.
		 * 
		 * */
		
		switch (sign) {

		case "+" ->{
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
			 //total = total + f;
			 total += f;
			}     		
			System.out.println("��1~5���� ���� ���� "+ total);   
		}
		
		case "-" ->{
			total = 0;
			
				
		}
		case "*" ->{
			int f = 1;
			
			total = 1;
			do {
                 total *= f;
                        f++ ;
			}while(f<=5);
			System.out.println(total);   // �� ���ϱ� ���� �������� case-if �� ������ ������ ��.
		}
		
		case "/" ->{
			total = 0;
		}
		
	}		
	
		
		
	}

}
