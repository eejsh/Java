import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
/*[응용문제] data = { "hong45", "lee90","kang100","park70","kim72"}; 
해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다. 
해당 값을 던질 때는 가공없이 던지게 됩니다. main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산 한 결과가 나와야 합니다. 
단, 문자. 숫자 변환 시 문제가 발생할 경우 finally로 체크 후 해당 main2메소드로 다시 호출 하여 정상적으로 데이터가 나오도록 하십시오.*/
String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };

ArrayList<String> rdata = new ArrayList<>();
try {
	total_method(data);
	
}catch(Exception z) {
	System.out.println(z);
}finally {
	int j = 0;
	String modify;
	while(j<data.length) {
 modify = data[j].replaceAll("[a-zA-z]","");		
 rdata.add(modify); 
		j++;
	}
	String cdata[] = new String[rdata.size()];
	int q=0;
	do {
		cdata[q] = rdata.get(q);
		q++;
	}while(q<rdata.size());
	try {
		total_method(cdata);
	}catch(Exception h) {
	// printStacktrace 실무사용안함 에러발생근원지-> 메모리에 쌓여서 찾기힘듬 , 취약점때문에 사용금
	// System.out.println(h);   // java.ver13?17 -> to.string()이 같이 붙어있어서 굳이 안사용해도됨. 
	// System.out.println(h.getMessage());   
	
	if(h.getMessage()==null) {
		System.exit(0);
	}else {
		System.out.println(h);
	}
	
	
	
	}
  }
}
	
	
	
static public void total_method(String db[]) throws Exception {
int ea = db.length;
int w =0;
int values;
int jumsu=0;
while(w<ea) {
	values = Integer.valueOf(db[w]);
	jumsu += values;
	w++;
}
System.out.println(jumsu);

Exception e = new Exception();
throw e;

}
	}

