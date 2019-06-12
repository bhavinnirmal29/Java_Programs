//Matrix Transpose
import java.util.*;
public class TransposeMatrix
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int c[][] = new int[3][3];
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Matrix A:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Transpose of A :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[j][i];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}