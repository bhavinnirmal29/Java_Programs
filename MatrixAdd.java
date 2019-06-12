//Matrix Addition
import java.util.*;
public class MatrixAdd
{
	public static void main(String args[])
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Matrix A : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter Matrix B : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("Addition :\n ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}