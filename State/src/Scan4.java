import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {

	Scanner a = new Scanner(System.in) ;
	
	System.out.println("�Է��� ������ �����ּ���.");
	
	String memo = a.nextLine() ;
	 
    //String memo = a.next() ;  : �����̽��� �Է� ������ ����.
	//                             a.nextline() :  �����̽��� ���� �Է� ����
	
	System.out.println(memo);	
	
            a.close();                     //  Scanner ���Ḧ �⺻���� ���� ���־�� �մϴ�. (���� ���ϸ� �޸𸮰� ��� ��������.)
                                                    
	
	String mid = "park" ;       
           int age = 25 ;           
           /* [�߿����]
              %d : byte,int    (����)����
              %s : string  + ����  , ����. ���� ����
              %f : float , double (�Ҽ���)����
              %t : date, time (�ð�. ��¥)  ����
              %b: boolean  true, false(��.����) ����
           */
           
       //    System.out.println(mid + "���� ���̴�" + age + "�Դϴ�");
           
           //System.out.printf( "%d��" ,mid  );
           
           System.out.printf("%s���� ���̴� %d �Դϴ�.",mid,age);
     
           //printf :  f�� format�� ����           
   
	
           
           	
	
	
	}

}
