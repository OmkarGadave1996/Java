//Multiple inheritance in Java by interface
interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class A7 implements Printable, Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("World");
	}
	public static void main(String[] args)
	{
		A7 a= new A7();
		a.print();
		a.show();
	}
}
