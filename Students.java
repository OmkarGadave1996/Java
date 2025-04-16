//Java Program to illustrate how to define a class and field
//Define a Students class
class Students
{
	//Defining field
	int id; //field or data member or instanace variable
	String name; 
	//Creating main method inside ṭhe Students class
	public static void main(String Args[])
	{
		//Creating object or instance
		Students s1 = new Students(); //Creating object of Students
		//Printing value of object
		System.out.println(s1.id); //Accessing member through reference variable
		System.out.println(s1.name);
	}
}