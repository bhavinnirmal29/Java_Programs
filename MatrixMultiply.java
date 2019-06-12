//Matrix Multiplication
import java.util.*;
public class MatrixMultiply
{
	public static void main(String args[])
	{
		int sum1=0,i;
		int k,l,m=0,x,j,temp=0;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int d[][] = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Matrix A : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter Matrix B : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("Multiplication :\n ");
		for(i=0;i<3;i++)
		{
			x=0;
			for(j=0;j<3;j++)
			{
				sum1=0;
				temp=0;
				for(k=0;k<3;k++)
				{
					temp=a[i][k]*b[k][j];
					sum1=sum1+temp;
				}
				d[i][x]=sum1;
				x++;
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println("");
		}
	}
}