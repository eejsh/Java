
public class Method3 {

	public static void main(String[] args) {
		/*
		 * [���빮��] �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�. ���� ��갪�� �޾Ƽ� ����� ����Ͻÿ�. 
		 * 157 ,* 45 /  ��������� ��� : 7065  
		 */

		math ma = new math();

		int result = ma.m(157, 45);
		System.out.println(result);

		ma.m2(); // m2 �޼ҵ� ȣ��
		ma.m();  // ����������� m �̸� ��밡��.
		
		
		
		
		/*���빮��
		 * ���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰ� �˴ϴ�.
		 * �ش� �޼ҵ忡���� ������ ���� ó�� �˴ϴ�.
		 * ���� 3�� �����ϸ� 3*1~3*9 ������ ��� ������� ���Ͽ� sysout���� ��� �ǵ��� �Ͻʽÿ�.
		 * */
		
		int result1 = ma.ab(3);
	     System.out.println("���:"+result1); // 3�� ������ int ab���� �ݺ��� ���� return to�� ����.
		
		String ck = ma.mb("hong");
		System.out.println(ck);

	}

}

class math {

	public int m(int a, int b) {
		int c = a * b;
		return c;

	}
	public void m() {   //int m �� �������� ������ ���Ұ��� �ϳ� �������� ������ �ߺ�m ��밡��.
		System.out.println("�����Դϴ�.");
		
	}
	public void m2() {

		int z = m(100, 200);
		System.out.println(z);
	}

	
public int ab(int f) {
	
	int g;
	int to=0;
	
	for(g=1; g<=9; g++) {
		to += (g * f);    // to = to + (g*f);
	}
   return to; //result1 �� ����      �ݺ��� �ȿ� return ���ȵ�.->������ �ݺ��� �ۿ��� �����ؾߵ�.
	
   
//   int w =1;
//   while(w<=9) {
//	   to += f * w;
//	   w++;
//   } return to;  
 
   /*return ��� �� ���� �ݺ��� �ȿ� �����ϸ� �ȵ˴ϴ�. 
    ���� ���ǹ��̶� ����� return ��� �ȵ˴ϴ�.*/
   
}
public String mb(String mid) {
    String msg =" ";
 
   
    
	//String aa = mid;
	if(mid.equals("hong")) {
	//	return "ok";
	msg ="ok";
	
	}
	else {
	//return "cancel";
	msg = "cancel";
		
	}
	return msg;      // ���������� �̾Ƽ� return���� �����ߵ�.
	
	//Ex: ����ġ���� 10�� �̻��̸� 10�� �� �������� �丸 ó���Ͽ� �����°� ����.
	
	/* �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return ��Ŵ */
	
	
	
}
	
	
	
	
	
}