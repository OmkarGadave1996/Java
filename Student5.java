//Java Program to Initialize the values from one object to another object 
class Student5
{
	int id;
	String name;
	//constructor to initialize integer and string
	Student5(int i, String n)
	{
		id = i;
		name = n; 
	}
	//constructor to initialize another object
	Student5()
	{
 	
	}
	//Method to display the values
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		//Creating objects and apssing values
		Student5 s1 = new Student5(111,"Karan");
		Student5 s2 = new Student5();
		s2.id = s1.id;
		s2.name = s1.name; 
		//Calling method to display the values of object
		s1.display();
		s2.display();
	}
}