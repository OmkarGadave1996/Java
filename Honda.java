//A class which is declared with the abstract keyword is known as an abstract class in Java.
//Abstraction in Java
//Abstarction is a process of hiding the implementation details and showing only functionality to the user
abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Running safely");
	}
	public static void main(String[] args)
	{
		Bike obj = new Honda();
		obj.run();
	}
}