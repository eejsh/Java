package Java;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	
FileReader fr = null;

ArrayList<String> em_name = null;

//protected String secury =" ";//Ű ���� �۵��ȵǰ�.. Ű�� ���Ƿ� ����.
//public void start(String a) {  } // �����ε� :  pay_program���� �����ϰ� �ٸ������� ����� ��� public void�� �����ϸ� pay_program���� �����ε� ���ص���. �ʿ信���� abstract, public ���� �ϸ��.

protected final int money = 87000000;  //ȸ�� �� �ܰ�ݾ�

public abstract void start();

abstract void db () throws IOException;

public abstract int[] check();  //setter


}