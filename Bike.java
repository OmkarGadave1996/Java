//Example of method Overriding
//Java Program to illustrate the use of Java Method Overriding 
//Creating Parent class

class Vehicle
{
	//defining a method
	void run()
	{
		System.out.println("Vehicle is running");
	} 
}
//creating a child class
class Bike extends Vehicle
{
	//defining the same method as in the parent class
	void run()
	{
		System.out.println("Bike is running safely");		
	} 
	public static void main(String[] args)
	{
		Bike obj = new Bike(); //Creating object
		obj.run();	//calling method
	} 
}