package Ex;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
	/*[���빮��]         -->����~!
	 * ���Ե� ȸ�� ���� �� ���� �����Ϳ��� ����Ʈ�� ���� ������� ������̸��� �����Ͽ� ����մϴ�.
	 *sort ����Ϸ��� "2200" �κ��� ���ڿ���. -> ���ڷκ����ؾߵ�..��
	 *  ��� - ���缺,����,���Ѽ�,������,�赵��,���Ѱ�,ȫ�浿,���,�̼���,������,������ 
	 *   -���μ��� �ڵ� ������ ������ free��..��~
	 *  */

		
		
  /*[���빮��]
   * 
   * ���Ե� ��� ȸ���� ����Ʈ �� ���� ���Ͻÿ�.
   * ��, abstract�� ������ ����ؾ� �մϴ�.
   * ��� : ȸ�� ��ü�� ����Ʈ �հ�� : 34390 �Դϴ�.
   * 
   * */		
	
	userpoint up = new userpoint();
    up.setter();
	int a = up.getter();
	System.out.println("�� �հ�� :" +a +" �Դϴ�." );
	}
}

abstract class plus {
	
 public abstract void setter();
 public abstract int getter();
 public abstract void db();
 String arr[][];
 	
}


class userpoint extends plus{
	int ea = 0;
	int total = 0;
	
	@Override
	public void setter() {
	   db();
//	String oo;    
	
		int w = 0;
		
		while(w < ea) {
			this.total += Integer.parseInt(this.arr[w][6]);
			
		//	this.total += Integer.parseInt(this.arr.get(w)[6]); ---> arraylist ����� ��� ���� ����.
//	        int ok = Integer.parseInt(oo);
//			oo = this.arr[w][6];
//       	total += ok;
			w++;
			}
		
		
	}
	@Override
	public int getter() {
	
		return this.total;
	}
	
	@Override
		public void db() {
	
		this.arr = new String [][] {
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
			} ;
	
			this.ea = this.arr.length;  //11
			
			
		//	System.out.println(this.ea);
		}
	
	
	
	
}