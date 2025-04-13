public class StringBufferExample4
{
	public static void main(String ar[])
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.delete(1,3); //Now Original String is changed
		System.out.println(sb); // Prints Hlo
	}
}