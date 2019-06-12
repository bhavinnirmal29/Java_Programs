//Vector Example
import java.util.*;
public class VectorExample
{
	public static void main(String args[])
	{
		String s1="";
		int choice=0;
		Scanner s = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		while(choice>=0)
		{
			System.out.print("\n1-AddElement    2-RemoveElement    3-Display    4-Size    5-Exit");
			System.out.print("\nEnter Choice : ");
			choice=s.nextInt();
			s.nextLine();
			if(choice==1)
			{
				System.out.print("Enter Element : ");
				s1=s.nextLine();
				v.addElement(s1);
				System.out.print("\nElement Added\n");
			}
			else if(choice==2)
			{
				v.removeElementAt(v.size()-1);
				System.out.print("\n1 Element Removed");
			}
			else if(choice==3)
			{
				System.out.print("\nElemnts Are : ");
				for(int i=0;i<v.size();i++)
				{
					System.out.print(v.elementAt(i)+"\t");
				}
			}
			else if(choice==4)
				System.out.print("\nSize of Vector : "+v.size());
			else if(choice==5)
				System.exit(0);
		}
	}
}