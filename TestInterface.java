//Interface declaration by first user
interface Drawable
{
	void draw();
}
//Implementation by second user
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Rectangle.");
	} 
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle.");
	} 
}//using interface by thrid user
class TestInterface
{
	public static void main(String[] args)
	{
		Drawable d = new Circle();
		Drawable d1 = new Rectangle(); // real example object is provided by method, e.g getDrawable()
		d.draw();	
		d1.draw();		
	}
}