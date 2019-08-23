package oops;
abstract class Shape{
	abstract void area(double r);
		
	}
class Square extends Shape{
	void area(double r){
		System.out.println("THE AREA OF THE SQUARE IS: "+(r*r));
	}
	
}
class Circle extends Shape{
	void area(double r){
		System.out.println("THE AREA OF CIRCLE IS: "+(Math.PI*r*r));
	}
}
class Triangle extends Shape{
	void area(double r)
	{
		System.out.println("THE AREA OF TRIANGLE IS: "+(0.5*r*r));
	}
}
public class AbsrtractionDemo {

	public static void main(String[] args) {
	Square s=new Square();
	Circle c=new Circle();
	Triangle t=new Triangle();
	s.area(5.0);
	c.area(5.0);
	t.area(5.0);

	}

}
