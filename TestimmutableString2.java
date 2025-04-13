public class TestimmutableString2
{
	public static void main(String ar[])
	{
		String s = "Sachin";
		s = s.concat(" Tendulkar"); //or s = s.concat(s)
		System.out.println(s);
	}
}