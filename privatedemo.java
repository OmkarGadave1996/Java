class circle
{
	int r,h;
	private double pi = 3.14;
	private int a;
	public double area(double r)
	{
		return pi*r*r;
	}
	public double volume(double r, double h)
	{
		return(2*pi*r*h);	
	}
}
class privatedemo
{
	public static void main(String[] args)
	{
		circle c = new circle();
		double a = c.area(2);
		double v = c.volume(4,5);
		//c.a = 20;
		System.out.println("The area of circle: "+a);
		System.out.println("The volume of circle: "+v);
	}
}