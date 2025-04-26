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
		Final6 a = new Final6();
		a.print();
	}
}