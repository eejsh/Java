import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
/*[���빮��] data = { "hong45", "lee90","kang100","park70","kim72"}; 
�ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�. 
�ش� ���� ���� ���� �������� ������ �˴ϴ�. main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ� �� ����� ���;� �մϴ�. 
��, ����. ���� ��ȯ �� ������ �߻��� ��� finally�� üũ �� �ش� main2�޼ҵ�� �ٽ� ȣ�� �Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�.*/
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
	// printStacktrace �ǹ������� �����߻��ٿ���-> �޸𸮿� �׿��� ã������ , ����������� ����
	// System.out.println(h);   // java.ver13?17 -> to.string()�� ���� �پ��־ ���� �Ȼ���ص���. 
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

