import java.util.*;
class Object
{
	int a,b;
	Object(int x, int y)
	{
		a = x;
		b = y; 
	}
	void display()
	{
		System.out.println("Addition is: "+(a+b));
	}
}
public class Object3
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		Object o1 = new Object(a,b);		
		o1.display();
	}
}