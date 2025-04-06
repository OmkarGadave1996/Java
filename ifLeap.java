import java.util.*;
class ifLeap
{
	public static void main(String[] Args)
	{
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		y = sc.nextInt();
		if(y%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}