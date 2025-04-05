import java.util.*;
class Calender
{
	public static void main(String[] Args)
	{
		int Day,dd,mm,yy;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Days: ");
		Day = sc.nextInt();
		yy = Day/365; 
		mm = (Day%365)/30;
		dd = (Day%365)%30;
		System.out.println("Days are represented as: "+yy+" years "+mm+" months "+dd+" days ");			
	}
}