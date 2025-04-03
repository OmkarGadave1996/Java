import java.util.*;
class Rectangle
{
	public static void main(String[] Args)
	{
		int l = 5,b = 10, l1, b2;
		double area,area2;
		Scanner sc = new Scanner(System.in);
		area = l * b;
		System.out.println("The length of reactangle is "+l+" And Breadth is"+b+" And Area is "+area);
		System.out.println("Enter length of rectangle = ");
		l1 = sc.nextInt();
		System.out.println("Enter breadth of rectangle = ");
		b2 = sc.nextInt();
		area2 = l1 *b2;
		System.out.println("The length of reactangle is "+l1+" And Breadth is"+b2+" And Area is "+area2);
	}
}	