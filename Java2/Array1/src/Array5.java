import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		
		// �� �ſ� ������ �ش� �����Ͱ� �ִ� �迭�� Ŀ���� ���.
		
		//����
		
		int a [ ]  =  new int [3] ;           // 3���� ������ ������  new int [3] 3��.
		int b [ ]  = { 1, 2, 3, 4, 5, 6, 7};   // 7���� ��ü�� �ִ� ��Ȳ  [0~6]      // �迭������ ������ �ݺ����� �ȵ��Ƽ� length
		
		int ea = b.length;           // b�� �迭�ȿ� ��� ������ ��ü�� ����ִ����� �ľ��ؾ� �ݺ����� ����� �����մϴ�. (1~7)
		
		
		int w = 0;   //������ �迭���� ������ 0���� ����.  do~while���� ����ϱ� ���� ����
		             // �迭�� ������ 1���� �����ص��ǳ� �迭�� ������� ������ 0���� �����ؾߴ�
	
		int a_ea = a.length;      // a�� ������ � �Ҵ�Ǿ����� �ѹ��� üũ
		
	    
		int ct=0;   //if������ ���� ī���� 
		
	   do {                //0<3 
	    	if(b[w]%2==0 && ct<a_ea    ) {       //b�� �迭������ ¦���̸�.
	                  a[ct] = b[w];   
	      // int [3] �� ������ ct 0~3�� ���� ���� ���� / b [1~2~3~4~5~6~7]
	                  ct++;
			}
			
		//	System.out.println(b[w]);   b�� �迭������ 0~6ȸ ������.
			w++;
		}while(w<ea);
	   System.out.println(Arrays.toString(a));
		
		
  
	    while(w<ea) {
	    	if(b[w]%2==0 && ct< a_ea){             //if b�� �迭�� �� �� ¦���� && ���ο� a �迭�� ��ü ��ü ũ�� ��ŭ��
	    		a[ct] = b[w];               
	    		ct++;                        //�� ���ǿ� ���� �� �ε��� ��ȣ�� +1�� ������Ŵ
	    	}
             w++;	    	
	    }
	    
	    System.out.println(Arrays.toString(a));
	    
	

	}

}
