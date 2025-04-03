import java.util.*;
class Swaptemp
{
	public static void main(String[] Args)
	{
		//Swap using third variable
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value: ");
		a = sc.nextInt();
		System.out.println("Enter the 2nd value: ");
		b = sc.nextInt();
		System.out.println("Before Swapping: ");
		System.out.println(" A: "+a+" B: "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping: ");
		System.out.println(" A: "+a+" B: "+b);
	}
}