import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
	
		
		try {
	ex e = new ex();
	e.loader("ok");
			
			// 자기 자신을 바로 예외상황으로 만듬.
//			Exception aaa = new Exception();
//			throw aaa;  //throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 class로 return 함 
			//---------------- try안, 문법 맨 마지막에 코드에 들어와야댐. try밖에선 작동안됨. ex로 안넘어가고 main에서 끝---exception e 출력.
		
		//}catch(Exception|NumberFormatException e) {   catch 두개말고 하나 사용 시 |으로 구분하여 추가하면됨.
		}catch(Exception e) {
		if(e.getMessage()!=null)
			System.out.println(e);
		}
//		}catch(IOException g) {
//			System.out.println(g);
//		}      --->filereader 없어서 오류.. 
		
	}
}
class ex{
	Exception ep = null;

	public void loader(String a)throws Exception {  //throws 는 try~catch를 받기 위한 class 로드 
	/*잘못된 문법사항 : 자신의 오류를 상위 main class에 모두 전달하는 상황임. */
	/*	if(a=="ok") {   //data != ok 이므로 exception->throw 넘어가 catch exception으로 넘어감.
			int keycode = Integer.valueOf(a);  //정상적으로 받았지만 loader class 자체적인 오류가 발생. 
		}
		else {
			//해당 문법은 자신으 오류사항에 대한 예외처리가 잘못된 경우			
			System.out.println("test");
            this.ep = new Exception();       //throw를 꼭 써야할 경우. 
    		throw this.ep; */
		
		/*잘된문법~!*/
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}else {
				System.out.println("test");
		 	}
 	    }
		catch(Exception e) {
		  System.out.println(e.getMessage());
		  //자신의 오류 사항을 리턴 받아서 확인함
		  this.ep = new Exception();
		  throw this.ep;
		  
	  }
   }
}
