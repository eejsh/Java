import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		 * ���� ����ڰ� ���� ���� ���α׷��� ��û �Ͽ����ϴ�. ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46 �� ������ ���ڸ� �Է��� �ּ���." ��� ����մϴ�.=5�� ��� ����ڰ� 5���� ���ڸ� �迭�� �����մϴ�. (main�� ó��)
		 * �ܺ� class�� �̿��Ͽ� pc�� ���� ��÷��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�. pc�� ���� 5���� ���ڸ� �迭�� �����մϴ�. 
		 * (�ܺ� class method�� ����)
		 
		 * ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭 �����Ϳ� pc�� ���� �迭 �����͸� �ش� method�� �����Ͽ�, ����Ͻø� �˴ϴ�. 
		 * ��, ��� ����ϴ� �ݺ����� ������ do~while ������ �ۼ��մϴ�.
		 * ����ڰ� ���� ���� a�� ������, b��..? b���� ���� ������ a+b
		 */

		System.out.println("1~46�� ������ ���ڸ� �Է��� �ּ���");
		Scanner sc = new Scanner(System.in);
		
		int nw [] = new int[5];
		
		int a = 0; // for��
		
		do {
        	int userin = sc.nextInt();   //���� �Էºκ�
           nw[a] = userin;                // �� �迭 5���� userin ���� ���� ���ڸ� �迭�� ����   nw[0~5]���� �־��ּ���.
		   a++;
		}while(a<5);
		// System.out.println(Arrays.toString(nw));
	
	number nm = new number();
	nm.pcnm(nw);
	
	
	
	}

}

class number {

	public void pcnm(int unw[]) { // pc(5)

	Random ro = new Random();    //random ��ü ���� �� �ν��Ͻ� ���� -> �޸𸮿� �۵���.
    int c = 0;
    
    int nnw [] = new int [5];       // ���� ���ڿ� �迭 ���� ���ּ���.
    
      do {
        nnw[c] = ro.nextInt(45+1) ; 	  
    	  c++;
      }while(c<5);
    //  System.out.print(Arrays.toString(nnw));
   
      ro=null;
      allnm(unw, nnw);
	}

	public static void allnm(int userno[], int pcno[]   ) { // �����(5), PC(5)   //���ο��� �ϳ� �ް�, aa���� �ް�...

		
		System.out.println("���� :"+ Arrays.toString(userno));
		System.out.println("PC : "+ Arrays.toString(pcno));
		
		
		

	}

}
