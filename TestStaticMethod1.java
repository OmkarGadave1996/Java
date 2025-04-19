
class Student
{
	int rollno;
	String name;
	static String collage = "ITS";
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
public class TestStaticMethod1
{
	public static void main(String[] args)
	{
		//Creating object
		Student s1 = new Student(111,"Karan");
		Student s2 = new Student(222,"Aryan");
		Student s3 = new Student(333,"Sonu");
		Student.collage = "BBDIT";//we can change the collage of all objects by the single line of code 
		//calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}