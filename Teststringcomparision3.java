public class Teststringcomparision3
{
	public static void main(String ar[])
	{
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin"); 
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);	
	}
}
