/* Q) Multiple inheritance is not supported through class in java, but it is porssible by an interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported 
in the case of class because of ambiguity.
Howeve, it is supported in case of interface because there is no ambiguity.
It is because its implementation is provided by the implementation class.*/


interface Printable
{
	void print();
}
interface Showable
{
	void print();
}
class TestInterface2 implements Printable, Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		TestInterface2 a= new TestInterface2();
		a.print();
	}
}
