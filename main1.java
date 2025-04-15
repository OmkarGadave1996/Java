public class main1
{
	//Create check age method with integer variable
	//Called age
	static void CheckAge(int age)
	{
		//If age is less than 18 print "access denied"
		if(age<18)
		{
			System.out.println("Access Denied! You are not Old enough!");
		}
		//If age is greater than, or equal to 18 print "access granted"
		else
		{
			System.out.println("Access Granted! You are Old enough!");
		}
	}
	public static void main(String[] Args)
	{
		CheckAge(20);	//function call checkage method & pass along an age of 20
	}
}