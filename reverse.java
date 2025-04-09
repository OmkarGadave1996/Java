import java.util.*;
class reverse
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int no, rev = 0, rem;
		System.out.println("Enter the Number: ");
		no = sc.nextInt();
		while(no!=0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;		
		}
		System.out.print("The Reverse Number is: "+rev);
	}
}