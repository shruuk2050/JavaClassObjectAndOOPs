abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle...");
	}
	
}

class RealTimeAbstraction
{
	public static void main(String args[])
	{
		Shape obj = new Rectangle();
		obj.draw();
	}
}