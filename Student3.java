//java Program constructor overloading
class Student3
{
	int id;
	String name;
	int age;
	//Creating two arg constructor
	Student3(int i, String n)
	{
		id = i;
		name = n; 
	}
	//Creating three arg constructor
	Student3(int i, String n,int a)
	{
		id = i;
		name = n; 
		age = a;	
	}
	//Method to display the values
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args)
	{
		//Creating objects and apssing values
		Student3 s1 = new Student3(111,"Karan");
		Student3 s2 = new Student3(222,"Ajit",25);
		//Calling method to display the values of object
		s1.display();
		s2.display();
	}
}