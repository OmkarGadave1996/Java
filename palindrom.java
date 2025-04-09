import java.util.*;
class palindrom
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int no, rev = 0, rem,p;
		System.out.println("Enter the Number: ");
		no = sc.nextInt();
		p = no;
		while(no!=0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;		
		}
		System.out.println("The Reverse Number is: "+rev);
		if(p==rev)
		{
			System.out.println("The Number is Palindrom Number!");			
		}
		else
		{
			System.out.println("The Number is Not Palindrom Number!");	
		}
	}
}