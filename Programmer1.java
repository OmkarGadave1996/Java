//Java Inheritance Example with final
class Employee
{
	final float salary = 40000;
}
class Programmer1 extends Employee
{
	int bonus = 10000;
	public static void main(String[] args)
	{
		Programmer1 p = new Programmer1();
		System.out.println("Programmer salary is: "+p.salary+3000f); //it won't add because of the final
		System.out.println("Bonus of Programmer: "+p.bonus); 
	}
}