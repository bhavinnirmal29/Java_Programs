//Java String Function
import java.util.*;
public class StringFunctions
{
	public static void main(String args[])
	{
			String s1="Hello World";
			String s2="Welcome To Java";
			System.out.println("String = "+s1);
			System.out.println("String Length = "+s1.length());
			System.out.println("charAt(3) = "+s1.charAt(3));
			System.out.println("Concatenation = "+s1.concat(s2));
			System.out.println("indexOf('W') = "+s1.indexOf('W'));
			System.out.println("Substring = "+s1.substring(5));
	}
}