//Hierachical Inheritance
import java.util.*;
abstract class A{
	abstract void area(double a1,double a2);
}
class Rect extends A{
	void area(double a1,double a2){
		System.out.println("Area of Rectangle : "+(a1*a2));
	}
}
class Triangle extends A{
	void area(double a1,double a2){
		System.out.println("Area of Triangle : "+(0.5*a1*a2));
	}
}
public class Hierarchical {
	public static void main(String args[]){
		A a = new Rect();
		a.area(4.0,6.0);
		a = new Triangle();
		a.area(3.5,6.0);
	}
}