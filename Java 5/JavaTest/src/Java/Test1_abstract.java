package Java;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Test1_abstract {

}

class subject{
	String sub[] = {"����","����","����","����","��ȸ"};
	ArrayList<String> sub1 = new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	ArrayList<String> newsub = new ArrayList<>();
	int user ;
	String user2;
	
	
	
	public void abc() {
		
	System.out.println("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3] �������ּ���.");
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
		System.out.println("��ȣ�� Ȯ���� �ּ���.");
		abc();
		
	}
	
	}//////
	
	public void sub1() {    //�����߰�.
	
	System.out.println("�߰��� ������� �Է��ϼ���.");
	this.user2 = this.sc.next();
	
	for(;;) {
	if(this.user2.equals(newsub.get(user))) {
     System.out.println("������ ������� �ֽ��ϴ�.");
     sub1();
     
	   }
	else if(!this.user2.equals(user)) {	
		this.newsub.add(this.user2);
		
		System.out.println("�߰� �Ͻðڽ��ϱ�? 1:�����߰� , 2:�������, 3:���񸮽�Ʈ Ȯ��");
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
	
	public void sub2() {  //�������.
		
		
		
	}//////
	
	public void sub3() {  //���񸮽�Ʈ Ȯ��.
		
		
		System.out.println(this.newsub);
		
		
		
	}///////
	
	
	
	
}