package oops;
abstract class Shape1{
	abstract void area(double r);
		
	}
class Square1 extends Shape1{
	void area(double r){
		System.out.println("THE AREA OF THE SQUARE IS: "+(r*r));
	}
	
}
class Circle1 extends Shape1{
	void area(double r){
		System.out.println("THE AREA OF CIRCLE IS: "+(Math.PI*r*r));
	}
}
public class DynamicBindingDemo{
	public static void main(String args[]){
			
		Shape1 sp1;
		Shape1 sp2;
		Square1 sq1=new Square1();
		Circle1 cr1=new Circle1();
		sp1=sq1;
		sp2=cr1;
		sp1=sp2;
		sp1.area(5.0);
		
			
	}
}