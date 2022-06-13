
public class oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체 추상클래스 만들기
      box[] b = { new abox(), new abox2(), new abox3()};
      /*
      b[0].dataload();
      b[1].dataload(); */
      
      //box z 는 배열 b
//      for(box z : b ) {    --> for~each 단점 : 특정 class를 중지 하지는 못합니다. ->전부 작동할때만. 
//    	  z.dataload();
//      }

      int w = 0;
      while(w<(b.length)) {
    	  if (w!=1) {    //인덱스 1번 class는 사용하지 않음. [0][1][2]
    		  b[w].dataload();
    	  }
    	  w++;
      }
      
      
      
	}

}

abstract class box {  // 자체 파일이니 public 사용안함.

	public abstract void dataload(); // -> 이 함수를 기본으로 로드하시오.
	

		
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