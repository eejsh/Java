//thread�� ������� ���������� �ȳ���...
public class Thread2 {

	public static void main(String[] args) {

		/*���빮��  Thread�� �̿��Ͽ� ���� �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ� �������α׷��� �����Ͻÿ�. */
		/*��: 6�̶�� �迭���� �μ������� thread�� ����, 6+5+4+3+2+1= ���� ������� print*/
		int data []  = { 6, 9, 10, 15, 3, 17 };
		
		int ea = data.length;
		
		plusbox pb = null;
		for(int a=0; a<ea; a++) {
		pb = new plusbox(data[a]);
		pb.start();
			
		}
		
	}
}
class plusbox extends Thread{
	int number=0;
	public plusbox(int no) {   // Thread���� ���� ����ϱ� ���� �⺻ �޼ҵ�.
		this.number =no;
		
		
	}
	
	@Override
	public void run(){  //run �޼ҵ�� �����μ����� ������.
	//�ݺ���..         
	//  �� Ȯ��. :System.out.println(this.number);
		int sum = 0;
		for(int z=this.number; z>0; z--) {
			sum += z;
		}
		System.out.println(sum);
		
		
		
	}
	
}
		
		
		
		
		
//		
//		abc a = null;
//
//		for(int f=0; f<data.length; f++) {
//		a = new abc(data[f]);
//		a.start();
//		}
//	}
//
//}
//
//class abc extends Thread{
//int zz = 0;	
//public void abc (int z) {//		
// this.zz = z;
//		
//	
//	@Override
//	public void run() {
//  int total =0;
//	int w =0;
//	while(w > zz.length) {
//		z--;
//
//	}
//}