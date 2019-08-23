package oops;
class Student1
{	
	public Student1()
	{
	System.out.println("35,Rahul Chakraborty");
}
	public Student1(int rollno,String name,String dept){
		System.out.println(rollno);	
		System.out.println(name);
		System.out.println(dept);
	}
	public Student1(int rollno,String name,String dept,double fees){
		System.out.println(rollno);	
		System.out.println(name);
		System.out.println(dept);
		System.out.println(fees);	
	}
}

	
public class ConstructorOverloading1Demo {

	
	public static void main(String[] args) {

		Student1 s=new Student1();
		Student1 s1=new Student1(35,"Rahul Chakraborty","CSE");
		Student1 s2=new Student1(35,"Rahul Chakraborty","CSE",100.00);
	}

}
