package Java;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Test1_abstract {

}

class subject{
	String sub[] = {"국어","영어","수학","과학","사회"};
	ArrayList<String> sub1 = new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	ArrayList<String> newsub = new ArrayList<>();
	int user ;
	String user2;
	
	
	
	public void abc() {
		
	System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 선택해주세요.");
	this.user =this.sc.nextInt();
	
	if(this.user==1) {
	
		this.sub1();
	}
	else if(this.user==2) {
		this.sub2();
	}
	else if(this.user==3) {
		this.sub3();
		
	}
	else {
		System.out.println("번호를 확인해 주세요.");
		abc();
		
	}
	
	}//////
	
	public void sub1() {    //과목추가.
	
	System.out.println("추가할 과목명을 입력하세요.");
	this.user2 = this.sc.next();
	
	for(;;) {
	if(this.user2.equals(newsub.get(user))) {
     System.out.println("동일한 과목명이 있습니다.");
     sub1();
     
	   }
	else if(!this.user2.equals(user)) {	
		this.newsub.add(this.user2);
		
		System.out.println("추가 하시겠습니까? 1:과목추가 , 2:과목삭제, 3:과목리스트 확인");
		this.user = sc.nextInt();
		
		if(this.user==1) {
			sub1();
			
		}
		else if(this.user==2) {
			sub2();
	
		}
		else {
			sub3();
			
		}
	 }

	}
	
		
	}//////
	
	public void sub2() {  //과목삭제.
		
		
		
	}//////
	
	public void sub3() {  //과목리스트 확인.
		
		
		System.out.println(this.newsub);
		
		
		
	}///////
	
	
	
	
}