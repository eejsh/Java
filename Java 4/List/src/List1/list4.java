package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
	//�迭 ���� ���ƾ� ���̰� ��. linkedlist 
		
		Integer	a[] = { 3,6,9,12,15 };
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
				ln.add(33);
			System.out.println(ln);
	
	
			
	     Scanner sc = new Scanner(System.in);
   		 LinkedList<Integer> list = new LinkedList<>();     // -> �� �迭 ����
			
			String  user;	  
		
			//for(;;) -for�� ���ѷ���, do{ }while?
			
			while(true) { // ���ѷ���
				
				System.out.println("���ڸ� �Է��ϼ���");
				user = sc.next();         //- ���� 1�� �־ ���� 1��. 
				try {    // ����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
	                int number = Integer.parseInt(user);    // ���� 1�� ���� 1�� ���� 
	                list.add(number);
	          
	                int ea = list.size();
	                if(ea>4) { 
	                	break;	     //����.     //5������ �迭�� �ԷµǸ� ���ѷ����� ��������
	                }
				} catch(Exception e) {    // ������ �߻� �Ͽ��� ��� �۵��Ǵ� ��Ʈ
					System.out.println("�ش� �Է»����� ���� �Դϴ�. \n ���ڸ� ���� �Է��ϼ���.");   //-->����ó�� �� �����.
					//break;
				}
		
				}
			System.out.println(list);  //--break ������ �۵�.
				
			sc.close();
				
				
	}

}
