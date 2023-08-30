package ch1;

class A{
	
	
	String Name;
	int id;
	double sal;
	String address;
	
	
	
	public A(String name, int id, double sal, String address) {
		super();
		Name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}



	public void displayinfo() {
		System.out.println("name :"+ Name);
		System.out.println("Id :"+ id);
		System.out.println("sal :" +sal);
		System.out.println("address "+ address);
		
	}



	@Override
	public String toString() {
		return "[Name=" + Name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}




	
	
	
	
	
	
	
}



public class Q1 {

	public static void main(String[] args) {
		
	A ob1 = new A("Ayush",20,100000,"Virar");
	ob1.displayinfo();
	System.out.println(ob1);
	System.out.println("hii");}

}
