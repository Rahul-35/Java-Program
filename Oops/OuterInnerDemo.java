package oops;
class Outer
{
	int out_x=60;
	class Inner
	{
		int in_x=60;
		public void add()
		{
			int x=out_x,y=out_x;
			System.out.println("THE RESULT IS :"+(x+y));
		}
	}
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ot=new Outer();
		Outer.Inner in=ot.new Inner();
		in.add();
	}

}
