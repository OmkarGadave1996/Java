//Jav Program to demonstarate use of static method
class Student
{
	int rollno;
	String name;
	static String collage = "ITS";
	//static method to change the value of static variable
	static void change()
	{
		collage = "BBDIT";
	}
	//constructor to initialize the varaiable
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	//method to display values
	void display()
	{
		System.out.println(rollno+" "+name+" "+collage);
	} 
}
public class TestStaticMethod
{
	public static void main(String[] args)
	{
		Student.change();//calling change method
		//Creating object
		Student s1 = new Student(111,"Karan");
		Student s2 = new Student(222,"Aryan");
		Student s3 = new Student(333,"Sonu");
		//calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}