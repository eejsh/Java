package Java;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Test1_abstract {


class subject{
	String sub[] = {"국어","영어","수학","과학","사회"};
	Scanner sc= new Scanner(System.in);
	ArrayList<String> newsub = new ArrayList<>();
	int user ;   // 선택지 숫자...
	 
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
	
	String user2;
	user2 = this.sc.next();
	int ea = this.sub.length;
    boolean call = false;
    
    for(String aa : this.sub) {
    	if(aa.contains(user2)) {
        call = true; }
    	else if(this.newsub.contains(user2)) {
            call = false;
          }
    	}
	if(call==true) {
    		this.newsub.add(user2);
    	}
        else if(call==false) {
          	 System.out.println("이미 중복된 과목명이 있습니다. ");
      	     }
        else {
        	System.out.println("다시 선택해주세요.");
        	sub1();
        	
        }
	
	
    	System.out.println(" 과목 추가? 1, 메인으로 돌아가기 2");
    	this.user = this.sc.nextInt();
    	if(this.user==1) {
    	   sub1();
    	 }else if(this.user==2) {
    		abc();
    	 }
    	 else {
    		 System.out.println("잘못 선택하셨습니다. 메인으로 돌아갑니다.");
    		abc();
    		
    	 }
   
	}	
	public void sub2() {  //과목삭제.
	     
	  System.out.println("삭제할 과목을 선택해 주세요. " + this.newsub);
	  
	  String user3;
	  boolean call2 = false;
	  
	  for(String bb : this.newsub) {
		  user3 = this.sc.next();
		  if(this.newsub.contains(user3)) {
			  call2 = true;
		  }
		  else{
			  System.out.println("잘못 입력하셨습니다.");
		   sub1();
		  } 
		  if(call2==true) {
			  this.newsub.remove(user3);
			  System.out.println("정상적으로 삭제 되었습니다.. ");
		  }
		    else if(call2==false) {
			 System.out.println("해당 과목명이 없습니다."); 
			 abc(); }
		  System.out.println(" 과목 삭제 추가? 1, 메인으로 돌아가기 2 ");
	    	this.user = this.sc.nextInt();
	    	if(this.user==1) {
	    	   sub2();
	    	 }
	    	else if(this.user==2) {
	    		abc();
	    	 }
	    	 else {
	    		 System.out.println("잘못 선택하셨습니다. 메인으로 돌아갑니다.");
	    	  abc();
	    	 }
		  
	  }
	}
	
	public void sub3() {  //과목리스트 확인.
		
		System.out.println(this.newsub);
	    System.exit(0);
		
	}///////
	
}
