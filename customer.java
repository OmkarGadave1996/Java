import java.util.Scanner;
class Bank
{
	private double bal = 5000;
	private int pwd;

	public void Deposite(double money)
	{
		System.out.println("Enter Password: ");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if(pwd==123)
		{
			bal = bal + money;
			System.out.println("Deposite money: "+money);
			System.out.println("Total Balance: "+bal);			
		}
		else
		{
			System.out.println("Incorrect Password..!!");
		}
	}
	public void Withdraw(double money)
	{
		System.out.println("Enter Password: ");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if(pwd==123)
		{
			bal = bal - money;
			System.out.println("Withdrawn money: "+money);
			System.out.println("Total Balance: "+bal);			
		}
		else
		{
			System.out.println("Incorrect Password..!!");
		}
	}
	public void CheckBal()
	{
		System.out.println("Enter Password: ");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if(pwd==123)
		{
			System.out.println("Total Balance: "+bal);			
		}
		else
		{
			System.out.println("Incorrect Password..!!");
		}
	}
}
class customer
{
	public static void main(String[] args)
	{
		Bank b = new Bank();
		int ch;
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("\nEnter Your Choice: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				b.Deposite(1000);
				break;
			case 2:
				b.Withdraw(2000);
				break;
			case 3:
				b.CheckBal();
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}