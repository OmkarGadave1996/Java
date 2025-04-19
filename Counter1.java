//Java Program to illustrate the use of a static variable
//whihch is shared with all objects.
class Counter1
{
	static int count= 0; //will get memory only once and retain its value
	Counter1()
	{
		count ++; //increasing value of the static varaiable
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		//Creating objects
		Counter1 c1 = new Counter1(); //only once get new memory allocation 
		Counter1 c2 = new Counter1(); 
		Counter1 c3 = new Counter1();
	}
}