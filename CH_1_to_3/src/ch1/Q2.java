package ch1;

class Members{
	
	int id;
	String name;
	
	static int cid = 012;
	static String dep = "Sales";
	
	
	
	public Members(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	 void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Id   :"+ id);
		System.out.println("Name :"+name);
	}
	
	
	static  void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Company Id   :"+ cid);
		System.out.println("Deepeatement :"+ dep);

	}
	
	
	
	
	
	
	
	
}

public class Q2 {
public static void main(String[] args) {
	Members m1 = new Members(20,"DEVOPS");
	m1.meth1();
	Members.meth2();
}
}
