
public class Time1 {
/* try~catch 문 : 예외처리 기능 문법  */
// 작동  문제가생길때..
	public static void main(String[] args) {
		// 1~10

		int f;

		for (f = 1; f <= 10; f++) {
			try {    // 예외 발생할 코드 를 적용.
				Thread.sleep(1000);  //1000 = 1초
				//Thread.sleep : 일시정지상태
				
				System.out.println(f);
			} catch (InterruptedException e) {  
				     /*InterruptedException e  예외 발생 경우 처리하기 위한 문법. */
                     
			}
		}

	}
}
