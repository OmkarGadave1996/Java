//With Arguments No Return Type
import java.util.*;
class addmethod3
{
	static void add(int x, int y)
	{
		int z;
		z = x + y;	
		System.out.println("Addition: "+z); //Method Body
	}
	public static void main(String[] Args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		add(a,b);	//function call
	}
}