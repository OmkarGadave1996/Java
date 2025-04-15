//No Arguments With Return Type
import java.util.*;
class addmethod2
{
	static int add()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();			
		return a + b; //Method Body
	}
	public static void main(String[] Args)
	{
		System.out.println("Addition: "+add());	//function call
	}
}