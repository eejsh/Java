package Ab;

//method_1a.java �� ����
public class method_1 extends ide_mth1 {       // main Ŭ������ extends ide_mth1 ������ ab2_method�� ����
	//package Ab2���� import �� �� �ֵ��� �ϸ�, �ܺ�Ŭ������ �����ϰ� ��� �������� ��.
	

	public void recall() {                 // Ab2 ��Ű���� �������� �޼ҵ�
		System.out.println("test");
	}
	protected static void name(){          //protected + static�� �����ؾ߸� Ab2��Ű���� ��������.
		System.out.println("ȫ�浿");
	}
	
	public static void main(String[] args) {
		//  Arrays.sort : �迭 �������� ���� (����,�ѱ�,����)
		//  ��, ������ ��� �빮�ڰ� ���� ���� ������������ �����մϴ�. ex(APPLE , apple)
		
		
	/*	int number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data);  //������������ �ε��� ����
		System.out.println(Arrays.toString(number_data)); */
		
	/*	String user_data[] = {"ȫ�浿","�̼���","�庸��","������","jang","apple","Apple","1"};
		Arrays.sort(user_data);        // �ѱ۵� ������... ������ ���� ����.
		System.out.println(Arrays.toString(user_data)); */
	
		
		/*������ 2�� �����ؼ� �ϳ��� ����, ����
		 * ���� ���Ե� ����ڿ� ���̵� Ȯ�� �� �ش� ����Ʈ�� �����ǵ��� �մϴ�.
		 * ��, ���� ����Ʈ + ������ ����Ʈ�� ���� ����� ����ϼž� �մϴ�.
		 * ����� ���� class���� �����.
		 * 
		 * 
		 * �迭 ������ :   String member_ship [][]= {
	  	       {"kim", "park", "seo", "oh", "lee", "jang", "jeong","cho", "ha","hwang"},
	  	       {"1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800"} };
		
		 */
		
		 String a = "park";                //800 + 2000 = 2800
		 int b = 2000;
		 // String c = "����";  		 
		 
         ide_mth1 m1 = new ide_mth1();
         m1.setter(a, b);
	     System.out.println(m1.getter());
		
	}

}
class ide_mth1 extends mth1{
	
private String member_ship[][];
private String data1;
private int data2;
private int ea;
private int total=0;
private String msg = "";



public ide_mth1() {
	this.member_ship = new String[][]{
	  	       {"kim", "park", "seo", "oh", "lee", "jang", "jeong","cho", "ha","hwang"},
	  	       {"1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800"} 
	  	       };
	this.ea = this.member_ship[0].length;  //10
	
}
@Override
public void setter(String data1, int data2) {   // �ش� �޼ҵ� ����..        method_1a abstract-��������. �ݺ���..?

	this.data1 = data1;
	this.data2 = data2;
//	if(this.data3.equals("����") {
//		this.loops();               
//	}
//	
//	else {       this.loops2();    "����." ����.  }

	this.loops(this.data1, this.data2, this.ea);   	// data1,data2�� loops�� �ѱ�
} 
public void loops(String a, int b, int c) {                     //���� ���� �޼ҵ�      // static���� this ������.

	int w = 0;
	while(w<c) {

	if (this.member_ship[0][w].equals(a)) {
		
	 this.total = Integer.parseInt(this.member_ship[1][w]) + data2 ;
		
	   }  w++;		
	}
	this.msg ="����";
	}
@Override
public void setter(int data3[]) {
}

@Override
public String getter() {  // ����� �̸��̶� ����Ʈ �ջ� �ؼ����� ���������� String���� ����.
	String print = this.data1 + "�� ����Ʈ�� " +  this.total+ " " + this.msg + " �Ǿ����ϴ�." ;
	return print;

   }
}


//class ide_mth1 extends mth1 {
//	private String member_ship [][];
//	private String user;
//	private int userpo;
//    private int total = 0;
//	
//	
//	@Override
//	public void setter(String data1, int data2) {   //method_1a abstract-��������. �ݺ���..?
//	
//	 this.user = data1;
//	 this.userpo = data2;
//	};
//	@Override
//	public void setter(int data3[]) {
//	this.member_ship = new String [][]
//		 {
//		 {"kim", "park", "seo", "oh", "lee", "jang", "jeong","cho", "ha","hwang"},
//		 {"1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800"} };
//		
//		 int ea1 = this.member_ship.length;
//		 int ea2 = this.member_ship[0].length; 
//			 int w = 0;
//		 
//		 while(w < ea2 ) {
//			 int ww = 0;
//			 while(ww< ea1) {
//			if(this.user.equals(this.member_ship)) {
//				this.total=Integer.parseInt(this.member_ship[1][ww]) + this.userpo;
//			}ww++;
//			 }
//			 w++;
//		 }
//		 
//	};
//	@Override
//	public String getter() {
//   String po = this.total + this.userpo +"�Դϴ�.";
//		return po;
//	};
//	
//}