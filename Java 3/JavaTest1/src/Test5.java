
public class Test5 {

	public static void main(String[] args) {
		
		int a = 1;
		int total = 0;
		 
		do {
			total = total + a; 	
			a++;
		}while(a<=100 && total<4000);
	
		System.out.println(total);
		
//	}
//
//}

    int w = 1;
    int sum2 = 0;
    while(w<=100) {
        if(sum2 < 4000 && w<89) {
    		sum2 += w;
    	}
    	else {
    		break;
    	}
    	w++;
          }
      System.out.println(sum2);
    
      }
    }
