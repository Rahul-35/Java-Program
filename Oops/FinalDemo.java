package oops;
class Parent12{
	public final void display(){
		System.out.println("Iam in Parent Class");
	}
}
class Child12 extends Parent12{
	public void display(){
		System.out.println("Iam in Child Class");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child12 cl=new Child12();
		cl.display();+
	}

}
