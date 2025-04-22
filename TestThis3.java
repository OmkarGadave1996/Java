import java.lang.*;
class A
{
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		//m();//same ae this.m();
		this.m();
	}
}
class TestThis3
{
	public static void main(String[] args)
	{
		A a = new A();
		a.n();
	}
}