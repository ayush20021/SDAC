package ch3;
class Emp{
	
	 private String name;
	 private double sal;
	 private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	 
	 
	
	
	
}
public class Q4 {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setName("Ayush");
		System.out.println(e.getName());
		e.setSal(1000);
		System.out.println(e.getSal());
		e.setId(20);
		System.out.println(e.getId() );
		
		
	}
	
	
	

}
