import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {

		
		
		/* Scanner �� �԰� While ������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� ���� �Ͻÿ�.
		 * */
		
         Scanner sc = new Scanner(System.in);
         System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���");

         int gugu = sc.nextInt();
         
         
         int c = 1;   // ����
         int aws ;      //��°�
        
       
         while (c<10) { ;  
          aws = gugu * c ;
         
         System.out.print(aws+" ");

         c ++; 
         }
         
         sc.close();
		
	}

}
