import java.io.FileReader;
import java.io.IOException;

// IOException + Exception

public class file3  {
	public static void main(String[] args) throws Exception {

     filein f = new filein();
	}
}
class filein{
	FileReader fr = null;
	
//실행하자마자바로.. class = public명 같음.	
public filein() throws IOException, Exception{
	
	try {
      this.fr = new FileReader("C:\\Java 5\\File_stream\\src\\data.dat");  //file reader 사용 안하면 ioexception 사용 안해도됨.
      this.word();
	}
	catch(IOException k){
	if(k.getMessage()!=null) {
		System.out.println(k);
	   }
   }
	catch(Exception k1){
		if(k1.getMessage()!=null) {
			System.out.println(k1);
	 } 
	}
}


public void word() throws IOException{
	
	try {
		int w;
		while(true) {
			w = this.fr.read();
			if(w==-1) {
				break;
			}
				System.out.print((char)w);
		}
		this.fr.close();   //FileReader종료
		
	}
	catch(Exception j){
		if(j.getMessage()!=null) {
			System.exit(0);
		}
	}
	
	
  

     }

}