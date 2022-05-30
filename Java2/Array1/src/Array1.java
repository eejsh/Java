
public class Array1 {

	public static void main(String[] args) {           //String ->문자배열
		
  //배열이란? 나열된 데이터 형태를 말합니다. (Array) 2차배열 -> 다차원배열
  //배열 기호는 다음과 같습니다.  [] , {} 
		
		
		int a []  =  new int[5];             // a[] 변수 이지만 배열값을 받는 변수
		// new  int[4]     : 숫자로 된 4개의 데이터를 생성함.		
		// 1.2.3.4 배열값을 가질수 있다고 선언.
		a[0]=5;                             //배열 0부터 시작. 0.1.2.3.4...
		a[1]=15;
		a[2]=25;
		a[3]=35;
		a[4]=75;
		//new int[배열범위] :해당 범위는 실제 데이터보다 무조건 커야함. 
		
		int ea = a.length;                //length : 배열의 갯수를 파악할때 사용합니다.  ->반복문사용.
		
	//	System.out.println(ea);
		int f;
		for(f=0;f<ea;f++) {               // 배열에서는 같거다 작다가 없음 무조건 작다.
			System.out.println(a[f]);
		       //a[0] ~a[4]
		}
		
		
		String user[] = new String[3];
		user[0]="홍길동" ;
		user[1]="이순신" ;
		user[2]="강감찬" ;
      //--------------------------------------------책에서 나온 내용. 잘 쓰이지 않음.//
		
		int k= user.length;
		
		int w=0;                  //무조건 0부터~!시작~!
		while(w<k) {
			System.out.println(user[w]);
			w++;
		}
		
		// int z[] : 배열 값을 선언하면서 직접 0부터 시작하여 값을 구분 
		// int[] z : 배열 값을 선언하고 해당 데이터를 직접적으로 자동구분하여 적용.  - 자기가 알아서 세팅함 
		
		int[] z = new int[] {10,20,30,33,42,11};        // 1차 배열..
		int zea = z.length;
		System.out.println(zea);
		int ww=0;
		do {
			System.out.println(z[ww]);
			ww++;
		}while(ww<zea);
		
		
		//버전이 바뀌면서 int z[] 배열이 바뀜
		/*aa[] 배열 사용시 배열범위 + 값을 지속적으로 넣어야 하는 불편함이 있음.
		버전이 변경되면서 aa[] 배열값을 {} 로 인식시킬수 있도록 변화됨. */
		
		int aa[] = {10,11,22,33,55};
		int aea =  aa.length;
		System.out.println(aea);    // aea가 5개 나옴 10.11.22.33.55 
		
		int aw = 0;
		while(aw<aea){         // 
			System.out.println(aa[aw]);
			aw++;
		}
				
		
		
		
		
		
	}

}
