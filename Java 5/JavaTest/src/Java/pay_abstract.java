package Java;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	
FileReader fr = null;

ArrayList<String> em_name = null;

//protected String secury =" ";//키 없음 작동안되게.. 키값 임의로 설정.
//public void start(String a) {  } // 오버로딩 :  pay_program에서 사용안하고 다른곳에서 사용할 경우 public void로 설정하면 pay_program에서 오버로딩 안해도됨. 필요에의해 abstract, public 설정 하면됨.

protected final int money = 87000000;  //회사 총 잔고금액

public abstract void start();

abstract void db () throws IOException;

public abstract int[] check();  //setter


}