//Hierarchical Inheritance Example
class Animal
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking...");		
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("meowing...");		
	}
}
class TestInheritance2
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Dog d = new Dog();
		c.meow();
		//c.bark();//compile time error
		d.bark();
		c.eat();
	}
}