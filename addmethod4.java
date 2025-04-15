//With Arguments With Return Type
import java.util.*;
class addmethod4
{
	static int add(int x, int y)
	{
		int z;
		z = x + y;	
 		return z; //Method Body
	}
	public static void main(String[] Args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition: "+add(a,b));	//function call
	}
}