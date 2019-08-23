package oops;
class Employee{
	public int eid =1;
	public String ename="ABCD";
	public void show()
	{
		System.out.println("The ID is:"+ eid);
		System.out.println("The Name is:"+ ename);
	}
}
class PersonalDetails extends Employee
{
	String plotno="AD41";
	String streetno="PARK STREET";
	String pincode="70074";
	public void display(){
		System.out.println("THE PLOT NO IS:"+ plotno);
		System.out.println("THE STREET NO IS:"+ streetno);
		System.out.println("THE PINCODE IS:"+ pincode);
	}
}
	class Salary extends PersonalDetails{
		double basic=25000.00;
		double da=2500.00;
		double hra=3000.00;
		public void totalsal(){
			double total;
			total=basic+da+hra;
			System.out.println("THE TOTAL SALARY IS:"+ total);
				
		}
	}

public class MultilevelDemo {

	
	public static void main(String[] args) {

		Salary sl=new Salary();
		sl.show();
		sl.display();
		sl.totalsal();
	}

}
