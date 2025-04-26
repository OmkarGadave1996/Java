//method Overriding cann't work with final

class Vehicle
{
	//defining final a method
	final void run()
	{
		System.out.println("Vehicle is running");
	} 
}
class Bike2 extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running safely");		
	} 
	public static void main(String[] args)
	{
		Bike2 obj = new Bike2(); //Creating object but it gives error because can't override it
		obj.run();	//calling method
	} 
}