package Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

/*ȸ������ DB�� �ִ� ��Ȳ�Դϴ�.
 * �ش������߿��� naver.com ���� �ּҸ� ����ϴ� �� �ο����� ����մϴ�.    --������ �м�.
 * (�̸��� ����Ͻÿ�.)
 * ��, DB�� �ε�� �߻�class ���� �ε尡 �ǵ��� �մϴ�.
 *["�̸�","��Ż�","��ȭ��ȣ","����","�ּ�","�̸���","����Ʈ"]
 * indexof();
 * */	
	
/*	{
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
}	*/
	
		user_list ul = new user_list();
		ul.setter("@naver.com");
		int total = ul.getter();
		System.out.println("���̹� �����ڴ� �� :" + total + "�Դϴ�.");
		
	}
}


abstract class basic{
	
   String arr[][] ;
   ArrayList<String> ar1 = null;
   public abstract void setter(String mail);
   public abstract int getter();
   public abstract void db();
   
  
}
	
class user_list extends basic{

	int ea = 0;
	int total = 0;
	
	
	@Override
	public void setter(String mail) {
   //System.out.println(mail);		 -->�� Ȯ��.
	  db();
	//	int f;
	

        //System.out.println( this.arr[f][5]);      -->�̸����ּ�.  
		
		
		//arraylist ����.
//		for(f=0; f<ea; f++) {
//	    this.ar1 = new ArrayList<>(Arrays.asList(this.arr[f][5]));
//         
//	    if(this.ar1.get(0).indexOf(mail)!= -1)  //indexof �� �迭���� ������.
//          	this.total += 1;    //----naver.com�� �ִ� ���
//       	}
//	
		//���� ������ �迭 �������� ī������ �ϰ� �� - indexFo -1(����), -1�� ��� ������ ���� ���� 
		for(int f=0; f<this.ea; f++) {
			if(this.arr[f][5].indexOf(mail)!= -1) {
				this.total += 1;
				
			}
			
		}
		
		//arraylist�� ������ �޸� �Ҵ� �����Ǵ� ��Ȳ�� �߻��� �� ����.
		
		
           	
	
	
	}
	@Override
	public int getter() {
		int t = this.total;
		return t;
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
		//this.ar1 = new ArrayList<>(Arrays.asList(this.arr[0]));  // 1��° �� ������ ������.
			
	}
}







