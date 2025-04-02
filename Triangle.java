import java.util.*;
class Triangle
{
	publiu static void main(String[] Args)
	{
		int b = 5, h =10, b1, h1;
		double area,area2;
		Scanner sc = new Scanner(System.in);
		area = 0.5 * b * h;
		System.out.println("The base of triangle is "+b+"And height is"+h+"And Area is "+area);
		System.out.println("Enter base of triangle = "+b1);
		b1 = sc.nextInt();
		System.out.println("Enter height of triangle = "+h1);
		h1 = sc.nextInt();
		area2 = 0.5 * b1 * h1;
		System.out.println("The base of triangle is "+b1+"And height is"+h1+"And Area is "+area);
	}
}	