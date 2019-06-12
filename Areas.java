import java.util.*;
public class Areas
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		//Area of Triangle
		float b,h;
		System.out.println("Enter base = ");
		b = s.nextFloat();
		System.out.println("Enter height = ");
		h = s.nextFloat();
		System.out.println("Area of Triangle = "+(0.5*b*h));
		//Area of Rectangle
		float l,b1;
		System.out.println("Enter length = ");
		l = s.nextFloat();
		System.out.println("Enter breadth = ");
		b1 = s.nextFloat();
		System.out.println("Area of Rectangle = "+(l*b));
		//Area of Circle
		float r;
		System.out.println("Enter Radius = ");
		r = s.nextFloat();
		System.out.println("Area of Circle = "+(3.14*r*r));
	}
}