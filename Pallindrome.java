//Pallindrome 
import java.util.*;
public class Pallindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1="";
		String temp="";
		String s2="";
		int i=0,j;
		System.out.println("Enter a string : ");
		s1=s.nextLine();
		temp=s1;
		j=temp.length()-1;
		while(i!=temp.length() && j!=-1)
		{
			s2+=s1.charAt(j);
			j--;
			i++;
		}
		if(s2.equals(s1))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}
}