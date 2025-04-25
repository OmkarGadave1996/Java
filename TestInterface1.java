interface Bank
{
	float rateofInterest();
}
class SBI implements Bank
{
	public float rateofInterest()
	{
		return 9.15f;
	}
}
class PNB implements Bank
{
	public float rateofInterest()
	{
		return 9.7f;
	}
}
class TestInterface1
{
	public static void main(String[] args)
	{
		Bank b = new SBI();
		System.out.println("ROI: "+b.rateofInterest());
		Bank c = new PNB();
		System.out.println("ROI: "+c.rateofInterest());
	}
}