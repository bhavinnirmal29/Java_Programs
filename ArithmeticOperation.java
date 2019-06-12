import java.lang.*;
import java.util.*;
public class ArithmeticOperation
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Enter num1 = ");
		a = s.nextInt();
		System.out.println("Enter num2 = ");
		b = s.nextInt();
		System.out.println("Addition = "+(a+b));
		System.out.println("Subtraction = "+(a-b));
		System.out.println("Multiplication = "+(a*b));
		System.out.println("Division = "+(a/b));
	}
}