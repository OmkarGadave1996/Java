import java.lang.*;
class A
{
	A()
	{
		System.out.println("hello m");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
}
class TestThis4
{
	public static void main(String[] args)
	{
		A a = new A(10);
	}
}