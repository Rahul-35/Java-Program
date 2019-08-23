package oops;
class Parent6
{
	public void show()
	{
		System.out.println("IAM IN PARENT CLASS");
	}
	}
class Child6 extends Parent6
{
	public void show()
	{
		System.out.println("Iam in Child Class");
	}
	}
public class MethodOverriding {


	public static void main(String[] args) {
	
		Child6 chd=new Child6();
		chd.show();
	}

}
