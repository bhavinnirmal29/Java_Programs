//Multiple Inheritance
import java.util.*;
interface A1{
	public void rect(double a,double b);
}
interface B1{
	public void tri(double a,double b);
}
public class Area_R_T implements A1,B1
{
	public void rect(double a,double b)
	{
		System.out.println("Area of Rectangle : "+(a*b));
	}
	public void tri(double a,double b)
	{
		System.out.println("Area of Triangle : "+(0.5*a*b));
	}
	public static void main(String args[])
	{
		Area_R_T obj = new Area_R_T();
		obj.rect(4.0,6.4);
		obj.tri(3.9,3.0);
		
	}
}