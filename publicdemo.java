class demo
{
	public int a = 5;
}
class publicderived extends demo
{
	void fun()
	{
		System.out.println("a = "+a);
	}
}
class publicdemo
{
	public static void main(String[] args)
	{
		publicderived pd = new publicderived();
		pd.fun();
	}
}