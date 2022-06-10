import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		// return에 값 두개 사용하기 split 이용.

		per p = new per();
		String info = p.userinfo();
		String info2[] = info.split(","); // info 의 user_name, user_id 두개 데이터를 배열로 만들어주기.
		
		System.out.println(Arrays.toString(info2));
		System.out.println(info2[1]);

		// return에 값 두개 사용하기 배열로 이용.
		String myinfo[] = p.userinfo2();    // 주고받을때 배열로 보내고 받기..
        System.out.println(myinfo[0] + myinfo[1]);
		
	}

}

class per {
	public String userinfo() {
		String user_name = "홍길동";
		String user_id = "hong";

		String user_info = user_name + "," + user_id;
		return user_info;

	}

	public String[] userinfo2() {        
		String user_name = "홍길동";
		String user_id = "hong";
		
		return new String[] {user_name, user_id};  //배열시 중괄호 중요 {} 
		//해당 1개 이상 값을 return으로 보낼경우.
		
		
		//String user_array[] = {user_name, user_id};
		//return user_array;  배열값 만들어서 보내도 가능!
		
		

	}

}
