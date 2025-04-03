import java.util.*;
class Squre
{
	public static void main(String[] Args)
	{
		int S = 5,S1;
		double area,area2;
		Scanner sc = new Scanner(System.in);
		area = S * S;
		System.out.println("The Side of Squre is "+S+" And Area is "+area);
		System.out.println("Enter Side of Squre = ");
		S1 = sc.nextInt();
		area2 = S1 * S1;
		System.out.println("The Side of Squre is "+S1+" And Area is "+area2);
	}
}	