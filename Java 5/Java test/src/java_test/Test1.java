package java_test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
/* �ش� �����Ͱ� �ִ� ��Ȳ �Դϴ�. �ش� ������ �� �ְ� ������ ����ڸ� ����� �Ͻÿ�.
 ��� ��      1�� : Daniel(98)
{
{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
{"65","74","23","75","68","96","88","98","54"}
}

�� abstract�� �ʼ��� ����Ͻñ� �ٶ��ϴ�. */


		fs f = new fs();
		f.load();
		
	}

}



abstract class data{

public abstract int index(int data[]);
public abstract void load();
	
}

class fs extends data{

	@Override
	public int index(int[] data2) {
		int s=0;
		int z=0;
		while(s<data2.length) {
			if(data2[z] < data2[s]) {
				z=s;
		
			}
			s++;
		}
		
		System.out.println(data2[z]);
		System.out.println(data2[s]);
		return z;
	}
	
	@Override
	public void load() {
		String[] nm = {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		String[] sc = {"65","74","23","75","68","96","88","98","54"}; 
		int ea = sc.length;
		int sc2[] = new int[ea];		
	int w=0;
	while(w<ea) {
	sc2[w] =Integer.parseInt(sc[w]);
		w++;
	}
	int ck = index(sc2); 
	
	
	System.out.println(Arrays.toString(sc2)); //[65, 74, 23, 75, 68, 96, 88, 98, 54]
	System.out.println(ck);//7
	System.out.printf("1�� : %s, %s ��",nm[ck],sc[ck]);
	
	
	}
		
}
