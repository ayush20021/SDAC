package ch3;
class A{
	
	static int a = 20;
	
	int b = 30;
	
	 void meth1() {
		 
		 int a = 40;
		System.out.println(a+a);

	}
}
public class Q5 {
		public static void main(String[] args) {
			System.out.println(A.a);
			A a = new A();
			System.out.println(a.b);
			a.meth1();
		}
	

	
	

}
