import java.util.*;
class Object
{
	int c;
	Object()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
	}
	void display()
	{
		System.out.println("Addition is: "+c);
	}
}
public class Object4
{
	public static void main(String[] args)
	{
		Object o1 = new Object();		
		o1.display();
	}
}