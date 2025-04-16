import java.util.*;
class Object
{
	int a,b;
	Object()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	void display()
	{
		System.out.println("Addition is: "+(a+b));
	}
	public static void main(String[] args)
	{
		Object o1 = new Object();
		Object o2 = new Object();		
		o1.display();
		o2.display();
	}
}