package ch1;



class A1{
	
	public void meth1(int a) {
		System.out.println(a+a);
	}
	
	public void meth1(int a, int b) {
		System.out.println(a+b);

	}
	
	
	public void meth1(int a , int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println(a+b+c);

	}
	

}
	
	class B extends A1{
		
		
		@Override
		public void meth1(int a) {
			// TODO Auto-generated method stub
			System.out.println(a);
		}
		
		@Override
		public void meth1(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println(a+b);
		}
		
		@Override
		public void meth1(int a, int b, int c) {
			// TODO Auto-generated method stub
			System.out.println(a+b+c);
		}
		
		
	}




public class Q4_5 {
	
	public static void main(String[] args) {
		A1 a = new A1();
		a.meth1(10);
		a.meth1(10, 10);
		a.meth1(10, 10, 10);
		
		B b = new B();
		b.meth1(10);
		b.meth1(10, 10);
		b.meth1(10, 10, 10);
		
		
		
	}
	
}
