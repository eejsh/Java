import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args){
	
		/* [���빮��]
		 * �ش� ����ڰ� ��ȭ������ �˻��մϴ�.
		 * �ش� ��ȭ ���� �´� �����Ͱ��� ���� ��� ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
		 * ��Ʈ: scanner ���
		 * [���˵���] - ��õ5, 2022�� 4�� ����
		 * "�˻��� ��ȭ������ �Է��ϼ���? :�Ƿη�
		 * �˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.
		 */
		
		try {  // ���� �ε� �� �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("1��. ������ȭ,  2�� �������� ��ȭ  : ");
		int user = sc.nextInt();
		if(user==1) {
			movie m =new movie("movie_db.txt");
		}
		else if(user==2) {
	    	System.out.println("���� �غ����Դϴ�...");
	    	sc.close();
		}
		    
			
		}catch(Exception k) {
		if(k.getMessage()!=null) {
			System.out.println("���� ���񽺰� ���������� �ʽ��ϴ�..");
     		}
		}
	}
}
	
	class movie{
		private String path = "C:\\Java 5\\File_stream\\src\\";               //���
		private BufferedReader bf = null;
		private FileReader fr = null;
		private ArrayList<String> list = null;        
		private Scanner sc = null;
		
		public movie(String filename) throws IOException {
		try {
		
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.coustom();
			this.fr.close();
			this.bf.close();

			this.search();
		
		}catch(Exception a) {
			System.out.println("ã�� ��ȭ�� �����ϴ�.");
	}
	}
		
	
	public void coustom() throws IOException {
		this.bf = new BufferedReader(this.fr);   //buffer���� �ø��� �뵵�� ��
		//System.out.println(this.bf.readLine());

		String datas=this.bf.readLine();
		//�ݺ���!!! - ó���� �а� ���⶧���� [1]���� ���������� String ���� �ѹ� �־�ߵ�. string data = null -> 0���� �󰪺��� ����.[null, [0][1][2]...]
		//String datas = this.bf.readline(); 0�� ���� ���Ƿ� �־��ֱ�. [0]���� �����ϰԵ�.
		
		this.list = new ArrayList<>();         //���� ���� ���.
		
	//	while(datas=this.bf.readLine())!=null) {
		do{
			this.list.add(datas);
			}while((datas=this.bf.readLine())!=null);    //bf�� ������ ����������?
		 //    System.out.println(this.list);  ->������ Ȯ��
	}

      public void search() {
    	  this.sc = new Scanner(System.in);
    	  System.out.println("�˻��� ��ȭ ������ �Է��� �ּ��� : ");
    	  //indexof, contanis
    	 String subject = this.sc.next().intern();
    	 boolean call= false;
    	 
    	 if(subject=="����"){
    		 sc.close();
    		 System.out.println("��");
    		 System.exit(0);
    	 }
    	 
    	 for(String moviesb : this.list) {
 
//    		 if(moviesb.indexOf(subject)!=-1) {    
//    			 System.out.println(moviesb);
//    		 }
 	
    		 if(moviesb.contains(subject)) {
    		System.out.println(moviesb);
    		call = true;
    		 }
    	 }
    		if(call==false) {
    			System.out.println("�����͸� Ȯ�� �� �� �����ϴ�.");
    		}
    	//	sc.close();
    	this.search();        //����Լ� --> search�� ��

    	 
    	
    	  
    	  
    }
		
}
	
