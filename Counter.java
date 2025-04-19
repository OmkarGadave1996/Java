//Java Program to demonstrate the use of an instance variable
//whihch gets memory each time when we create an object of the class
class Counter
{
	int count= 0; //will get memory each time when the instance is created
	Counter()
	{
		count ++; //increasing value
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		//Creating objects
		Counter c1 = new Counter(); //each time get new memory allocation 
		Counter c2 = new Counter(); //to variable because its non-static variable
		Counter c3 = new Counter();
	}
}