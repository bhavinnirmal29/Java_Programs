//Armstrong Number
import java.util.*;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
		int count=0,rem,num,temp,num_length=0;
		double ans=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num=s.nextInt();
		temp=num;
		int temp1=num;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		num_length=count;
		while(num!=0)
		{
			rem=num%10;
			ans=(double)ans+(double)Math.pow(rem,num_length);
			num=num/10;
		}
		System.out.println("ANS = "+ans);
		if(ans==temp1)
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not an armstrong number");
		}
	}
}
