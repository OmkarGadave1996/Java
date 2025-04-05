import java.util.*;
class Student
{
	public static void main(String[] Args)
	{
		int rollno,m1,m2,m3,m4,m5,total;
		double per;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		name = sc.nextLine();
		System.out.println("Enter the Roll Number of student: ");
		rollno = sc.nextInt();
		System.out.println("Enter Marks of Marathi: ");
		m1 = sc.nextInt();
		System.out.println("Enter Marks of Hindi: ");
		m2 = sc.nextInt();
		System.out.println("Enter Marks of English: ");
		m3 = sc.nextInt();
		System.out.println("Enter Marks of Science: ");
		m4 = sc.nextInt();
		System.out.println("Enter Marks of Maths: ");
		m5 = sc.nextInt();
		total = m1+m2+m3+m4+m5;
		per = total/5.0;
		System.out.println("Enter the Name of Student: "+name);
		System.out.println("Enter Roll Number of Student: "+rollno);	
		System.out.println("Enter Percentage of Student: "+per);								
	}
}