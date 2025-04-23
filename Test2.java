//Java Method Overriding
//Java Program to demonstrate the real scenario of Java Method Overriding 
//where three classes are overriding the methos of parent class.

//Creating a parent class
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
//test class to create objects and call the methods
class Test2
{
	public static void main(String[] args)
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interesr: "+s.getRateOfInterest());
		System.out.println("ICICI Rate of Interesr: "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interesr: "+a.getRateOfInterest());
	}
}