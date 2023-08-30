package ch1;



public class A3PD {

	
	
	public int a = 20;
	private int b = 20;
	protected int c = 30;
	int d = 50;
	
	
	
}

class  AS{
	public static void main(String[] args) {
		A3PD a = new A3PD();
		System.out.println(a.a);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}