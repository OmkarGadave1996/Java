class A
{
	// int a = 40; non static variable accessing static variable its give error
	static int a = 40; //static
	public static void main(String[] args)
	{
		System.out.println(a);//non static can't access because its in static methdod
	}
}