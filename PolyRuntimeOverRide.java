class Bike
{
	void run()
	{
		System.out.println("Running...");
	}
}
class PolyRuntimeOverRide extends Bike
{
	void run()
	{
		System.out.println("Running safely with 60 km...");
	}
	public static void main(String args[])
	{
		Bike b = new PolyRuntimeOverRide();
		b.run();
	}
}