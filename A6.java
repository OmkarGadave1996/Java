/*Interface in java with final*/
interface printable
{
	final void print();
}
class Final6 implements printable
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