import java.io.*;
import java.util.*;
public class Exception1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		try
		{	
			int choice=0;
			System.out.println("1-ArithmeticException  2-ArrayIndexOutOfBounds  3-FileNotFoundException  4-Exit\n");
			while(choice>=0)
			{
				try
				{
					System.out.println("Enter choice");
					choice=s.nextInt();
					if(choice==1){
						int a=5,b=0;
						int ans = a/b;
					}
					else if(choice==2)
					{
						int c[] = new int[3];
						c[4]=5;
					}
					else if(choice==3)
					{
						File f1 = new File("D://File.txt");
						FileReader f2 = new FileReader(f1);
					}
					else if(choice==4)
					{
						System.exit(0);
					}
				}
				catch(ArithmeticException ae)
				{
					System.out.println("ArithmeticException Generated [Divide by 0]");
				}
				catch(ArrayIndexOutOfBoundsException ar)
				{
					System.out.println("ArrayIndexOutOfBoundsException [Illegal Array Assignment] Generated");
				}
				catch(FileNotFoundException f)
				{
					System.out.println("FileNotFoundException [Invalid FileName] Generated");
				}
				finally
				{
					
				}				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}