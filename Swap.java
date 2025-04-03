import java.util.*;
class Swap
{
	public static void main(String[] Args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value: ");
		a = sc.nextInt();
		System.out.println("Enter the 2nd value: ");
		b = sc.nextInt();
		System.out.println("Before Swapping: ");
		System.out.println(" A: "+a+" B: "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping: ");
		System.out.println(" A: "+a+" B: "+b);
	}
}