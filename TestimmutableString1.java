public class TestimmutableString1
{
	public static void main(String ar[])
	{
		String s = "Sachin";
		s.concat(" Tendulkar"); //concat() method appemds the string at the end  
		System.out.println(s); //will print Sachin because Strings are immutable objects
	}
}