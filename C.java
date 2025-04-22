/*Why multiple Inheritance is not supported in Java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A,B & C are three classes. The C class inheritance A & B classes. If A & B classes have the
same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

Since compile-time errors are better thanruntime errors, Java renders compile-time error if you inherit 2 classes. So
whether you have same method or different, there will be compile time error.
*/

class A
{
	void msg()
	{
		System.out.println("Hello");
	}
} 
class B
{
	void msg()
	{
		System.out.println("Welcome");
	}
} 
class C extends A,B
{
	//Suppose if it were
	public static void main(String[] args)
	{
		C obj = new C();
		obj.msg();//Now which msg90 method would be invoke?
	}	
}