package com.Hospital.staff.doctor.salary;

public class Salary {
	
	protected void Sallery(int sal , int tax) {
		System.out.println(sal -tax);
	}
	

}

class BB {
	public static void main(String[] args) {
		Salary s = new Salary();
		s.Sallery(100000, 100);
	}
}
