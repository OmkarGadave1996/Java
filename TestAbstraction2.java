//Abstract class having constructor, data member and methods
//Example of an abstract class that has abstract and non-abstract method
abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear Changed");
	}
}
//Creating a child class which inherits Abstract class
class Honda extends Bike
{
	void run()
	{
		System.out.println("Running safely");
	}
}
//Creating a test class which calls abstract and non-abstract methods
class TestAbstraction2
{
	public static void main(String[] args)
	{
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}