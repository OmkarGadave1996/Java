import java.util.*;
class Object2
{
	int a,b;
	Object2(int x, int y)
	{
		a = x;
		b = y; 
	}
	void display()
	{
		System.out.println("Addition is: "+(a+b));
	}
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		Object2 o1 = new Object2(a,b);		
		o1.display();
	}
}