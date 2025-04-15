//Method Ovreloading
public class Overloading
{
	//static int PlusMethodInt(int x, int y)	insted of this we can write
	static int PlusMethod(int x, int y)
	{
		return x + y;
	}
	//static double PlusMethoddoub;e(double x, double y)	insted of this we can write
	static double PlusMethod(double x, double y)
	{
		return x + y;
	}
	public static void main(String[] Args)
	{
		//int myNum1 = PlusMethodInt(8,5); insted of this we can write
		int myNum1 = PlusMethod(8,5);		
		//double myNum2 = PlusMethoddouble(4.3, 6.26); insted of this we can write
		double myNum2 = PlusMethod(4.3, 6.26);
		System.out.println("Int: "+myNum1);
		System.out.println("Double: "+myNum2);
	}
}