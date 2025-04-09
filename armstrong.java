import java.util.*;
class armstrong
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int no, sum = 0, rem,p,c;
		System.out.println("Enter the Number: ");
		no = sc.nextInt();
		p = no;
		while(no!=0)
		{
			rem = no % 10;
			c = rem * rem * rem;
			sum = sum + c;
			no = no / 10;		
		}
		System.out.println("The Sum of Cube of each digit is: "+sum);
		if(p==sum)
		{
			System.out.println("The Number is Armstrong Number!");			
		}
		else
		{
			System.out.println("The Number is Not Armstrong Number!");	
		}
	}
}