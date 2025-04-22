class Addition
{
	int a = 10, b = 20;
	void add()
	{
		System.out.println("Addition is: "+(a+b));
	}
}
class Substrcation extends Addition
{
	void sub()
	{
		System.out.println("Subtraction is: "+(a-b));
	}
}
class Multiplication extends Substrcation
{
	void mul()
	{
		System.out.println("Multiplication is: "+(a*b));
	}
}
class Division extends Multiplication
{
	void dev()
	{
		System.out.println("Division is: "+(a/b));
	}
}
class Numbers
{
	public static void main(String[] args)
	{
		Division d = new Division();
		d.add();
		d.sub();
		d.mul();
		d.dev();
	}
}