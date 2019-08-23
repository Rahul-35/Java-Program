package oops;
class Student
{
	public int marks1=60;
	public int marks2=55;
	public int marks3=90;
	public void add()
	{
		int mk;
		mk=marks1+marks2+marks3;
		System.out.println(mk);
	}
}

public class EncapsulationDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.add();
	}

}
