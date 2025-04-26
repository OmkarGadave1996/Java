class protecteddemo1
{
	protected int a;
}
class derived extends protecteddemo1
{
	void fun()
	{
		System.out.println("a = "+a);
	}
}
class protecteddemo
{
	public static void main(String[] args)
	{
		derived d = new derived();
		d.a = 5;
		d.fun();
	}
}