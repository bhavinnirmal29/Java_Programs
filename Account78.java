//Bank Account
import java.util.*;
class Customer
{
	Scanner s = new Scanner(System.in);
	public int id1,bal1=0,bal2;
	public int amt_dep=0;
	public String name1;
	Customer()
	{
	}
	void account_Details_Input()
	{
		System.out.println("Enter your Acc_ID : ");
		id1=s.nextInt();
		System.out.println("Enter your Name : ");
		name1 = s.nextLine();
		s.nextLine();
		System.out.println("Enter balance : ");
		bal1 = s.nextInt();
	}	
	void deposit()
	{
		System.out.println("Enter Amount to be Deposited : ");
		amt_dep = s.nextInt();
		if(amt_dep>0)
		{
			bal1=bal1+amt_dep;
			System.out.println("Amount Deposited : "+amt_dep);
			System.out.println("Total Balance : "+bal1);
		}
		else if(amt_dep<0)
		{	
			System.out.println("Invalid Amount");
		}

	}
	void withdraw()
	{
		s.nextLine();
		System.out.println("Enter Balance to be withdrawn : ");
		bal2 = s.nextInt();
		if(bal2<=bal1)
		{
			bal1 = bal1-bal2;
			System.out.println("Withdrawn Amount : "+bal2);
			System.out.println("Total Balance : "+bal1);
		}
		else if(bal2>bal1)
		{
			System.out.println("Insufficient Balance ");
		}
	}
	void display()
	{
		System.out.println("Account  ID : "+id1);
		System.out.println("Name : "+name1);
		System.out.println("Balance : "+bal1);
	}
}
public class Account78 extends Customer
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int choice=0;
		Customer c=new Customer();
		System.out.print("1-AddAcount  2-Withdraw  3-Deposit  4-Display_Details  5-Exit\n");
		System.out.println("Enter your choice : ");
		choice = s1.nextInt();
		while(true)
		{
			switch(choice)
			{
				case 1:
				{
					c.account_Details_Input();
					break;
				}
				case 2:
				{
					c.withdraw();
					break;
				}
				case 3:
				{
					c.deposit();
					break;
				}
				case 4:
				{
					c.display();
					break;
				}
				case 5:
					System.exit(0);
					break;
				default:
				{
					
				}
			}
				System.out.print("1-AddAcount  2-Withdraw  3-Deposit  4-Display_Details  5-Exit\n");
				System.out.println("Enter your choice : ");
				choice = s1.nextInt();
		}
	}
}