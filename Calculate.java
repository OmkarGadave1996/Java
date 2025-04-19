class Calculate
{
	static int cube(int x)
	{
		return x * x * x;
	}
	public static void main(String[] args)
	{
		int result = Calculate.cube(5); // method with argument call using Class Name
		System.out.println(result);
	}
}