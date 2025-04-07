import java.util.*;
class switch2
{
	public static void main(String[] Args)
	{
		int ch,a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Find Reminder");
		System.out.println("Enter the choice");
		ch = sc.nextInt();
		System.out.println("Enter the 1st value: ");
		a = sc.nextInt();
		System.out.println("Enter the 2nd value: ");
		b = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Addition");
				c = a + b;
				System.out.println("Addition is "+c);
				break;
			case 2:
				System.out.println("Substraction");
				c = a - b;
				System.out.println("Substraction is "+c);
				break;
			case 3:
				System.out.println("Multiplication");
				c = a * b;
				System.out.println("Multiplication is "+c);
				break;
			case 4:
				System.out.println("Division");
				c = a / b;
				System.out.println("Division is "+c);
				break;
			case 5:
				System.out.println("Find Reminder");
				c = a % b;
				System.out.println("Reminder is "+c);
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}
}