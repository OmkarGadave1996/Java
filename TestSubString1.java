public class TestSubString1
{
	public static void main(String ar[])
	{
		String s = "Sachin Tendulkar";
		System.out.println("Original String: "+s); 
		System.out.println("SubString Starting from index 6: "+s.substring(6)); //Tendulkar
		System.out.println("SubString Starting from index 0 to 6: "+s.substring(0,6)); //Sachin
	}
}