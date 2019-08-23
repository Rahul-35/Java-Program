package oops;
class TestStatic{
	static int x=25;
	static int y=0;
	public static void display(){
		System.out.println("The Value of X is: "+x);
		System.out.println("The Value of Y is: "+y);
	}
	static{
		y=x*4;
	}
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic.display();
	}

}
