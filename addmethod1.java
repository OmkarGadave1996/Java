//No Arguments No Return Type
import java.util.*;
class addmethod1
{
	static void add()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();			
		System.out.println("Addition: "+(a+b)); //Method Body
	}
	public static void main(String[] Args)
	{
		add(); //function call
	}
}