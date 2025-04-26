abstract class emp
{
	int basic = 2000;
	abstract void salary();
}
class manager extends emp
{
	void salary()
	{
		System.out.println("Salary: "+basic*3);
	}
}
class AbsatctEmp 
{
	public static void main(String[] args)
	{
		manager e = new manager();
		e.salary();
	}
}