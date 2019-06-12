//Prime Number Program 
import java.awt.*;
import java.applet.*;
public class Prime_Applet extends Applet									
{
	int num,j,count=1,i,flag=0;
	public void paint(Graphics g)
	{
		for(i=2;i<=20;i++)
		{
			count=1;
			for(j=2;j<i;j++)												
			{
				if(i%j==0)
				{
					count=0;
				}
			}																
			if(count==1)
			{
				g.drawString("Main : "+i,10,flag);
			}
			flag+=20;
		}
	}																		
}																			