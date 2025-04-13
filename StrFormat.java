public class StrFormat
{
	/*Driver Code*/
	public static void main(String ar[])
	{
		String s1 = new String("Hello"); //String 1
		String s2 = new String(" World"); //String 2
		int a = 10;
		String s = String.format("%s%s %s",s1,s2,a); //String 3 to store the result
		System.out.println(s.toString()); //Display Result
	}
}