import cal.calculate;
class demo
{
	public static void main(String[] args)
	{
		calculate c = new calculate();
		double cir = c.circle(10.2);
		System.out.println("Area of circle = "+cir);
	}
}