//Java Inheritance Example
class Employee
{
	float salary = 40000;
}
class Programmer0 extends Employee
{
	int bonus = 10000;
	public static void main(String[] args)
	{
		Programmer0 p = new Programmer0();
		System.out.println("Programmer salary is: "+p.salary);
		System.out.println("Bonus of Programmer: "+p.bonus); 
	}
}