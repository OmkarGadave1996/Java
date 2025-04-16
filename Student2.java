//java Program to demonstarte the use of the paramereterized constructor
class Student2
{
	int id;
	String name;
	//Creating parameterized constructor
	Student2(int i, String n)
	{
		id = i;
		name = n; 
	}
	//Method to display the values
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		//Creating objects and apssing values
		Student2 s1 = new Student2(111,"Karan");
		Student2 s2 = new Student2(222,"Ajit");
		//Calling method to display the values of object
		s1.display();
		s2.display();
	}
}