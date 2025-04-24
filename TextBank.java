abstract class Bank
{
	abstract int getrateofinterest(); 
}
class SBI extends Bank
{
	int getrateofinterest()
	{
		return 8; 
	} 
} 	
class ICICI extends Bank
{
	int getrateofinterest()
	{
		return 7; 
	} 
} 
class AXIS extends Bank
{
	int getrateofinterest()
	{
		return 9; 
	} 
} 
class TextBank
{
	public static void main(String[] args)
	{
		Bank b;
		b = new SBI();	
		System.out.println("SBI rate of Interest: "+b.getrateofinterest());
		b = new ICICI();	
		System.out.println("ICICI rate of Interest: "+b.getrateofinterest());
		b = new AXIS();	
		System.out.println("AXIS rate of Interest: "+b.getrateofinterest());
	}
}