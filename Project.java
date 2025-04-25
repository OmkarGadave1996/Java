import java.util.*;
class Bank
{
	int bal =2500;
	void display()
	{
		System.out.println("Display Account Balance: "+bal);
	}
}
class Debit extends Bank
{
	void display()
	{
		int dr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw : ");
		dr = sc.nextInt();
		if(bal>2000)
		{
			if((bal-dr)>2000)
			{
				bal = bal - dr;
				System.out.println("After Withdraw Account Balance: "+bal);
			}
			else
			{
				System.out.println("Balance will be below minimum balance");
				System.out.println("To continue(y/n): ");
				char ch = sc.next().charAt(0);
				if((int)ch == 89 || (int)ch == 121)
				{
					bal = bal - dr;
					System.out.println("After Withdraw Account Balance: "+bal);
				}
				else
				{
					System.out.println("Thank you for Using Bank!!");
				}
			}
		}
		else
		{
			System.out.println("Insufficient Bank Balance!!");
		}
	}
}
class Credit extends Bank
{
	void display()
	{
		int cr;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Credit : ");
		cr = sc.nextInt();
		bal = bal + cr;
		System.out.println("After Credit Account Balance: "+bal);
	}
}
class Project
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to Bank!!");
		System.out.println("1.Display Balance"); 
		System.out.println("2.Withdraw Amount"); 
		System.out.println("3.Credit Amount");  
		System.out.println("Enter the choice: "); 
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				Bank b = new Bank();
				b.display();
				break;
			case 2:
				Bank d = new Debit();
				d.display();
				break;
			case 3:
				Bank c = new Credit();
				c.display();
				break;
			default:
				System.out.println("Wrong choice!!"); 	
		}
	}
}
