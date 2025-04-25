//Interface Inheritance
interface Printable
{
	void print();
}
interface Showable extends Printable
{
	void show();
}
class TestInterface3 implements Showable
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
		TestInterface3 a= new TestInterface3();
		a.print();
		a.show();
	}
}