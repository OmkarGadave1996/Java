import java.util.*;
class ladderif2
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
		System.out.println("Total Marks of Student: "+total);	
		System.out.println("Percentage of Student: "+per);
		if(per>=90 && 100>per)
		{
			System.out.println("A Grade");
		}
		else if(per>=75 && 90>per)
		{
			System.out.println("B Grade");
		}
		else if(per>=50 && 75>per)
		{
			System.out.println("C Grade");
		}
		else if(per>=35 && 50>per)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");				
		}								
	}
}