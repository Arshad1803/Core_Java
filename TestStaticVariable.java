// Program to understand static variables

class StaticDemo
{
	static int a = 10;
	int b = 10;
	
	public void display()
	{
		a = a+10;
		b =b+10;
		System.out.println("a: " +a);
		System.out.println("b: " +b);
	}
}

public class TestStaticVariable
{
	public static void main(String args[])
	{
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		obj1.display();
		obj2.display();
	}
}