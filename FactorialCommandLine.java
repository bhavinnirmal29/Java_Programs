//Factorial using Command Line
public class FactorialCommandLine
{
	static int fact(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}
	public static void main(String args[])
	{
		int n1=Integer.parseInt(args[0]);
		System.out.println("Factorial = "+fact(n1));
	}
}