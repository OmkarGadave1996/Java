import mypackage.calculate;
class packagedemo
{
	public static void main(String args[])
	{
		calculate cal=new calculate();
		int sum=cal.add(10,20);
		double vol=cal.volume(10.2,12.2,13.2);
		int div=cal.divide(20,4);
		System.out.println("add is:"+sum);
		System.out.println("volume is:"+vol);
		System.out.println("division is:"+div);
	}
}