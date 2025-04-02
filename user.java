import java.util.*;
class user
{
	public static void main(String[] Args)
	{
		String name;
		int a;
		float b;
		double c;
		long d;
	
		Scanner sc =new Scanner(System.in); //wrapper class
		System.out.println("Enter the String value = ");
		name = sc.nextLine();
		System.out.println("Enter the Integer value = ");
		a = sc.nextInt();  
		System.out.println("Enter the Float value = ");
		b = sc.nextFloat();
		System.out.println("Enter the Double value = ");
		c = sc.nextDouble();
		System.out.println("Enter the Long value = ");
		d = sc.nextLong();
		System.out.println("The String value = "+name);
		System.out.println("The Integer value = "+a);
		System.out.println("The Float value = "+b);
		System.out.println("The Double value = "+c);
		System.out.println("The Long value = "+d);
	}
}