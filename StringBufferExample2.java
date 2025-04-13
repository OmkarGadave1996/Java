public class StringBufferExample2
{
	public static void main(String ar[])
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1,"Java"); //Now Original String is changed
		System.out.println(sb); // Prints HJavaello
	}
}