import java.util.*;
class Object
{
	\\class varaiable can access within class
	int c;
	Object()
	{	
		//method variable acn't access outside method
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;/thst's why values are stored in c class variable
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
		Object o1 = new Object();	//method call using class	
		o1.display();
	}
}