import java.util.*;
class Account
{
	int bal = 20000;
	void display()
	{
		System.out.println("Display the Account balance: "+bal);
	}
}
class Withdraw extends Account
{
	void withdraw()
	{
		System.out.println("Enter the amount to withdraw: ");
		int Dr = 1000;
		System.out.println("Amount to withdraw: "+Dr);
		bal = bal - Dr;
		System.out.println("Account balance after withdraw : "+bal);				
	}
}
class Credit extends Account
{
	void credit()
	{
		System.out.println("Enter the amount to Credit: ");
		int Cr = 1000;
		System.out.println("Amount to Credit: "+Cr);
		bal = bal + Cr;
		System.out.println("Account balance after Credit : "+bal);				
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		int ch;
		Credit c = new Credit();
		Withdraw d = new Withdraw();
		System.out.println("Welcome to Bank!!");
		System.out.println("1.Display Amount");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Credit Amount");		
		System.out.println("Enter the choice: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				c.display();
				break;
			case 2:
				d.withdraw();
				break;
			case 3:
				c.credit();
				break;
			default:
				System.out.println("Wrong choice!!");
		}
	}
}