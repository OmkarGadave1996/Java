import java.util.*;
class switch0
{
	public static void main(String[] Args)
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice : ");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}
}