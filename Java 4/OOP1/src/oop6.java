
public class oop6 {

	public static void main(String[] args) {
		// �迭 ������ ������ ��ü �߻�Ŭ���� �����
      box[] b = { new abox(), new abox2(), new abox3()};
      /*
      b[0].dataload();
      b[1].dataload(); */
      
      //box z �� �迭 b
//      for(box z : b ) {    --> for~each ���� : Ư�� class�� ���� ������ ���մϴ�. ->���� �۵��Ҷ���. 
//    	  z.dataload();
//      }

      int w = 0;
      while(w<(b.length)) {
    	  if (w!=1) {    //�ε��� 1�� class�� ������� ����. [0][1][2]
    		  b[w].dataload();
    	  }
    	  w++;
      }
      
      
      
	}

}

abstract class box {  // ��ü �����̴� public ������.

	public abstract void dataload(); // -> �� �Լ��� �⺻���� �ε��Ͻÿ�.
	

		
}
class abox extends box {
	@Override
	public void dataload() {
     System.out.println("test1");	
	}
}
class abox2 extends box {
	@Override
	public void dataload() {
		System.out.println("test2");	
	}
}

class abox3 extends box {
	@Override
	public void dataload() {
		System.out.println("test3");
			
	}
}