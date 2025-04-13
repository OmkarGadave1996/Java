public class StringBufferExample3
{
	public static void main(String ar[])
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.replace(1,3,"Java"); //Now Original String is changed
		System.out.println(sb); // Prints HJavalo
	}
}