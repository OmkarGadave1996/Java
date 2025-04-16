/*Let us see another example of default constructor which display
the default value*/
class Student1
{
	int id;
	String name;
	Student1()
	{
		id = 101;
		name = "Disha";
	}
	//methdo to display the value of id and name 
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		//Creating objects
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		//Displaying vlaues of the object
		s1.display();
		s2.display();
	}
}