package ch3;



class Members{
	
	int id;
	String name;
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
}
public class Q2 {
	public static void main(String[] args) {
		Members m1 = new Members(20,"DEVOPS");
		m1.meth1();
	}

}
