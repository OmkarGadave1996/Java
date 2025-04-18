import java.util.*;
class Object1
{
	int c;
	Object1()
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
	public static void main(String[] args)
	{
		Object1 o1 = new Object1();
		Object1 o2 = new Object1();		
		o1.display();
		o2.display();
	}
}