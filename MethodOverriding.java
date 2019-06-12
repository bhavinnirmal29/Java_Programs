//Method Overriding
import java.util.*;
class A
{
	void display()
	{
		System.out.println("Method display of Class A");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Method display of Class B");
	}
}
class C extends A
{
	void display()
	{
		System.out.println("Method display of Class C");
	}
}
public class MethodOverriding
{
	public static void main(String args[])
	{
		B b= new B();
		b.display();
		C c= new C();
		c.display();
		A a= new A();
		a.display();
		
	}
}