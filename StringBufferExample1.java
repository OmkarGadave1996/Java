public class StringBufferExample1
{
	public static void main(String ar[])
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java"); //Now Original String is changed
		System.out.println(sb); // Prints Hello Java
	}
}