//Constructor
class A
{
	A()
	{
		System.out.println("Default Constructor");
	}
	A(int a,int b)
	{
		System.out.println("Parameterized Constructor");
		System.out.println("Addition = "+(a+b));
	}
}
class Constructor
{
	public static void main(String args[])
	{
		A a=new A();
		A a1=new A(6,5);
	}
}