import java.util.*;
class towerofhanoi
{
	static void towerofhanoi(int n, char from, char to, char aux)
	{
		if(n == 1)
		{
			System.out.println("Move disk 1 from "+from+" to "+to);
		}
		towerofhanoi(n-1,from, aux, to);
		System.out.println("Move disk "+n+" from "+from+" to "+to); 		
		towerofhanoi(n-1, aux, to, from);
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of disk: ");	
		n = sc.nextInt();
		towerofhanoi(n, 'A', 'B', 'C');
	}
}	