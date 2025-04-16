//Java Program to Initialize the values from one object to another object 
class Student4
{
	int id;
	String name;
	//constructor to initialize integer and string
	Student4(int i, String n)
	{
		id = i;
		name = n; 
	}
	//constructor to initialize another object
	Student4(Student4 s)
	{
		id = s.id;
		name = s.name; 	
	}
	//Method to display the values
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		//Creating objects and apssing values
		Student4 s1 = new Student4(111,"Karan");
		Student4 s2 = new Student4(s1);
		//Calling method to display the values of object
		s1.display();
		s2.display();
	}
}