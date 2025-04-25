/*Interface in java 
The interface in Java is a mechanism to achieve abstarction.
There can be only abstract methods in the Java interface,not method body.
It is used to achieve abstarction and multiple inheritance in java.
In other words, you can say that interfaces can have abstract methods and veriables.
It cannot have a method body.*/
interface printable
{
	void print();
}
class A6 implements printable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		A6 a = new A6();
		a.print();
	}
}