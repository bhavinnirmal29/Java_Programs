//Reverse Number
import java.util.*;
public class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num,rem=0,rev=0;
		System.out.println("Enter number = ");
		num = s.nextInt();
		while(num!=0)
		{
			rem = num%10;
			rev=(rev*10+rem);
			num = num/10;
		}
		System.out.println("Reverse = "+rev);
	}
}