// Program to show the usage of Final keyword

final class Tvs
{
	final int speedLimit = 80;
	final void run()
	{
		System.out.println("Speed of Bike is: " +speedLimit);s
	}
}
public class Bike extends Tvs
{
	void run()
	{
		System.out.println("Speed of Bike is: " +speedLimit);
	}
	public static void main(String args[])
	{
		Bike obj = new Bike();
		obj.run();
	}
}