abstract class book
{
	String nm;
	int year;
	public book(String bnm, int by)
	{
		nm = bnm;
		year = by;
	}
} 
class phbook extends book
{
	String loc,type;
	phbook(String bnm, int by, String l, String t)
	{
		super(bnm,by);
		loc = l;
		type = t;
	} 
	void show()
	{
		System.out.println("name = "+nm);
		System.out.println("year = "+year);
		System.out.println("location = "+loc);
		System.out.println("type = "+type);
	}
}
class novel extends book
{
	String lang,author;
	public novel(String bnm, int by, String nlang, String nauthor)
	{
		super(bnm,by);
		lang = nlang;
		author = nauthor;
	}
	void show()
	{
		System.out.println("language = "+lang);
		System.out.println("author = "+author);
	}
}
class library
{
	public static void main(String[] args)
	{
		phbook ph = new phbook("Yellow Pages",1995,"KOP","Bussiness author");
		ph.show();
		novel n = new novel("Neeta",1991,"English","PQR");
		n.show();
	}	
}  