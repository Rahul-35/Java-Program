package oops;
class Parent
{
	int a=25;
	
	}
class Child extends Parent
{
	int b=60;
	public void add()
	{
		int c;
		c=a+b;
		System.out.println("THE RESULT IS: "+c);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Child ch=new Child();
		ch.add();
		

	}

}
